// antlr4 Project2.g4 -visitor
// javac Value.java
// javac EvalVisitor.java
// javac Main.java
// java Main testfile

import java.lang.Exception;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            //no file provided to run
            System.out.println("aaaa ");
        }
        else {
            System.out.println("parsing: " + args[0]);
            
            //CharStream cs = CharStreams.fromFileName(args[0]);
            Project2Lexer lexer = new Project2Lexer(CharStreams.fromFileName(args[0]));
            //Project2Lexer lexer = new Project2Lexer(cs);
            Project2Parser parser = new Project2Parser(new CommonTokenStream(lexer));
            ParseTree tree = parser.start();
            EvalVisitor visitor = new EvalVisitor();
            visitor.visit(tree); 
    
        }        
    }
}