// Generated from C:/itmo/automatic-parser/src/main\Grammar.g4 by ANTLR 4.8

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;
import java.util.function.Function;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(GrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(GrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#eqList}.
	 * @param ctx the parse tree
	 */
	void enterEqList(GrammarParser.EqListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#eqList}.
	 * @param ctx the parse tree
	 */
	void exitEqList(GrammarParser.EqListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#eq}.
	 * @param ctx the parse tree
	 */
	void enterEq(GrammarParser.EqContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#eq}.
	 * @param ctx the parse tree
	 */
	void exitEq(GrammarParser.EqContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(GrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(GrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#exprP}.
	 * @param ctx the parse tree
	 */
	void enterExprP(GrammarParser.ExprPContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#exprP}.
	 * @param ctx the parse tree
	 */
	void exitExprP(GrammarParser.ExprPContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(GrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(GrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#termP}.
	 * @param ctx the parse tree
	 */
	void enterTermP(GrammarParser.TermPContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#termP}.
	 * @param ctx the parse tree
	 */
	void exitTermP(GrammarParser.TermPContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFact(GrammarParser.FactContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFact(GrammarParser.FactContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#factP}.
	 * @param ctx the parse tree
	 */
	void enterFactP(GrammarParser.FactPContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#factP}.
	 * @param ctx the parse tree
	 */
	void exitFactP(GrammarParser.FactPContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(GrammarParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(GrammarParser.AtomContext ctx);
}