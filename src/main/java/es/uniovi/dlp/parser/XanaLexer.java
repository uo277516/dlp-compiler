// Generated from Xana.g4 by ANTLR 4.3

package es.uniovi.dlp.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XanaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT_CONSTANT=1, REAL_CONSTANT=2, ID=3;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'"
	};
	public static final String[] ruleNames = {
		"INT_CONSTANT", "REAL_CONSTANT", "ID", "REAL_CONSTANT_DECIMAL", "REAL_CONSTANT_EXP", 
		"LETTER"
	};


	public XanaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Xana.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\5\67\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\21\n\2\r\2\16\2\22\3"+
		"\3\3\3\5\3\27\n\3\3\4\3\4\3\5\7\5\34\n\5\f\5\16\5\37\13\5\3\5\3\5\7\5"+
		"#\n\5\f\5\16\5&\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6/\n\6\3\6\3\6\3\6"+
		"\5\6\64\n\6\3\7\3\7\2\2\b\3\3\5\4\7\5\t\2\13\2\r\2\3\2\5\3\2\62;\4\2-"+
		"-//\4\2C\\c|9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\3\20\3\2\2\2\5\26\3"+
		"\2\2\2\7\30\3\2\2\2\t\35\3\2\2\2\13\63\3\2\2\2\r\65\3\2\2\2\17\21\t\2"+
		"\2\2\20\17\3\2\2\2\21\22\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\4\3\2"+
		"\2\2\24\27\5\t\5\2\25\27\5\13\6\2\26\24\3\2\2\2\26\25\3\2\2\2\27\6\3\2"+
		"\2\2\30\31\5\r\7\2\31\b\3\2\2\2\32\34\5\3\2\2\33\32\3\2\2\2\34\37\3\2"+
		"\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36 \3\2\2\2\37\35\3\2\2\2 $\13\2\2\2"+
		"!#\5\3\2\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\n\3\2\2\2&$\3\2"+
		"\2\2\'(\5\t\5\2()\7G\2\2)*\t\3\2\2*+\5\3\2\2+\64\3\2\2\2,/\5\3\2\2-/\5"+
		"\t\5\2.,\3\2\2\2.-\3\2\2\2/\60\3\2\2\2\60\61\7g\2\2\61\62\5\3\2\2\62\64"+
		"\3\2\2\2\63\'\3\2\2\2\63.\3\2\2\2\64\f\3\2\2\2\65\66\t\4\2\2\66\16\3\2"+
		"\2\2\t\2\22\26\35$.\63\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}