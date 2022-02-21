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
		BASURA=1, INT_CONSTANT=2, ID=3, REAL_CONSTANT=4, ONELINE_COMMENT=5, LINES_COMMENT=6, 
		CHAR_CONSTANT=7;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'"
	};
	public static final String[] ruleNames = {
		"BASURA", "INT_CONSTANT", "ID", "REAL_CONSTANT", "ONELINE_COMMENT", "LINES_COMMENT", 
		"CHAR_CONSTANT", "ASCI", "ASCI_1", "ASCI_2", "CHAR_ESPECIAL", "ID_BODY", 
		"REAL_CONSTANT_DECIMAL", "REAL_CONSTANT_EXP", "DIGIT", "DIGITS", "EXPOS", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\t\u00ae\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\6\2)\n\2\r\2\16\2*\3\2\3\2\3\3\3\3\3\3\7\3\62\n\3\f\3\16"+
		"\3\65\13\3\5\3\67\n\3\3\4\3\4\5\4;\n\4\3\4\7\4>\n\4\f\4\16\4A\13\4\3\5"+
		"\3\5\5\5E\n\5\3\6\3\6\7\6I\n\6\f\6\16\6L\13\6\3\6\5\6O\n\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\7\7X\n\7\f\7\16\7[\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\5\bg\n\b\3\b\3\b\3\t\3\t\3\t\5\tn\n\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13y\n\13\3\f\3\f\3\f\3\f\5\f\177\n\f\3\r\3\r\3"+
		"\r\5\r\u0084\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u008f"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0098\n\17\3\17\3\17\3\17"+
		"\5\17\u009d\n\17\3\20\3\20\3\21\6\21\u00a2\n\21\r\21\16\21\u00a3\3\22"+
		"\3\22\7\22\u00a8\n\22\f\22\16\22\u00ab\13\22\3\23\3\23\4JY\2\24\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2"+
		"%\2\3\2\13\5\2\13\f\17\17\"\"\3\2\63;\3\3\f\f\3\2\62;\3\2\63\63\3\2\64"+
		"\64\3\2\62\67\4\2--//\4\2C\\c|\u00b7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3(\3\2\2\2\5\66\3"+
		"\2\2\2\7:\3\2\2\2\tD\3\2\2\2\13F\3\2\2\2\rR\3\2\2\2\17b\3\2\2\2\21j\3"+
		"\2\2\2\23o\3\2\2\2\25x\3\2\2\2\27~\3\2\2\2\31\u0083\3\2\2\2\33\u008e\3"+
		"\2\2\2\35\u009c\3\2\2\2\37\u009e\3\2\2\2!\u00a1\3\2\2\2#\u00a5\3\2\2\2"+
		"%\u00ac\3\2\2\2\')\t\2\2\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+,"+
		"\3\2\2\2,-\b\2\2\2-\4\3\2\2\2.\67\7\62\2\2/\63\t\3\2\2\60\62\5\37\20\2"+
		"\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\67\3\2\2\2"+
		"\65\63\3\2\2\2\66.\3\2\2\2\66/\3\2\2\2\67\6\3\2\2\28;\5%\23\29;\7a\2\2"+
		":8\3\2\2\2:9\3\2\2\2;?\3\2\2\2<>\5\31\r\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2"+
		"\2?@\3\2\2\2@\b\3\2\2\2A?\3\2\2\2BE\5\33\16\2CE\5\35\17\2DB\3\2\2\2DC"+
		"\3\2\2\2E\n\3\2\2\2FJ\7%\2\2GI\13\2\2\2HG\3\2\2\2IL\3\2\2\2JK\3\2\2\2"+
		"JH\3\2\2\2KN\3\2\2\2LJ\3\2\2\2MO\t\4\2\2NM\3\2\2\2OP\3\2\2\2PQ\b\6\2\2"+
		"Q\f\3\2\2\2RS\7$\2\2ST\7$\2\2TU\7$\2\2UY\3\2\2\2VX\13\2\2\2WV\3\2\2\2"+
		"X[\3\2\2\2YZ\3\2\2\2YW\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7$\2\2]^\7$\2\2"+
		"^_\7$\2\2_`\3\2\2\2`a\b\7\2\2a\16\3\2\2\2bf\7)\2\2cg\13\2\2\2dg\5\21\t"+
		"\2eg\5\27\f\2fc\3\2\2\2fd\3\2\2\2fe\3\2\2\2gh\3\2\2\2hi\7)\2\2i\20\3\2"+
		"\2\2jm\7^\2\2kn\5\23\n\2ln\5\25\13\2mk\3\2\2\2ml\3\2\2\2n\22\3\2\2\2o"+
		"p\t\5\2\2pq\t\5\2\2q\24\3\2\2\2rs\t\6\2\2st\t\5\2\2ty\t\5\2\2uv\t\7\2"+
		"\2vw\t\b\2\2wy\t\b\2\2xr\3\2\2\2xu\3\2\2\2y\26\3\2\2\2z{\7^\2\2{\177\7"+
		"v\2\2|}\7^\2\2}\177\7p\2\2~z\3\2\2\2~|\3\2\2\2\177\30\3\2\2\2\u0080\u0084"+
		"\5%\23\2\u0081\u0084\5\37\20\2\u0082\u0084\7a\2\2\u0083\u0080\3\2\2\2"+
		"\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\32\3\2\2\2\u0085\u0086"+
		"\5\5\3\2\u0086\u0087\7\60\2\2\u0087\u0088\5\5\3\2\u0088\u008f\3\2\2\2"+
		"\u0089\u008a\7\60\2\2\u008a\u008f\5\5\3\2\u008b\u008c\5\5\3\2\u008c\u008d"+
		"\7\60\2\2\u008d\u008f\3\2\2\2\u008e\u0085\3\2\2\2\u008e\u0089\3\2\2\2"+
		"\u008e\u008b\3\2\2\2\u008f\34\3\2\2\2\u0090\u0091\5\33\16\2\u0091\u0092"+
		"\7G\2\2\u0092\u0093\t\t\2\2\u0093\u0094\5#\22\2\u0094\u009d\3\2\2\2\u0095"+
		"\u0098\5!\21\2\u0096\u0098\5\33\16\2\u0097\u0095\3\2\2\2\u0097\u0096\3"+
		"\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7g\2\2\u009a\u009b\5#\22\2\u009b"+
		"\u009d\3\2\2\2\u009c\u0090\3\2\2\2\u009c\u0097\3\2\2\2\u009d\36\3\2\2"+
		"\2\u009e\u009f\t\5\2\2\u009f \3\2\2\2\u00a0\u00a2\t\5\2\2\u00a1\u00a0"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\"\3\2\2\2\u00a5\u00a9\t\3\2\2\u00a6\u00a8\t\5\2\2\u00a7\u00a6\3\2\2\2"+
		"\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa$\3"+
		"\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\t\n\2\2\u00ad&\3\2\2\2\26\2*\63"+
		"\66:?DJNYfmx~\u0083\u008e\u0097\u009c\u00a3\u00a9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}