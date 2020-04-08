// Generated from C:/itmo/parser-generator/src/main\Grammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(GrammarParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(GrammarParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#documentComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocumentComment(GrammarParser.DocumentCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(GrammarParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#members}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMembers(GrammarParser.MembersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#state_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState_declaration(GrammarParser.State_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#state_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState_parameters(GrammarParser.State_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#state_returns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState_returns(GrammarParser.State_returnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#state_locals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState_locals(GrammarParser.State_localsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#state_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState_rule(GrammarParser.State_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(GrammarParser.ItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#code_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_block(GrammarParser.Code_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#parameter_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_block(GrammarParser.Parameter_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#token_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToken_declaration(GrammarParser.Token_declarationContext ctx);
}