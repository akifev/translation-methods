// Generated from C:/itmo/automatic-parser/src/main\Grammar.g4 by ANTLR 4.8

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;
import java.util.function.Function;

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
	 * Visit a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(GrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#eqList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqList(GrammarParser.EqListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#eq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq(GrammarParser.EqContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(GrammarParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#exprP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprP(GrammarParser.ExprPContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(GrammarParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#termP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermP(GrammarParser.TermPContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFact(GrammarParser.FactContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#factP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactP(GrammarParser.FactPContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(GrammarParser.AtomContext ctx);
}