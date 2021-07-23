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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, OR=13, AND=14, AMP=15, SEMIC=16, DOUBLE_SEMIC=17, 
		SEMIAMP=18, DOUBLE_SEMIAMP=19, PIPE=20, PIPEAMP=21, L_BR=22, R_BR=23, 
		L_SQUAREBR=24, R_SQUAREBR=25, L_CURLYBR=26, R_CURLYBR=27, LT=28, GT=29, 
		Exclamation=30, DOUBLE_QUOTE=31, SINGLE_QUOTE=32, BACKSLASH=33, PR_if=34, 
		PR_then=35, PR_elif=36, PR_else=37, PR_fi=38, PR_time=39, PR_for=40, PR_in=41, 
		PR_until=42, PR_while=43, PR_do=44, PR_done=45, PR_case=46, PR_esac=47, 
		PR_coproc=48, PR_select=49, PR_function=50, PR_Lsquarebracket=51, PR_Rsquarebracket=52, 
		ID=53, FILENAME=54, SQ_WORD=55, DQ_WORD=56, COMMENT=57, COMMENT_MUL=58, 
		WS=59;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "OR", "AND", "AMP", "SEMIC", "DOUBLE_SEMIC", 
			"SEMIAMP", "DOUBLE_SEMIAMP", "PIPE", "PIPEAMP", "L_BR", "R_BR", "L_SQUAREBR", 
			"R_SQUAREBR", "L_CURLYBR", "R_CURLYBR", "LT", "GT", "Exclamation", "DOUBLE_QUOTE", 
			"SINGLE_QUOTE", "BACKSLASH", "PR_if", "PR_then", "PR_elif", "PR_else", 
			"PR_fi", "PR_time", "PR_for", "PR_in", "PR_until", "PR_while", "PR_do", 
			"PR_done", "PR_case", "PR_esac", "PR_coproc", "PR_select", "PR_function", 
			"PR_Lsquarebracket", "PR_Rsquarebracket", "ID", "FILENAME", "SQ_WORD", 
			"DQ_WORD", "COMMENT", "COMMENT_MUL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'dash'", "'-'", "'c'", "'a'", "'s'", "'echo'", "'n'", "'e'", "'E'", 
			"'--'", "'help'", "'version'", "'||'", "'&&'", "'&'", "';'", "';;'", 
			"';&'", "';;&'", "'|'", "'|&'", "'('", "')'", "'['", "']'", "'{'", "'}'", 
			"'<'", "'>'", "'!'", "'\"'", "'''", "'\\'", "'if'", "'then'", "'elif'", 
			"'else'", "'fi'", "'time'", "'for'", "'in'", "'until'", "'while'", "'do'", 
			"'done'", "'case'", "'esac'", "'coproc'", "'select'", "'function'", "'[['", 
			"']]'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "OR", "AND", "AMP", "SEMIC", "DOUBLE_SEMIC", "SEMIAMP", "DOUBLE_SEMIAMP", 
			"PIPE", "PIPEAMP", "L_BR", "R_BR", "L_SQUAREBR", "R_SQUAREBR", "L_CURLYBR", 
			"R_CURLYBR", "LT", "GT", "Exclamation", "DOUBLE_QUOTE", "SINGLE_QUOTE", 
			"BACKSLASH", "PR_if", "PR_then", "PR_elif", "PR_else", "PR_fi", "PR_time", 
			"PR_for", "PR_in", "PR_until", "PR_while", "PR_do", "PR_done", "PR_case", 
			"PR_esac", "PR_coproc", "PR_select", "PR_function", "PR_Lsquarebracket", 
			"PR_Rsquarebracket", "ID", "FILENAME", "SQ_WORD", "DQ_WORD", "COMMENT", 
			"COMMENT_MUL", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2=\u0176\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3"+
		"%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3"+
		"*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3.\3"+
		"/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\7\66\u0131\n\66"+
		"\f\66\16\66\u0134\13\66\3\67\3\67\7\67\u0138\n\67\f\67\16\67\u013b\13"+
		"\67\3\67\3\67\6\67\u013f\n\67\r\67\16\67\u0140\38\38\38\38\78\u0147\n"+
		"8\f8\168\u014a\138\38\38\39\39\39\39\79\u0152\n9\f9\169\u0155\139\39\3"+
		"9\3:\3:\7:\u015b\n:\f:\16:\u015e\13:\3;\3;\3;\3;\3;\3;\3;\7;\u0167\n;"+
		"\f;\16;\u016a\13;\3;\3;\3;\3;\3<\6<\u0171\n<\r<\16<\u0172\3<\3<\5\u0148"+
		"\u0153\u0168\2=\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9q:s;u<w=\3\2\b\4\2C\\c|\6\2\62;C\\aac|\3\2\60\60\5\2\62"+
		";C\\c|\3\2\17\17\5\2\13\f\17\17\"\"\2\u017f\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2"+
		"s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\3y\3\2\2\2\5~\3\2\2\2\7\u0080\3\2\2\2"+
		"\t\u0082\3\2\2\2\13\u0084\3\2\2\2\r\u0086\3\2\2\2\17\u008b\3\2\2\2\21"+
		"\u008d\3\2\2\2\23\u008f\3\2\2\2\25\u0091\3\2\2\2\27\u0094\3\2\2\2\31\u0099"+
		"\3\2\2\2\33\u00a1\3\2\2\2\35\u00a4\3\2\2\2\37\u00a7\3\2\2\2!\u00a9\3\2"+
		"\2\2#\u00ab\3\2\2\2%\u00ae\3\2\2\2\'\u00b1\3\2\2\2)\u00b5\3\2\2\2+\u00b7"+
		"\3\2\2\2-\u00ba\3\2\2\2/\u00bc\3\2\2\2\61\u00be\3\2\2\2\63\u00c0\3\2\2"+
		"\2\65\u00c2\3\2\2\2\67\u00c4\3\2\2\29\u00c6\3\2\2\2;\u00c8\3\2\2\2=\u00ca"+
		"\3\2\2\2?\u00cc\3\2\2\2A\u00ce\3\2\2\2C\u00d0\3\2\2\2E\u00d2\3\2\2\2G"+
		"\u00d5\3\2\2\2I\u00da\3\2\2\2K\u00df\3\2\2\2M\u00e4\3\2\2\2O\u00e7\3\2"+
		"\2\2Q\u00ec\3\2\2\2S\u00f0\3\2\2\2U\u00f3\3\2\2\2W\u00f9\3\2\2\2Y\u00ff"+
		"\3\2\2\2[\u0102\3\2\2\2]\u0107\3\2\2\2_\u010c\3\2\2\2a\u0111\3\2\2\2c"+
		"\u0118\3\2\2\2e\u011f\3\2\2\2g\u0128\3\2\2\2i\u012b\3\2\2\2k\u012e\3\2"+
		"\2\2m\u0135\3\2\2\2o\u0142\3\2\2\2q\u014d\3\2\2\2s\u0158\3\2\2\2u\u015f"+
		"\3\2\2\2w\u0170\3\2\2\2yz\7f\2\2z{\7c\2\2{|\7u\2\2|}\7j\2\2}\4\3\2\2\2"+
		"~\177\7/\2\2\177\6\3\2\2\2\u0080\u0081\7e\2\2\u0081\b\3\2\2\2\u0082\u0083"+
		"\7c\2\2\u0083\n\3\2\2\2\u0084\u0085\7u\2\2\u0085\f\3\2\2\2\u0086\u0087"+
		"\7g\2\2\u0087\u0088\7e\2\2\u0088\u0089\7j\2\2\u0089\u008a\7q\2\2\u008a"+
		"\16\3\2\2\2\u008b\u008c\7p\2\2\u008c\20\3\2\2\2\u008d\u008e\7g\2\2\u008e"+
		"\22\3\2\2\2\u008f\u0090\7G\2\2\u0090\24\3\2\2\2\u0091\u0092\7/\2\2\u0092"+
		"\u0093\7/\2\2\u0093\26\3\2\2\2\u0094\u0095\7j\2\2\u0095\u0096\7g\2\2\u0096"+
		"\u0097\7n\2\2\u0097\u0098\7r\2\2\u0098\30\3\2\2\2\u0099\u009a\7x\2\2\u009a"+
		"\u009b\7g\2\2\u009b\u009c\7t\2\2\u009c\u009d\7u\2\2\u009d\u009e\7k\2\2"+
		"\u009e\u009f\7q\2\2\u009f\u00a0\7p\2\2\u00a0\32\3\2\2\2\u00a1\u00a2\7"+
		"~\2\2\u00a2\u00a3\7~\2\2\u00a3\34\3\2\2\2\u00a4\u00a5\7(\2\2\u00a5\u00a6"+
		"\7(\2\2\u00a6\36\3\2\2\2\u00a7\u00a8\7(\2\2\u00a8 \3\2\2\2\u00a9\u00aa"+
		"\7=\2\2\u00aa\"\3\2\2\2\u00ab\u00ac\7=\2\2\u00ac\u00ad\7=\2\2\u00ad$\3"+
		"\2\2\2\u00ae\u00af\7=\2\2\u00af\u00b0\7(\2\2\u00b0&\3\2\2\2\u00b1\u00b2"+
		"\7=\2\2\u00b2\u00b3\7=\2\2\u00b3\u00b4\7(\2\2\u00b4(\3\2\2\2\u00b5\u00b6"+
		"\7~\2\2\u00b6*\3\2\2\2\u00b7\u00b8\7~\2\2\u00b8\u00b9\7(\2\2\u00b9,\3"+
		"\2\2\2\u00ba\u00bb\7*\2\2\u00bb.\3\2\2\2\u00bc\u00bd\7+\2\2\u00bd\60\3"+
		"\2\2\2\u00be\u00bf\7]\2\2\u00bf\62\3\2\2\2\u00c0\u00c1\7_\2\2\u00c1\64"+
		"\3\2\2\2\u00c2\u00c3\7}\2\2\u00c3\66\3\2\2\2\u00c4\u00c5\7\177\2\2\u00c5"+
		"8\3\2\2\2\u00c6\u00c7\7>\2\2\u00c7:\3\2\2\2\u00c8\u00c9\7@\2\2\u00c9<"+
		"\3\2\2\2\u00ca\u00cb\7#\2\2\u00cb>\3\2\2\2\u00cc\u00cd\7$\2\2\u00cd@\3"+
		"\2\2\2\u00ce\u00cf\7)\2\2\u00cfB\3\2\2\2\u00d0\u00d1\7^\2\2\u00d1D\3\2"+
		"\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7h\2\2\u00d4F\3\2\2\2\u00d5\u00d6"+
		"\7v\2\2\u00d6\u00d7\7j\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7p\2\2\u00d9"+
		"H\3\2\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7n\2\2\u00dc\u00dd\7k\2\2\u00dd"+
		"\u00de\7h\2\2\u00deJ\3\2\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1\7n\2\2\u00e1"+
		"\u00e2\7u\2\2\u00e2\u00e3\7g\2\2\u00e3L\3\2\2\2\u00e4\u00e5\7h\2\2\u00e5"+
		"\u00e6\7k\2\2\u00e6N\3\2\2\2\u00e7\u00e8\7v\2\2\u00e8\u00e9\7k\2\2\u00e9"+
		"\u00ea\7o\2\2\u00ea\u00eb\7g\2\2\u00ebP\3\2\2\2\u00ec\u00ed\7h\2\2\u00ed"+
		"\u00ee\7q\2\2\u00ee\u00ef\7t\2\2\u00efR\3\2\2\2\u00f0\u00f1\7k\2\2\u00f1"+
		"\u00f2\7p\2\2\u00f2T\3\2\2\2\u00f3\u00f4\7w\2\2\u00f4\u00f5\7p\2\2\u00f5"+
		"\u00f6\7v\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8\7n\2\2\u00f8V\3\2\2\2\u00f9"+
		"\u00fa\7y\2\2\u00fa\u00fb\7j\2\2\u00fb\u00fc\7k\2\2\u00fc\u00fd\7n\2\2"+
		"\u00fd\u00fe\7g\2\2\u00feX\3\2\2\2\u00ff\u0100\7f\2\2\u0100\u0101\7q\2"+
		"\2\u0101Z\3\2\2\2\u0102\u0103\7f\2\2\u0103\u0104\7q\2\2\u0104\u0105\7"+
		"p\2\2\u0105\u0106\7g\2\2\u0106\\\3\2\2\2\u0107\u0108\7e\2\2\u0108\u0109"+
		"\7c\2\2\u0109\u010a\7u\2\2\u010a\u010b\7g\2\2\u010b^\3\2\2\2\u010c\u010d"+
		"\7g\2\2\u010d\u010e\7u\2\2\u010e\u010f\7c\2\2\u010f\u0110\7e\2\2\u0110"+
		"`\3\2\2\2\u0111\u0112\7e\2\2\u0112\u0113\7q\2\2\u0113\u0114\7r\2\2\u0114"+
		"\u0115\7t\2\2\u0115\u0116\7q\2\2\u0116\u0117\7e\2\2\u0117b\3\2\2\2\u0118"+
		"\u0119\7u\2\2\u0119\u011a\7g\2\2\u011a\u011b\7n\2\2\u011b\u011c\7g\2\2"+
		"\u011c\u011d\7e\2\2\u011d\u011e\7v\2\2\u011ed\3\2\2\2\u011f\u0120\7h\2"+
		"\2\u0120\u0121\7w\2\2\u0121\u0122\7p\2\2\u0122\u0123\7e\2\2\u0123\u0124"+
		"\7v\2\2\u0124\u0125\7k\2\2\u0125\u0126\7q\2\2\u0126\u0127\7p\2\2\u0127"+
		"f\3\2\2\2\u0128\u0129\7]\2\2\u0129\u012a\7]\2\2\u012ah\3\2\2\2\u012b\u012c"+
		"\7_\2\2\u012c\u012d\7_\2\2\u012dj\3\2\2\2\u012e\u0132\t\2\2\2\u012f\u0131"+
		"\t\3\2\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133l\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0139\t\2\2\2"+
		"\u0136\u0138\t\3\2\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137"+
		"\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c"+
		"\u013e\t\4\2\2\u013d\u013f\t\5\2\2\u013e\u013d\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141n\3\2\2\2\u0142\u0148"+
		"\7)\2\2\u0143\u0144\7^\2\2\u0144\u0147\7$\2\2\u0145\u0147\13\2\2\2\u0146"+
		"\u0143\3\2\2\2\u0146\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0149\3\2"+
		"\2\2\u0148\u0146\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014b"+
		"\u014c\7)\2\2\u014cp\3\2\2\2\u014d\u0153\7$\2\2\u014e\u014f\7^\2\2\u014f"+
		"\u0152\7$\2\2\u0150\u0152\13\2\2\2\u0151\u014e\3\2\2\2\u0151\u0150\3\2"+
		"\2\2\u0152\u0155\3\2\2\2\u0153\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154"+
		"\u0156\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0157\7$\2\2\u0157r\3\2\2\2\u0158"+
		"\u015c\7%\2\2\u0159\u015b\n\6\2\2\u015a\u0159\3\2\2\2\u015b\u015e\3\2"+
		"\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015dt\3\2\2\2\u015e\u015c"+
		"\3\2\2\2\u015f\u0160\7>\2\2\u0160\u0161\7>\2\2\u0161\u0162\7G\2\2\u0162"+
		"\u0163\7Q\2\2\u0163\u0164\7H\2\2\u0164\u0168\3\2\2\2\u0165\u0167\13\2"+
		"\2\2\u0166\u0165\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0169\3\2\2\2\u0168"+
		"\u0166\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016c\7G"+
		"\2\2\u016c\u016d\7Q\2\2\u016d\u016e\7H\2\2\u016ev\3\2\2\2\u016f\u0171"+
		"\t\7\2\2\u0170\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0170\3\2\2\2\u0172"+
		"\u0173\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\b<\2\2\u0175x\3\2\2\2\r"+
		"\2\u0132\u0139\u0140\u0146\u0148\u0151\u0153\u015c\u0168\u0172\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}