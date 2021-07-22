// Generated from C:/Users/moise/Desktop/X/Lenguajes/Project/grammar\b2b.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link b2bParser}.
 */
public interface b2bListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link b2bParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(b2bParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(b2bParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(b2bParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(b2bParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#dash}.
	 * @param ctx the parse tree
	 */
	void enterDash(b2bParser.DashContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#dash}.
	 * @param ctx the parse tree
	 */
	void exitDash(b2bParser.DashContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#dashargs}.
	 * @param ctx the parse tree
	 */
	void enterDashargs(b2bParser.DashargsContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#dashargs}.
	 * @param ctx the parse tree
	 */
	void exitDashargs(b2bParser.DashargsContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#dashparams}.
	 * @param ctx the parse tree
	 */
	void enterDashparams(b2bParser.DashparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#dashparams}.
	 * @param ctx the parse tree
	 */
	void exitDashparams(b2bParser.DashparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#execution_control}.
	 * @param ctx the parse tree
	 */
	void enterExecution_control(b2bParser.Execution_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#execution_control}.
	 * @param ctx the parse tree
	 */
	void exitExecution_control(b2bParser.Execution_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#b_if}.
	 * @param ctx the parse tree
	 */
	void enterB_if(b2bParser.B_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#b_if}.
	 * @param ctx the parse tree
	 */
	void exitB_if(b2bParser.B_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#b_while}.
	 * @param ctx the parse tree
	 */
	void enterB_while(b2bParser.B_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#b_while}.
	 * @param ctx the parse tree
	 */
	void exitB_while(b2bParser.B_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#b_for}.
	 * @param ctx the parse tree
	 */
	void enterB_for(b2bParser.B_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#b_for}.
	 * @param ctx the parse tree
	 */
	void exitB_for(b2bParser.B_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#b_until}.
	 * @param ctx the parse tree
	 */
	void enterB_until(b2bParser.B_untilContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#b_until}.
	 * @param ctx the parse tree
	 */
	void exitB_until(b2bParser.B_untilContext ctx);
}