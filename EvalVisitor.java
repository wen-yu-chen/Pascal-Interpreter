import org.antlr.v4.runtime.misc.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Math;
import java.util.Scanner;


public class EvalVisitor extends Project2BaseVisitor<Value> {
    private Map<String, Var> memory = new HashMap<String, Var>();// for globals
    private int curScope = 0;//scope level: global = 0.
    public static final double SMALL_VALUE = 0.00000000001;// used to compare floating point numbers
    boolean breakOn = false;
    boolean continueOn = false;


    @Override public Value visitVarDecl2(Project2Parser.VarDecl2Context ctx) {
        String type = ctx.TYPE().getText();
        String id = "";
        Value value = null;
        Var var = null;

        for (Project2Parser.VariableContext temp : ctx.variable()) {
            id =  String.valueOf(this.visitVariable(temp));

            if (type.equalsIgnoreCase("boolean")) {
                value = new Value(false);
            }
            else if (type.equalsIgnoreCase("real")) {
                value = new Value(0f);
            }

            var = new Var(curScope, value);
            memory.put(id, var);
        }
        
        return memory.put(id, var).getVal();
    }
    
    @Override public Value visitVariable(Project2Parser.VariableContext ctx) { 
        String s = ctx.getText();
        return new Value(s);
    }


    @Override public Value visitProDecl(Project2Parser.ProDeclContext ctx) {
        curScope++;
        return null;
    }

    @Override public Value visitFuncDecl(Project2Parser.FuncDeclContext ctx) { 
       curScope++;
        return null; 
    }
    
    @Override public Value visitEnd(Project2Parser.EndContext ctx) {
        curScope--;

        return visitChildren(ctx); 
    }

    @Override public Value visitVarDef(Project2Parser.VarDefContext ctx) { 
        String id = ctx.variable().getText();
        Var var = null;
    
        if (!memory.containsKey(id) || (memory.get(id).getLevel() > curScope)) {
            throw new RuntimeException("no such variable: " + id);
        }
        Value value = this.visit(ctx.expr());
        var = new Var(memory.get(id).getLevel(), value);

        return memory.put(id, var).getVal();
    }

    @Override public Value visitIfStatement(Project2Parser.IfStatementContext ctx) { 
        List<Project2Parser.CondStatementContext> conditions =  ctx.condStatement();
        boolean evaluatedBlock = false;

        for (Project2Parser.CondStatementContext condition : conditions) {
            Value evaluated = this.visit(condition.expr());

            if (evaluated.asBoolean()) {
                evaluatedBlock = true;

                for (Project2Parser.StatementContext st : condition.statement()) {
                    this.visit(st);
                }

                break;
            }
        }
        if(!evaluatedBlock && ctx.statement() != null) {
            List<Project2Parser.StatementContext> st = ctx.statement();

            for (Project2Parser.StatementContext temp : st) {
                
                this.visit(temp);
            }
        }

        return Value.VOID; 
    }

    @Override public Value visitWhileLoop(Project2Parser.WhileLoopContext ctx) {
        Value value = this.visit(ctx.expr());
        
        while(value.asBoolean()) {
            if (breakOn) {
                breakOn = false;
                break;
            }
            if (continueOn) {
                continueOn = false;
                continue;
            }

            curScope++;

            // evaluate the code block
            this.visit(ctx.mainBlock());

            // evaluate the expression
            value = this.visit(ctx.expr());
        }

        return Value.VOID; 
    }

    @Override public Value visitForLoop(Project2Parser.ForLoopContext ctx) {
        String id = ctx.variable().getText();
        
        if (!memory.containsKey(id) || (memory.get(id).getLevel() > curScope)) {
            throw new RuntimeException("no such variable: " + id);
        }

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        int init = Math.round(left.asFloat());
        int end = Math.round(right.asFloat());
        Value val;
        Var var;
        var =  new Var(memory.get(id).getLevel(), left);
        memory.put(id, var);

        while (init <= end) {
            if (breakOn) {
                breakOn = false;
                break;
            }
            if (continueOn) {
                continueOn = false;
                continue;
            }

            curScope++;

            // evaluate the code block
            this.visit(ctx.mainBlock());

            init++;
            val = new Value((float)init);
            var =  new Var(memory.get(id).getLevel(), val);
            memory.put(id, var);
        }

        return Value.VOID;
    }

    @Override public Value visitBrkStatement(Project2Parser.BrkStatementContext ctx) {
        breakOn = true;
        return null; 
    }

    @Override public Value visitContStatement(Project2Parser.ContStatementContext ctx) {
        continueOn = true;
        return null; 
    }

