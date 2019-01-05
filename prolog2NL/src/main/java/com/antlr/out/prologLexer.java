// Generated from E:/prolog2NL/src/main/java\prolog.g4 by ANTLR 4.7
package com.antlr.out;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class prologLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		LETTER_DIGIT=18, VARIABLE=19, DECIMAL=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"LETTER_DIGIT", "VARIABLE", "DECIMAL", "ALPHANUMERIC", "ALPHA", "SMALL_LETTER", 
		"CAPITAL_LETTER", "DIGIT", "WS"
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


	public prologLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "prolog.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u0087\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\7\23"+
		"a\n\23\f\23\16\23d\13\23\3\24\3\24\7\24h\n\24\f\24\16\24k\13\24\3\25\6"+
		"\25n\n\25\r\25\16\25o\3\26\3\26\5\26t\n\26\3\27\3\27\3\27\5\27y\n\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\33\6\33\u0082\n\33\r\33\16\33\u0083\3\33"+
		"\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\2-\2/\2\61\2\63\2\65\27\3\2\6"+
		"\4\2aac|\3\2C\\\3\2\62;\5\2\13\f\17\17\"\"\2\u0088\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\59\3\2\2\2\7;\3\2\2\2\t=\3"+
		"\2\2\2\13?\3\2\2\2\rA\3\2\2\2\17C\3\2\2\2\21E\3\2\2\2\23G\3\2\2\2\25I"+
		"\3\2\2\2\27K\3\2\2\2\31N\3\2\2\2\33R\3\2\2\2\35U\3\2\2\2\37W\3\2\2\2!"+
		"Z\3\2\2\2#\\\3\2\2\2%^\3\2\2\2\'e\3\2\2\2)m\3\2\2\2+s\3\2\2\2-x\3\2\2"+
		"\2/z\3\2\2\2\61|\3\2\2\2\63~\3\2\2\2\65\u0081\3\2\2\2\678\7\60\2\28\4"+
		"\3\2\2\29:\7.\2\2:\6\3\2\2\2;<\7*\2\2<\b\3\2\2\2=>\7+\2\2>\n\3\2\2\2?"+
		"@\7/\2\2@\f\3\2\2\2AB\7]\2\2B\16\3\2\2\2CD\7~\2\2D\20\3\2\2\2EF\7_\2\2"+
		"F\22\3\2\2\2GH\7}\2\2H\24\3\2\2\2IJ\7\177\2\2J\26\3\2\2\2KL\7<\2\2LM\7"+
		"/\2\2M\30\3\2\2\2NO\7/\2\2OP\7/\2\2PQ\7@\2\2Q\32\3\2\2\2RS\7A\2\2ST\7"+
		"/\2\2T\34\3\2\2\2UV\7=\2\2V\36\3\2\2\2WX\7/\2\2XY\7@\2\2Y \3\2\2\2Z[\7"+
		"`\2\2[\"\3\2\2\2\\]\7^\2\2]$\3\2\2\2^b\5/\30\2_a\5+\26\2`_\3\2\2\2ad\3"+
		"\2\2\2b`\3\2\2\2bc\3\2\2\2c&\3\2\2\2db\3\2\2\2ei\5\61\31\2fh\5+\26\2g"+
		"f\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j(\3\2\2\2ki\3\2\2\2ln\5\63\32"+
		"\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2p*\3\2\2\2qt\5-\27\2rt\5\63"+
		"\32\2sq\3\2\2\2sr\3\2\2\2t,\3\2\2\2uy\7a\2\2vy\5/\30\2wy\5\61\31\2xu\3"+
		"\2\2\2xv\3\2\2\2xw\3\2\2\2y.\3\2\2\2z{\t\2\2\2{\60\3\2\2\2|}\t\3\2\2}"+
		"\62\3\2\2\2~\177\t\4\2\2\177\64\3\2\2\2\u0080\u0082\t\5\2\2\u0081\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0086\b\33\2\2\u0086\66\3\2\2\2\t\2biosx\u0083\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}