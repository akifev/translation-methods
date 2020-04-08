// Generated from C:/itmo/parser-generator/src/main\Grammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(GrammarParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(GrammarParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(GrammarParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(GrammarParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#documentComment}.
	 * @param ctx the parse tree
	 */
	void enterDocumentComment(GrammarParser.DocumentCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#documentComment}.
	 * @param ctx the parse tree
	 */
	void exitDocumentComment(GrammarParser.DocumentCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(GrammarParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(GrammarParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#members}.
	 * @param ctx the parse tree
	 */
	void enterMembers(GrammarParser.MembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#members}.
	 * @param ctx the parse tree
	 */
	void exitMembers(GrammarParser.MembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#state_declaration}.
	 * @param ctx the parse tree
	 */
	void enterState_declaration(GrammarParser.State_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#state_declaration}.
	 * @param ctx the parse tree
	 */
	void exitState_declaration(GrammarParser.State_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#state_parameters}.
	 * @param ctx the parse tree
	 */
	void enterState_parameters(GrammarParser.State_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#state_parameters}.
	 * @param ctx the parse tree
	 */
	void exitState_parameters(GrammarParser.State_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#state_returns}.
	 * @param ctx the parse tree
	 */
	void enterState_returns(GrammarParser.State_returnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#state_returns}.
	 * @param ctx the parse tree
	 */
	void exitState_returns(GrammarParser.State_returnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#state_locals}.
	 * @param ctx the parse tree
	 */
	void enterState_locals(GrammarParser.State_localsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#state_locals}.
	 * @param ctx the parse tree
	 */
	void exitState_locals(GrammarParser.State_localsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#state_rule}.
	 * @param ctx the parse tree
	 */
	void enterState_rule(GrammarParser.State_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#state_rule}.
	 * @param ctx the parse tree
	 */
	void exitState_rule(GrammarParser.State_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(GrammarParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(GrammarParser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#code_block}.
	 * @param ctx the parse tree
	 */
	void enterCode_block(GrammarParser.Code_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#code_block}.
	 * @param ctx the parse tree
	 */
	void exitCode_block(GrammarParser.Code_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#parameter_block}.
	 * @param ctx the parse tree
	 */
	void enterParameter_block(GrammarParser.Parameter_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#parameter_block}.
	 * @param ctx the parse tree
	 */
	void exitParameter_block(GrammarParser.Parameter_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#token_declaration}.
	 * @param ctx the parse tree
	 */
	void enterToken_declaration(GrammarParser.Token_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#token_declaration}.
	 * @param ctx the parse tree
	 */
	void exitToken_declaration(GrammarParser.Token_declarationContext ctx);
}