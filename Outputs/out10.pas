(* Expected output

parsing: tests/test10.pas
2.0
4.0
6.0
8.0
10.0
12.0
14.0
16.0
18.0
20.0
22.0
24.0
26.0
28.0
30.0
32.0
34.0
36.0
38.0
40.0
42.0
44.0
46.0
48.0
50.0
285.0
-0.9966807949323107
Exception in thread "main" java.lang.RuntimeException: no such variable: b
	at EvalVisitor.visitVarAtom(EvalVisitor.java:327)
	at EvalVisitor.visitVarAtom(EvalVisitor.java:10)
	at Project2Parser$VarAtomContext.accept(Project2Parser.java:2179)
	at org.antlr.v4.runtime.tree.AbstractParseTreeVisitor.visitChildren(AbstractParseTreeVisitor.java:46)
	at Project2BaseVisitor.visitAtomExpr(Project2BaseVisitor.java:229)
	at Project2Parser$AtomExprContext.accept(Project2Parser.java:1841)
	at org.antlr.v4.runtime.tree.AbstractParseTreeVisitor.visit(AbstractParseTreeVisitor.java:18)
	at EvalVisitor.visitVarDef(EvalVisitor.java:70)
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