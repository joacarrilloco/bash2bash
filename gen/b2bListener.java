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
}