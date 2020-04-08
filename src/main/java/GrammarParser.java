// Generated from C:/itmo/automatic-parser/src/main\Grammar.g4 by ANTLR 4.8

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;
import java.util.function.Function;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN_BRACKET=1, CLOSE_BRACKET=2, PLUS=3, MINUS=4, MUL=5, DIV=6, EQ=7, 
		SEMICOLON=8, FACTORIAL=9, NUMBER=10, VAR=11, WS=12;
	public static final int
		RULE_start = 0, RULE_eqList = 1, RULE_eq = 2, RULE_expr = 3, RULE_exprP = 4, 
		RULE_term = 5, RULE_termP = 6, RULE_fact = 7, RULE_factP = 8, RULE_atom = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "eqList", "eq", "expr", "exprP", "term", "termP", "fact", "factP", 
			"atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'='", "';'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPEN_BRACKET", "CLOSE_BRACKET", "PLUS", "MINUS", "MUL", "DIV", 
			"EQ", "SEMICOLON", "FACTORIAL", "NUMBER", "VAR", "WS"
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
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private int factorial(int n) {
	        if (n <= 1) {
	            return 1;
	        }

	        return n * factorial(n - 1);
	    }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public List<String> results;
		public EqListContext resList;
		public EqListContext eqList() {
			return getRuleContext(EqListContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			((StartContext)_localctx).resList = eqList(new HashMap<String, Integer>(), new ArrayList<String>());

			        Collections.reverse(((StartContext)_localctx).resList.ret); ((StartContext)_localctx).results =  ((StartContext)_localctx).resList.ret;
			    
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

	public static class EqListContext extends ParserRuleContext {
		public Map<String, Integer> variables;
		public List<String> results;
		public List<String> ret;
		public EqContext e;
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public EqContext eq() {
			return getRuleContext(EqContext.class,0);
		}
		public List<EqListContext> eqList() {
			return getRuleContexts(EqListContext.class);
		}
		public EqListContext eqList(int i) {
			return getRuleContext(EqListContext.class,i);
		}
		public EqListContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EqListContext(ParserRuleContext parent, int invokingState, Map<String, Integer> variables, List<String> results) {
			super(parent, invokingState);
			this.variables = variables;
			this.results = results;
		}
		@Override public int getRuleIndex() { return RULE_eqList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterEqList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitEqList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitEqList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqListContext eqList(Map<String, Integer> variables,List<String> results) throws RecognitionException {
		EqListContext _localctx = new EqListContext(_ctx, getState(), variables, results);
		enterRule(_localctx, 2, RULE_eqList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			((EqListContext)_localctx).e = eq(variables);
			setState(24);
			match(SEMICOLON);
			setState(28);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(25);
					eqList(variables, results);
					}
					} 
				}
				setState(30);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}

			        results.add(((EqListContext)_localctx).e.result); ((EqListContext)_localctx).ret =  _localctx.results;
			    
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

	public static class EqContext extends ParserRuleContext {
		public Map<String, Integer> variables;
		public String result;
		public Token VAR;
		public ExprContext expr;
		public TerminalNode VAR() { return getToken(GrammarParser.VAR, 0); }
		public TerminalNode EQ() { return getToken(GrammarParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public EqContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EqContext(ParserRuleContext parent, int invokingState, Map<String, Integer> variables) {
			super(parent, invokingState);
			this.variables = variables;
		}
		@Override public int getRuleIndex() { return RULE_eq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitEq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqContext eq(Map<String, Integer> variables) throws RecognitionException {
		EqContext _localctx = new EqContext(_ctx, getState(), variables);
		enterRule(_localctx, 4, RULE_eq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			((EqContext)_localctx).VAR = match(VAR);
			setState(34);
			match(EQ);
			setState(35);
			((EqContext)_localctx).expr = expr(variables);

			        variables.put((((EqContext)_localctx).VAR!=null?((EqContext)_localctx).VAR.getText():null), ((EqContext)_localctx).expr.val); ((EqContext)_localctx).result =  (((EqContext)_localctx).VAR!=null?((EqContext)_localctx).VAR.getText():null) + " = " + ((EqContext)_localctx).expr.val;
			    
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

	public static class ExprContext extends ParserRuleContext {
		public Map<String, Integer> variables;
		public int val;
		public TermContext term;
		public ExprPContext exprP;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprPContext exprP() {
			return getRuleContext(ExprPContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprContext(ParserRuleContext parent, int invokingState, Map<String, Integer> variables) {
			super(parent, invokingState);
			this.variables = variables;
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr(Map<String, Integer> variables) throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState(), variables);
		enterRule(_localctx, 6, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			((ExprContext)_localctx).term = term(variables);
			setState(39);
			((ExprContext)_localctx).exprP = exprP(variables, ((ExprContext)_localctx).term.val);

			        ((ExprContext)_localctx).val =  ((ExprContext)_localctx).exprP.val;
			    
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

	public static class ExprPContext extends ParserRuleContext {
		public Map<String, Integer> variables;
		public int i;
		public int val;
		public TermContext term;
		public ExprPContext e;
		public TerminalNode PLUS() { return getToken(GrammarParser.PLUS, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprPContext exprP() {
			return getRuleContext(ExprPContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(GrammarParser.MINUS, 0); }
		public ExprPContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprPContext(ParserRuleContext parent, int invokingState, Map<String, Integer> variables, int i) {
			super(parent, invokingState);
			this.variables = variables;
			this.i = i;
		}
		@Override public int getRuleIndex() { return RULE_exprP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExprP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExprP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExprP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprPContext exprP(Map<String, Integer> variables,int i) throws RecognitionException {
		ExprPContext _localctx = new ExprPContext(_ctx, getState(), variables, i);
		enterRule(_localctx, 8, RULE_exprP);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLOSE_BRACKET:
			case SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{

				        ((ExprPContext)_localctx).val =  _localctx.i;
				    
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(PLUS);
				setState(44);
				((ExprPContext)_localctx).term = term(variables);
				setState(45);
				((ExprPContext)_localctx).e = exprP(variables, i + ((ExprPContext)_localctx).term.val);

				        ((ExprPContext)_localctx).val =  ((ExprPContext)_localctx).e.val;
				    
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				match(MINUS);
				setState(49);
				((ExprPContext)_localctx).term = term(variables);
				setState(50);
				((ExprPContext)_localctx).e = exprP(variables, i - ((ExprPContext)_localctx).term.val);

				        ((ExprPContext)_localctx).val =  ((ExprPContext)_localctx).e.val;
				    
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

	public static class TermContext extends ParserRuleContext {
		public Map<String, Integer> variables;
		public int val;
		public FactContext fact;
		public TermPContext termP;
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public TermPContext termP() {
			return getRuleContext(TermPContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TermContext(ParserRuleContext parent, int invokingState, Map<String, Integer> variables) {
			super(parent, invokingState);
			this.variables = variables;
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term(Map<String, Integer> variables) throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState(), variables);
		enterRule(_localctx, 10, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			((TermContext)_localctx).fact = fact(variables);
			setState(56);
			((TermContext)_localctx).termP = termP(variables, ((TermContext)_localctx).fact.val);

			        ((TermContext)_localctx).val =  ((TermContext)_localctx).termP.val;
			    
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

	public static class TermPContext extends ParserRuleContext {
		public Map<String, Integer> variables;
		public int i;
		public int val;
		public FactContext fact;
		public TermPContext e;
		public TerminalNode MUL() { return getToken(GrammarParser.MUL, 0); }
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public TermPContext termP() {
			return getRuleContext(TermPContext.class,0);
		}
		public TerminalNode DIV() { return getToken(GrammarParser.DIV, 0); }
		public TermPContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TermPContext(ParserRuleContext parent, int invokingState, Map<String, Integer> variables, int i) {
			super(parent, invokingState);
			this.variables = variables;
			this.i = i;
		}
		@Override public int getRuleIndex() { return RULE_termP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTermP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTermP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitTermP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermPContext termP(Map<String, Integer> variables,int i) throws RecognitionException {
		TermPContext _localctx = new TermPContext(_ctx, getState(), variables, i);
		enterRule(_localctx, 12, RULE_termP);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLOSE_BRACKET:
			case PLUS:
			case MINUS:
			case SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{

				        ((TermPContext)_localctx).val =  _localctx.i;
				    
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				match(MUL);
				setState(61);
				((TermPContext)_localctx).fact = fact(variables);
				setState(62);
				((TermPContext)_localctx).e = termP(variables, i * ((TermPContext)_localctx).fact.val);

				        ((TermPContext)_localctx).val =  ((TermPContext)_localctx).e.val;
				    
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				match(DIV);
				setState(66);
				((TermPContext)_localctx).fact = fact(variables);
				setState(67);
				((TermPContext)_localctx).e = termP(variables, i / ((TermPContext)_localctx).fact.val);

				        ((TermPContext)_localctx).val =  ((TermPContext)_localctx).e.val;
				    
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

	public static class FactContext extends ParserRuleContext {
		public Map<String, Integer> variables;
		public int val;
		public AtomContext atom;
		public FactPContext e;
		public TerminalNode MINUS() { return getToken(GrammarParser.MINUS, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public FactPContext factP() {
			return getRuleContext(FactPContext.class,0);
		}
		public FactContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FactContext(ParserRuleContext parent, int invokingState, Map<String, Integer> variables) {
			super(parent, invokingState);
			this.variables = variables;
		}
		@Override public int getRuleIndex() { return RULE_fact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactContext fact(Map<String, Integer> variables) throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState(), variables);
		enterRule(_localctx, 14, RULE_fact);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(MINUS);
				setState(73);
				((FactContext)_localctx).atom = atom(variables);

				        ((FactContext)_localctx).val =  -((FactContext)_localctx).atom.val;
				    
				}
				break;
			case OPEN_BRACKET:
			case NUMBER:
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				((FactContext)_localctx).atom = atom(variables);
				setState(77);
				((FactContext)_localctx).e = factP(variables, ((FactContext)_localctx).atom.val);

				        ((FactContext)_localctx).val =  ((FactContext)_localctx).e.val;
				    
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

	public static class FactPContext extends ParserRuleContext {
		public Map<String, Integer> variables;
		public int i;
		public int val;
		public FactPContext e;
		public TerminalNode FACTORIAL() { return getToken(GrammarParser.FACTORIAL, 0); }
		public FactPContext factP() {
			return getRuleContext(FactPContext.class,0);
		}
		public FactPContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FactPContext(ParserRuleContext parent, int invokingState, Map<String, Integer> variables, int i) {
			super(parent, invokingState);
			this.variables = variables;
			this.i = i;
		}
		@Override public int getRuleIndex() { return RULE_factP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFactP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFactP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFactP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactPContext factP(Map<String, Integer> variables,int i) throws RecognitionException {
		FactPContext _localctx = new FactPContext(_ctx, getState(), variables, i);
		enterRule(_localctx, 16, RULE_factP);
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLOSE_BRACKET:
			case PLUS:
			case MINUS:
			case MUL:
			case DIV:
			case SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{

				        ((FactPContext)_localctx).val =  _localctx.i;
				    
				}
				break;
			case FACTORIAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(FACTORIAL);
				setState(84);
				((FactPContext)_localctx).e = factP(variables, i);

				        ((FactPContext)_localctx).val =  factorial(((FactPContext)_localctx).e.val);
				    
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

	public static class AtomContext extends ParserRuleContext {
		public Map<String, Integer> variables;
		public int val;
		public ExprContext expr;
		public Token NUMBER;
		public Token VAR;
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public TerminalNode VAR() { return getToken(GrammarParser.VAR, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AtomContext(ParserRuleContext parent, int invokingState, Map<String, Integer> variables) {
			super(parent, invokingState);
			this.variables = variables;
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom(Map<String, Integer> variables) throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState(), variables);
		enterRule(_localctx, 18, RULE_atom);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(OPEN_BRACKET);
				setState(90);
				((AtomContext)_localctx).expr = expr(variables);
				setState(91);
				match(CLOSE_BRACKET);

				        ((AtomContext)_localctx).val =  ((AtomContext)_localctx).expr.val;
				    
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				((AtomContext)_localctx).NUMBER = match(NUMBER);

				        ((AtomContext)_localctx).val =  Integer.parseInt((((AtomContext)_localctx).NUMBER!=null?((AtomContext)_localctx).NUMBER.getText():null));
				    
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				((AtomContext)_localctx).VAR = match(VAR);

				        ((AtomContext)_localctx).val =  variables.get((((AtomContext)_localctx).VAR!=null?((AtomContext)_localctx).VAR.getText():null));
				    
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16g\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"8\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"I\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tS\n\t\3\n\3\n\3\n\3\n\3\n\5\n"+
		"Z\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13e\n\13\3\13\2\2"+
		"\f\2\4\6\b\n\f\16\20\22\24\2\2\2e\2\26\3\2\2\2\4\31\3\2\2\2\6#\3\2\2\2"+
		"\b(\3\2\2\2\n\67\3\2\2\2\f9\3\2\2\2\16H\3\2\2\2\20R\3\2\2\2\22Y\3\2\2"+
		"\2\24d\3\2\2\2\26\27\5\4\3\2\27\30\b\2\1\2\30\3\3\2\2\2\31\32\5\6\4\2"+
		"\32\36\7\n\2\2\33\35\5\4\3\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36"+
		"\37\3\2\2\2\37!\3\2\2\2 \36\3\2\2\2!\"\b\3\1\2\"\5\3\2\2\2#$\7\r\2\2$"+
		"%\7\t\2\2%&\5\b\5\2&\'\b\4\1\2\'\7\3\2\2\2()\5\f\7\2)*\5\n\6\2*+\b\5\1"+
		"\2+\t\3\2\2\2,8\b\6\1\2-.\7\5\2\2./\5\f\7\2/\60\5\n\6\2\60\61\b\6\1\2"+
		"\618\3\2\2\2\62\63\7\6\2\2\63\64\5\f\7\2\64\65\5\n\6\2\65\66\b\6\1\2\66"+
		"8\3\2\2\2\67,\3\2\2\2\67-\3\2\2\2\67\62\3\2\2\28\13\3\2\2\29:\5\20\t\2"+
		":;\5\16\b\2;<\b\7\1\2<\r\3\2\2\2=I\b\b\1\2>?\7\7\2\2?@\5\20\t\2@A\5\16"+
		"\b\2AB\b\b\1\2BI\3\2\2\2CD\7\b\2\2DE\5\20\t\2EF\5\16\b\2FG\b\b\1\2GI\3"+
		"\2\2\2H=\3\2\2\2H>\3\2\2\2HC\3\2\2\2I\17\3\2\2\2JK\7\6\2\2KL\5\24\13\2"+
		"LM\b\t\1\2MS\3\2\2\2NO\5\24\13\2OP\5\22\n\2PQ\b\t\1\2QS\3\2\2\2RJ\3\2"+
		"\2\2RN\3\2\2\2S\21\3\2\2\2TZ\b\n\1\2UV\7\13\2\2VW\5\22\n\2WX\b\n\1\2X"+
		"Z\3\2\2\2YT\3\2\2\2YU\3\2\2\2Z\23\3\2\2\2[\\\7\3\2\2\\]\5\b\5\2]^\7\4"+
		"\2\2^_\b\13\1\2_e\3\2\2\2`a\7\f\2\2ae\b\13\1\2bc\7\r\2\2ce\b\13\1\2d["+
		"\3\2\2\2d`\3\2\2\2db\3\2\2\2e\25\3\2\2\2\b\36\67HRYd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}