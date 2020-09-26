// Generated from /Users/wenyuchen/UF/COP4020/P2/Project2.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Project2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, PROGRAM=11, VAR=12, PROCEDURE=13, FUNCTION=14, BEGIN=15, END=16, 
		IF=17, THEN=18, ELSE=19, BREAK=20, CONTINUE=21, WHILE=22, DO=23, FOR=24, 
		TYPE=25, MUL=26, DIV=27, MOD=28, ADD=29, SUB=30, NOT=31, AND=32, OR=33, 
		EQ=34, LT=35, GT=36, NEQ=37, LTEQ=38, GTEQ=39, TRUE=40, FALSE=41, READLN=42, 
		WRITELN=43, SQRT=44, SIN=45, COS=46, LN=47, EXP=48, REAL=49, BOOLEAN=50, 
		ID=51, FLOAT=52, INT=53, WS=54;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_contents = 2, RULE_content = 3, 
		RULE_comment = 4, RULE_varDecl = 5, RULE_varDecl2 = 6, RULE_variable = 7, 
		RULE_proDecl = 8, RULE_proDecl2 = 9, RULE_funcDecl = 10, RULE_funcDecl2 = 11, 
		RULE_statements = 12, RULE_mainBlock = 13, RULE_statement = 14, RULE_end = 15, 
		RULE_varDef = 16, RULE_ifStatement = 17, RULE_condStatement = 18, RULE_brkStatement = 19, 
		RULE_contStatement = 20, RULE_loops = 21, RULE_whileLoop = 22, RULE_forLoop = 23, 
		RULE_readWrite = 24, RULE_expr = 25, RULE_atom = 26;
	public static final String[] ruleNames = {
		"start", "program", "contents", "content", "comment", "varDecl", "varDecl2", 
		"variable", "proDecl", "proDecl2", "funcDecl", "funcDecl2", "statements", 
		"mainBlock", "statement", "end", "varDef", "ifStatement", "condStatement", 
		"brkStatement", "contStatement", "loops", "whileLoop", "forLoop", "readWrite", 
		"expr", "atom"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'(*'", "'*)'", "','", "':'", "'.'", "':='", "'to'", "'('", 
		"')'", null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "'*'", "'/'", null, "'+'", "'-'", null, null, 
		null, "'='", "'<'", "'>'", "'<>'", "'<='", "'>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "PROGRAM", 
		"VAR", "PROCEDURE", "FUNCTION", "BEGIN", "END", "IF", "THEN", "ELSE", 
		"BREAK", "CONTINUE", "WHILE", "DO", "FOR", "TYPE", "MUL", "DIV", "MOD", 
		"ADD", "SUB", "NOT", "AND", "OR", "EQ", "LT", "GT", "NEQ", "LTEQ", "GTEQ", 
		"TRUE", "FALSE", "READLN", "WRITELN", "SQRT", "SIN", "COS", "LN", "EXP", 
		"REAL", "BOOLEAN", "ID", "FLOAT", "INT", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Project2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Project2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Project2Parser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			program();
			setState(55);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(Project2Parser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(Project2Parser.ID, 0); }
		public ContentsContext contents() {
			return getRuleContext(ContentsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(PROGRAM);
			setState(58);
			match(ID);
			setState(59);
			match(T__0);
			setState(60);
			contents();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContentsContext extends ParserRuleContext {
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public ContentsContext contents() {
			return getRuleContext(ContentsContext.class,0);
		}
		public ContentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contents; }
	}

	public final ContentsContext contents() throws RecognitionException {
		ContentsContext _localctx = new ContentsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_contents);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__1:
			case VAR:
			case PROCEDURE:
			case FUNCTION:
			case BEGIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				content();
				setState(64);
				contents();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContentContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public ProDeclContext proDecl() {
			return getRuleContext(ProDeclContext.class,0);
		}
		public FuncDeclContext funcDecl() {
			return getRuleContext(FuncDeclContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_content);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				varDecl();
				}
				break;
			case PROCEDURE:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				proDecl();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				funcDecl();
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				statements();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 5);
				{
				setState(72);
				comment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(Project2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Project2Parser.ID, i);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__1);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(76);
				match(ID);
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(Project2Parser.VAR, 0); }
		public List<VarDecl2Context> varDecl2() {
			return getRuleContexts(VarDecl2Context.class);
		}
		public VarDecl2Context varDecl2(int i) {
			return getRuleContext(VarDecl2Context.class,i);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(VAR);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(85);
				varDecl2();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDecl2Context extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode TYPE() { return getToken(Project2Parser.TYPE, 0); }
		public VarDecl2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl2; }
	}

	public final VarDecl2Context varDecl2() throws RecognitionException {
		VarDecl2Context _localctx = new VarDecl2Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_varDecl2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			variable();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(92);
				match(T__3);
				setState(93);
				variable();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(T__4);
			setState(100);
			match(TYPE);
			setState(101);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Project2Parser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProDeclContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(Project2Parser.PROCEDURE, 0); }
		public ProDecl2Context proDecl2() {
			return getRuleContext(ProDecl2Context.class,0);
		}
		public ProDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proDecl; }
	}

	public final ProDeclContext proDecl() throws RecognitionException {
		ProDeclContext _localctx = new ProDeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_proDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(PROCEDURE);
			setState(106);
			proDecl2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProDecl2Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Project2Parser.ID, 0); }
		public ProDecl2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proDecl2; }
	}

	public final ProDecl2Context proDecl2() throws RecognitionException {
		ProDecl2Context _localctx = new ProDecl2Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_proDecl2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(ID);
			setState(109);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncDeclContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(Project2Parser.FUNCTION, 0); }
		public FuncDecl2Context funcDecl2() {
			return getRuleContext(FuncDecl2Context.class,0);
		}
		public FuncDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDecl; }
	}

	public final FuncDeclContext funcDecl() throws RecognitionException {
		FuncDeclContext _localctx = new FuncDeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(FUNCTION);
			setState(112);
			funcDecl2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncDecl2Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Project2Parser.ID, 0); }
		public TerminalNode TYPE() { return getToken(Project2Parser.TYPE, 0); }
		public FuncDecl2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDecl2; }
	}

	public final FuncDecl2Context funcDecl2() throws RecognitionException {
		FuncDecl2Context _localctx = new FuncDecl2Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_funcDecl2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(ID);
			setState(115);
			match(T__4);
			setState(116);
			match(TYPE);
			setState(117);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public MainBlockContext mainBlock() {
			return getRuleContext(MainBlockContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			mainBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainBlockContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(Project2Parser.BEGIN, 0); }
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainBlock; }
	}

	public final MainBlockContext mainBlock() throws RecognitionException {
		MainBlockContext _localctx = new MainBlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mainBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(BEGIN);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << IF) | (1L << BREAK) | (1L << CONTINUE) | (1L << WHILE) | (1L << FOR) | (1L << READLN) | (1L << WRITELN) | (1L << ID))) != 0)) {
				{
				{
				setState(122);
				statement();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			end();
			setState(129);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public BrkStatementContext brkStatement() {
			return getRuleContext(BrkStatementContext.class,0);
		}
		public ContStatementContext contStatement() {
			return getRuleContext(ContStatementContext.class,0);
		}
		public LoopsContext loops() {
			return getRuleContext(LoopsContext.class,0);
		}
		public ReadWriteContext readWrite() {
			return getRuleContext(ReadWriteContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statement);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				varDef();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				ifStatement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				brkStatement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				contStatement();
				}
				break;
			case WHILE:
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(135);
				loops();
				}
				break;
			case READLN:
			case WRITELN:
				enterOuterAlt(_localctx, 6);
				{
				setState(136);
				readWrite();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 7);
				{
				setState(137);
				comment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(Project2Parser.END, 0); }
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDefContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_varDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			variable();
			setState(143);
			match(T__6);
			setState(144);
			expr(0);
			setState(145);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(Project2Parser.IF); }
		public TerminalNode IF(int i) {
			return getToken(Project2Parser.IF, i);
		}
		public List<CondStatementContext> condStatement() {
			return getRuleContexts(CondStatementContext.class);
		}
		public CondStatementContext condStatement(int i) {
			return getRuleContext(CondStatementContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(Project2Parser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(Project2Parser.ELSE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(IF);
			setState(148);
			condStatement();
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(149);
					match(ELSE);
					setState(150);
					match(IF);
					setState(151);
					condStatement();
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(157);
				match(ELSE);
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(158);
						statement();
						}
						} 
					}
					setState(163);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(Project2Parser.THEN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CondStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condStatement; }
	}

	public final CondStatementContext condStatement() throws RecognitionException {
		CondStatementContext _localctx = new CondStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_condStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			expr(0);
			setState(167);
			match(THEN);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(168);
					statement();
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BrkStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(Project2Parser.BREAK, 0); }
		public BrkStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brkStatement; }
	}

	public final BrkStatementContext brkStatement() throws RecognitionException {
		BrkStatementContext _localctx = new BrkStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_brkStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(BREAK);
			setState(175);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(Project2Parser.CONTINUE, 0); }
		public ContStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contStatement; }
	}

	public final ContStatementContext contStatement() throws RecognitionException {
		ContStatementContext _localctx = new ContStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_contStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(CONTINUE);
			setState(178);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopsContext extends ParserRuleContext {
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public LoopsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loops; }
	}

	public final LoopsContext loops() throws RecognitionException {
		LoopsContext _localctx = new LoopsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_loops);
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				whileLoop();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				forLoop();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(Project2Parser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DO() { return getToken(Project2Parser.DO, 0); }
		public MainBlockContext mainBlock() {
			return getRuleContext(MainBlockContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(WHILE);
			setState(185);
			expr(0);
			setState(186);
			match(DO);
			setState(187);
			mainBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(Project2Parser.FOR, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DO() { return getToken(Project2Parser.DO, 0); }
		public MainBlockContext mainBlock() {
			return getRuleContext(MainBlockContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(FOR);
			setState(190);
			variable();
			setState(191);
			match(T__6);
			setState(192);
			expr(0);
			setState(193);
			match(T__7);
			setState(194);
			expr(0);
			setState(195);
			match(DO);
			setState(196);
			mainBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadWriteContext extends ParserRuleContext {
		public ReadWriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readWrite; }
	 
		public ReadWriteContext() { }
		public void copyFrom(ReadWriteContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WriteFuncContext extends ReadWriteContext {
		public TerminalNode WRITELN() { return getToken(Project2Parser.WRITELN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public WriteFuncContext(ReadWriteContext ctx) { copyFrom(ctx); }
	}
	public static class ReadFuncContext extends ReadWriteContext {
		public TerminalNode READLN() { return getToken(Project2Parser.READLN, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public ReadFuncContext(ReadWriteContext ctx) { copyFrom(ctx); }
	}

	public final ReadWriteContext readWrite() throws RecognitionException {
		ReadWriteContext _localctx = new ReadWriteContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_readWrite);
		int _la;
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READLN:
				_localctx = new ReadFuncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(READLN);
				setState(199);
				match(T__8);
				setState(200);
				variable();
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(201);
					match(T__3);
					setState(202);
					variable();
					}
					}
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(208);
				match(T__9);
				setState(209);
				match(T__0);
				}
				break;
			case WRITELN:
				_localctx = new WriteFuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(WRITELN);
				setState(212);
				match(T__8);
				setState(213);
				expr(0);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(214);
					match(T__3);
					setState(215);
					expr(0);
					}
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(221);
				match(T__9);
				setState(222);
				match(T__0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotExprContext extends ExprContext {
		public TerminalNode NOT() { return getToken(Project2Parser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class SpcExprContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SQRT() { return getToken(Project2Parser.SQRT, 0); }
		public TerminalNode SIN() { return getToken(Project2Parser.SIN, 0); }
		public TerminalNode COS() { return getToken(Project2Parser.COS, 0); }
		public TerminalNode LN() { return getToken(Project2Parser.LN, 0); }
		public TerminalNode EXP() { return getToken(Project2Parser.EXP, 0); }
		public SpcExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AddExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(Project2Parser.ADD, 0); }
		public TerminalNode SUB() { return getToken(Project2Parser.SUB, 0); }
		public AddExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MulExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(Project2Parser.MUL, 0); }
		public TerminalNode DIV() { return getToken(Project2Parser.DIV, 0); }
		public TerminalNode MOD() { return getToken(Project2Parser.MOD, 0); }
		public MulExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AtomExprContext extends ExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class OrExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(Project2Parser.OR, 0); }
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class RelExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(Project2Parser.EQ, 0); }
		public TerminalNode LT() { return getToken(Project2Parser.LT, 0); }
		public TerminalNode GT() { return getToken(Project2Parser.GT, 0); }
		public TerminalNode NEQ() { return getToken(Project2Parser.NEQ, 0); }
		public TerminalNode LTEQ() { return getToken(Project2Parser.LTEQ, 0); }
		public TerminalNode GTEQ() { return getToken(Project2Parser.GTEQ, 0); }
		public RelExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AndExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(Project2Parser.AND, 0); }
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(227);
				match(NOT);
				setState(228);
				expr(8);
				}
				break;
			case SQRT:
			case SIN:
			case COS:
			case LN:
			case EXP:
				{
				_localctx = new SpcExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229);
				((SpcExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SQRT) | (1L << SIN) | (1L << COS) | (1L << LN) | (1L << EXP))) != 0)) ) {
					((SpcExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(230);
				match(T__8);
				setState(231);
				expr(0);
				setState(232);
				match(T__9);
				}
				break;
			case T__8:
			case TRUE:
			case FALSE:
			case ID:
			case FLOAT:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(234);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(252);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new MulExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(237);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(238);
						((MulExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((MulExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(239);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(240);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(241);
						((AndExprContext)_localctx).op = match(AND);
						setState(242);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(243);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(244);
						((AddExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(245);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(246);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(247);
						((OrExprContext)_localctx).op = match(OR);
						setState(248);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new RelExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(249);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(250);
						((RelExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << LT) | (1L << GT) | (1L << NEQ) | (1L << LTEQ) | (1L << GTEQ))) != 0)) ) {
							((RelExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(251);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParExprContext extends AtomContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParExprContext(AtomContext ctx) { copyFrom(ctx); }
	}
	public static class IdAtomContext extends AtomContext {
		public TerminalNode ID() { return getToken(Project2Parser.ID, 0); }
		public IdAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}
	public static class VarAtomContext extends AtomContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VarAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}
	public static class NumAtomContext extends AtomContext {
		public TerminalNode FLOAT() { return getToken(Project2Parser.FLOAT, 0); }
		public NumAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}
	public static class BoolAtomContext extends AtomContext {
		public TerminalNode TRUE() { return getToken(Project2Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(Project2Parser.FALSE, 0); }
		public BoolAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_atom);
		int _la;
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new ParExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				match(T__8);
				setState(258);
				expr(0);
				setState(259);
				match(T__9);
				}
				break;
			case 2:
				_localctx = new VarAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				variable();
				}
				break;
			case 3:
				_localctx = new NumAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				match(FLOAT);
				}
				break;
			case 4:
				_localctx = new BoolAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(263);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 5:
				_localctx = new IdAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(264);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 25:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u010e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\5\4E\n\4\3\5\3\5\3\5\3\5\3\5\5\5L\n\5\3\6\3\6\7\6P\n\6\f\6\16"+
		"\6S\13\6\3\6\3\6\3\7\3\7\7\7Y\n\7\f\7\16\7\\\13\7\3\b\3\b\3\b\7\ba\n\b"+
		"\f\b\16\bd\13\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\7\17~\n\17\f\17\16\17"+
		"\u0081\13\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u008d"+
		"\n\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\7\23"+
		"\u009b\n\23\f\23\16\23\u009e\13\23\3\23\3\23\7\23\u00a2\n\23\f\23\16\23"+
		"\u00a5\13\23\5\23\u00a7\n\23\3\24\3\24\3\24\7\24\u00ac\n\24\f\24\16\24"+
		"\u00af\13\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\5\27\u00b9\n\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\7\32\u00ce\n\32\f\32\16\32\u00d1\13\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u00db\n\32\f\32\16\32\u00de\13"+
		"\32\3\32\3\32\3\32\5\32\u00e3\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\5\33\u00ee\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u00ff\n\33\f\33\16\33\u0102\13\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u010c\n\34\3\34\2\3\64\35"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\7\3\2."+
		"\62\3\2\34\36\3\2\37 \3\2$)\3\2*+\2\u0114\28\3\2\2\2\4;\3\2\2\2\6D\3\2"+
		"\2\2\bK\3\2\2\2\nM\3\2\2\2\fV\3\2\2\2\16]\3\2\2\2\20i\3\2\2\2\22k\3\2"+
		"\2\2\24n\3\2\2\2\26q\3\2\2\2\30t\3\2\2\2\32y\3\2\2\2\34{\3\2\2\2\36\u008c"+
		"\3\2\2\2 \u008e\3\2\2\2\"\u0090\3\2\2\2$\u0095\3\2\2\2&\u00a8\3\2\2\2"+
		"(\u00b0\3\2\2\2*\u00b3\3\2\2\2,\u00b8\3\2\2\2.\u00ba\3\2\2\2\60\u00bf"+
		"\3\2\2\2\62\u00e2\3\2\2\2\64\u00ed\3\2\2\2\66\u010b\3\2\2\289\5\4\3\2"+
		"9:\7\2\2\3:\3\3\2\2\2;<\7\r\2\2<=\7\65\2\2=>\7\3\2\2>?\5\6\4\2?\5\3\2"+
		"\2\2@E\3\2\2\2AB\5\b\5\2BC\5\6\4\2CE\3\2\2\2D@\3\2\2\2DA\3\2\2\2E\7\3"+
		"\2\2\2FL\5\f\7\2GL\5\22\n\2HL\5\26\f\2IL\5\32\16\2JL\5\n\6\2KF\3\2\2\2"+
		"KG\3\2\2\2KH\3\2\2\2KI\3\2\2\2KJ\3\2\2\2L\t\3\2\2\2MQ\7\4\2\2NP\7\65\2"+
		"\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\7\5\2"+
		"\2U\13\3\2\2\2VZ\7\16\2\2WY\5\16\b\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z["+
		"\3\2\2\2[\r\3\2\2\2\\Z\3\2\2\2]b\5\20\t\2^_\7\6\2\2_a\5\20\t\2`^\3\2\2"+
		"\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7\7\2\2fg\7\33"+
		"\2\2gh\7\3\2\2h\17\3\2\2\2ij\7\65\2\2j\21\3\2\2\2kl\7\17\2\2lm\5\24\13"+
		"\2m\23\3\2\2\2no\7\65\2\2op\7\3\2\2p\25\3\2\2\2qr\7\20\2\2rs\5\30\r\2"+
		"s\27\3\2\2\2tu\7\65\2\2uv\7\7\2\2vw\7\33\2\2wx\7\3\2\2x\31\3\2\2\2yz\5"+
		"\34\17\2z\33\3\2\2\2{\177\7\21\2\2|~\5\36\20\2}|\3\2\2\2~\u0081\3\2\2"+
		"\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2"+
		"\2\u0082\u0083\5 \21\2\u0083\u0084\7\b\2\2\u0084\35\3\2\2\2\u0085\u008d"+
		"\5\"\22\2\u0086\u008d\5$\23\2\u0087\u008d\5(\25\2\u0088\u008d\5*\26\2"+
		"\u0089\u008d\5,\27\2\u008a\u008d\5\62\32\2\u008b\u008d\5\n\6\2\u008c\u0085"+
		"\3\2\2\2\u008c\u0086\3\2\2\2\u008c\u0087\3\2\2\2\u008c\u0088\3\2\2\2\u008c"+
		"\u0089\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\37\3\2\2"+
		"\2\u008e\u008f\7\22\2\2\u008f!\3\2\2\2\u0090\u0091\5\20\t\2\u0091\u0092"+
		"\7\t\2\2\u0092\u0093\5\64\33\2\u0093\u0094\7\3\2\2\u0094#\3\2\2\2\u0095"+
		"\u0096\7\23\2\2\u0096\u009c\5&\24\2\u0097\u0098\7\25\2\2\u0098\u0099\7"+
		"\23\2\2\u0099\u009b\5&\24\2\u009a\u0097\3\2\2\2\u009b\u009e\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a6\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009f\u00a3\7\25\2\2\u00a0\u00a2\5\36\20\2\u00a1\u00a0\3\2\2\2\u00a2"+
		"\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a7\3\2"+
		"\2\2\u00a5\u00a3\3\2\2\2\u00a6\u009f\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"%\3\2\2\2\u00a8\u00a9\5\64\33\2\u00a9\u00ad\7\24\2\2\u00aa\u00ac\5\36"+
		"\20\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\'\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7\26\2"+
		"\2\u00b1\u00b2\7\3\2\2\u00b2)\3\2\2\2\u00b3\u00b4\7\27\2\2\u00b4\u00b5"+
		"\7\3\2\2\u00b5+\3\2\2\2\u00b6\u00b9\5.\30\2\u00b7\u00b9\5\60\31\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9-\3\2\2\2\u00ba\u00bb\7\30\2\2"+
		"\u00bb\u00bc\5\64\33\2\u00bc\u00bd\7\31\2\2\u00bd\u00be\5\34\17\2\u00be"+
		"/\3\2\2\2\u00bf\u00c0\7\32\2\2\u00c0\u00c1\5\20\t\2\u00c1\u00c2\7\t\2"+
		"\2\u00c2\u00c3\5\64\33\2\u00c3\u00c4\7\n\2\2\u00c4\u00c5\5\64\33\2\u00c5"+
		"\u00c6\7\31\2\2\u00c6\u00c7\5\34\17\2\u00c7\61\3\2\2\2\u00c8\u00c9\7,"+
		"\2\2\u00c9\u00ca\7\13\2\2\u00ca\u00cf\5\20\t\2\u00cb\u00cc\7\6\2\2\u00cc"+
		"\u00ce\5\20\t\2\u00cd\u00cb\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3"+
		"\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2"+
		"\u00d3\7\f\2\2\u00d3\u00d4\7\3\2\2\u00d4\u00e3\3\2\2\2\u00d5\u00d6\7-"+
		"\2\2\u00d6\u00d7\7\13\2\2\u00d7\u00dc\5\64\33\2\u00d8\u00d9\7\6\2\2\u00d9"+
		"\u00db\5\64\33\2\u00da\u00d8\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3"+
		"\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df"+
		"\u00e0\7\f\2\2\u00e0\u00e1\7\3\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00c8\3\2"+
		"\2\2\u00e2\u00d5\3\2\2\2\u00e3\63\3\2\2\2\u00e4\u00e5\b\33\1\2\u00e5\u00e6"+
		"\7!\2\2\u00e6\u00ee\5\64\33\n\u00e7\u00e8\t\2\2\2\u00e8\u00e9\7\13\2\2"+
		"\u00e9\u00ea\5\64\33\2\u00ea\u00eb\7\f\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ee"+
		"\5\66\34\2\u00ed\u00e4\3\2\2\2\u00ed\u00e7\3\2\2\2\u00ed\u00ec\3\2\2\2"+
		"\u00ee\u0100\3\2\2\2\u00ef\u00f0\f\t\2\2\u00f0\u00f1\t\3\2\2\u00f1\u00ff"+
		"\5\64\33\n\u00f2\u00f3\f\b\2\2\u00f3\u00f4\7\"\2\2\u00f4\u00ff\5\64\33"+
		"\t\u00f5\u00f6\f\7\2\2\u00f6\u00f7\t\4\2\2\u00f7\u00ff\5\64\33\b\u00f8"+
		"\u00f9\f\6\2\2\u00f9\u00fa\7#\2\2\u00fa\u00ff\5\64\33\7\u00fb\u00fc\f"+
		"\4\2\2\u00fc\u00fd\t\5\2\2\u00fd\u00ff\5\64\33\5\u00fe\u00ef\3\2\2\2\u00fe"+
		"\u00f2\3\2\2\2\u00fe\u00f5\3\2\2\2\u00fe\u00f8\3\2\2\2\u00fe\u00fb\3\2"+
		"\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\65\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104\7\13\2\2\u0104\u0105\5\64"+
		"\33\2\u0105\u0106\7\f\2\2\u0106\u010c\3\2\2\2\u0107\u010c\5\20\t\2\u0108"+
		"\u010c\7\66\2\2\u0109\u010c\t\6\2\2\u010a\u010c\7\65\2\2\u010b\u0103\3"+
		"\2\2\2\u010b\u0107\3\2\2\2\u010b\u0108\3\2\2\2\u010b\u0109\3\2\2\2\u010b"+
		"\u010a\3\2\2\2\u010c\67\3\2\2\2\25DKQZb\177\u008c\u009c\u00a3\u00a6\u00ad"+
		"\u00b8\u00cf\u00dc\u00e2\u00ed\u00fe\u0100\u010b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}