    @Override public Value visitReadFunc(Project2Parser.ReadFuncContext ctx) { 
        Scanner sc = new Scanner(System.in);
        String id = "";
        Float x = 0f;
        Value value = null;
        Var var = null;

        for (Project2Parser.VariableContext temp : ctx.variable()) {
            id =  String.valueOf(this.visitVariable(temp));

            if (!memory.containsKey(id) || (memory.get(id).getLevel() > curScope)) {
                throw new RuntimeException("no such variable: " + id);
            }
            x = sc.nextFloat();
            value = new Value(x);
            var = new Var(memory.get(id).getLevel(), value);
        }

        return memory.put(id, var).getVal();
    }

    @Override public Value visitWriteFunc(Project2Parser.WriteFuncContext ctx) {
        for (Project2Parser.ExprContext temp : ctx.expr()) {
            System.out.println(this.visit(temp));
        }

        return null;
    }
	
	@Override public Value visitNotExpr(Project2Parser.NotExprContext ctx) { 
        Value value = this.visit(ctx.expr());

        return new Value(!value.asBoolean());
    }

    @Override public Value visitMulExpr(Project2Parser.MulExprContext ctx) { 
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case Project2Parser.MUL:
                return new Value(left.asFloat() * right.asFloat());
            
            case Project2Parser.DIV:
                return new Value(left.asFloat() / right.asFloat());
            
            case Project2Parser.MOD:
                return new Value(left.asFloat() % right.asFloat());

            default:
                throw new RuntimeException("unknown operator: " + Project2Parser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override public Value visitAndExpr(Project2Parser.AndExprContext ctx) { 
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asBoolean() && right.asBoolean());
    }
    
    @Override public Value visitAddExpr(Project2Parser.AddExprContext ctx) { 
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case Project2Parser.ADD:
                return new Value(left.asFloat() + right.asFloat());

            case Project2Parser.SUB:
                return new Value(left.asFloat() - right.asFloat());

            default:
                throw new RuntimeException("unknown operator: " + Project2Parser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override public Value visitOrExpr(Project2Parser.OrExprContext ctx) { 
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asBoolean() || right.asBoolean());
    }

    @Override public Value visitSpcExpr(Project2Parser.SpcExprContext ctx) { 
        Value value = this.visit(ctx.expr());

        switch (ctx.op.getType()) {
            case Project2Parser.SQRT:
                return new Value(Math.sqrt(value.asFloat()));

            case Project2Parser.SIN:
                return new Value(Math.sin(value.asFloat()));

            case Project2Parser.COS:
                return new Value(Math.cos(value.asFloat()));

            case Project2Parser.LN:
                return new Value(Math.log(value.asFloat()));

            case Project2Parser.EXP:
                return new Value(Math.exp(value.asFloat()));

            default:
                throw new RuntimeException("unknown operator: " + Project2Parser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override public Value visitRelExpr(Project2Parser.RelExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case Project2Parser.EQ:
                return new Value(Math.abs(left.asFloat() - right.asFloat()) < SMALL_VALUE);

            case Project2Parser.LT:
                return new Value(left.asFloat() < right.asFloat());

            case Project2Parser.GT:
                return new Value(left.asFloat() > right.asFloat());

            case Project2Parser.NEQ:
                return new Value(Math.abs(left.asFloat() - right.asFloat()) >= SMALL_VALUE);

            case Project2Parser.LTEQ:
                return new Value(left.asFloat() <= right.asFloat());

            case Project2Parser.GTEQ:
                return new Value(left.asFloat() >= right.asFloat());

            default:
                throw new RuntimeException("unknown operator: " + Project2Parser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override public Value visitParExpr(Project2Parser.ParExprContext ctx) { 
        return this.visit(ctx.expr());
    }

    @Override public Value visitVarAtom(Project2Parser.VarAtomContext ctx) { 
        String id = ctx.variable().getText();
        Value value;
        
        //variable found
        if ((memory.containsKey(id)) && (memory.get(id).getLevel() <= curScope)) {
            return memory.get(id).getVal();
        }
        
        throw new RuntimeException("no such variable: " + id);
    }

    @Override public Value visitNumAtom(Project2Parser.NumAtomContext ctx) {
        return new Value(Float.valueOf(ctx.getText()));
    }

    @Override public Value visitBoolAtom(Project2Parser.BoolAtomContext ctx) { 
        return new Value(Boolean.valueOf(ctx.getText())); 
    }

    @Override public Value visitIdAtom(Project2Parser.IdAtomContext ctx) {
        return new Value(ctx.getText());
     }
}