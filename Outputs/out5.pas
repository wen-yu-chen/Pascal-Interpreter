(* Expected output 

parsing: tests/test5.pas
true
false
true
Exception in thread "main" java.lang.RuntimeException: no such variable: x
	at EvalVisitor.visitVarDef(EvalVisitor.java:68)
	at EvalVisitor.visitVarDef(EvalVisitor.java:10)
	at Project2Parser$VarDefContext.accept(Project2Parser.java:1088)
	at org.antlr.v4.runtime.tree.AbstractParseTreeVisitor.visitChildren(AbstractParseTreeVisitor.java:46)
	at Project2BaseVisitor.visitStatement(Project2BaseVisitor.java:117)
	at Project2Parser$StatementContext.accept(Project2Parser.java:947)
	at org.antlr.v4.runtime.tree.AbstractParseTreeVisitor.visitChildren(AbstractParseTreeVisitor.java:46)
	at Project2BaseVisitor.visitMainBlock(Project2BaseVisitor.java:110)
	at Project2Parser$MainBlockContext.accept(Project2Parser.java:866)
	at org.antlr.v4.runtime.tree.AbstractParseTreeVisitor.visitChildren(AbstractParseTreeVisitor.java:46)
	at Project2BaseVisitor.visitStatements(Project2BaseVisitor.java:103)
	at Project2Parser$StatementsContext.accept(Project2Parser.java:815)
	at org.antlr.v4.runtime.tree.AbstractParseTreeVisitor.visitChildren(AbstractParseTreeVisitor.java:46)
	at Project2BaseVisitor.visitContent(Project2BaseVisitor.java:40)
	at Project2Parser$ContentContext.accept(Project2Parser.java:310)
	at org.antlr.v4.runtime.tree.AbstractParseTreeVisitor.visitChildren(AbstractParseTreeVisitor.java:46)
	at Project2BaseVisitor.visitContents(Project2BaseVisitor.java:33)
	at Project2Parser$ContentsContext.accept(Project2Parser.java:235)
	at org.antlr.v4.runtime.tree.AbstractParseTreeVisitor.visitChildren(AbstractParseTreeVisitor.java:46)
	at Project2BaseVisitor.visitContents(Project2BaseVisitor.java:33)
	at Project2Parser$ContentsContext.accept(Project2Parser.java:235)
	at org.antlr.v4.runtime.tree.AbstractParseTreeVisitor.visitChildren(AbstractParseTreeVisitor.java:46)
	at Project2BaseVisitor.visitContents(Project2BaseVisitor.java:33)
	at Project2Parser$ContentsContext.accept(Project2Parser.java:235)
	at org.antlr.v4.runtime.tree.AbstractParseTreeVisitor.visitChildren(AbstractParseTreeVisitor.java:46)
	at Project2BaseVisitor.visitContents(Project2BaseVisitor.java:33)
	at Project2Parser$ContentsContext.accept(Project2Parser.java:235)
	at org.antlr.v4.runtime.tree.AbstractParseTreeVisitor.visitChildren(AbstractParseTreeVisitor.java:46)
	at Project2BaseVisitor.visitContents(Project2BaseVisitor.java:33)
	at Project2Parser$ContentsContext.accept(Project2Parser.java:235)
	at org.antlr.v4.runtime.tree.AbstractParseTreeVisitor.visitChildren(AbstractParseTreeVisitor.java:46)
	at Project2BaseVisitor.visitProgram(Project2BaseVisitor.java:26)
	at Project2Parser$ProgramContext.accept(Project2Parser.java:182)
	at org.antlr.v4.runtime.tree.AbstractParseTreeVisitor.visitChildren(AbstractParseTreeVisitor.java:46)
	at Project2BaseVisitor.visitStart(Project2BaseVisitor.java:19)
	at Project2Parser$StartContext.accept(Project2Parser.java:134)
	at org.antlr.v4.runtime.tree.AbstractParseTreeVisitor.visit(AbstractParseTreeVisitor.java:18)
	at Main.main(Main.java:30)

*)