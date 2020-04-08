// Generated from C:/itmo/parser-generator/src/main\Grammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GRAMMAR=1, HEADER=2, MEMBERS=3, INIT=4, RETURNS=5, LOCALS=6, SKIPPING=7, 
		OPEN_BRACKET=8, CLOSE_BRACKET=9, SQUARE_OPEN_BRACKET=10, SQUARE_CLOSE_BRACKET=11, 
		COLON=12, COMMA=13, SEMICOLON=14, OR=15, WORD=16, REGEX=17, CODE_TEXT=18, 
		PARAMETER_TEXT=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"GRAMMAR", "HEADER", "MEMBERS", "INIT", "RETURNS", "LOCALS", "SKIPPING", 
			"OPEN_BRACKET", "CLOSE_BRACKET", "SQUARE_OPEN_BRACKET", "SQUARE_CLOSE_BRACKET", 
			"COLON", "COMMA", "SEMICOLON", "OR", "WORD", "REGEX", "CODE_TEXT", "PARAMETER_TEXT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'grammar'", "'@header'", "'@members'", "'@init'", "'returns'", 
			"'locals'", "'-> skip'", "'('", "')'", "'['", "']'", "':'", "','", "';'", 
			"'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GRAMMAR", "HEADER", "MEMBERS", "INIT", "RETURNS", "LOCALS", "SKIPPING", 
			"OPEN_BRACKET", "CLOSE_BRACKET", "SQUARE_OPEN_BRACKET", "SQUARE_CLOSE_BRACKET", 
			"COLON", "COMMA", "SEMICOLON", "OR", "WORD", "REGEX", "CODE_TEXT", "PARAMETER_TEXT", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u00af\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\7\21t\n\21\f\21"+
		"\16\21w\13\21\3\21\3\21\3\21\7\21|\n\21\f\21\16\21\177\13\21\5\21\u0081"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\6\22\u008b\n\22\r\22\16"+
		"\22\u008c\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u0095\n\23\f\23\16\23\u0098"+
		"\13\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u00a1\n\24\f\24\16\24\u00a4"+
		"\13\24\3\24\3\24\3\24\3\25\6\25\u00aa\n\25\r\25\16\25\u00ab\3\25\3\25"+
		"\4\u0096\u00a2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3\2\6\4\2C\\c|\6\2\62;C"+
		"\\aac|\5\2\f\f))^^\5\2\13\f\17\17\"\"\2\u00b8\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\3+\3\2\2\2\5\63\3\2\2\2\7;\3\2\2\2\tD\3\2\2\2\13J\3\2"+
		"\2\2\rR\3\2\2\2\17Y\3\2\2\2\21a\3\2\2\2\23c\3\2\2\2\25e\3\2\2\2\27g\3"+
		"\2\2\2\31i\3\2\2\2\33k\3\2\2\2\35m\3\2\2\2\37o\3\2\2\2!q\3\2\2\2#\u0082"+
		"\3\2\2\2%\u0090\3\2\2\2\'\u009c\3\2\2\2)\u00a9\3\2\2\2+,\7i\2\2,-\7t\2"+
		"\2-.\7c\2\2./\7o\2\2/\60\7o\2\2\60\61\7c\2\2\61\62\7t\2\2\62\4\3\2\2\2"+
		"\63\64\7B\2\2\64\65\7j\2\2\65\66\7g\2\2\66\67\7c\2\2\678\7f\2\289\7g\2"+
		"\29:\7t\2\2:\6\3\2\2\2;<\7B\2\2<=\7o\2\2=>\7g\2\2>?\7o\2\2?@\7d\2\2@A"+
		"\7g\2\2AB\7t\2\2BC\7u\2\2C\b\3\2\2\2DE\7B\2\2EF\7k\2\2FG\7p\2\2GH\7k\2"+
		"\2HI\7v\2\2I\n\3\2\2\2JK\7t\2\2KL\7g\2\2LM\7v\2\2MN\7w\2\2NO\7t\2\2OP"+
		"\7p\2\2PQ\7u\2\2Q\f\3\2\2\2RS\7n\2\2ST\7q\2\2TU\7e\2\2UV\7c\2\2VW\7n\2"+
		"\2WX\7u\2\2X\16\3\2\2\2YZ\7/\2\2Z[\7@\2\2[\\\7\"\2\2\\]\7u\2\2]^\7m\2"+
		"\2^_\7k\2\2_`\7r\2\2`\20\3\2\2\2ab\7*\2\2b\22\3\2\2\2cd\7+\2\2d\24\3\2"+
		"\2\2ef\7]\2\2f\26\3\2\2\2gh\7_\2\2h\30\3\2\2\2ij\7<\2\2j\32\3\2\2\2kl"+
		"\7.\2\2l\34\3\2\2\2mn\7=\2\2n\36\3\2\2\2op\7~\2\2p \3\2\2\2qu\t\2\2\2"+
		"rt\t\3\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\u0080\3\2\2\2wu\3"+
		"\2\2\2xy\7\60\2\2y}\t\2\2\2z|\t\3\2\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2"+
		"}~\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\u0080x\3\2\2\2\u0080\u0081\3\2"+
		"\2\2\u0081\"\3\2\2\2\u0082\u008a\7)\2\2\u0083\u008b\n\4\2\2\u0084\u0085"+
		"\7^\2\2\u0085\u008b\7^\2\2\u0086\u0087\7^\2\2\u0087\u008b\7)\2\2\u0088"+
		"\u0089\7^\2\2\u0089\u008b\7\60\2\2\u008a\u0083\3\2\2\2\u008a\u0084\3\2"+
		"\2\2\u008a\u0086\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\7)"+
		"\2\2\u008f$\3\2\2\2\u0090\u0091\7^\2\2\u0091\u0092\7}\2\2\u0092\u0096"+
		"\3\2\2\2\u0093\u0095\13\2\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2"+
		"\u0096\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\u0099\u009a\7^\2\2\u009a\u009b\7\177\2\2\u009b&\3\2\2\2\u009c"+
		"\u009d\7^\2\2\u009d\u009e\7]\2\2\u009e\u00a2\3\2\2\2\u009f\u00a1\13\2"+
		"\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7^"+
		"\2\2\u00a6\u00a7\7_\2\2\u00a7(\3\2\2\2\u00a8\u00aa\t\5\2\2\u00a9\u00a8"+
		"\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00ae\b\25\2\2\u00ae*\3\2\2\2\13\2u}\u0080\u008a"+
		"\u008c\u0096\u00a2\u00ab\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}