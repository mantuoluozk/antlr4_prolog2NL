// Generated from E:/prolog2NL/src/main/java\prolog.g4 by ANTLR 4.7
package com.antlr.out;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class prologParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		LETTER_DIGIT=18, VARIABLE=19, DECIMAL=20, WS=21;
	public static final int
		RULE_p_text = 0, RULE_clause = 1, RULE_termlist = 2, RULE_term = 3, RULE_operator = 4, 
		RULE_atom = 5, RULE_integer = 6;
	public static final String[] ruleNames = {
		"p_text", "clause", "termlist", "term", "operator", "atom", "integer"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "','", "'('", "')'", "'-'", "'['", "'|'", "']'", "'{'", "'}'", 
		"':-'", "'-->'", "'?-'", "';'", "'->'", "'^'", "'\\'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "LETTER_DIGIT", "VARIABLE", "DECIMAL", 
		"WS"
	};
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
	public String getGrammarFileName() { return "prolog.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public prologParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class P_textContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(prologParser.EOF, 0); }
		public List<ClauseContext> clause() {
			return getRuleContexts(ClauseContext.class);
		}
		public ClauseContext clause(int i) {
			return getRuleContext(ClauseContext.class,i);
		}
		public P_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterP_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitP_text(this);
		}
	}

	public final P_textContext p_text() throws RecognitionException {
		P_textContext _localctx = new P_textContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_p_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << LETTER_DIGIT) | (1L << VARIABLE) | (1L << DECIMAL))) != 0)) {
				{
				{
				setState(14);
				clause();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20);
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

	public static class ClauseContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitClause(this);
		}
	}

	public final ClauseContext clause() throws RecognitionException {
		ClauseContext _localctx = new ClauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			term(0);
			setState(23);
			match(T__0);
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

	public static class TermlistContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TermlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterTermlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitTermlist(this);
		}
	}

	public final TermlistContext termlist() throws RecognitionException {
		TermlistContext _localctx = new TermlistContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_termlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			term(0);
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(26);
				match(T__1);
				setState(27);
				term(0);
				}
				}
				setState(32);
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Atom_termContext extends TermContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public Atom_termContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterAtom_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitAtom_term(this);
		}
	}
	public static class Binary_operatorContext extends TermContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Binary_operatorContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterBinary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitBinary_operator(this);
		}
	}
	public static class Unary_operatorContext extends TermContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Unary_operatorContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitUnary_operator(this);
		}
	}
	public static class Braced_termContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Braced_termContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterBraced_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitBraced_term(this);
		}
	}
	public static class List_termContext extends TermContext {
		public TermlistContext termlist() {
			return getRuleContext(TermlistContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public List_termContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterList_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitList_term(this);
		}
	}
	public static class VariableContext extends TermContext {
		public TerminalNode VARIABLE() { return getToken(prologParser.VARIABLE, 0); }
		public VariableContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitVariable(this);
		}
	}
	public static class Compound_termContext extends TermContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TermlistContext termlist() {
			return getRuleContext(TermlistContext.class,0);
		}
		public Compound_termContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterCompound_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitCompound_term(this);
		}
	}
	public static class Integer_termContext extends TermContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public Integer_termContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterInteger_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitInteger_term(this);
		}
	}
	public static class Curly_bracketed_termContext extends TermContext {
		public TermlistContext termlist() {
			return getRuleContext(TermlistContext.class,0);
		}
		public Curly_bracketed_termContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterCurly_bracketed_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitCurly_bracketed_term(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(34);
				match(VARIABLE);
				}
				break;
			case 2:
				{
				_localctx = new Braced_termContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(35);
				match(T__2);
				setState(36);
				term(0);
				setState(37);
				match(T__3);
				}
				break;
			case 3:
				{
				_localctx = new Integer_termContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(39);
					match(T__4);
					}
				}

				setState(42);
				integer();
				}
				break;
			case 4:
				{
				_localctx = new Compound_termContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(43);
				atom();
				setState(44);
				match(T__2);
				setState(45);
				termlist();
				setState(46);
				match(T__3);
				}
				break;
			case 5:
				{
				_localctx = new Unary_operatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(48);
				operator();
				setState(49);
				term(4);
				}
				break;
			case 6:
				{
				_localctx = new List_termContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(51);
				match(T__5);
				setState(52);
				termlist();
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(53);
					match(T__6);
					setState(54);
					term(0);
					}
				}

				setState(57);
				match(T__7);
				}
				break;
			case 7:
				{
				_localctx = new Curly_bracketed_termContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				match(T__8);
				setState(60);
				termlist();
				setState(61);
				match(T__9);
				}
				break;
			case 8:
				{
				_localctx = new Atom_termContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63);
				atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(72);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Binary_operatorContext(new TermContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(66);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(67);
					operator();
					setState(68);
					term(5);
					}
					} 
				}
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
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

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NameContext extends AtomContext {
		public TerminalNode LETTER_DIGIT() { return getToken(prologParser.LETTER_DIGIT, 0); }
		public NameContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitName(this);
		}
	}
	public static class Empty_listContext extends AtomContext {
		public Empty_listContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterEmpty_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitEmpty_list(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atom);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				_localctx = new Empty_listContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(T__5);
				setState(78);
				match(T__7);
				}
				break;
			case LETTER_DIGIT:
				_localctx = new NameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(LETTER_DIGIT);
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode DECIMAL() { return getToken(prologParser.DECIMAL, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(DECIMAL);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27W\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\7\2\22\n\2\f\2\16\2\25"+
		"\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\7\4\37\n\4\f\4\16\4\"\13\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5+\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5:\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5C\n\5\3\5\3\5\3"+
		"\5\3\5\7\5I\n\5\f\5\16\5L\13\5\3\6\3\6\3\7\3\7\3\7\5\7S\n\7\3\b\3\b\3"+
		"\b\2\3\b\t\2\4\6\b\n\f\16\2\3\4\2\4\4\r\23\2\\\2\23\3\2\2\2\4\30\3\2\2"+
		"\2\6\33\3\2\2\2\bB\3\2\2\2\nM\3\2\2\2\fR\3\2\2\2\16T\3\2\2\2\20\22\5\4"+
		"\3\2\21\20\3\2\2\2\22\25\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\26\3\2"+
		"\2\2\25\23\3\2\2\2\26\27\7\2\2\3\27\3\3\2\2\2\30\31\5\b\5\2\31\32\7\3"+
		"\2\2\32\5\3\2\2\2\33 \5\b\5\2\34\35\7\4\2\2\35\37\5\b\5\2\36\34\3\2\2"+
		"\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\7\3\2\2\2\" \3\2\2\2#$\b\5\1\2"+
		"$C\7\25\2\2%&\7\5\2\2&\'\5\b\5\2\'(\7\6\2\2(C\3\2\2\2)+\7\7\2\2*)\3\2"+
		"\2\2*+\3\2\2\2+,\3\2\2\2,C\5\16\b\2-.\5\f\7\2./\7\5\2\2/\60\5\6\4\2\60"+
		"\61\7\6\2\2\61C\3\2\2\2\62\63\5\n\6\2\63\64\5\b\5\6\64C\3\2\2\2\65\66"+
		"\7\b\2\2\669\5\6\4\2\678\7\t\2\28:\5\b\5\29\67\3\2\2\29:\3\2\2\2:;\3\2"+
		"\2\2;<\7\n\2\2<C\3\2\2\2=>\7\13\2\2>?\5\6\4\2?@\7\f\2\2@C\3\2\2\2AC\5"+
		"\f\7\2B#\3\2\2\2B%\3\2\2\2B*\3\2\2\2B-\3\2\2\2B\62\3\2\2\2B\65\3\2\2\2"+
		"B=\3\2\2\2BA\3\2\2\2CJ\3\2\2\2DE\f\7\2\2EF\5\n\6\2FG\5\b\5\7GI\3\2\2\2"+
		"HD\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\t\3\2\2\2LJ\3\2\2\2MN\t\2\2"+
		"\2N\13\3\2\2\2OP\7\b\2\2PS\7\n\2\2QS\7\24\2\2RO\3\2\2\2RQ\3\2\2\2S\r\3"+
		"\2\2\2TU\7\26\2\2U\17\3\2\2\2\t\23 *9BJR";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}