// Generated from Xana.g4 by ANTLR 4.9.3

package es.uniovi.dlp.parser;

import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.definitions.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;
import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.Program;

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
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		BASURA=39, INT_CONSTANT=40, ID=41, REAL_CONSTANT=42, ONELINE_COMMENT=43, 
		LINES_COMMENT=44, CHAR_CONSTANT=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "BASURA", "INT_CONSTANT", 
			"ID", "REAL_CONSTANT", "ONELINE_COMMENT", "LINES_COMMENT", "CHAR_CONSTANT", 
			"ASCI", "ASCI_1", "ASCI_2", "CHAR_ESPECIAL", "ID_BODY", "DIGIT_POS", 
			"REAL_CONSTANT_DECIMAL", "REAL_CONSTANT_EXP", "DIGIT", "DIGITS", "EXPOS", 
			"LETTER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'('", "')'", "'::'", "'do'", "'end'", "'void'", "'main'", 
			"','", "'['", "']'", "'.'", "'as'", "'!'", "'-'", "'<'", "'>'", "'<='", 
			"'>='", "'!='", "'=='", "'&&'", "'||'", "'+'", "'/'", "'*'", "'%'", "'puts'", 
			"'in'", "'='", "'if'", "'else'", "'while'", "'return'", "'int'", "'double'", 
			"'char'", "'defstruct'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "BASURA", "INT_CONSTANT", "ID", "REAL_CONSTANT", "ONELINE_COMMENT", 
			"LINES_COMMENT", "CHAR_CONSTANT"
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


	public XanaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Xana.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u0183\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3"+
		"#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\6(\u00f9\n(\r(\16(\u00fa\3(\3(\3)"+
		"\3)\3)\7)\u0102\n)\f)\16)\u0105\13)\5)\u0107\n)\3*\3*\5*\u010b\n*\3*\7"+
		"*\u010e\n*\f*\16*\u0111\13*\3+\3+\5+\u0115\n+\3,\3,\7,\u0119\n,\f,\16"+
		",\u011c\13,\3,\5,\u011f\n,\3,\3,\3-\3-\3-\3-\3-\7-\u0128\n-\f-\16-\u012b"+
		"\13-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\5.\u0137\n.\3.\3.\3/\3/\3/\5/\u013e"+
		"\n/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0149\n\61\3\62"+
		"\3\62\3\62\3\62\5\62\u014f\n\62\3\63\3\63\3\63\5\63\u0154\n\63\3\64\6"+
		"\64\u0157\n\64\r\64\16\64\u0158\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\5\65\u0164\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u016d\n"+
		"\66\3\66\3\66\3\66\5\66\u0172\n\66\3\67\3\67\38\68\u0177\n8\r8\168\u0178"+
		"\39\39\79\u017d\n9\f9\169\u0180\139\3:\3:\4\u011a\u0129\2;\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2\3\2\13\5\2"+
		"\13\f\17\17\"\"\3\2\63;\3\3\f\f\3\2\62;\3\2\63\63\3\2\64\64\3\2\62\67"+
		"\4\2--//\4\2C\\c|\2\u018c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3u"+
		"\3\2\2\2\5y\3\2\2\2\7{\3\2\2\2\t}\3\2\2\2\13\u0080\3\2\2\2\r\u0083\3\2"+
		"\2\2\17\u0087\3\2\2\2\21\u008c\3\2\2\2\23\u0091\3\2\2\2\25\u0093\3\2\2"+
		"\2\27\u0095\3\2\2\2\31\u0097\3\2\2\2\33\u0099\3\2\2\2\35\u009c\3\2\2\2"+
		"\37\u009e\3\2\2\2!\u00a0\3\2\2\2#\u00a2\3\2\2\2%\u00a4\3\2\2\2\'\u00a7"+
		"\3\2\2\2)\u00aa\3\2\2\2+\u00ad\3\2\2\2-\u00b0\3\2\2\2/\u00b3\3\2\2\2\61"+
		"\u00b6\3\2\2\2\63\u00b8\3\2\2\2\65\u00ba\3\2\2\2\67\u00bc\3\2\2\29\u00be"+
		"\3\2\2\2;\u00c3\3\2\2\2=\u00c6\3\2\2\2?\u00c8\3\2\2\2A\u00cb\3\2\2\2C"+
		"\u00d0\3\2\2\2E\u00d6\3\2\2\2G\u00dd\3\2\2\2I\u00e1\3\2\2\2K\u00e8\3\2"+
		"\2\2M\u00ed\3\2\2\2O\u00f8\3\2\2\2Q\u0106\3\2\2\2S\u010a\3\2\2\2U\u0114"+
		"\3\2\2\2W\u0116\3\2\2\2Y\u0122\3\2\2\2[\u0132\3\2\2\2]\u013a\3\2\2\2_"+
		"\u013f\3\2\2\2a\u0148\3\2\2\2c\u014e\3\2\2\2e\u0153\3\2\2\2g\u0156\3\2"+
		"\2\2i\u0163\3\2\2\2k\u0171\3\2\2\2m\u0173\3\2\2\2o\u0176\3\2\2\2q\u017a"+
		"\3\2\2\2s\u0181\3\2\2\2uv\7f\2\2vw\7g\2\2wx\7h\2\2x\4\3\2\2\2yz\7*\2\2"+
		"z\6\3\2\2\2{|\7+\2\2|\b\3\2\2\2}~\7<\2\2~\177\7<\2\2\177\n\3\2\2\2\u0080"+
		"\u0081\7f\2\2\u0081\u0082\7q\2\2\u0082\f\3\2\2\2\u0083\u0084\7g\2\2\u0084"+
		"\u0085\7p\2\2\u0085\u0086\7f\2\2\u0086\16\3\2\2\2\u0087\u0088\7x\2\2\u0088"+
		"\u0089\7q\2\2\u0089\u008a\7k\2\2\u008a\u008b\7f\2\2\u008b\20\3\2\2\2\u008c"+
		"\u008d\7o\2\2\u008d\u008e\7c\2\2\u008e\u008f\7k\2\2\u008f\u0090\7p\2\2"+
		"\u0090\22\3\2\2\2\u0091\u0092\7.\2\2\u0092\24\3\2\2\2\u0093\u0094\7]\2"+
		"\2\u0094\26\3\2\2\2\u0095\u0096\7_\2\2\u0096\30\3\2\2\2\u0097\u0098\7"+
		"\60\2\2\u0098\32\3\2\2\2\u0099\u009a\7c\2\2\u009a\u009b\7u\2\2\u009b\34"+
		"\3\2\2\2\u009c\u009d\7#\2\2\u009d\36\3\2\2\2\u009e\u009f\7/\2\2\u009f"+
		" \3\2\2\2\u00a0\u00a1\7>\2\2\u00a1\"\3\2\2\2\u00a2\u00a3\7@\2\2\u00a3"+
		"$\3\2\2\2\u00a4\u00a5\7>\2\2\u00a5\u00a6\7?\2\2\u00a6&\3\2\2\2\u00a7\u00a8"+
		"\7@\2\2\u00a8\u00a9\7?\2\2\u00a9(\3\2\2\2\u00aa\u00ab\7#\2\2\u00ab\u00ac"+
		"\7?\2\2\u00ac*\3\2\2\2\u00ad\u00ae\7?\2\2\u00ae\u00af\7?\2\2\u00af,\3"+
		"\2\2\2\u00b0\u00b1\7(\2\2\u00b1\u00b2\7(\2\2\u00b2.\3\2\2\2\u00b3\u00b4"+
		"\7~\2\2\u00b4\u00b5\7~\2\2\u00b5\60\3\2\2\2\u00b6\u00b7\7-\2\2\u00b7\62"+
		"\3\2\2\2\u00b8\u00b9\7\61\2\2\u00b9\64\3\2\2\2\u00ba\u00bb\7,\2\2\u00bb"+
		"\66\3\2\2\2\u00bc\u00bd\7\'\2\2\u00bd8\3\2\2\2\u00be\u00bf\7r\2\2\u00bf"+
		"\u00c0\7w\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7u\2\2\u00c2:\3\2\2\2\u00c3"+
		"\u00c4\7k\2\2\u00c4\u00c5\7p\2\2\u00c5<\3\2\2\2\u00c6\u00c7\7?\2\2\u00c7"+
		">\3\2\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7h\2\2\u00ca@\3\2\2\2\u00cb\u00cc"+
		"\7g\2\2\u00cc\u00cd\7n\2\2\u00cd\u00ce\7u\2\2\u00ce\u00cf\7g\2\2\u00cf"+
		"B\3\2\2\2\u00d0\u00d1\7y\2\2\u00d1\u00d2\7j\2\2\u00d2\u00d3\7k\2\2\u00d3"+
		"\u00d4\7n\2\2\u00d4\u00d5\7g\2\2\u00d5D\3\2\2\2\u00d6\u00d7\7t\2\2\u00d7"+
		"\u00d8\7g\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da\7w\2\2\u00da\u00db\7t\2\2"+
		"\u00db\u00dc\7p\2\2\u00dcF\3\2\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7p\2"+
		"\2\u00df\u00e0\7v\2\2\u00e0H\3\2\2\2\u00e1\u00e2\7f\2\2\u00e2\u00e3\7"+
		"q\2\2\u00e3\u00e4\7w\2\2\u00e4\u00e5\7d\2\2\u00e5\u00e6\7n\2\2\u00e6\u00e7"+
		"\7g\2\2\u00e7J\3\2\2\2\u00e8\u00e9\7e\2\2\u00e9\u00ea\7j\2\2\u00ea\u00eb"+
		"\7c\2\2\u00eb\u00ec\7t\2\2\u00ecL\3\2\2\2\u00ed\u00ee\7f\2\2\u00ee\u00ef"+
		"\7g\2\2\u00ef\u00f0\7h\2\2\u00f0\u00f1\7u\2\2\u00f1\u00f2\7v\2\2\u00f2"+
		"\u00f3\7t\2\2\u00f3\u00f4\7w\2\2\u00f4\u00f5\7e\2\2\u00f5\u00f6\7v\2\2"+
		"\u00f6N\3\2\2\2\u00f7\u00f9\t\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3"+
		"\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u00fd\b(\2\2\u00fdP\3\2\2\2\u00fe\u0107\7\62\2\2\u00ff\u0103\t\3\2\2"+
		"\u0100\u0102\5m\67\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101"+
		"\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0106"+
		"\u00fe\3\2\2\2\u0106\u00ff\3\2\2\2\u0107R\3\2\2\2\u0108\u010b\5s:\2\u0109"+
		"\u010b\7a\2\2\u010a\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b\u010f\3\2"+
		"\2\2\u010c\u010e\5e\63\2\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110T\3\2\2\2\u0111\u010f\3\2\2\2"+
		"\u0112\u0115\5i\65\2\u0113\u0115\5k\66\2\u0114\u0112\3\2\2\2\u0114\u0113"+
		"\3\2\2\2\u0115V\3\2\2\2\u0116\u011a\7%\2\2\u0117\u0119\13\2\2\2\u0118"+
		"\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u011b\3\2\2\2\u011a\u0118\3\2"+
		"\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011f\t\4\2\2\u011e"+
		"\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\b,\2\2\u0121X\3\2\2\2\u0122"+
		"\u0123\7$\2\2\u0123\u0124\7$\2\2\u0124\u0125\7$\2\2\u0125\u0129\3\2\2"+
		"\2\u0126\u0128\13\2\2\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0129\3\2"+
		"\2\2\u012c\u012d\7$\2\2\u012d\u012e\7$\2\2\u012e\u012f\7$\2\2\u012f\u0130"+
		"\3\2\2\2\u0130\u0131\b-\2\2\u0131Z\3\2\2\2\u0132\u0136\7)\2\2\u0133\u0137"+
		"\13\2\2\2\u0134\u0137\5]/\2\u0135\u0137\5c\62\2\u0136\u0133\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\7)"+
		"\2\2\u0139\\\3\2\2\2\u013a\u013d\7^\2\2\u013b\u013e\5_\60\2\u013c\u013e"+
		"\5a\61\2\u013d\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013e^\3\2\2\2\u013f"+
		"\u0140\t\5\2\2\u0140\u0141\t\5\2\2\u0141`\3\2\2\2\u0142\u0143\t\6\2\2"+
		"\u0143\u0144\t\5\2\2\u0144\u0149\t\5\2\2\u0145\u0146\t\7\2\2\u0146\u0147"+
		"\t\b\2\2\u0147\u0149\t\b\2\2\u0148\u0142\3\2\2\2\u0148\u0145\3\2\2\2\u0149"+
		"b\3\2\2\2\u014a\u014b\7^\2\2\u014b\u014f\7v\2\2\u014c\u014d\7^\2\2\u014d"+
		"\u014f\7p\2\2\u014e\u014a\3\2\2\2\u014e\u014c\3\2\2\2\u014fd\3\2\2\2\u0150"+
		"\u0154\5s:\2\u0151\u0154\5m\67\2\u0152\u0154\7a\2\2\u0153\u0150\3\2\2"+
		"\2\u0153\u0151\3\2\2\2\u0153\u0152\3\2\2\2\u0154f\3\2\2\2\u0155\u0157"+
		"\t\3\2\2\u0156\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0156\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159h\3\2\2\2\u015a\u015b\5Q)\2\u015b\u015c\7\60\2\2\u015c"+
		"\u015d\5Q)\2\u015d\u0164\3\2\2\2\u015e\u015f\7\60\2\2\u015f\u0164\5Q)"+
		"\2\u0160\u0161\5Q)\2\u0161\u0162\7\60\2\2\u0162\u0164\3\2\2\2\u0163\u015a"+
		"\3\2\2\2\u0163\u015e\3\2\2\2\u0163\u0160\3\2\2\2\u0164j\3\2\2\2\u0165"+
		"\u0166\5i\65\2\u0166\u0167\7G\2\2\u0167\u0168\t\t\2\2\u0168\u0169\5q9"+
		"\2\u0169\u0172\3\2\2\2\u016a\u016d\5o8\2\u016b\u016d\5i\65\2\u016c\u016a"+
		"\3\2\2\2\u016c\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\7g\2\2\u016f"+
		"\u0170\5q9\2\u0170\u0172\3\2\2\2\u0171\u0165\3\2\2\2\u0171\u016c\3\2\2"+
		"\2\u0172l\3\2\2\2\u0173\u0174\t\5\2\2\u0174n\3\2\2\2\u0175\u0177\t\5\2"+
		"\2\u0176\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179"+
		"\3\2\2\2\u0179p\3\2\2\2\u017a\u017e\t\3\2\2\u017b\u017d\t\5\2\2\u017c"+
		"\u017b\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2"+
		"\2\2\u017fr\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0182\t\n\2\2\u0182t\3\2"+
		"\2\2\27\2\u00fa\u0103\u0106\u010a\u010f\u0114\u011a\u011e\u0129\u0136"+
		"\u013d\u0148\u014e\u0153\u0158\u0163\u016c\u0171\u0178\u017e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}