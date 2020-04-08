// Generated from C:/itmo/parser-generator/src/main\Grammar.g4 by ANTLR 4.8
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
		GRAMMAR=1, HEADER=2, MEMBERS=3, INIT=4, RETURNS=5, LOCALS=6, SKIPPING=7, 
		OPEN_BRACKET=8, CLOSE_BRACKET=9, SQUARE_OPEN_BRACKET=10, SQUARE_CLOSE_BRACKET=11, 
		COLON=12, COMMA=13, SEMICOLON=14, OR=15, WORD=16, REGEX=17, CODE_TEXT=18, 
		PARAMETER_TEXT=19, WS=20;
	public static final int
		RULE_s = 0, RULE_file = 1, RULE_documentComment = 2, RULE_header = 3, 
		RULE_members = 4, RULE_state_declaration = 5, RULE_state_parameters = 6, 
		RULE_state_returns = 7, RULE_state_locals = 8, RULE_state_rule = 9, RULE_item = 10, 
		RULE_code_block = 11, RULE_parameter_block = 12, RULE_token_declaration = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "file", "documentComment", "header", "members", "state_declaration", 
			"state_parameters", "state_returns", "state_locals", "state_rule", "item", 
			"code_block", "parameter_block", "token_declaration"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'grammar'", "'@header'", "'@members'", "'@init'", "'returns'", 
			"'locals'", "'-> skip'", "'('", "')'", "'['", "']'", "':'", "','", "';'", 
			"'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GRAMMAR", "HEADER", "MEMBERS", "INIT", "RETURNS", "LOCALS", "SKIPPING", 
			"OPEN_BRACKET", "CLOSE_BRACKET", "SQUARE_OPEN_BRACKET", "SQUARE_CLOSE_BRACKET", 
			"COLON", "COMMA", "SEMICOLON", "OR", "WORD", "REGEX", "CODE_TEXT", "PARAMETER_TEXT", 
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
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SContext extends ParserRuleContext {
		public Grammar g;
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);

		    ((SContext)_localctx).g =  new Grammar();

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			file(_localctx.g);
			setState(29);
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

	public static class FileContext extends ParserRuleContext {
		public Grammar g;
		public State_declarationContext state_declaration;
		public Token_declarationContext token_declaration;
		public DocumentCommentContext documentComment() {
			return getRuleContext(DocumentCommentContext.class,0);
		}
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public MembersContext members() {
			return getRuleContext(MembersContext.class,0);
		}
		public List<State_declarationContext> state_declaration() {
			return getRuleContexts(State_declarationContext.class);
		}
		public State_declarationContext state_declaration(int i) {
			return getRuleContext(State_declarationContext.class,i);
		}
		public List<Token_declarationContext> token_declaration() {
			return getRuleContexts(Token_declarationContext.class);
		}
		public Token_declarationContext token_declaration(int i) {
			return getRuleContext(Token_declarationContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FileContext(ParserRuleContext parent, int invokingState, Grammar g) {
			super(parent, invokingState);
			this.g = g;
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file(Grammar g) throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState(), g);
		enterRule(_localctx, 2, RULE_file);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GRAMMAR) {
				{
				setState(31);
				documentComment(_localctx.g);
				}
			}

			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HEADER) {
				{
				setState(34);
				header(_localctx.g);
				}
			}

			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MEMBERS) {
				{
				setState(37);
				members(_localctx.g);
				}
			}

			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(40);
					((FileContext)_localctx).state_declaration = state_declaration();

					            _localctx.g.addState(((FileContext)_localctx).state_declaration.state);
					        
					}
					} 
				}
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WORD) {
				{
				{
				setState(48);
				((FileContext)_localctx).token_declaration = token_declaration();

				            _localctx.g.addToken(((FileContext)_localctx).token_declaration.token);
				        
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class DocumentCommentContext extends ParserRuleContext {
		public Grammar g;
		public Token WORD;
		public TerminalNode GRAMMAR() { return getToken(GrammarParser.GRAMMAR, 0); }
		public TerminalNode WORD() { return getToken(GrammarParser.WORD, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public DocumentCommentContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DocumentCommentContext(ParserRuleContext parent, int invokingState, Grammar g) {
			super(parent, invokingState);
			this.g = g;
		}
		@Override public int getRuleIndex() { return RULE_documentComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDocumentComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDocumentComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDocumentComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentCommentContext documentComment(Grammar g) throws RecognitionException {
		DocumentCommentContext _localctx = new DocumentCommentContext(_ctx, getState(), g);
		enterRule(_localctx, 4, RULE_documentComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(GRAMMAR);
			setState(57);
			((DocumentCommentContext)_localctx).WORD = match(WORD);
			setState(58);
			match(SEMICOLON);

			        _localctx.g.setName((((DocumentCommentContext)_localctx).WORD!=null?((DocumentCommentContext)_localctx).WORD.getText():null));
			    
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

	public static class HeaderContext extends ParserRuleContext {
		public Grammar g;
		public StringBuilder code;
		public TerminalNode HEADER() { return getToken(GrammarParser.HEADER, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public HeaderContext(ParserRuleContext parent, int invokingState, Grammar g) {
			super(parent, invokingState);
			this.g = g;
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header(Grammar g) throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState(), g);
		enterRule(_localctx, 6, RULE_header);

		    ((HeaderContext)_localctx).code =  new StringBuilder();

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(HEADER);
			setState(62);
			code_block(_localctx.code);

			        _localctx.g.setHeader(_localctx.code.toString());
			    
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

	public static class MembersContext extends ParserRuleContext {
		public Grammar g;
		public StringBuilder code;
		public TerminalNode MEMBERS() { return getToken(GrammarParser.MEMBERS, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public MembersContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MembersContext(ParserRuleContext parent, int invokingState, Grammar g) {
			super(parent, invokingState);
			this.g = g;
		}
		@Override public int getRuleIndex() { return RULE_members; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMembers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitMembers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MembersContext members(Grammar g) throws RecognitionException {
		MembersContext _localctx = new MembersContext(_ctx, getState(), g);
		enterRule(_localctx, 8, RULE_members);

		    ((MembersContext)_localctx).code =  new StringBuilder();

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(MEMBERS);
			setState(66);
			code_block(_localctx.code);

			        _localctx.g.setMembers(_localctx.code.toString());
			    
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

	public static class State_declarationContext extends ParserRuleContext {
		public State state;
		public StringBuilder code;
		public Token WORD;
		public State_ruleContext state_rule;
		public TerminalNode WORD() { return getToken(GrammarParser.WORD, 0); }
		public TerminalNode COLON() { return getToken(GrammarParser.COLON, 0); }
		public List<State_ruleContext> state_rule() {
			return getRuleContexts(State_ruleContext.class);
		}
		public State_ruleContext state_rule(int i) {
			return getRuleContext(State_ruleContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public List<TerminalNode> SQUARE_OPEN_BRACKET() { return getTokens(GrammarParser.SQUARE_OPEN_BRACKET); }
		public TerminalNode SQUARE_OPEN_BRACKET(int i) {
			return getToken(GrammarParser.SQUARE_OPEN_BRACKET, i);
		}
		public State_parametersContext state_parameters() {
			return getRuleContext(State_parametersContext.class,0);
		}
		public List<TerminalNode> SQUARE_CLOSE_BRACKET() { return getTokens(GrammarParser.SQUARE_CLOSE_BRACKET); }
		public TerminalNode SQUARE_CLOSE_BRACKET(int i) {
			return getToken(GrammarParser.SQUARE_CLOSE_BRACKET, i);
		}
		public TerminalNode RETURNS() { return getToken(GrammarParser.RETURNS, 0); }
		public State_returnsContext state_returns() {
			return getRuleContext(State_returnsContext.class,0);
		}
		public TerminalNode LOCALS() { return getToken(GrammarParser.LOCALS, 0); }
		public State_localsContext state_locals() {
			return getRuleContext(State_localsContext.class,0);
		}
		public TerminalNode INIT() { return getToken(GrammarParser.INIT, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public List<TerminalNode> OR() { return getTokens(GrammarParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(GrammarParser.OR, i);
		}
		public State_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterState_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitState_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitState_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final State_declarationContext state_declaration() throws RecognitionException {
		State_declarationContext _localctx = new State_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_state_declaration);

		    ((State_declarationContext)_localctx).code =  new StringBuilder();
		    ((State_declarationContext)_localctx).state =  new State();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			((State_declarationContext)_localctx).WORD = match(WORD);

			        _localctx.state.setName((((State_declarationContext)_localctx).WORD!=null?((State_declarationContext)_localctx).WORD.getText():null));
			    
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SQUARE_OPEN_BRACKET) {
				{
				setState(71);
				match(SQUARE_OPEN_BRACKET);
				setState(72);
				state_parameters(_localctx.state);
				setState(73);
				match(SQUARE_CLOSE_BRACKET);
				}
			}

			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNS) {
				{
				setState(77);
				match(RETURNS);
				setState(78);
				match(SQUARE_OPEN_BRACKET);
				setState(79);
				state_returns(_localctx.state);
				setState(80);
				match(SQUARE_CLOSE_BRACKET);
				}
			}

			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCALS) {
				{
				setState(84);
				match(LOCALS);
				setState(85);
				match(SQUARE_OPEN_BRACKET);
				setState(86);
				state_locals(_localctx.state);
				setState(87);
				match(SQUARE_CLOSE_BRACKET);
				}
			}

			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INIT) {
				{
				setState(91);
				match(INIT);
				setState(92);
				code_block(_localctx.code);

				            _localctx.state.setInit(_localctx.code.toString());
				        
				}
			}

			setState(97);
			match(COLON);
			setState(98);
			((State_declarationContext)_localctx).state_rule = state_rule();

			        _localctx.state.addRule(((State_declarationContext)_localctx).state_rule.rule);
			    
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(100);
				match(OR);
				setState(101);
				((State_declarationContext)_localctx).state_rule = state_rule();

				            _localctx.state.addRule(((State_declarationContext)_localctx).state_rule.rule);
				        
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			match(SEMICOLON);
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

	public static class State_parametersContext extends ParserRuleContext {
		public State state;
		public Token type;
		public Token name;
		public List<TerminalNode> WORD() { return getTokens(GrammarParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(GrammarParser.WORD, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public State_parametersContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public State_parametersContext(ParserRuleContext parent, int invokingState, State state) {
			super(parent, invokingState);
			this.state = state;
		}
		@Override public int getRuleIndex() { return RULE_state_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterState_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitState_parameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitState_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final State_parametersContext state_parameters(State state) throws RecognitionException {
		State_parametersContext _localctx = new State_parametersContext(_ctx, getState(), state);
		enterRule(_localctx, 12, RULE_state_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			((State_parametersContext)_localctx).type = match(WORD);
			setState(112);
			((State_parametersContext)_localctx).name = match(WORD);

			        _localctx.state.addParameter((((State_parametersContext)_localctx).type!=null?((State_parametersContext)_localctx).type.getText():null), (((State_parametersContext)_localctx).name!=null?((State_parametersContext)_localctx).name.getText():null));
			    
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(114);
				match(COMMA);
				setState(115);
				((State_parametersContext)_localctx).type = match(WORD);
				setState(116);
				((State_parametersContext)_localctx).name = match(WORD);

				            _localctx.state.addParameter((((State_parametersContext)_localctx).type!=null?((State_parametersContext)_localctx).type.getText():null), (((State_parametersContext)_localctx).name!=null?((State_parametersContext)_localctx).name.getText():null));
				        
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class State_returnsContext extends ParserRuleContext {
		public State state;
		public Token type;
		public Token name;
		public List<TerminalNode> WORD() { return getTokens(GrammarParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(GrammarParser.WORD, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public State_returnsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public State_returnsContext(ParserRuleContext parent, int invokingState, State state) {
			super(parent, invokingState);
			this.state = state;
		}
		@Override public int getRuleIndex() { return RULE_state_returns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterState_returns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitState_returns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitState_returns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final State_returnsContext state_returns(State state) throws RecognitionException {
		State_returnsContext _localctx = new State_returnsContext(_ctx, getState(), state);
		enterRule(_localctx, 14, RULE_state_returns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			((State_returnsContext)_localctx).type = match(WORD);
			setState(124);
			((State_returnsContext)_localctx).name = match(WORD);

			        _localctx.state.addReturn((((State_returnsContext)_localctx).type!=null?((State_returnsContext)_localctx).type.getText():null), (((State_returnsContext)_localctx).name!=null?((State_returnsContext)_localctx).name.getText():null));
			    
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(126);
				match(COMMA);
				setState(127);
				((State_returnsContext)_localctx).type = match(WORD);
				setState(128);
				((State_returnsContext)_localctx).name = match(WORD);

				            _localctx.state.addReturn((((State_returnsContext)_localctx).type!=null?((State_returnsContext)_localctx).type.getText():null), (((State_returnsContext)_localctx).name!=null?((State_returnsContext)_localctx).name.getText():null));
				        
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class State_localsContext extends ParserRuleContext {
		public State state;
		public Token type;
		public Token name;
		public List<TerminalNode> WORD() { return getTokens(GrammarParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(GrammarParser.WORD, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public State_localsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public State_localsContext(ParserRuleContext parent, int invokingState, State state) {
			super(parent, invokingState);
			this.state = state;
		}
		@Override public int getRuleIndex() { return RULE_state_locals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterState_locals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitState_locals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitState_locals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final State_localsContext state_locals(State state) throws RecognitionException {
		State_localsContext _localctx = new State_localsContext(_ctx, getState(), state);
		enterRule(_localctx, 16, RULE_state_locals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			((State_localsContext)_localctx).type = match(WORD);
			setState(136);
			((State_localsContext)_localctx).name = match(WORD);

			        _localctx.state.addLocal((((State_localsContext)_localctx).type!=null?((State_localsContext)_localctx).type.getText():null), (((State_localsContext)_localctx).name!=null?((State_localsContext)_localctx).name.getText():null));
			    
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(138);
				match(COMMA);
				setState(139);
				((State_localsContext)_localctx).type = match(WORD);
				setState(140);
				((State_localsContext)_localctx).name = match(WORD);

				            _localctx.state.addLocal((((State_localsContext)_localctx).type!=null?((State_localsContext)_localctx).type.getText():null), (((State_localsContext)_localctx).name!=null?((State_localsContext)_localctx).name.getText():null));
				        
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class State_ruleContext extends ParserRuleContext {
		public Rule rule;
		public ItemContext item;
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public State_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterState_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitState_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitState_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final State_ruleContext state_rule() throws RecognitionException {
		State_ruleContext _localctx = new State_ruleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_state_rule);

		    ((State_ruleContext)_localctx).rule =  new Rule();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WORD) {
				{
				{
				setState(147);
				((State_ruleContext)_localctx).item = item();

				            _localctx.rule.addItem(((State_ruleContext)_localctx).item.i);
				        
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ItemContext extends ParserRuleContext {
		public Item i;
		public StringBuilder code;
		public StringBuilder params;
		public Token WORD;
		public TerminalNode WORD() { return getToken(GrammarParser.WORD, 0); }
		public Parameter_blockContext parameter_block() {
			return getRuleContext(Parameter_blockContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_item);

		    ((ItemContext)_localctx).i =  new Item();
		    ((ItemContext)_localctx).code =  new StringBuilder();
		    ((ItemContext)_localctx).params =  new StringBuilder();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			((ItemContext)_localctx).WORD = match(WORD);

			        _localctx.i.setName((((ItemContext)_localctx).WORD!=null?((ItemContext)_localctx).WORD.getText():null));
			    
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARAMETER_TEXT) {
				{
				setState(157);
				parameter_block(_localctx.params);

				            _localctx.i.setParameters(_localctx.params.toString());
				        
				}
			}

			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CODE_TEXT) {
				{
				setState(162);
				code_block(_localctx.code);

				            _localctx.i.setCode(_localctx.code.toString());
				        
				}
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

	public static class Code_blockContext extends ParserRuleContext {
		public StringBuilder sb;
		public Token CODE_TEXT;
		public TerminalNode CODE_TEXT() { return getToken(GrammarParser.CODE_TEXT, 0); }
		public Code_blockContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Code_blockContext(ParserRuleContext parent, int invokingState, StringBuilder sb) {
			super(parent, invokingState);
			this.sb = sb;
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCode_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCode_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCode_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_blockContext code_block(StringBuilder sb) throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState(), sb);
		enterRule(_localctx, 22, RULE_code_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			((Code_blockContext)_localctx).CODE_TEXT = match(CODE_TEXT);

			        String codeText = (((Code_blockContext)_localctx).CODE_TEXT!=null?((Code_blockContext)_localctx).CODE_TEXT.getText():null);
			        _localctx.sb.append(codeText.substring(2, codeText.length() - 2));
			    
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

	public static class Parameter_blockContext extends ParserRuleContext {
		public StringBuilder sb;
		public Token PARAMETER_TEXT;
		public TerminalNode PARAMETER_TEXT() { return getToken(GrammarParser.PARAMETER_TEXT, 0); }
		public Parameter_blockContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Parameter_blockContext(ParserRuleContext parent, int invokingState, StringBuilder sb) {
			super(parent, invokingState);
			this.sb = sb;
		}
		@Override public int getRuleIndex() { return RULE_parameter_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterParameter_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitParameter_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitParameter_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_blockContext parameter_block(StringBuilder sb) throws RecognitionException {
		Parameter_blockContext _localctx = new Parameter_blockContext(_ctx, getState(), sb);
		enterRule(_localctx, 24, RULE_parameter_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			((Parameter_blockContext)_localctx).PARAMETER_TEXT = match(PARAMETER_TEXT);

			        String paramText = (((Parameter_blockContext)_localctx).PARAMETER_TEXT!=null?((Parameter_blockContext)_localctx).PARAMETER_TEXT.getText():null);
			        _localctx.sb.append(paramText.substring(2, paramText.length() - 2));
			    
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

	public static class Token_declarationContext extends ParserRuleContext {
		public StateToken token;
		public Token WORD;
		public Token REGEX;
		public TerminalNode WORD() { return getToken(GrammarParser.WORD, 0); }
		public TerminalNode COLON() { return getToken(GrammarParser.COLON, 0); }
		public TerminalNode REGEX() { return getToken(GrammarParser.REGEX, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public Token_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterToken_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitToken_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitToken_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Token_declarationContext token_declaration() throws RecognitionException {
		Token_declarationContext _localctx = new Token_declarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_token_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			((Token_declarationContext)_localctx).WORD = match(WORD);
			setState(174);
			match(COLON);
			setState(175);
			((Token_declarationContext)_localctx).REGEX = match(REGEX);
			setState(176);
			match(SEMICOLON);

			        String regex = (((Token_declarationContext)_localctx).REGEX!=null?((Token_declarationContext)_localctx).REGEX.getText():null);
			        ((Token_declarationContext)_localctx).token =  new StateToken((((Token_declarationContext)_localctx).WORD!=null?((Token_declarationContext)_localctx).WORD.getText():null), regex.substring(1, regex.length() - 1));
			    
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\u00b6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\3\5\3#\n\3\3\3"+
		"\5\3&\n\3\3\3\5\3)\n\3\3\3\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\3\3\3\3"+
		"\3\7\3\66\n\3\f\3\16\39\13\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7N\n\7\3\7\3\7\3\7\3\7\3\7\5\7U\n"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7\\\n\7\3\7\3\7\3\7\3\7\5\7b\n\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\7\7k\n\7\f\7\16\7n\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\7\by\n\b\f\b\16\b|\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0085\n"+
		"\t\f\t\16\t\u0088\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0091\n\n\f\n\16"+
		"\n\u0094\13\n\3\13\3\13\3\13\7\13\u0099\n\13\f\13\16\13\u009c\13\13\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u00a3\n\f\3\f\3\f\3\f\5\f\u00a8\n\f\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\2\2\2\u00b7\2\36\3\2\2\2\4\"\3\2\2\2\6:\3\2\2"+
		"\2\b?\3\2\2\2\nC\3\2\2\2\fG\3\2\2\2\16q\3\2\2\2\20}\3\2\2\2\22\u0089\3"+
		"\2\2\2\24\u009a\3\2\2\2\26\u009d\3\2\2\2\30\u00a9\3\2\2\2\32\u00ac\3\2"+
		"\2\2\34\u00af\3\2\2\2\36\37\5\4\3\2\37 \7\2\2\3 \3\3\2\2\2!#\5\6\4\2\""+
		"!\3\2\2\2\"#\3\2\2\2#%\3\2\2\2$&\5\b\5\2%$\3\2\2\2%&\3\2\2\2&(\3\2\2\2"+
		"\')\5\n\6\2(\'\3\2\2\2()\3\2\2\2)/\3\2\2\2*+\5\f\7\2+,\b\3\1\2,.\3\2\2"+
		"\2-*\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\67\3\2\2\2\61/\3\2\2"+
		"\2\62\63\5\34\17\2\63\64\b\3\1\2\64\66\3\2\2\2\65\62\3\2\2\2\669\3\2\2"+
		"\2\67\65\3\2\2\2\678\3\2\2\28\5\3\2\2\29\67\3\2\2\2:;\7\3\2\2;<\7\22\2"+
		"\2<=\7\20\2\2=>\b\4\1\2>\7\3\2\2\2?@\7\4\2\2@A\5\30\r\2AB\b\5\1\2B\t\3"+
		"\2\2\2CD\7\5\2\2DE\5\30\r\2EF\b\6\1\2F\13\3\2\2\2GH\7\22\2\2HM\b\7\1\2"+
		"IJ\7\f\2\2JK\5\16\b\2KL\7\r\2\2LN\3\2\2\2MI\3\2\2\2MN\3\2\2\2NT\3\2\2"+
		"\2OP\7\7\2\2PQ\7\f\2\2QR\5\20\t\2RS\7\r\2\2SU\3\2\2\2TO\3\2\2\2TU\3\2"+
		"\2\2U[\3\2\2\2VW\7\b\2\2WX\7\f\2\2XY\5\22\n\2YZ\7\r\2\2Z\\\3\2\2\2[V\3"+
		"\2\2\2[\\\3\2\2\2\\a\3\2\2\2]^\7\6\2\2^_\5\30\r\2_`\b\7\1\2`b\3\2\2\2"+
		"a]\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7\16\2\2de\5\24\13\2el\b\7\1\2fg\7\21"+
		"\2\2gh\5\24\13\2hi\b\7\1\2ik\3\2\2\2jf\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3"+
		"\2\2\2mo\3\2\2\2nl\3\2\2\2op\7\20\2\2p\r\3\2\2\2qr\7\22\2\2rs\7\22\2\2"+
		"sz\b\b\1\2tu\7\17\2\2uv\7\22\2\2vw\7\22\2\2wy\b\b\1\2xt\3\2\2\2y|\3\2"+
		"\2\2zx\3\2\2\2z{\3\2\2\2{\17\3\2\2\2|z\3\2\2\2}~\7\22\2\2~\177\7\22\2"+
		"\2\177\u0086\b\t\1\2\u0080\u0081\7\17\2\2\u0081\u0082\7\22\2\2\u0082\u0083"+
		"\7\22\2\2\u0083\u0085\b\t\1\2\u0084\u0080\3\2\2\2\u0085\u0088\3\2\2\2"+
		"\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\21\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0089\u008a\7\22\2\2\u008a\u008b\7\22\2\2\u008b\u0092\b\n\1\2"+
		"\u008c\u008d\7\17\2\2\u008d\u008e\7\22\2\2\u008e\u008f\7\22\2\2\u008f"+
		"\u0091\b\n\1\2\u0090\u008c\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0092\u0093\3\2\2\2\u0093\23\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096"+
		"\5\26\f\2\u0096\u0097\b\13\1\2\u0097\u0099\3\2\2\2\u0098\u0095\3\2\2\2"+
		"\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\25"+
		"\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7\22\2\2\u009e\u00a2\b\f\1\2"+
		"\u009f\u00a0\5\32\16\2\u00a0\u00a1\b\f\1\2\u00a1\u00a3\3\2\2\2\u00a2\u009f"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a7\3\2\2\2\u00a4\u00a5\5\30\r\2"+
		"\u00a5\u00a6\b\f\1\2\u00a6\u00a8\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a7\u00a8"+
		"\3\2\2\2\u00a8\27\3\2\2\2\u00a9\u00aa\7\24\2\2\u00aa\u00ab\b\r\1\2\u00ab"+
		"\31\3\2\2\2\u00ac\u00ad\7\25\2\2\u00ad\u00ae\b\16\1\2\u00ae\33\3\2\2\2"+
		"\u00af\u00b0\7\22\2\2\u00b0\u00b1\7\16\2\2\u00b1\u00b2\7\23\2\2\u00b2"+
		"\u00b3\7\20\2\2\u00b3\u00b4\b\17\1\2\u00b4\35\3\2\2\2\22\"%(/\67MT[al"+
		"z\u0086\u0092\u009a\u00a2\u00a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}