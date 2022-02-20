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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\b\u00ac\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\6\2(\n\2\r\2\16\2)\3\2\7\2-\n\2\f\2\16\2\60\13\2\5\2\62\n\2\3"+
		"\3\3\3\5\3\66\n\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\4\3\4\5\4@\n\4\3\5\3\5"+
		"\7\5D\n\5\f\5\16\5G\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6P\n\6\f\6\16\6"+
		"S\13\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7]\n\7\3\7\3\7\3\b\3\b\3\b\5"+
		"\bd\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\no\n\n\3\13\3\13\3\f\3\f"+
		"\3\f\5\fv\n\f\3\r\3\r\3\r\3\r\3\16\6\16}\n\16\r\16\16\16~\3\16\3\16\7"+
		"\16\u0083\n\16\f\16\16\16\u0086\13\16\3\16\7\16\u0089\n\16\f\16\16\16"+
		"\u008c\13\16\3\16\3\16\6\16\u0090\n\16\r\16\16\16\u0091\5\16\u0094\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u009d\n\17\3\17\3\17\3\17\5\17"+
		"\u00a2\n\17\3\20\3\20\3\21\6\21\u00a7\n\21\r\21\16\21\u00a8\3\22\3\22"+
		"\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35"+
		"\2\37\2!\2#\2\3\2\n\3\2\63;\3\2\62;\3\2\63\63\3\2\64\64\3\2\62\67\5\2"+
		"\13\f\17\17\"\"\4\2--//\4\2C\\c|\u00b6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\3\61\3\2\2\2\5\65\3\2\2\2\7"+
		"?\3\2\2\2\tA\3\2\2\2\13J\3\2\2\2\rX\3\2\2\2\17`\3\2\2\2\21e\3\2\2\2\23"+
		"n\3\2\2\2\25p\3\2\2\2\27u\3\2\2\2\31w\3\2\2\2\33\u0093\3\2\2\2\35\u00a1"+
		"\3\2\2\2\37\u00a3\3\2\2\2!\u00a6\3\2\2\2#\u00aa\3\2\2\2%\62\7\62\2\2&"+
		"(\t\2\2\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*.\3\2\2\2+-\5\37\20"+
		"\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\61"+
		"%\3\2\2\2\61\'\3\2\2\2\62\4\3\2\2\2\63\66\5#\22\2\64\66\7a\2\2\65\63\3"+
		"\2\2\2\65\64\3\2\2\2\66:\3\2\2\2\679\5\27\f\28\67\3\2\2\29<\3\2\2\2:8"+
		"\3\2\2\2:;\3\2\2\2;\6\3\2\2\2<:\3\2\2\2=@\5\33\16\2>@\5\35\17\2?=\3\2"+
		"\2\2?>\3\2\2\2@\b\3\2\2\2AE\7%\2\2BD\13\2\2\2CB\3\2\2\2DG\3\2\2\2EC\3"+
		"\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\b\5\2\2I\n\3\2\2\2JK\7$\2\2KL\7"+
		"$\2\2LM\7$\2\2MQ\3\2\2\2NP\13\2\2\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3"+
		"\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\7$\2\2UV\7$\2\2VW\7$\2\2W\f\3\2\2\2X\\\7"+
		")\2\2Y]\5#\22\2Z]\5\17\b\2[]\5\25\13\2\\Y\3\2\2\2\\Z\3\2\2\2\\[\3\2\2"+
		"\2]^\3\2\2\2^_\7)\2\2_\16\3\2\2\2`c\7^\2\2ad\5\21\t\2bd\5\23\n\2ca\3\2"+
		"\2\2cb\3\2\2\2d\20\3\2\2\2ef\t\3\2\2fg\t\3\2\2g\22\3\2\2\2hi\t\4\2\2i"+
		"j\t\3\2\2jo\t\3\2\2kl\t\5\2\2lm\t\6\2\2mo\t\6\2\2nh\3\2\2\2nk\3\2\2\2"+
		"o\24\3\2\2\2pq\4\13\f\2q\26\3\2\2\2rv\5#\22\2sv\5\37\20\2tv\7a\2\2ur\3"+
		"\2\2\2us\3\2\2\2ut\3\2\2\2v\30\3\2\2\2wx\t\7\2\2xy\3\2\2\2yz\b\r\2\2z"+
		"\32\3\2\2\2{}\5!\21\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u0084\7\60\2\2\u0081\u0083\5!\21\2\u0082\u0081\3\2\2\2"+
		"\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0094"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0089\5!\21\2\u0088\u0087\3\2\2\2\u0089"+
		"\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2"+
		"\2\2\u008c\u008a\3\2\2\2\u008d\u008f\7\60\2\2\u008e\u0090\5!\21\2\u008f"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\u0094\3\2\2\2\u0093|\3\2\2\2\u0093\u008a\3\2\2\2\u0094\34\3"+
		"\2\2\2\u0095\u0096\5\33\16\2\u0096\u0097\7G\2\2\u0097\u0098\t\b\2\2\u0098"+
		"\u0099\5!\21\2\u0099\u00a2\3\2\2\2\u009a\u009d\5!\21\2\u009b\u009d\5\33"+
		"\16\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\7g\2\2\u009f\u00a0\5!\21\2\u00a0\u00a2\3\2\2\2\u00a1\u0095\3\2"+
		"\2\2\u00a1\u009c\3\2\2\2\u00a2\36\3\2\2\2\u00a3\u00a4\t\3\2\2\u00a4 \3"+
		"\2\2\2\u00a5\u00a7\t\3\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\"\3\2\2\2\u00aa\u00ab\t\t\2\2"+
		"\u00ab$\3\2\2\2\27\2).\61\65:?EQ\\cnu~\u0084\u008a\u0091\u0093\u009c\u00a1"+
		"\u00a8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}