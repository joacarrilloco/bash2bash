// Generated from C:/Users/moise/Desktop/X/Lenguajes/Project/grammar\b2b.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class b2bLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, OR=6, AND=7, AMP=8, SEMIC=9, DOUBLE_SEMIC=10, 
		SEMIAMP=11, DOUBLE_SEMIAMP=12, PIPE=13, PIPEAMP=14, L_BR=15, R_BR=16, 
		L_SQUAREBR=17, R_SQUAREBR=18, L_CURLYBR=19, R_CURLYBR=20, LT=21, GT=22, 
		EQ=23, NE=24, GOET=25, LOET=26, NOT=27, DOUBLE_QUOTE=28, SINGLE_QUOTE=29, 
		BACKSLASH=30, PR_if=31, PR_then=32, PR_elif=33, PR_else=34, PR_fi=35, 
		PR_time=36, PR_for=37, PR_in=38, PR_until=39, PR_while=40, PR_do=41, PR_done=42, 
		PR_case=43, PR_esac=44, PR_coproc=45, PR_select=46, PR_function=47, PR_Lsquarebracket=48, 
		PR_Rsquarebracket=49, PR_true=50, PR_false=51, PR_null=52, PR_echo=53, 
		PR_read=54, NUMERO=55, ID=56, FILENAME=57, SQ_WORD=58, DQ_WORD=59, COMMENT=60, 
		COMMENT_MUL=61, WS=62;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "OR", "AND", "AMP", "SEMIC", 
			"DOUBLE_SEMIC", "SEMIAMP", "DOUBLE_SEMIAMP", "PIPE", "PIPEAMP", "L_BR", 
			"R_BR", "L_SQUAREBR", "R_SQUAREBR", "L_CURLYBR", "R_CURLYBR", "LT", "GT", 
			"EQ", "NE", "GOET", "LOET", "NOT", "DOUBLE_QUOTE", "SINGLE_QUOTE", "BACKSLASH", 
			"PR_if", "PR_then", "PR_elif", "PR_else", "PR_fi", "PR_time", "PR_for", 
			"PR_in", "PR_until", "PR_while", "PR_do", "PR_done", "PR_case", "PR_esac", 
			"PR_coproc", "PR_select", "PR_function", "PR_Lsquarebracket", "PR_Rsquarebracket", 
			"PR_true", "PR_false", "PR_null", "PR_echo", "PR_read", "NUMERO", "ID", 
			"FILENAME", "SQ_WORD", "DQ_WORD", "COMMENT", "COMMENT_MUL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'dash'", "'-c'", "'-a'", "'-s'", "'$'", "'||'", "'&&'", "'&'", 
			"';'", "';;'", "';&'", "';;&'", "'|'", "'|&'", "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "'<'", "'>'", "'='", "'!='", "'>='", "'<='", "'!'", "'\"'", 
			"'''", "'\\'", "'if'", "'then'", "'elif'", "'else'", "'fi'", "'time'", 
			"'for'", "'in'", "'until'", "'while'", "'do'", "'done'", "'case'", "'esac'", 
			"'coproc'", "'select'", "'function'", "'[['", "']]'", "'true'", "'false'", 
			"''''", null, "'read'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "OR", "AND", "AMP", "SEMIC", "DOUBLE_SEMIC", 
			"SEMIAMP", "DOUBLE_SEMIAMP", "PIPE", "PIPEAMP", "L_BR", "R_BR", "L_SQUAREBR", 
			"R_SQUAREBR", "L_CURLYBR", "R_CURLYBR", "LT", "GT", "EQ", "NE", "GOET", 
			"LOET", "NOT", "DOUBLE_QUOTE", "SINGLE_QUOTE", "BACKSLASH", "PR_if", 
			"PR_then", "PR_elif", "PR_else", "PR_fi", "PR_time", "PR_for", "PR_in", 
			"PR_until", "PR_while", "PR_do", "PR_done", "PR_case", "PR_esac", "PR_coproc", 
			"PR_select", "PR_function", "PR_Lsquarebracket", "PR_Rsquarebracket", 
			"PR_true", "PR_false", "PR_null", "PR_echo", "PR_read", "NUMERO", "ID", 
			"FILENAME", "SQ_WORD", "DQ_WORD", "COMMENT", "COMMENT_MUL", "WS"
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


	public b2bLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "b2b.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2@\u019a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#"+
		"\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)"+
		"\3)\3)\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-"+
		"\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3"+
		"\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\7\66\u013c\n\66\f\66\16\66\u013f\13\66\3\67\3\67\3\67\3\67\3"+
		"\67\38\68\u0147\n8\r8\168\u0148\38\38\68\u014d\n8\r8\168\u014e\58\u0151"+
		"\n8\39\39\79\u0155\n9\f9\169\u0158\139\3:\3:\7:\u015c\n:\f:\16:\u015f"+
		"\13:\3:\3:\6:\u0163\n:\r:\16:\u0164\3;\3;\3;\3;\7;\u016b\n;\f;\16;\u016e"+
		"\13;\3;\3;\3<\3<\3<\3<\7<\u0176\n<\f<\16<\u0179\13<\3<\3<\3=\3=\7=\u017f"+
		"\n=\f=\16=\u0182\13=\3>\3>\3>\3>\3>\3>\3>\7>\u018b\n>\f>\16>\u018e\13"+
		">\3>\3>\3>\3>\3?\6?\u0195\n?\r?\16?\u0196\3?\3?\5\u016c\u0177\u018c\2"+
		"@\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o"+
		"9q:s;u<w=y>{?}@\3\2\n\3\2\f\f\3\2\62;\3\2\60\60\4\2C\\c|\6\2\62;C\\aa"+
		"c|\5\2\62;C\\c|\3\2\17\17\5\2\13\f\17\17\"\"\2\u01a7\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3"+
		"\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2"+
		"\2\3\177\3\2\2\2\5\u0084\3\2\2\2\7\u0087\3\2\2\2\t\u008a\3\2\2\2\13\u008d"+
		"\3\2\2\2\r\u008f\3\2\2\2\17\u0092\3\2\2\2\21\u0095\3\2\2\2\23\u0097\3"+
		"\2\2\2\25\u0099\3\2\2\2\27\u009c\3\2\2\2\31\u009f\3\2\2\2\33\u00a3\3\2"+
		"\2\2\35\u00a5\3\2\2\2\37\u00a8\3\2\2\2!\u00aa\3\2\2\2#\u00ac\3\2\2\2%"+
		"\u00ae\3\2\2\2\'\u00b0\3\2\2\2)\u00b2\3\2\2\2+\u00b4\3\2\2\2-\u00b6\3"+
		"\2\2\2/\u00b8\3\2\2\2\61\u00ba\3\2\2\2\63\u00bd\3\2\2\2\65\u00c0\3\2\2"+
		"\2\67\u00c3\3\2\2\29\u00c5\3\2\2\2;\u00c7\3\2\2\2=\u00c9\3\2\2\2?\u00cb"+
		"\3\2\2\2A\u00ce\3\2\2\2C\u00d3\3\2\2\2E\u00d8\3\2\2\2G\u00dd\3\2\2\2I"+
		"\u00e0\3\2\2\2K\u00e5\3\2\2\2M\u00e9\3\2\2\2O\u00ec\3\2\2\2Q\u00f2\3\2"+
		"\2\2S\u00f8\3\2\2\2U\u00fb\3\2\2\2W\u0100\3\2\2\2Y\u0105\3\2\2\2[\u010a"+
		"\3\2\2\2]\u0111\3\2\2\2_\u0118\3\2\2\2a\u0121\3\2\2\2c\u0124\3\2\2\2e"+
		"\u0127\3\2\2\2g\u012c\3\2\2\2i\u0132\3\2\2\2k\u0135\3\2\2\2m\u0140\3\2"+
		"\2\2o\u0146\3\2\2\2q\u0152\3\2\2\2s\u0159\3\2\2\2u\u0166\3\2\2\2w\u0171"+
		"\3\2\2\2y\u017c\3\2\2\2{\u0183\3\2\2\2}\u0194\3\2\2\2\177\u0080\7f\2\2"+
		"\u0080\u0081\7c\2\2\u0081\u0082\7u\2\2\u0082\u0083\7j\2\2\u0083\4\3\2"+
		"\2\2\u0084\u0085\7/\2\2\u0085\u0086\7e\2\2\u0086\6\3\2\2\2\u0087\u0088"+
		"\7/\2\2\u0088\u0089\7c\2\2\u0089\b\3\2\2\2\u008a\u008b\7/\2\2\u008b\u008c"+
		"\7u\2\2\u008c\n\3\2\2\2\u008d\u008e\7&\2\2\u008e\f\3\2\2\2\u008f\u0090"+
		"\7~\2\2\u0090\u0091\7~\2\2\u0091\16\3\2\2\2\u0092\u0093\7(\2\2\u0093\u0094"+
		"\7(\2\2\u0094\20\3\2\2\2\u0095\u0096\7(\2\2\u0096\22\3\2\2\2\u0097\u0098"+
		"\7=\2\2\u0098\24\3\2\2\2\u0099\u009a\7=\2\2\u009a\u009b\7=\2\2\u009b\26"+
		"\3\2\2\2\u009c\u009d\7=\2\2\u009d\u009e\7(\2\2\u009e\30\3\2\2\2\u009f"+
		"\u00a0\7=\2\2\u00a0\u00a1\7=\2\2\u00a1\u00a2\7(\2\2\u00a2\32\3\2\2\2\u00a3"+
		"\u00a4\7~\2\2\u00a4\34\3\2\2\2\u00a5\u00a6\7~\2\2\u00a6\u00a7\7(\2\2\u00a7"+
		"\36\3\2\2\2\u00a8\u00a9\7*\2\2\u00a9 \3\2\2\2\u00aa\u00ab\7+\2\2\u00ab"+
		"\"\3\2\2\2\u00ac\u00ad\7]\2\2\u00ad$\3\2\2\2\u00ae\u00af\7_\2\2\u00af"+
		"&\3\2\2\2\u00b0\u00b1\7}\2\2\u00b1(\3\2\2\2\u00b2\u00b3\7\177\2\2\u00b3"+
		"*\3\2\2\2\u00b4\u00b5\7>\2\2\u00b5,\3\2\2\2\u00b6\u00b7\7@\2\2\u00b7."+
		"\3\2\2\2\u00b8\u00b9\7?\2\2\u00b9\60\3\2\2\2\u00ba\u00bb\7#\2\2\u00bb"+
		"\u00bc\7?\2\2\u00bc\62\3\2\2\2\u00bd\u00be\7@\2\2\u00be\u00bf\7?\2\2\u00bf"+
		"\64\3\2\2\2\u00c0\u00c1\7>\2\2\u00c1\u00c2\7?\2\2\u00c2\66\3\2\2\2\u00c3"+
		"\u00c4\7#\2\2\u00c48\3\2\2\2\u00c5\u00c6\7$\2\2\u00c6:\3\2\2\2\u00c7\u00c8"+
		"\7)\2\2\u00c8<\3\2\2\2\u00c9\u00ca\7^\2\2\u00ca>\3\2\2\2\u00cb\u00cc\7"+
		"k\2\2\u00cc\u00cd\7h\2\2\u00cd@\3\2\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0"+
		"\7j\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7p\2\2\u00d2B\3\2\2\2\u00d3\u00d4"+
		"\7g\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7h\2\2\u00d7"+
		"D\3\2\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7n\2\2\u00da\u00db\7u\2\2\u00db"+
		"\u00dc\7g\2\2\u00dcF\3\2\2\2\u00dd\u00de\7h\2\2\u00de\u00df\7k\2\2\u00df"+
		"H\3\2\2\2\u00e0\u00e1\7v\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7o\2\2\u00e3"+
		"\u00e4\7g\2\2\u00e4J\3\2\2\2\u00e5\u00e6\7h\2\2\u00e6\u00e7\7q\2\2\u00e7"+
		"\u00e8\7t\2\2\u00e8L\3\2\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7p\2\2\u00eb"+
		"N\3\2\2\2\u00ec\u00ed\7w\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef\7v\2\2\u00ef"+
		"\u00f0\7k\2\2\u00f0\u00f1\7n\2\2\u00f1P\3\2\2\2\u00f2\u00f3\7y\2\2\u00f3"+
		"\u00f4\7j\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7n\2\2\u00f6\u00f7\7g\2\2"+
		"\u00f7R\3\2\2\2\u00f8\u00f9\7f\2\2\u00f9\u00fa\7q\2\2\u00faT\3\2\2\2\u00fb"+
		"\u00fc\7f\2\2\u00fc\u00fd\7q\2\2\u00fd\u00fe\7p\2\2\u00fe\u00ff\7g\2\2"+
		"\u00ffV\3\2\2\2\u0100\u0101\7e\2\2\u0101\u0102\7c\2\2\u0102\u0103\7u\2"+
		"\2\u0103\u0104\7g\2\2\u0104X\3\2\2\2\u0105\u0106\7g\2\2\u0106\u0107\7"+
		"u\2\2\u0107\u0108\7c\2\2\u0108\u0109\7e\2\2\u0109Z\3\2\2\2\u010a\u010b"+
		"\7e\2\2\u010b\u010c\7q\2\2\u010c\u010d\7r\2\2\u010d\u010e\7t\2\2\u010e"+
		"\u010f\7q\2\2\u010f\u0110\7e\2\2\u0110\\\3\2\2\2\u0111\u0112\7u\2\2\u0112"+
		"\u0113\7g\2\2\u0113\u0114\7n\2\2\u0114\u0115\7g\2\2\u0115\u0116\7e\2\2"+
		"\u0116\u0117\7v\2\2\u0117^\3\2\2\2\u0118\u0119\7h\2\2\u0119\u011a\7w\2"+
		"\2\u011a\u011b\7p\2\2\u011b\u011c\7e\2\2\u011c\u011d\7v\2\2\u011d\u011e"+
		"\7k\2\2\u011e\u011f\7q\2\2\u011f\u0120\7p\2\2\u0120`\3\2\2\2\u0121\u0122"+
		"\7]\2\2\u0122\u0123\7]\2\2\u0123b\3\2\2\2\u0124\u0125\7_\2\2\u0125\u0126"+
		"\7_\2\2\u0126d\3\2\2\2\u0127\u0128\7v\2\2\u0128\u0129\7t\2\2\u0129\u012a"+
		"\7w\2\2\u012a\u012b\7g\2\2\u012bf\3\2\2\2\u012c\u012d\7h\2\2\u012d\u012e"+
		"\7c\2\2\u012e\u012f\7n\2\2\u012f\u0130\7u\2\2\u0130\u0131\7g\2\2\u0131"+
		"h\3\2\2\2\u0132\u0133\7)\2\2\u0133\u0134\7)\2\2\u0134j\3\2\2\2\u0135\u0136"+
		"\7g\2\2\u0136\u0137\7e\2\2\u0137\u0138\7j\2\2\u0138\u0139\7q\2\2\u0139"+
		"\u013d\3\2\2\2\u013a\u013c\n\2\2\2\u013b\u013a\3\2\2\2\u013c\u013f\3\2"+
		"\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013el\3\2\2\2\u013f\u013d"+
		"\3\2\2\2\u0140\u0141\7t\2\2\u0141\u0142\7g\2\2\u0142\u0143\7c\2\2\u0143"+
		"\u0144\7f\2\2\u0144n\3\2\2\2\u0145\u0147\t\3\2\2\u0146\u0145\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0150\3\2"+
		"\2\2\u014a\u014c\t\4\2\2\u014b\u014d\t\3\2\2\u014c\u014b\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2"+
		"\2\2\u0150\u014a\3\2\2\2\u0150\u0151\3\2\2\2\u0151p\3\2\2\2\u0152\u0156"+
		"\t\5\2\2\u0153\u0155\t\6\2\2\u0154\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157r\3\2\2\2\u0158\u0156\3\2\2\2"+
		"\u0159\u015d\t\5\2\2\u015a\u015c\t\6\2\2\u015b\u015a\3\2\2\2\u015c\u015f"+
		"\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f"+
		"\u015d\3\2\2\2\u0160\u0162\t\4\2\2\u0161\u0163\t\7\2\2\u0162\u0161\3\2"+
		"\2\2\u0163\u0164\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"t\3\2\2\2\u0166\u016c\7)\2\2\u0167\u0168\7^\2\2\u0168\u016b\7$\2\2\u0169"+
		"\u016b\13\2\2\2\u016a\u0167\3\2\2\2\u016a\u0169\3\2\2\2\u016b\u016e\3"+
		"\2\2\2\u016c\u016d\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016f\3\2\2\2\u016e"+
		"\u016c\3\2\2\2\u016f\u0170\7)\2\2\u0170v\3\2\2\2\u0171\u0177\7$\2\2\u0172"+
		"\u0173\7^\2\2\u0173\u0176\7$\2\2\u0174\u0176\13\2\2\2\u0175\u0172\3\2"+
		"\2\2\u0175\u0174\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0178\3\2\2\2\u0177"+
		"\u0175\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b\7$"+
		"\2\2\u017bx\3\2\2\2\u017c\u0180\7%\2\2\u017d\u017f\n\b\2\2\u017e\u017d"+
		"\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"z\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0184\7>\2\2\u0184\u0185\7>\2\2\u0185"+
		"\u0186\7G\2\2\u0186\u0187\7Q\2\2\u0187\u0188\7H\2\2\u0188\u018c\3\2\2"+
		"\2\u0189\u018b\13\2\2\2\u018a\u0189\3\2\2\2\u018b\u018e\3\2\2\2\u018c"+
		"\u018d\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u018f\3\2\2\2\u018e\u018c\3\2"+
		"\2\2\u018f\u0190\7G\2\2\u0190\u0191\7Q\2\2\u0191\u0192\7H\2\2\u0192|\3"+
		"\2\2\2\u0193\u0195\t\t\2\2\u0194\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
		"\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\b?"+
		"\2\2\u0199~\3\2\2\2\21\2\u013d\u0148\u014e\u0150\u0156\u015d\u0164\u016a"+
		"\u016c\u0175\u0177\u0180\u018c\u0196\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}