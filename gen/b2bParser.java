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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, OR=6, AND=7, AMP=8, SEMIC=9, DOUBLE_SEMIC=10, 
		SEMIAMP=11, DOUBLE_SEMIAMP=12, PIPE=13, PIPEAMP=14, L_BR=15, R_BR=16, 
		L_SQUAREBR=17, R_SQUAREBR=18, L_CURLYBR=19, R_CURLYBR=20, LT=21, GT=22, 
		Exclamation=23, DOUBLE_QUOTE=24, SINGLE_QUOTE=25, BACKSLASH=26, PR_if=27, 
		PR_then=28, PR_elif=29, PR_else=30, PR_fi=31, PR_time=32, PR_for=33, PR_in=34, 
		PR_until=35, PR_while=36, PR_do=37, PR_done=38, PR_case=39, PR_esac=40, 
		PR_coproc=41, PR_select=42, PR_function=43, PR_Lsquarebracket=44, PR_Rsquarebracket=45, 
		ID=46, FILENAME=47, COMMENT=48, WS=49;
	public static final int
		RULE_root = 0, RULE_command = 1, RULE_dash = 2, RULE_dashargs = 3, RULE_dashparams = 4, 
		RULE_execution_control = 5, RULE_b_if = 6, RULE_b_while = 7, RULE_b_for = 8, 
		RULE_b_until = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "command", "dash", "dashargs", "dashparams", "execution_control", 
			"b_if", "b_while", "b_for", "b_until"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'dash'", "'-'", "'c'", "'a'", "'s'", "'||'", "'&&'", "'&'", "';'", 
			"';;'", "';&'", "';;&'", "'|'", "'|&'", "'('", "')'", "'['", "']'", "'{'", 
			"'}'", "'<'", "'>'", "'!'", "'\"'", "'''", "'\\'", "'if'", "'then'", 
			"'elif'", "'else'", "'fi'", "'time'", "'for'", "'in'", "'until'", "'while'", 
			"'do'", "'done'", "'case'", "'esac'", "'coproc'", "'select'", "'function'", 
			"'[['", "']]'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "OR", "AND", "AMP", "SEMIC", "DOUBLE_SEMIC", 
			"SEMIAMP", "DOUBLE_SEMIAMP", "PIPE", "PIPEAMP", "L_BR", "R_BR", "L_SQUAREBR", 
			"R_SQUAREBR", "L_CURLYBR", "R_CURLYBR", "LT", "GT", "Exclamation", "DOUBLE_QUOTE", 
			"SINGLE_QUOTE", "BACKSLASH", "PR_if", "PR_then", "PR_elif", "PR_else", 
			"PR_fi", "PR_time", "PR_for", "PR_in", "PR_until", "PR_while", "PR_do", 
			"PR_done", "PR_case", "PR_esac", "PR_coproc", "PR_select", "PR_function", 
			"PR_Lsquarebracket", "PR_Rsquarebracket", "ID", "FILENAME", "COMMENT", 
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
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << PR_if) | (1L << PR_for) | (1L << PR_until) | (1L << PR_while))) != 0)) {
				{
				{
				setState(20);
				command();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
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
		public DashContext dash() {
			return getRuleContext(DashContext.class,0);
		}
		public Execution_controlContext execution_control() {
			return getRuleContext(Execution_controlContext.class,0);
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
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				dash();
				}
				break;
			case PR_if:
			case PR_for:
			case PR_until:
			case PR_while:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				execution_control();
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
		public TerminalNode FILENAME() { return getToken(b2bParser.FILENAME, 0); }
		public List<TerminalNode> SINGLE_QUOTE() { return getTokens(b2bParser.SINGLE_QUOTE); }
		public TerminalNode SINGLE_QUOTE(int i) {
			return getToken(b2bParser.SINGLE_QUOTE, i);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public List<DashargsContext> dashargs() {
			return getRuleContexts(DashargsContext.class);
		}
		public DashargsContext dashargs(int i) {
			return getRuleContext(DashargsContext.class,i);
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
		enterRule(_localctx, 4, RULE_dash);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(T__0);
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(33);
				dashargs();
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILENAME:
				{
				setState(39);
				match(FILENAME);
				}
				break;
			case SINGLE_QUOTE:
				{
				setState(40);
				match(SINGLE_QUOTE);
				setState(41);
				command();
				setState(42);
				match(SINGLE_QUOTE);
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

	public static class DashargsContext extends ParserRuleContext {
		public DashparamsContext dashparams() {
			return getRuleContext(DashparamsContext.class,0);
		}
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
		enterRule(_localctx, 6, RULE_dashargs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__1);
			setState(47);
			dashparams();
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

	public static class DashparamsContext extends ParserRuleContext {
		public DashparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dashparams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterDashparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitDashparams(this);
		}
	}

	public final DashparamsContext dashparams() throws RecognitionException {
		DashparamsContext _localctx = new DashparamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dashparams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
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
		enterRule(_localctx, 10, RULE_execution_control);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PR_if:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				b_if();
				}
				break;
			case PR_while:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				b_while();
				}
				break;
			case PR_for:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				b_for();
				}
				break;
			case PR_until:
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
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
		enterRule(_localctx, 12, RULE_b_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(PR_if);
			setState(58);
			command();
			setState(59);
			match(SEMIC);
			setState(60);
			match(PR_then);
			setState(61);
			command();
			setState(62);
			match(SEMIC);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PR_elif) {
				{
				{
				setState(63);
				match(PR_elif);
				setState(64);
				command();
				setState(65);
				match(SEMIC);
				setState(66);
				match(PR_then);
				setState(67);
				command();
				setState(68);
				match(SEMIC);
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			match(PR_else);
			setState(76);
			command();
			setState(77);
			match(SEMIC);
			setState(78);
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
		enterRule(_localctx, 14, RULE_b_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(PR_while);
			setState(81);
			command();
			setState(82);
			match(SEMIC);
			setState(83);
			match(PR_do);
			setState(84);
			command();
			setState(85);
			match(SEMIC);
			setState(86);
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
		enterRule(_localctx, 16, RULE_b_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(PR_for);
			setState(89);
			match(ID);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PR_in) {
				{
				setState(90);
				match(PR_in);
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(91);
					match(ID);
					}
					}
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(99);
			match(PR_do);
			setState(100);
			command();
			setState(101);
			match(SEMIC);
			setState(102);
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
		enterRule(_localctx, 18, RULE_b_until);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(PR_until);
			setState(105);
			match(L_SQUAREBR);
			setState(106);
			command();
			setState(107);
			match(R_SQUAREBR);
			setState(108);
			match(SEMIC);
			setState(109);
			match(PR_do);
			setState(110);
			command();
			setState(111);
			match(SEMIC);
			setState(112);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63u\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\7\2\30\n\2\f\2\16\2\33\13\2\3\2\3\2\3\3\3\3\5\3!\n\3\3\4\3\4\7\4%\n"+
		"\4\f\4\16\4(\13\4\3\4\3\4\3\4\3\4\3\4\5\4/\n\4\3\5\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\5\7:\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\7\bI\n\b\f\b\16\bL\13\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n_\n\n\f\n\16\nb\13\n\5\nd\n\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\2\2"+
		"\f\2\4\6\b\n\f\16\20\22\24\2\3\3\2\5\7\2t\2\31\3\2\2\2\4 \3\2\2\2\6\""+
		"\3\2\2\2\b\60\3\2\2\2\n\63\3\2\2\2\f9\3\2\2\2\16;\3\2\2\2\20R\3\2\2\2"+
		"\22Z\3\2\2\2\24j\3\2\2\2\26\30\5\4\3\2\27\26\3\2\2\2\30\33\3\2\2\2\31"+
		"\27\3\2\2\2\31\32\3\2\2\2\32\34\3\2\2\2\33\31\3\2\2\2\34\35\7\2\2\3\35"+
		"\3\3\2\2\2\36!\5\6\4\2\37!\5\f\7\2 \36\3\2\2\2 \37\3\2\2\2!\5\3\2\2\2"+
		"\"&\7\3\2\2#%\5\b\5\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'.\3\2"+
		"\2\2(&\3\2\2\2)/\7\61\2\2*+\7\33\2\2+,\5\4\3\2,-\7\33\2\2-/\3\2\2\2.)"+
		"\3\2\2\2.*\3\2\2\2/\7\3\2\2\2\60\61\7\4\2\2\61\62\5\n\6\2\62\t\3\2\2\2"+
		"\63\64\t\2\2\2\64\13\3\2\2\2\65:\5\16\b\2\66:\5\20\t\2\67:\5\22\n\28:"+
		"\5\24\13\29\65\3\2\2\29\66\3\2\2\29\67\3\2\2\298\3\2\2\2:\r\3\2\2\2;<"+
		"\7\35\2\2<=\5\4\3\2=>\7\13\2\2>?\7\36\2\2?@\5\4\3\2@J\7\13\2\2AB\7\37"+
		"\2\2BC\5\4\3\2CD\7\13\2\2DE\7\36\2\2EF\5\4\3\2FG\7\13\2\2GI\3\2\2\2HA"+
		"\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\7 \2\2NO"+
		"\5\4\3\2OP\7\13\2\2PQ\7!\2\2Q\17\3\2\2\2RS\7&\2\2ST\5\4\3\2TU\7\13\2\2"+
		"UV\7\'\2\2VW\5\4\3\2WX\7\13\2\2XY\7(\2\2Y\21\3\2\2\2Z[\7#\2\2[c\7\60\2"+
		"\2\\`\7$\2\2]_\7\60\2\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ad\3\2"+
		"\2\2b`\3\2\2\2c\\\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\7\'\2\2fg\5\4\3\2gh\7"+
		"\13\2\2hi\7(\2\2i\23\3\2\2\2jk\7%\2\2kl\7\23\2\2lm\5\4\3\2mn\7\24\2\2"+
		"no\7\13\2\2op\7\'\2\2pq\5\4\3\2qr\7\13\2\2rs\7(\2\2s\25\3\2\2\2\n\31 "+
		"&.9J`c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}