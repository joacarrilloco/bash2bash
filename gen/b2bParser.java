// Generated from C:/Users/moise/Desktop/X/Lenguajes/Project/grammar\b2b.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class b2bParser extends Parser {
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
	public static final int
		RULE_root = 0, RULE_command = 1, RULE_comments = 2, RULE_comment_lines = 3, 
		RULE_gramar_excecution = 4, RULE_dash = 5, RULE_dashargs = 6, RULE_echo = 7, 
		RULE_short_option = 8, RULE_string = 9, RULE_long_option = 10, RULE_execution_control = 11, 
		RULE_b_if = 12, RULE_b_while = 13, RULE_b_for = 14, RULE_b_until = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "command", "comments", "comment_lines", "gramar_excecution", 
			"dash", "dashargs", "echo", "short_option", "string", "long_option", 
			"execution_control", "b_if", "b_while", "b_for", "b_until"
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

	@Override
	public String getGrammarFileName() { return "b2b.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public b2bParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(b2bParser.EOF, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitRoot(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << PR_if) | (1L << PR_for) | (1L << PR_until) | (1L << PR_while) | (1L << COMMENT) | (1L << COMMENT_MUL))) != 0)) {
				{
				{
				setState(32);
				command();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
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

	public static class CommandContext extends ParserRuleContext {
		public Gramar_excecutionContext gramar_excecution() {
			return getRuleContext(Gramar_excecutionContext.class,0);
		}
		public Execution_controlContext execution_control() {
			return getRuleContext(Execution_controlContext.class,0);
		}
		public CommentsContext comments() {
			return getRuleContext(CommentsContext.class,0);
		}
		public Comment_linesContext comment_lines() {
			return getRuleContext(Comment_linesContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				gramar_excecution();
				}
				break;
			case PR_if:
			case PR_for:
			case PR_until:
			case PR_while:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				execution_control();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				comments();
				}
				break;
			case COMMENT_MUL:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				comment_lines();
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

	public static class CommentsContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(b2bParser.COMMENT, 0); }
		public CommentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterComments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitComments(this);
		}
	}

	public final CommentsContext comments() throws RecognitionException {
		CommentsContext _localctx = new CommentsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(COMMENT);
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

	public static class Comment_linesContext extends ParserRuleContext {
		public TerminalNode COMMENT_MUL() { return getToken(b2bParser.COMMENT_MUL, 0); }
		public Comment_linesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment_lines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterComment_lines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitComment_lines(this);
		}
	}

	public final Comment_linesContext comment_lines() throws RecognitionException {
		Comment_linesContext _localctx = new Comment_linesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comment_lines);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(COMMENT_MUL);
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

	public static class Gramar_excecutionContext extends ParserRuleContext {
		public DashContext dash() {
			return getRuleContext(DashContext.class,0);
		}
		public EchoContext echo() {
			return getRuleContext(EchoContext.class,0);
		}
		public Gramar_excecutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gramar_excecution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterGramar_excecution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitGramar_excecution(this);
		}
	}

	public final Gramar_excecutionContext gramar_excecution() throws RecognitionException {
		Gramar_excecutionContext _localctx = new Gramar_excecutionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_gramar_excecution);
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				dash();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				echo();
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

	public static class DashContext extends ParserRuleContext {
		public List<DashargsContext> dashargs() {
			return getRuleContexts(DashargsContext.class);
		}
		public DashargsContext dashargs(int i) {
			return getRuleContext(DashargsContext.class,i);
		}
		public TerminalNode FILENAME() { return getToken(b2bParser.FILENAME, 0); }
		public List<TerminalNode> SINGLE_QUOTE() { return getTokens(b2bParser.SINGLE_QUOTE); }
		public TerminalNode SINGLE_QUOTE(int i) {
			return getToken(b2bParser.SINGLE_QUOTE, i);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public DashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterDash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitDash(this);
		}
	}

	public final DashContext dash() throws RecognitionException {
		DashContext _localctx = new DashContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dash);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__0);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(55);
				dashargs();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(61);
				match(FILENAME);
				}
				break;
			case 2:
				{
				setState(62);
				match(SINGLE_QUOTE);
				setState(63);
				command();
				setState(64);
				match(SINGLE_QUOTE);
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

	public static class DashargsContext extends ParserRuleContext {
		public Token arg;
		public DashargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dashargs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterDashargs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitDashargs(this);
		}
	}

	public final DashargsContext dashargs() throws RecognitionException {
		DashargsContext _localctx = new DashargsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dashargs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__1);
			setState(69);
			((DashargsContext)_localctx).arg = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
				((DashargsContext)_localctx).arg = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class EchoContext extends ParserRuleContext {
		public List<Long_optionContext> long_option() {
			return getRuleContexts(Long_optionContext.class);
		}
		public Long_optionContext long_option(int i) {
			return getRuleContext(Long_optionContext.class,i);
		}
		public List<Short_optionContext> short_option() {
			return getRuleContexts(Short_optionContext.class);
		}
		public Short_optionContext short_option(int i) {
			return getRuleContext(Short_optionContext.class,i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(b2bParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(b2bParser.ID, i);
		}
		public EchoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_echo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterEcho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitEcho(this);
		}
	}

	public final EchoContext echo() throws RecognitionException {
		EchoContext _localctx = new EchoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_echo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__5);
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__1:
			case T__5:
			case SEMIC:
			case R_SQUAREBR:
			case SINGLE_QUOTE:
			case PR_if:
			case PR_for:
			case PR_until:
			case PR_while:
			case ID:
			case SQ_WORD:
			case DQ_WORD:
			case COMMENT:
			case COMMENT_MUL:
				{
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(72);
					short_option();
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << SQ_WORD) | (1L << DQ_WORD))) != 0)) {
					{
					setState(83);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SQ_WORD:
					case DQ_WORD:
						{
						setState(78);
						string();
						}
						break;
					case ID:
						{
						setState(79);
						match(ID);
						setState(81);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__9 || _la==GT) {
							{
							setState(80);
							long_option();
							}
						}

						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__9:
			case GT:
				{
				setState(88);
				long_option();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Short_optionContext extends ParserRuleContext {
		public Token opt;
		public Short_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_short_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterShort_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitShort_option(this);
		}
	}

	public final Short_optionContext short_option() throws RecognitionException {
		Short_optionContext _localctx = new Short_optionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_short_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__1);
			setState(92);
			((Short_optionContext)_localctx).opt = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
				((Short_optionContext)_localctx).opt = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode SQ_WORD() { return getToken(b2bParser.SQ_WORD, 0); }
		public TerminalNode DQ_WORD() { return getToken(b2bParser.DQ_WORD, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_la = _input.LA(1);
			if ( !(_la==SQ_WORD || _la==DQ_WORD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Long_optionContext extends ParserRuleContext {
		public Token opt;
		public TerminalNode GT() { return getToken(b2bParser.GT, 0); }
		public TerminalNode ID() { return getToken(b2bParser.ID, 0); }
		public TerminalNode FILENAME() { return getToken(b2bParser.FILENAME, 0); }
		public Long_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_long_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterLong_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitLong_option(this);
		}
	}

	public final Long_optionContext long_option() throws RecognitionException {
		Long_optionContext _localctx = new Long_optionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_long_option);
		int _la;
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(T__9);
				setState(97);
				((Long_optionContext)_localctx).opt = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__11) ) {
					((Long_optionContext)_localctx).opt = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(GT);
				setState(99);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==FILENAME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class Execution_controlContext extends ParserRuleContext {
		public B_ifContext b_if() {
			return getRuleContext(B_ifContext.class,0);
		}
		public B_whileContext b_while() {
			return getRuleContext(B_whileContext.class,0);
		}
		public B_forContext b_for() {
			return getRuleContext(B_forContext.class,0);
		}
		public B_untilContext b_until() {
			return getRuleContext(B_untilContext.class,0);
		}
		public Execution_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execution_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterExecution_control(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitExecution_control(this);
		}
	}

	public final Execution_controlContext execution_control() throws RecognitionException {
		Execution_controlContext _localctx = new Execution_controlContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_execution_control);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PR_if:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				b_if();
				}
				break;
			case PR_while:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				b_while();
				}
				break;
			case PR_for:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				b_for();
				}
				break;
			case PR_until:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				b_until();
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

	public static class B_ifContext extends ParserRuleContext {
		public TerminalNode PR_if() { return getToken(b2bParser.PR_if, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public List<TerminalNode> SEMIC() { return getTokens(b2bParser.SEMIC); }
		public TerminalNode SEMIC(int i) {
			return getToken(b2bParser.SEMIC, i);
		}
		public List<TerminalNode> PR_then() { return getTokens(b2bParser.PR_then); }
		public TerminalNode PR_then(int i) {
			return getToken(b2bParser.PR_then, i);
		}
		public TerminalNode PR_else() { return getToken(b2bParser.PR_else, 0); }
		public TerminalNode PR_fi() { return getToken(b2bParser.PR_fi, 0); }
		public List<TerminalNode> PR_elif() { return getTokens(b2bParser.PR_elif); }
		public TerminalNode PR_elif(int i) {
			return getToken(b2bParser.PR_elif, i);
		}
		public B_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterB_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitB_if(this);
		}
	}

	public final B_ifContext b_if() throws RecognitionException {
		B_ifContext _localctx = new B_ifContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_b_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(PR_if);
			setState(109);
			command();
			setState(110);
			match(SEMIC);
			setState(111);
			match(PR_then);
			setState(112);
			command();
			setState(113);
			match(SEMIC);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PR_elif) {
				{
				{
				setState(114);
				match(PR_elif);
				setState(115);
				command();
				setState(116);
				match(SEMIC);
				setState(117);
				match(PR_then);
				setState(118);
				command();
				setState(119);
				match(SEMIC);
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			match(PR_else);
			setState(127);
			command();
			setState(128);
			match(SEMIC);
			setState(129);
			match(PR_fi);
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

	public static class B_whileContext extends ParserRuleContext {
		public TerminalNode PR_while() { return getToken(b2bParser.PR_while, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public List<TerminalNode> SEMIC() { return getTokens(b2bParser.SEMIC); }
		public TerminalNode SEMIC(int i) {
			return getToken(b2bParser.SEMIC, i);
		}
		public TerminalNode PR_do() { return getToken(b2bParser.PR_do, 0); }
		public TerminalNode PR_done() { return getToken(b2bParser.PR_done, 0); }
		public B_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterB_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitB_while(this);
		}
	}

	public final B_whileContext b_while() throws RecognitionException {
		B_whileContext _localctx = new B_whileContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_b_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(PR_while);
			setState(132);
			command();
			setState(133);
			match(SEMIC);
			setState(134);
			match(PR_do);
			setState(135);
			command();
			setState(136);
			match(SEMIC);
			setState(137);
			match(PR_done);
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

	public static class B_forContext extends ParserRuleContext {
		public TerminalNode PR_for() { return getToken(b2bParser.PR_for, 0); }
		public List<TerminalNode> ID() { return getTokens(b2bParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(b2bParser.ID, i);
		}
		public TerminalNode PR_do() { return getToken(b2bParser.PR_do, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode SEMIC() { return getToken(b2bParser.SEMIC, 0); }
		public TerminalNode PR_done() { return getToken(b2bParser.PR_done, 0); }
		public TerminalNode PR_in() { return getToken(b2bParser.PR_in, 0); }
		public B_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterB_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitB_for(this);
		}
	}

	public final B_forContext b_for() throws RecognitionException {
		B_forContext _localctx = new B_forContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_b_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(PR_for);
			setState(140);
			match(ID);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PR_in) {
				{
				setState(141);
				match(PR_in);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(142);
					match(ID);
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(150);
			match(PR_do);
			setState(151);
			command();
			setState(152);
			match(SEMIC);
			setState(153);
			match(PR_done);
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

	public static class B_untilContext extends ParserRuleContext {
		public TerminalNode PR_until() { return getToken(b2bParser.PR_until, 0); }
		public TerminalNode L_SQUAREBR() { return getToken(b2bParser.L_SQUAREBR, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public TerminalNode R_SQUAREBR() { return getToken(b2bParser.R_SQUAREBR, 0); }
		public List<TerminalNode> SEMIC() { return getTokens(b2bParser.SEMIC); }
		public TerminalNode SEMIC(int i) {
			return getToken(b2bParser.SEMIC, i);
		}
		public TerminalNode PR_do() { return getToken(b2bParser.PR_do, 0); }
		public TerminalNode PR_done() { return getToken(b2bParser.PR_done, 0); }
		public B_untilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b_until; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterB_until(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitB_until(this);
		}
	}

	public final B_untilContext b_until() throws RecognitionException {
		B_untilContext _localctx = new B_untilContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_b_until);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(PR_until);
			setState(156);
			match(L_SQUAREBR);
			setState(157);
			command();
			setState(158);
			match(R_SQUAREBR);
			setState(159);
			match(SEMIC);
			setState(160);
			match(PR_do);
			setState(161);
			command();
			setState(162);
			match(SEMIC);
			setState(163);
			match(PR_done);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u00a8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\7\2$\n"+
		"\2\f\2\16\2\'\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\5\6\67\n\6\3\7\3\7\7\7;\n\7\f\7\16\7>\13\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7E\n\7\3\b\3\b\3\b\3\t\3\t\7\tL\n\t\f\t\16\tO\13\t\3\t\3\t\3\t\5\t"+
		"T\n\t\7\tV\n\t\f\t\16\tY\13\t\3\t\5\t\\\n\t\3\n\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\5\fg\n\f\3\r\3\r\3\r\3\r\5\rm\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16|\n\16\f\16\16\16\177\13"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\7\20\u0092\n\20\f\20\16\20\u0095\13\20\5\20\u0097\n"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\7\3\2\5"+
		"\7\3\2\t\13\3\29:\3\2\r\16\3\2\678\2\u00ab\2%\3\2\2\2\4.\3\2\2\2\6\60"+
		"\3\2\2\2\b\62\3\2\2\2\n\66\3\2\2\2\f8\3\2\2\2\16F\3\2\2\2\20I\3\2\2\2"+
		"\22]\3\2\2\2\24`\3\2\2\2\26f\3\2\2\2\30l\3\2\2\2\32n\3\2\2\2\34\u0085"+
		"\3\2\2\2\36\u008d\3\2\2\2 \u009d\3\2\2\2\"$\5\4\3\2#\"\3\2\2\2$\'\3\2"+
		"\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\7\2\2\3)\3\3\2\2\2*/\5"+
		"\n\6\2+/\5\30\r\2,/\5\6\4\2-/\5\b\5\2.*\3\2\2\2.+\3\2\2\2.,\3\2\2\2.-"+
		"\3\2\2\2/\5\3\2\2\2\60\61\7;\2\2\61\7\3\2\2\2\62\63\7<\2\2\63\t\3\2\2"+
		"\2\64\67\5\f\7\2\65\67\5\20\t\2\66\64\3\2\2\2\66\65\3\2\2\2\67\13\3\2"+
		"\2\28<\7\3\2\29;\5\16\b\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=D\3"+
		"\2\2\2><\3\2\2\2?E\78\2\2@A\7\"\2\2AB\5\4\3\2BC\7\"\2\2CE\3\2\2\2D?\3"+
		"\2\2\2D@\3\2\2\2DE\3\2\2\2E\r\3\2\2\2FG\7\4\2\2GH\t\2\2\2H\17\3\2\2\2"+
		"I[\7\b\2\2JL\5\22\n\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NW\3\2\2"+
		"\2OM\3\2\2\2PV\5\24\13\2QS\7\67\2\2RT\5\26\f\2SR\3\2\2\2ST\3\2\2\2TV\3"+
		"\2\2\2UP\3\2\2\2UQ\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\\\3\2\2\2YW"+
		"\3\2\2\2Z\\\5\26\f\2[M\3\2\2\2[Z\3\2\2\2\\\21\3\2\2\2]^\7\4\2\2^_\t\3"+
		"\2\2_\23\3\2\2\2`a\t\4\2\2a\25\3\2\2\2bc\7\f\2\2cg\t\5\2\2de\7\37\2\2"+
		"eg\t\6\2\2fb\3\2\2\2fd\3\2\2\2g\27\3\2\2\2hm\5\32\16\2im\5\34\17\2jm\5"+
		"\36\20\2km\5 \21\2lh\3\2\2\2li\3\2\2\2lj\3\2\2\2lk\3\2\2\2m\31\3\2\2\2"+
		"no\7$\2\2op\5\4\3\2pq\7\22\2\2qr\7%\2\2rs\5\4\3\2s}\7\22\2\2tu\7&\2\2"+
		"uv\5\4\3\2vw\7\22\2\2wx\7%\2\2xy\5\4\3\2yz\7\22\2\2z|\3\2\2\2{t\3\2\2"+
		"\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080"+
		"\u0081\7\'\2\2\u0081\u0082\5\4\3\2\u0082\u0083\7\22\2\2\u0083\u0084\7"+
		"(\2\2\u0084\33\3\2\2\2\u0085\u0086\7-\2\2\u0086\u0087\5\4\3\2\u0087\u0088"+
		"\7\22\2\2\u0088\u0089\7.\2\2\u0089\u008a\5\4\3\2\u008a\u008b\7\22\2\2"+
		"\u008b\u008c\7/\2\2\u008c\35\3\2\2\2\u008d\u008e\7*\2\2\u008e\u0096\7"+
		"\67\2\2\u008f\u0093\7+\2\2\u0090\u0092\7\67\2\2\u0091\u0090\3\2\2\2\u0092"+
		"\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0097\3\2"+
		"\2\2\u0095\u0093\3\2\2\2\u0096\u008f\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0099\7.\2\2\u0099\u009a\5\4\3\2\u009a\u009b\7\22"+
		"\2\2\u009b\u009c\7/\2\2\u009c\37\3\2\2\2\u009d\u009e\7,\2\2\u009e\u009f"+
		"\7\32\2\2\u009f\u00a0\5\4\3\2\u00a0\u00a1\7\33\2\2\u00a1\u00a2\7\22\2"+
		"\2\u00a2\u00a3\7.\2\2\u00a3\u00a4\5\4\3\2\u00a4\u00a5\7\22\2\2\u00a5\u00a6"+
		"\7/\2\2\u00a6!\3\2\2\2\21%.\66<DMSUW[fl}\u0093\u0096";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}