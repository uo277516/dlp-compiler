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
		INT_CONSTANT=1, ID=2, REAL_CONSTANT=3, ONELINE_COMMENT=4, LINES_COMMENT=5, 
		CHAR_CONSTANT=6;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'"
	};
	public static final String[] ruleNames = {
		"INT_CONSTANT", "ID", "REAL_CONSTANT", "ONELINE_COMMENT", "LINES_COMMENT", 
		"CHAR_CONSTANT", "ASCI", "ASCI_1", "ASCI_2", "CHAR_ESPECIAL", "ID_BODY", 
		"WS", "REAL_CONSTANT_DECIMAL", "REAL_CONSTANT_EXP", "DIGIT", "DIGITS", 
		"EXPOS", "LETTER"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\b\u00a4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\7\2+\n\2\f\2\16\2.\13\2\5\2\60\n\2\3\3\3\3\5\3"+
		"\64\n\3\3\3\7\3\67\n\3\f\3\16\3:\13\3\3\4\3\4\5\4>\n\4\3\5\3\5\7\5B\n"+
		"\5\f\5\16\5E\13\5\3\5\5\5H\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6Q\n\6\f"+
		"\6\16\6T\13\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7^\n\7\3\7\3\7\3\b\3\b"+
		"\3\b\5\be\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\np\n\n\3\13\3\13\3"+
		"\f\3\f\3\f\5\fw\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u0085\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u008e\n"+
		"\17\3\17\3\17\3\17\5\17\u0093\n\17\3\20\3\20\3\21\6\21\u0098\n\21\r\21"+
		"\16\21\u0099\3\22\3\22\7\22\u009e\n\22\f\22\16\22\u00a1\13\22\3\23\3\23"+
		"\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35"+
		"\2\37\2!\2#\2%\2\3\2\13\3\2\63;\3\3\f\f\3\2\62;\3\2\63\63\3\2\64\64\3"+
		"\2\62\67\5\2\13\f\17\17\"\"\4\2--//\4\2C\\c|\u00a9\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\3/\3\2\2\2\5\63"+
		"\3\2\2\2\7=\3\2\2\2\t?\3\2\2\2\13K\3\2\2\2\rY\3\2\2\2\17a\3\2\2\2\21f"+
		"\3\2\2\2\23o\3\2\2\2\25q\3\2\2\2\27v\3\2\2\2\31x\3\2\2\2\33\u0084\3\2"+
		"\2\2\35\u0092\3\2\2\2\37\u0094\3\2\2\2!\u0097\3\2\2\2#\u009b\3\2\2\2%"+
		"\u00a2\3\2\2\2\'\60\7\62\2\2(,\t\2\2\2)+\5\37\20\2*)\3\2\2\2+.\3\2\2\2"+
		",*\3\2\2\2,-\3\2\2\2-\60\3\2\2\2.,\3\2\2\2/\'\3\2\2\2/(\3\2\2\2\60\4\3"+
		"\2\2\2\61\64\5%\23\2\62\64\7a\2\2\63\61\3\2\2\2\63\62\3\2\2\2\648\3\2"+
		"\2\2\65\67\5\27\f\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29\6"+
		"\3\2\2\2:8\3\2\2\2;>\5\33\16\2<>\5\35\17\2=;\3\2\2\2=<\3\2\2\2>\b\3\2"+
		"\2\2?C\7%\2\2@B\13\2\2\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DG\3\2"+
		"\2\2EC\3\2\2\2FH\t\3\2\2GF\3\2\2\2HI\3\2\2\2IJ\b\5\2\2J\n\3\2\2\2KL\7"+
		"$\2\2LM\7$\2\2MN\7$\2\2NR\3\2\2\2OQ\13\2\2\2PO\3\2\2\2QT\3\2\2\2RP\3\2"+
		"\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7$\2\2VW\7$\2\2WX\7$\2\2X\f\3\2\2"+
		"\2Y]\7)\2\2Z^\5%\23\2[^\5\17\b\2\\^\5\25\13\2]Z\3\2\2\2][\3\2\2\2]\\\3"+
		"\2\2\2^_\3\2\2\2_`\7)\2\2`\16\3\2\2\2ad\7^\2\2be\5\21\t\2ce\5\23\n\2d"+
		"b\3\2\2\2dc\3\2\2\2e\20\3\2\2\2fg\t\4\2\2gh\t\4\2\2h\22\3\2\2\2ij\t\5"+
		"\2\2jk\t\4\2\2kp\t\4\2\2lm\t\6\2\2mn\t\7\2\2np\t\7\2\2oi\3\2\2\2ol\3\2"+
		"\2\2p\24\3\2\2\2qr\4\13\f\2r\26\3\2\2\2sw\5%\23\2tw\5\37\20\2uw\7a\2\2"+
		"vs\3\2\2\2vt\3\2\2\2vu\3\2\2\2w\30\3\2\2\2xy\t\b\2\2yz\3\2\2\2z{\b\r\2"+
		"\2{\32\3\2\2\2|}\5\3\2\2}~\7\60\2\2~\177\5\3\2\2\177\u0085\3\2\2\2\u0080"+
		"\u0081\5\3\2\2\u0081\u0082\7\60\2\2\u0082\u0083\5\3\2\2\u0083\u0085\3"+
		"\2\2\2\u0084|\3\2\2\2\u0084\u0080\3\2\2\2\u0085\34\3\2\2\2\u0086\u0087"+
		"\5\33\16\2\u0087\u0088\7G\2\2\u0088\u0089\t\t\2\2\u0089\u008a\5#\22\2"+
		"\u008a\u0093\3\2\2\2\u008b\u008e\5!\21\2\u008c\u008e\5\33\16\2\u008d\u008b"+
		"\3\2\2\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\7g\2\2\u0090"+
		"\u0091\5#\22\2\u0091\u0093\3\2\2\2\u0092\u0086\3\2\2\2\u0092\u008d\3\2"+
		"\2\2\u0093\36\3\2\2\2\u0094\u0095\t\4\2\2\u0095 \3\2\2\2\u0096\u0098\t"+
		"\4\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\"\3\2\2\2\u009b\u009f\t\2\2\2\u009c\u009e\t\4\2\2"+
		"\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0$\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\t\n\2\2\u00a3"+
		"&\3\2\2\2\24\2,/\638=CGR]dov\u0084\u008d\u0092\u0099\u009f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}