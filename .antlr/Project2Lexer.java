// Generated from /Users/wenyuchen/UF/COP4020/P2/Project2.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Project2Lexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "PROGRAM", "VAR", "PROCEDURE", "FUNCTION", "BEGIN", "END", "IF", 
		"THEN", "ELSE", "BREAK", "CONTINUE", "WHILE", "DO", "FOR", "TYPE", "MUL", 
		"DIV", "MOD", "ADD", "SUB", "NOT", "AND", "OR", "EQ", "LT", "GT", "NEQ", 
		"LTEQ", "GTEQ", "TRUE", "FALSE", "READLN", "WRITELN", "SQRT", "SIN", "COS", 
		"LN", "EXP", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", 
		"M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", 
		"REAL", "BOOLEAN", "ID", "FLOAT", "INT", "WS"
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


	public Project2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Project2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u01c7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\3\2\3\2\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\5"+
		"\32\u0110\n\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3"+
		"\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3"+
		"+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3"+
		"\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3"+
		"\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3"+
		"?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3"+
		"K\3K\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3M\3M\3N\3N\7N\u01a9\nN\fN\16N\u01ac"+
		"\13N\3O\7O\u01af\nO\fO\16O\u01b2\13O\3O\5O\u01b5\nO\3O\6O\u01b8\nO\rO"+
		"\16O\u01b9\3P\6P\u01bd\nP\rP\16P\u01be\3Q\6Q\u01c2\nQ\rQ\16Q\u01c3\3Q"+
		"\3Q\2\2R\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\2e\2g\2i\2k\2"+
		"m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089"+
		"\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\63\u0099\64\u009b"+
		"\65\u009d\66\u009f\67\u00a18\3\2!\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2"+
		"GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4"+
		"\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXx"+
		"x\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;"+
		"\3\2\60\60\5\2\13\f\17\17\"\"\2\u01b3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2"+
		"\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\3"+
		"\u00a3\3\2\2\2\5\u00a5\3\2\2\2\7\u00a8\3\2\2\2\t\u00ab\3\2\2\2\13\u00ad"+
		"\3\2\2\2\r\u00af\3\2\2\2\17\u00b1\3\2\2\2\21\u00b4\3\2\2\2\23\u00b7\3"+
		"\2\2\2\25\u00b9\3\2\2\2\27\u00bb\3\2\2\2\31\u00c3\3\2\2\2\33\u00c7\3\2"+
		"\2\2\35\u00d1\3\2\2\2\37\u00da\3\2\2\2!\u00e0\3\2\2\2#\u00e4\3\2\2\2%"+
		"\u00e7\3\2\2\2\'\u00ec\3\2\2\2)\u00f1\3\2\2\2+\u00f7\3\2\2\2-\u0100\3"+
		"\2\2\2/\u0106\3\2\2\2\61\u0109\3\2\2\2\63\u010f\3\2\2\2\65\u0111\3\2\2"+
		"\2\67\u0113\3\2\2\29\u0115\3\2\2\2;\u0119\3\2\2\2=\u011b\3\2\2\2?\u011d"+
		"\3\2\2\2A\u0121\3\2\2\2C\u0125\3\2\2\2E\u0128\3\2\2\2G\u012a\3\2\2\2I"+
		"\u012c\3\2\2\2K\u012e\3\2\2\2M\u0131\3\2\2\2O\u0134\3\2\2\2Q\u0137\3\2"+
		"\2\2S\u013c\3\2\2\2U\u0142\3\2\2\2W\u0149\3\2\2\2Y\u0151\3\2\2\2[\u0156"+
		"\3\2\2\2]\u015a\3\2\2\2_\u015e\3\2\2\2a\u0161\3\2\2\2c\u0165\3\2\2\2e"+
		"\u0167\3\2\2\2g\u0169\3\2\2\2i\u016b\3\2\2\2k\u016d\3\2\2\2m\u016f\3\2"+
		"\2\2o\u0171\3\2\2\2q\u0173\3\2\2\2s\u0175\3\2\2\2u\u0177\3\2\2\2w\u0179"+
		"\3\2\2\2y\u017b\3\2\2\2{\u017d\3\2\2\2}\u017f\3\2\2\2\177\u0181\3\2\2"+
		"\2\u0081\u0183\3\2\2\2\u0083\u0185\3\2\2\2\u0085\u0187\3\2\2\2\u0087\u0189"+
		"\3\2\2\2\u0089\u018b\3\2\2\2\u008b\u018d\3\2\2\2\u008d\u018f\3\2\2\2\u008f"+
		"\u0191\3\2\2\2\u0091\u0193\3\2\2\2\u0093\u0195\3\2\2\2\u0095\u0197\3\2"+
		"\2\2\u0097\u0199\3\2\2\2\u0099\u019e\3\2\2\2\u009b\u01a6\3\2\2\2\u009d"+
		"\u01b4\3\2\2\2\u009f\u01bc\3\2\2\2\u00a1\u01c1\3\2\2\2\u00a3\u00a4\7="+
		"\2\2\u00a4\4\3\2\2\2\u00a5\u00a6\7*\2\2\u00a6\u00a7\7,\2\2\u00a7\6\3\2"+
		"\2\2\u00a8\u00a9\7,\2\2\u00a9\u00aa\7+\2\2\u00aa\b\3\2\2\2\u00ab\u00ac"+
		"\7.\2\2\u00ac\n\3\2\2\2\u00ad\u00ae\7<\2\2\u00ae\f\3\2\2\2\u00af\u00b0"+
		"\7\60\2\2\u00b0\16\3\2\2\2\u00b1\u00b2\7<\2\2\u00b2\u00b3\7?\2\2\u00b3"+
		"\20\3\2\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7q\2\2\u00b6\22\3\2\2\2\u00b7"+
		"\u00b8\7*\2\2\u00b8\24\3\2\2\2\u00b9\u00ba\7+\2\2\u00ba\26\3\2\2\2\u00bb"+
		"\u00bc\5\u0081A\2\u00bc\u00bd\5\u0085C\2\u00bd\u00be\5\177@\2\u00be\u00bf"+
		"\5o8\2\u00bf\u00c0\5\u0085C\2\u00c0\u00c1\5c\62\2\u00c1\u00c2\5{>\2\u00c2"+
		"\30\3\2\2\2\u00c3\u00c4\5\u008dG\2\u00c4\u00c5\5c\62\2\u00c5\u00c6\5\u0085"+
		"C\2\u00c6\32\3\2\2\2\u00c7\u00c8\5\u0081A\2\u00c8\u00c9\5\u0085C\2\u00c9"+
		"\u00ca\5\177@\2\u00ca\u00cb\5g\64\2\u00cb\u00cc\5k\66\2\u00cc\u00cd\5"+
		"i\65\2\u00cd\u00ce\5\u008bF\2\u00ce\u00cf\5\u0085C\2\u00cf\u00d0\5k\66"+
		"\2\u00d0\34\3\2\2\2\u00d1\u00d2\5m\67\2\u00d2\u00d3\5\u008bF\2\u00d3\u00d4"+
		"\5}?\2\u00d4\u00d5\5g\64\2\u00d5\u00d6\5\u0089E\2\u00d6\u00d7\5s:\2\u00d7"+
		"\u00d8\5\177@\2\u00d8\u00d9\5}?\2\u00d9\36\3\2\2\2\u00da\u00db\5e\63\2"+
		"\u00db\u00dc\5k\66\2\u00dc\u00dd\5o8\2\u00dd\u00de\5s:\2\u00de\u00df\5"+
		"}?\2\u00df \3\2\2\2\u00e0\u00e1\5k\66\2\u00e1\u00e2\5}?\2\u00e2\u00e3"+
		"\5i\65\2\u00e3\"\3\2\2\2\u00e4\u00e5\5s:\2\u00e5\u00e6\5m\67\2\u00e6$"+
		"\3\2\2\2\u00e7\u00e8\5\u0089E\2\u00e8\u00e9\5q9\2\u00e9\u00ea\5k\66\2"+
		"\u00ea\u00eb\5}?\2\u00eb&\3\2\2\2\u00ec\u00ed\5k\66\2\u00ed\u00ee\5y="+
		"\2\u00ee\u00ef\5\u0087D\2\u00ef\u00f0\5k\66\2\u00f0(\3\2\2\2\u00f1\u00f2"+
		"\5e\63\2\u00f2\u00f3\5\u0085C\2\u00f3\u00f4\5k\66\2\u00f4\u00f5\5c\62"+
		"\2\u00f5\u00f6\5w<\2\u00f6*\3\2\2\2\u00f7\u00f8\5g\64\2\u00f8\u00f9\5"+
		"\177@\2\u00f9\u00fa\5}?\2\u00fa\u00fb\5\u0089E\2\u00fb\u00fc\5s:\2\u00fc"+
		"\u00fd\5}?\2\u00fd\u00fe\5\u008bF\2\u00fe\u00ff\5k\66\2\u00ff,\3\2\2\2"+
		"\u0100\u0101\5\u008fH\2\u0101\u0102\5q9\2\u0102\u0103\5s:\2\u0103\u0104"+
		"\5y=\2\u0104\u0105\5k\66\2\u0105.\3\2\2\2\u0106\u0107\5i\65\2\u0107\u0108"+
		"\5\177@\2\u0108\60\3\2\2\2\u0109\u010a\5m\67\2\u010a\u010b\5\177@\2\u010b"+
		"\u010c\5\u0085C\2\u010c\62\3\2\2\2\u010d\u0110\5\u0097L\2\u010e\u0110"+
		"\5\u0099M\2\u010f\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110\64\3\2\2\2\u0111"+
		"\u0112\7,\2\2\u0112\66\3\2\2\2\u0113\u0114\7\61\2\2\u01148\3\2\2\2\u0115"+
		"\u0116\5{>\2\u0116\u0117\5\177@\2\u0117\u0118\5i\65\2\u0118:\3\2\2\2\u0119"+
		"\u011a\7-\2\2\u011a<\3\2\2\2\u011b\u011c\7/\2\2\u011c>\3\2\2\2\u011d\u011e"+
		"\5}?\2\u011e\u011f\5\177@\2\u011f\u0120\5\u0089E\2\u0120@\3\2\2\2\u0121"+
		"\u0122\5c\62\2\u0122\u0123\5}?\2\u0123\u0124\5i\65\2\u0124B\3\2\2\2\u0125"+
		"\u0126\5\177@\2\u0126\u0127\5\u0085C\2\u0127D\3\2\2\2\u0128\u0129\7?\2"+
		"\2\u0129F\3\2\2\2\u012a\u012b\7>\2\2\u012bH\3\2\2\2\u012c\u012d\7@\2\2"+
		"\u012dJ\3\2\2\2\u012e\u012f\7>\2\2\u012f\u0130\7@\2\2\u0130L\3\2\2\2\u0131"+
		"\u0132\7>\2\2\u0132\u0133\7?\2\2\u0133N\3\2\2\2\u0134\u0135\7@\2\2\u0135"+
		"\u0136\7?\2\2\u0136P\3\2\2\2\u0137\u0138\5\u0089E\2\u0138\u0139\5\u0085"+
		"C\2\u0139\u013a\5\u008bF\2\u013a\u013b\5k\66\2\u013bR\3\2\2\2\u013c\u013d"+
		"\5m\67\2\u013d\u013e\5c\62\2\u013e\u013f\5y=\2\u013f\u0140\5\u0087D\2"+
		"\u0140\u0141\5k\66\2\u0141T\3\2\2\2\u0142\u0143\5\u0085C\2\u0143\u0144"+
		"\5k\66\2\u0144\u0145\5c\62\2\u0145\u0146\5i\65\2\u0146\u0147\5y=\2\u0147"+
		"\u0148\5}?\2\u0148V\3\2\2\2\u0149\u014a\5\u008fH\2\u014a\u014b\5\u0085"+
		"C\2\u014b\u014c\5s:\2\u014c\u014d\5\u0089E\2\u014d\u014e\5k\66\2\u014e"+
		"\u014f\5y=\2\u014f\u0150\5}?\2\u0150X\3\2\2\2\u0151\u0152\5\u0087D\2\u0152"+
		"\u0153\5\u0083B\2\u0153\u0154\5\u0085C\2\u0154\u0155\5\u0089E\2\u0155"+
		"Z\3\2\2\2\u0156\u0157\5\u0087D\2\u0157\u0158\5s:\2\u0158\u0159\5}?\2\u0159"+
		"\\\3\2\2\2\u015a\u015b\5g\64\2\u015b\u015c\5\177@\2\u015c\u015d\5\u0087"+
		"D\2\u015d^\3\2\2\2\u015e\u015f\5y=\2\u015f\u0160\5}?\2\u0160`\3\2\2\2"+
		"\u0161\u0162\5k\66\2\u0162\u0163\5\u0091I\2\u0163\u0164\5\u0081A\2\u0164"+
		"b\3\2\2\2\u0165\u0166\t\2\2\2\u0166d\3\2\2\2\u0167\u0168\t\3\2\2\u0168"+
		"f\3\2\2\2\u0169\u016a\t\4\2\2\u016ah\3\2\2\2\u016b\u016c\t\5\2\2\u016c"+
		"j\3\2\2\2\u016d\u016e\t\6\2\2\u016el\3\2\2\2\u016f\u0170\t\7\2\2\u0170"+
		"n\3\2\2\2\u0171\u0172\t\b\2\2\u0172p\3\2\2\2\u0173\u0174\t\t\2\2\u0174"+
		"r\3\2\2\2\u0175\u0176\t\n\2\2\u0176t\3\2\2\2\u0177\u0178\t\13\2\2\u0178"+
		"v\3\2\2\2\u0179\u017a\t\f\2\2\u017ax\3\2\2\2\u017b\u017c\t\r\2\2\u017c"+
		"z\3\2\2\2\u017d\u017e\t\16\2\2\u017e|\3\2\2\2\u017f\u0180\t\17\2\2\u0180"+
		"~\3\2\2\2\u0181\u0182\t\20\2\2\u0182\u0080\3\2\2\2\u0183\u0184\t\21\2"+
		"\2\u0184\u0082\3\2\2\2\u0185\u0186\t\22\2\2\u0186\u0084\3\2\2\2\u0187"+
		"\u0188\t\23\2\2\u0188\u0086\3\2\2\2\u0189\u018a\t\24\2\2\u018a\u0088\3"+
		"\2\2\2\u018b\u018c\t\25\2\2\u018c\u008a\3\2\2\2\u018d\u018e\t\26\2\2\u018e"+
		"\u008c\3\2\2\2\u018f\u0190\t\27\2\2\u0190\u008e\3\2\2\2\u0191\u0192\t"+
		"\30\2\2\u0192\u0090\3\2\2\2\u0193\u0194\t\31\2\2\u0194\u0092\3\2\2\2\u0195"+
		"\u0196\t\32\2\2\u0196\u0094\3\2\2\2\u0197\u0198\t\33\2\2\u0198\u0096\3"+
		"\2\2\2\u0199\u019a\5\u0085C\2\u019a\u019b\5k\66\2\u019b\u019c\5c\62\2"+
		"\u019c\u019d\5y=\2\u019d\u0098\3\2\2\2\u019e\u019f\5e\63\2\u019f\u01a0"+
		"\5\177@\2\u01a0\u01a1\5\177@\2\u01a1\u01a2\5y=\2\u01a2\u01a3\5k\66\2\u01a3"+
		"\u01a4\5c\62\2\u01a4\u01a5\5}?\2\u01a5\u009a\3\2\2\2\u01a6\u01aa\t\34"+
		"\2\2\u01a7\u01a9\t\35\2\2\u01a8\u01a7\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa"+
		"\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u009c\3\2\2\2\u01ac\u01aa\3\2"+
		"\2\2\u01ad\u01af\t\36\2\2\u01ae\u01ad\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0"+
		"\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01b0\3\2"+
		"\2\2\u01b3\u01b5\t\37\2\2\u01b4\u01b0\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5"+
		"\u01b7\3\2\2\2\u01b6\u01b8\t\36\2\2\u01b7\u01b6\3\2\2\2\u01b8\u01b9\3"+
		"\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u009e\3\2\2\2\u01bb"+
		"\u01bd\t\36\2\2\u01bc\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bc\3"+
		"\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u00a0\3\2\2\2\u01c0\u01c2\t \2\2\u01c1"+
		"\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2"+
		"\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\bQ\2\2\u01c6\u00a2\3\2\2\2\n\2\u010f"+
		"\u01aa\u01b0\u01b4\u01b9\u01be\u01c3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}