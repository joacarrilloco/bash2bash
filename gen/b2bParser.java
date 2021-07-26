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
		EQ=23, NE=24, GOET=25, LOET=26, NOT=27, DOUBLE_QUOTE=28, SINGLE_QUOTE=29, 
		BACKSLASH=30, PR_if=31, PR_then=32, PR_elif=33, PR_else=34, PR_fi=35, 
		PR_time=36, PR_for=37, PR_in=38, PR_until=39, PR_while=40, PR_do=41, PR_done=42, 
		PR_case=43, PR_esac=44, PR_coproc=45, PR_select=46, PR_function=47, PR_Lsquarebracket=48, 
		PR_Rsquarebracket=49, PR_true=50, PR_false=51, PR_null=52, PR_echo=53, 
		PR_read=54, NUMERO=55, ID=56, FILENAME=57, SQ_WORD=58, DQ_WORD=59, COMMENT=60, 
		COMMENT_MUL=61, WS=62;
	public static final int
		RULE_root = 0, RULE_command = 1, RULE_gramar_excecution = 2, RULE_dash = 3, 
		RULE_dashargs = 4, RULE_echo = 5, RULE_comments = 6, RULE_comment_lines = 7, 
		RULE_read = 8, RULE_variables_expressions = 9, RULE_var = 10, RULE_value = 11, 
		RULE_nill = 12, RULE_arithmetic_logic = 13, RULE_boolean_val = 14, RULE_logical_operators = 15, 
		RULE_execution_control = 16, RULE_b_if = 17, RULE_b_while = 18, RULE_b_for = 19, 
		RULE_b_until = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "command", "gramar_excecution", "dash", "dashargs", "echo", "comments", 
			"comment_lines", "read", "variables_expressions", "var", "value", "nill", 
			"arithmetic_logic", "boolean_val", "logical_operators", "execution_control", 
			"b_if", "b_while", "b_for", "b_until"
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
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << OR) | (1L << AND) | (1L << NOT) | (1L << PR_if) | (1L << PR_for) | (1L << PR_until) | (1L << PR_while) | (1L << PR_true) | (1L << PR_false) | (1L << PR_null) | (1L << PR_echo) | (1L << PR_read) | (1L << ID) | (1L << COMMENT) | (1L << COMMENT_MUL))) != 0)) {
				{
				{
				setState(42);
				command();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
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
		public Variables_expressionsContext variables_expressions() {
			return getRuleContext(Variables_expressionsContext.class,0);
		}
		public Arithmetic_logicContext arithmetic_logic() {
			return getRuleContext(Arithmetic_logicContext.class,0);
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
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case PR_echo:
			case PR_read:
			case COMMENT:
			case COMMENT_MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				gramar_excecution();
				}
				break;
			case PR_if:
			case PR_for:
			case PR_until:
			case PR_while:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				execution_control();
				}
				break;
			case PR_null:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				variables_expressions();
				}
				break;
			case OR:
			case AND:
			case NOT:
			case PR_true:
			case PR_false:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				arithmetic_logic();
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

	public static class Gramar_excecutionContext extends ParserRuleContext {
		public DashContext dash() {
			return getRuleContext(DashContext.class,0);
		}
		public EchoContext echo() {
			return getRuleContext(EchoContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public CommentsContext comments() {
			return getRuleContext(CommentsContext.class,0);
		}
		public Comment_linesContext comment_lines() {
			return getRuleContext(Comment_linesContext.class,0);
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
		enterRule(_localctx, 4, RULE_gramar_excecution);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				dash();
				}
				break;
			case PR_echo:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				echo();
				}
				break;
			case PR_read:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				read();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				comments();
				}
				break;
			case COMMENT_MUL:
				enterOuterAlt(_localctx, 5);
				{
				setState(60);
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
		enterRule(_localctx, 6, RULE_dash);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__0);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) {
				{
				{
				setState(64);
				dashargs();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(70);
				match(FILENAME);
				}
				break;
			case 2:
				{
				setState(71);
				match(SINGLE_QUOTE);
				setState(72);
				command();
				setState(73);
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
		enterRule(_localctx, 8, RULE_dashargs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			((DashargsContext)_localctx).arg = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) ) {
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
		public TerminalNode PR_echo() { return getToken(b2bParser.PR_echo, 0); }
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
		enterRule(_localctx, 10, RULE_echo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(PR_echo);
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
		enterRule(_localctx, 12, RULE_comments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
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
		enterRule(_localctx, 14, RULE_comment_lines);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode PR_read() { return getToken(b2bParser.PR_read, 0); }
		public TerminalNode ID() { return getToken(b2bParser.ID, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitRead(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(PR_read);
			setState(86);
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

	public static class Variables_expressionsContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public NillContext nill() {
			return getRuleContext(NillContext.class,0);
		}
		public Variables_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterVariables_expressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitVariables_expressions(this);
		}
	}

	public final Variables_expressionsContext variables_expressions() throws RecognitionException {
		Variables_expressionsContext _localctx = new Variables_expressionsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variables_expressions);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				var();
				}
				break;
			case PR_null:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				nill();
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(b2bParser.ID, 0); }
		public TerminalNode EQ() { return getToken(b2bParser.EQ, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(ID);
			setState(93);
			match(EQ);
			setState(94);
			value();
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(b2bParser.NUMERO, 0); }
		public TerminalNode SQ_WORD() { return getToken(b2bParser.SQ_WORD, 0); }
		public TerminalNode DQ_WORD() { return getToken(b2bParser.DQ_WORD, 0); }
		public TerminalNode ID() { return getToken(b2bParser.ID, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_value);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(NUMERO);
				}
				break;
			case SQ_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(SQ_WORD);
				}
				break;
			case DQ_WORD:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				match(DQ_WORD);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				match(T__4);
				setState(100);
				match(ID);
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

	public static class NillContext extends ParserRuleContext {
		public TerminalNode PR_null() { return getToken(b2bParser.PR_null, 0); }
		public NillContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nill; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterNill(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitNill(this);
		}
	}

	public final NillContext nill() throws RecognitionException {
		NillContext _localctx = new NillContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_nill);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(PR_null);
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

	public static class Arithmetic_logicContext extends ParserRuleContext {
		public Boolean_valContext boolean_val() {
			return getRuleContext(Boolean_valContext.class,0);
		}
		public Logical_operatorsContext logical_operators() {
			return getRuleContext(Logical_operatorsContext.class,0);
		}
		public Arithmetic_logicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterArithmetic_logic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitArithmetic_logic(this);
		}
	}

	public final Arithmetic_logicContext arithmetic_logic() throws RecognitionException {
		Arithmetic_logicContext _localctx = new Arithmetic_logicContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arithmetic_logic);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PR_true:
			case PR_false:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				boolean_val();
				}
				break;
			case OR:
			case AND:
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				logical_operators();
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

	public static class Boolean_valContext extends ParserRuleContext {
		public TerminalNode PR_true() { return getToken(b2bParser.PR_true, 0); }
		public TerminalNode PR_false() { return getToken(b2bParser.PR_false, 0); }
		public Boolean_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterBoolean_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitBoolean_val(this);
		}
	}

	public final Boolean_valContext boolean_val() throws RecognitionException {
		Boolean_valContext _localctx = new Boolean_valContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_boolean_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_la = _input.LA(1);
			if ( !(_la==PR_true || _la==PR_false) ) {
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

	public static class Logical_operatorsContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(b2bParser.AND, 0); }
		public TerminalNode OR() { return getToken(b2bParser.OR, 0); }
		public TerminalNode NOT() { return getToken(b2bParser.NOT, 0); }
		public Logical_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterLogical_operators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitLogical_operators(this);
		}
	}

	public final Logical_operatorsContext logical_operators() throws RecognitionException {
		Logical_operatorsContext _localctx = new Logical_operatorsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_logical_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << AND) | (1L << NOT))) != 0)) ) {
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
		enterRule(_localctx, 32, RULE_execution_control);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PR_if:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				b_if();
				}
				break;
			case PR_while:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				b_while();
				}
				break;
			case PR_for:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				b_for();
				}
				break;
			case PR_until:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
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
		public List<TerminalNode> L_SQUAREBR() { return getTokens(b2bParser.L_SQUAREBR); }
		public TerminalNode L_SQUAREBR(int i) {
			return getToken(b2bParser.L_SQUAREBR, i);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public List<TerminalNode> R_SQUAREBR() { return getTokens(b2bParser.R_SQUAREBR); }
		public TerminalNode R_SQUAREBR(int i) {
			return getToken(b2bParser.R_SQUAREBR, i);
		}
		public List<TerminalNode> SEMIC() { return getTokens(b2bParser.SEMIC); }
		public TerminalNode SEMIC(int i) {
			return getToken(b2bParser.SEMIC, i);
		}
		public List<TerminalNode> PR_then() { return getTokens(b2bParser.PR_then); }
		public TerminalNode PR_then(int i) {
			return getToken(b2bParser.PR_then, i);
		}
		public TerminalNode PR_fi() { return getToken(b2bParser.PR_fi, 0); }
		public List<TerminalNode> PR_elif() { return getTokens(b2bParser.PR_elif); }
		public TerminalNode PR_elif(int i) {
			return getToken(b2bParser.PR_elif, i);
		}
		public TerminalNode PR_else() { return getToken(b2bParser.PR_else, 0); }
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
		enterRule(_localctx, 34, RULE_b_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(PR_if);
			setState(120);
			match(L_SQUAREBR);
			setState(121);
			command();
			setState(122);
			match(R_SQUAREBR);
			setState(123);
			match(SEMIC);
			setState(124);
			match(PR_then);
			setState(125);
			command();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PR_elif) {
				{
				{
				setState(126);
				match(PR_elif);
				setState(127);
				match(L_SQUAREBR);
				setState(128);
				command();
				setState(129);
				match(R_SQUAREBR);
				setState(130);
				match(SEMIC);
				setState(131);
				match(PR_then);
				setState(132);
				command();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PR_else) {
				{
				setState(139);
				match(PR_else);
				setState(140);
				command();
				}
			}

			setState(143);
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
		enterRule(_localctx, 36, RULE_b_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(PR_while);
			setState(146);
			command();
			setState(147);
			match(SEMIC);
			setState(148);
			match(PR_do);
			setState(149);
			command();
			setState(150);
			match(SEMIC);
			setState(151);
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
		enterRule(_localctx, 38, RULE_b_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(PR_for);
			setState(154);
			match(ID);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PR_in) {
				{
				setState(155);
				match(PR_in);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(156);
					match(ID);
					}
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(164);
			match(PR_do);
			setState(165);
			command();
			setState(166);
			match(SEMIC);
			setState(167);
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
		enterRule(_localctx, 40, RULE_b_until);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(PR_until);
			setState(170);
			match(L_SQUAREBR);
			setState(171);
			command();
			setState(172);
			match(R_SQUAREBR);
			setState(173);
			match(SEMIC);
			setState(174);
			match(PR_do);
			setState(175);
			command();
			setState(176);
			match(SEMIC);
			setState(177);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3@\u00b6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\7\2.\n\2\f\2\16\2\61\13\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\5\39\n\3\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\5\3\5"+
		"\7\5D\n\5\f\5\16\5G\13\5\3\5\3\5\3\5\3\5\3\5\5\5N\n\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\5\13]\n\13\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\5\rh\n\r\3\16\3\16\3\17\3\17\5\17n\n\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\5\22x\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0089\n\23\f\23\16\23\u008c"+
		"\13\23\3\23\3\23\5\23\u0090\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u00a0\n\25\f\25\16\25\u00a3\13"+
		"\25\5\25\u00a5\n\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*\2\5\3\2\4\6\3\2\64\65\4\2\b\t\35\35\2\u00b7\2/\3\2\2\2\4"+
		"8\3\2\2\2\6?\3\2\2\2\bA\3\2\2\2\nO\3\2\2\2\fQ\3\2\2\2\16S\3\2\2\2\20U"+
		"\3\2\2\2\22W\3\2\2\2\24\\\3\2\2\2\26^\3\2\2\2\30g\3\2\2\2\32i\3\2\2\2"+
		"\34m\3\2\2\2\36o\3\2\2\2 q\3\2\2\2\"w\3\2\2\2$y\3\2\2\2&\u0093\3\2\2\2"+
		"(\u009b\3\2\2\2*\u00ab\3\2\2\2,.\5\4\3\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2"+
		"\2/\60\3\2\2\2\60\62\3\2\2\2\61/\3\2\2\2\62\63\7\2\2\3\63\3\3\2\2\2\64"+
		"9\5\6\4\2\659\5\"\22\2\669\5\24\13\2\679\5\34\17\28\64\3\2\2\28\65\3\2"+
		"\2\28\66\3\2\2\28\67\3\2\2\29\5\3\2\2\2:@\5\b\5\2;@\5\f\7\2<@\5\22\n\2"+
		"=@\5\16\b\2>@\5\20\t\2?:\3\2\2\2?;\3\2\2\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2"+
		"\2@\7\3\2\2\2AE\7\3\2\2BD\5\n\6\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2"+
		"\2\2FM\3\2\2\2GE\3\2\2\2HN\7;\2\2IJ\7\37\2\2JK\5\4\3\2KL\7\37\2\2LN\3"+
		"\2\2\2MH\3\2\2\2MI\3\2\2\2MN\3\2\2\2N\t\3\2\2\2OP\t\2\2\2P\13\3\2\2\2"+
		"QR\7\67\2\2R\r\3\2\2\2ST\7>\2\2T\17\3\2\2\2UV\7?\2\2V\21\3\2\2\2WX\78"+
		"\2\2XY\7:\2\2Y\23\3\2\2\2Z]\5\26\f\2[]\5\32\16\2\\Z\3\2\2\2\\[\3\2\2\2"+
		"]\25\3\2\2\2^_\7:\2\2_`\7\31\2\2`a\5\30\r\2a\27\3\2\2\2bh\79\2\2ch\7<"+
		"\2\2dh\7=\2\2ef\7\7\2\2fh\7:\2\2gb\3\2\2\2gc\3\2\2\2gd\3\2\2\2ge\3\2\2"+
		"\2h\31\3\2\2\2ij\7\66\2\2j\33\3\2\2\2kn\5\36\20\2ln\5 \21\2mk\3\2\2\2"+
		"ml\3\2\2\2n\35\3\2\2\2op\t\3\2\2p\37\3\2\2\2qr\t\4\2\2r!\3\2\2\2sx\5$"+
		"\23\2tx\5&\24\2ux\5(\25\2vx\5*\26\2ws\3\2\2\2wt\3\2\2\2wu\3\2\2\2wv\3"+
		"\2\2\2x#\3\2\2\2yz\7!\2\2z{\7\23\2\2{|\5\4\3\2|}\7\24\2\2}~\7\13\2\2~"+
		"\177\7\"\2\2\177\u008a\5\4\3\2\u0080\u0081\7#\2\2\u0081\u0082\7\23\2\2"+
		"\u0082\u0083\5\4\3\2\u0083\u0084\7\24\2\2\u0084\u0085\7\13\2\2\u0085\u0086"+
		"\7\"\2\2\u0086\u0087\5\4\3\2\u0087\u0089\3\2\2\2\u0088\u0080\3\2\2\2\u0089"+
		"\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008f\3\2"+
		"\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7$\2\2\u008e\u0090\5\4\3\2\u008f"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7%"+
		"\2\2\u0092%\3\2\2\2\u0093\u0094\7*\2\2\u0094\u0095\5\4\3\2\u0095\u0096"+
		"\7\13\2\2\u0096\u0097\7+\2\2\u0097\u0098\5\4\3\2\u0098\u0099\7\13\2\2"+
		"\u0099\u009a\7,\2\2\u009a\'\3\2\2\2\u009b\u009c\7\'\2\2\u009c\u00a4\7"+
		":\2\2\u009d\u00a1\7(\2\2\u009e\u00a0\7:\2\2\u009f\u009e\3\2\2\2\u00a0"+
		"\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a5\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a4\u009d\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a7\7+\2\2\u00a7\u00a8\5\4\3\2\u00a8\u00a9\7\13"+
		"\2\2\u00a9\u00aa\7,\2\2\u00aa)\3\2\2\2\u00ab\u00ac\7)\2\2\u00ac\u00ad"+
		"\7\23\2\2\u00ad\u00ae\5\4\3\2\u00ae\u00af\7\24\2\2\u00af\u00b0\7\13\2"+
		"\2\u00b0\u00b1\7+\2\2\u00b1\u00b2\5\4\3\2\u00b2\u00b3\7\13\2\2\u00b3\u00b4"+
		"\7,\2\2\u00b4+\3\2\2\2\17/8?EM\\gmw\u008a\u008f\u00a1\u00a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}