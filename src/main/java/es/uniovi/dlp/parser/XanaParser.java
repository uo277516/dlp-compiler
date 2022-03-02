// Generated from Xana.g4 by ANTLR 4.9.3

package es.uniovi.dlp.parser;

import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.definitions.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;
import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.Program;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XanaParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_funDef = 1, RULE_returnType = 2, RULE_funMain = 3, 
		RULE_parameterList = 4, RULE_param = 5, RULE_expression = 6, RULE_operatorLogical = 7, 
		RULE_operatorArithmetic = 8, RULE_operatorMultiply = 9, RULE_listExpressions = 10, 
		RULE_statement = 11, RULE_varDef = 12, RULE_type = 13, RULE_complex_type = 14, 
		RULE_simple_type = 15, RULE_array = 16, RULE_struct = 17, RULE_recordFields = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "funDef", "returnType", "funMain", "parameterList", "param", 
			"expression", "operatorLogical", "operatorArithmetic", "operatorMultiply", 
			"listExpressions", "statement", "varDef", "type", "complex_type", "simple_type", 
			"array", "struct", "recordFields"
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

	@Override
	public String getGrammarFileName() { return "Xana.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XanaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public VarDefContext varDef;
		public List<VarDefContext> v = new ArrayList<VarDefContext>();
		public FunDefContext funDef;
		public List<FunDefContext> funDefs = new ArrayList<FunDefContext>();
		public FunMainContext funMain;
		public FunMainContext funMain() {
			return getRuleContext(FunMainContext.class,0);
		}
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public List<FunDefContext> funDef() {
			return getRuleContexts(FunDefContext.class);
		}
		public FunDefContext funDef(int i) {
			return getRuleContext(FunDefContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(40);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(38);
						((ProgramContext)_localctx).varDef = varDef();
						((ProgramContext)_localctx).v.add(((ProgramContext)_localctx).varDef);
						}
						break;
					case T__0:
						{
						setState(39);
						((ProgramContext)_localctx).funDef = funDef();
						((ProgramContext)_localctx).funDefs.add(((ProgramContext)_localctx).funDef);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(45);
			((ProgramContext)_localctx).funMain = funMain();

			        List<FunDef> funDefs = new ArrayList<>();
			        List<VarDef> varDefs = new ArrayList<>();

			        for (var varDef1: ((ProgramContext)_localctx).v) {
			            for (var varDef2: varDef1.ast) {
			                varDefs.add(varDef2);
			            }
			        }
			        if (((ProgramContext)_localctx).funMain.ast!=null)
			            funDefs.add(((ProgramContext)_localctx).funMain.ast);

			        ((ProgramContext)_localctx).ast =  new Program(varDefs, funDefs, _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
			      
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

	public static class FunDefContext extends ParserRuleContext {
		public FunDef ast;
		public Token id;
		public ReturnTypeContext returnType;
		public VarDefContext varDef;
		public List<VarDefContext> v = new ArrayList<VarDefContext>();
		public StatementContext statement;
		public List<StatementContext> statements = new ArrayList<StatementContext>();
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(XanaParser.ID, 0); }
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDef; }
	}

	public final FunDefContext funDef() throws RecognitionException {
		FunDefContext _localctx = new FunDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__0);
			setState(49);
			((FunDefContext)_localctx).id = match(ID);
			setState(50);
			match(T__1);
			setState(51);
			parameterList();
			setState(52);
			match(T__2);
			setState(53);
			match(T__3);
			setState(54);
			((FunDefContext)_localctx).returnType = returnType();
			setState(55);
			match(T__4);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__13) | (1L << T__14) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				setState(58);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(56);
					((FunDefContext)_localctx).varDef = varDef();
					((FunDefContext)_localctx).v.add(((FunDefContext)_localctx).varDef);
					}
					break;
				case 2:
					{
					setState(57);
					((FunDefContext)_localctx).statement = statement();
					((FunDefContext)_localctx).statements.add(((FunDefContext)_localctx).statement);
					}
					break;
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			match(T__5);

			            List<Statemment> sts = new ArrayList<>();
			            List<VarDef> varDefs = new ArrayList<>();

			            for (var varDef1: ((FunDefContext)_localctx).v) {
			                 for (var varDef2: varDef1.ast) {
			                      varDefs.add(varDef2);
			                 }
			            }

			            for (var s: ((FunDefContext)_localctx).statements) {
			                sts.add(s.ast);
			            }
			            ((FunDefContext)_localctx).ast =  new FunDef(varDefs, sts, (((FunDefContext)_localctx).id!=null?((FunDefContext)_localctx).id.getText():null), ((FunDefContext)_localctx).returnType.ast,
			                       _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);

			          
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

	public static class ReturnTypeContext extends ParserRuleContext {
		public Type ast;
		public Simple_typeContext simple_type;
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_returnType);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				((ReturnTypeContext)_localctx).simple_type = simple_type();
				((ReturnTypeContext)_localctx).ast =  ((ReturnTypeContext)_localctx).simple_type.ast; 
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(T__6);
				((ReturnTypeContext)_localctx).ast =  new VoidType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1); 
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

	public static class FunMainContext extends ParserRuleContext {
		public FunMain ast;
		public VarDefContext varDef;
		public List<VarDefContext> v = new ArrayList<VarDefContext>();
		public StatementContext statement;
		public List<StatementContext> sts = new ArrayList<StatementContext>();
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunMainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funMain; }
	}

	public final FunMainContext funMain() throws RecognitionException {
		FunMainContext _localctx = new FunMainContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funMain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__0);
			setState(74);
			match(T__7);
			setState(75);
			match(T__1);
			setState(76);
			match(T__2);
			setState(77);
			match(T__4);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__13) | (1L << T__14) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				setState(80);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(78);
					((FunMainContext)_localctx).varDef = varDef();
					((FunMainContext)_localctx).v.add(((FunMainContext)_localctx).varDef);
					}
					break;
				case 2:
					{
					setState(79);
					((FunMainContext)_localctx).statement = statement();
					((FunMainContext)_localctx).sts.add(((FunMainContext)_localctx).statement);
					}
					break;
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			match(T__5);

			                List<Statemment> sts = new ArrayList<>();
			                List<VarDef> varDefs = new ArrayList<>();
			                for (var s: ((FunMainContext)_localctx).sts) {
			                    sts.add(s.ast);
			                }
			                for (var varDef1: ((FunMainContext)_localctx).v) {
			                     for (var varDef2: varDef1.ast) {
			                        varDefs.add(varDef2);
			                     }
			                }
			                ((FunMainContext)_localctx).ast =  new FunMain(varDefs, sts, null, null,
			                       _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);


			              
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(88);
				param();
				}
			}

			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(91);
				match(T__8);
				setState(92);
				param();
				}
				}
				setState(97);
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XanaParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(ID);
			setState(99);
			match(T__3);
			setState(100);
			type();
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public TerminalNode INT_CONSTANT() { return getToken(XanaParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(XanaParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(XanaParser.CHAR_CONSTANT, 0); }
		public TerminalNode ID() { return getToken(XanaParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OperatorMultiplyContext operatorMultiply() {
			return getRuleContext(OperatorMultiplyContext.class,0);
		}
		public OperatorArithmeticContext operatorArithmetic() {
			return getRuleContext(OperatorArithmeticContext.class,0);
		}
		public OperatorLogicalContext operatorLogical() {
			return getRuleContext(OperatorLogicalContext.class,0);
		}
		public ListExpressionsContext listExpressions() {
			return getRuleContext(ListExpressionsContext.class,0);
		}
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_CONSTANT:
				{
				setState(103);
				match(INT_CONSTANT);
				}
				break;
			case REAL_CONSTANT:
				{
				setState(104);
				match(REAL_CONSTANT);
				}
				break;
			case CHAR_CONSTANT:
				{
				setState(105);
				match(CHAR_CONSTANT);
				}
				break;
			case ID:
				{
				setState(106);
				match(ID);
				}
				break;
			case T__13:
				{
				setState(107);
				match(T__13);
				setState(108);
				expression(7);
				}
				break;
			case T__14:
				{
				setState(109);
				match(T__14);
				setState(110);
				expression(6);
				}
				break;
			case T__1:
				{
				setState(111);
				match(T__1);
				setState(112);
				expression(0);
				setState(113);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(148);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(117);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(118);
						match(T__11);
						setState(119);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(120);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(121);
						operatorMultiply();
						setState(122);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(124);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(125);
						operatorArithmetic();
						setState(126);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(128);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(129);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(130);
						expression(4);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(131);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(132);
						operatorLogical();
						setState(133);
						expression(3);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(135);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(136);
						match(T__1);
						setState(137);
						listExpressions();
						setState(138);
						match(T__2);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(140);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(141);
						match(T__9);
						setState(142);
						expression(0);
						setState(143);
						match(T__10);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(145);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(146);
						match(T__12);
						setState(147);
						simple_type();
						}
						break;
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class OperatorLogicalContext extends ParserRuleContext {
		public OperatorLogicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorLogical; }
	}

	public final OperatorLogicalContext operatorLogical() throws RecognitionException {
		OperatorLogicalContext _localctx = new OperatorLogicalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_operatorLogical);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_la = _input.LA(1);
			if ( !(_la==T__21 || _la==T__22) ) {
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

	public static class OperatorArithmeticContext extends ParserRuleContext {
		public OperatorArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorArithmetic; }
	}

	public final OperatorArithmeticContext operatorArithmetic() throws RecognitionException {
		OperatorArithmeticContext _localctx = new OperatorArithmeticContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operatorArithmetic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__23) ) {
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

	public static class OperatorMultiplyContext extends ParserRuleContext {
		public OperatorMultiplyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorMultiply; }
	}

	public final OperatorMultiplyContext operatorMultiply() throws RecognitionException {
		OperatorMultiplyContext _localctx = new OperatorMultiplyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operatorMultiply);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__13:
			case T__14:
			case INT_CONSTANT:
			case ID:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(T__24);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				match(T__25);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				match(T__26);
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

	public static class ListExpressionsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ListExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listExpressions; }
	}

	public final ListExpressionsContext listExpressions() throws RecognitionException {
		ListExpressionsContext _localctx = new ListExpressionsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_listExpressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__13) | (1L << T__14) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				setState(163);
				expression(0);
				}
			}

			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(166);
				match(T__8);
				setState(167);
				expression(0);
				}
				}
				setState(172);
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

	public static class StatementContext extends ParserRuleContext {
		public Statemment ast;
		public ExpressionContext expression;
		public List<ExpressionContext> exps = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ListExpressionsContext listExpressions() {
			return getRuleContext(ListExpressionsContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		int _la;
		try {
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(T__27);
				setState(174);
				((StatementContext)_localctx).expression = expression(0);
				((StatementContext)_localctx).exps.add(((StatementContext)_localctx).expression);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(175);
					match(T__8);
					setState(176);
					((StatementContext)_localctx).expression = expression(0);
					((StatementContext)_localctx).exps.add(((StatementContext)_localctx).expression);
					}
					}
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

				                List<Expression> expressions = new ArrayList<>();
				                for (var e: ((StatementContext)_localctx).exps) {
				                    expressions.add(e.ast);
				                }
				                ((StatementContext)_localctx).ast =  new Write(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, expressions);
				            
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(T__28);
				setState(185);
				expression(0);
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(186);
					match(T__8);
					setState(187);
					expression(0);
					}
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				expression(0);
				setState(194);
				match(T__29);
				setState(195);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(197);
				match(T__30);
				setState(199); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(198);
					expression(0);
					}
					}
					setState(201); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__13) | (1L << T__14) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0) );
				setState(203);
				match(T__4);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__13) | (1L << T__14) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					setState(206);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(204);
						expression(0);
						}
						break;
					case 2:
						{
						setState(205);
						statement();
						}
						break;
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__31) {
					{
					setState(211);
					match(T__31);
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__13) | (1L << T__14) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
						{
						setState(214);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
						case 1:
							{
							setState(212);
							expression(0);
							}
							break;
						case 2:
							{
							setState(213);
							statement();
							}
							break;
						}
						}
						setState(218);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(221);
				match(T__5);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(223);
				match(T__32);
				setState(225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(224);
					expression(0);
					}
					}
					setState(227); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__13) | (1L << T__14) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0) );
				setState(229);
				match(T__4);
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__13) | (1L << T__14) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					setState(232);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						setState(230);
						expression(0);
						}
						break;
					case 2:
						{
						setState(231);
						statement();
						}
						break;
					}
					}
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(237);
				match(T__5);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(239);
				match(T__33);
				setState(240);
				expression(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(241);
				expression(0);
				setState(242);
				match(T__1);
				setState(243);
				listExpressions();
				setState(244);
				match(T__2);
				}
				break;
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

	public static class VarDefContext extends ParserRuleContext {
		public List<VarDef> ast = new ArrayList<>();
		public Token ID;
		public List<Token> ids = new ArrayList<Token>();
		public TypeContext type;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(XanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XanaParser.ID, i);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_varDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			((VarDefContext)_localctx).ID = match(ID);
			((VarDefContext)_localctx).ids.add(((VarDefContext)_localctx).ID);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(249);
				match(T__8);
				setState(250);
				((VarDefContext)_localctx).ID = match(ID);
				((VarDefContext)_localctx).ids.add(((VarDefContext)_localctx).ID);
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256);
			match(T__3);
			setState(257);
			((VarDefContext)_localctx).type = type();

			        for(var id : ((VarDefContext)_localctx).ids) {
			            _localctx.ast.add(new VarDef(id.getLine(), id.getCharPositionInLine() + 1, id.getText(), ((VarDefContext)_localctx).type.ast));
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

	public static class TypeContext extends ParserRuleContext {
		public Type ast;
		public Simple_typeContext simple_type;
		public Complex_typeContext complex_type;
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public Complex_typeContext complex_type() {
			return getRuleContext(Complex_typeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_type);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				((TypeContext)_localctx).simple_type = simple_type();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).simple_type.ast; 
				}
				break;
			case T__9:
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				((TypeContext)_localctx).complex_type = complex_type();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).complex_type.ast; 
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

	public static class Complex_typeContext extends ParserRuleContext {
		public Type ast;
		public ArrayContext array;
		public StructContext struct;
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public StructContext struct() {
			return getRuleContext(StructContext.class,0);
		}
		public Complex_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_type; }
	}

	public final Complex_typeContext complex_type() throws RecognitionException {
		Complex_typeContext _localctx = new Complex_typeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_complex_type);
		try {
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				((Complex_typeContext)_localctx).array = array();
				 ((Complex_typeContext)_localctx).ast =  ((Complex_typeContext)_localctx).array.ast; 
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				((Complex_typeContext)_localctx).struct = struct();
				 ((Complex_typeContext)_localctx).ast =  ((Complex_typeContext)_localctx).struct.ast; 
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

	public static class Simple_typeContext extends ParserRuleContext {
		public Type ast;
		public Simple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_type; }
	}

	public final Simple_typeContext simple_type() throws RecognitionException {
		Simple_typeContext _localctx = new Simple_typeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_simple_type);
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(T__34);
				 ((Simple_typeContext)_localctx).ast =  new IntType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1); 
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(T__35);
				 ((Simple_typeContext)_localctx).ast =  new RealType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1); 
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				match(T__36);
				 ((Simple_typeContext)_localctx).ast =  new CharType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1); 
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

	public static class ArrayContext extends ParserRuleContext {
		public Type ast;
		public TypeContext type;
		public TerminalNode INT_CONSTANT() { return getToken(XanaParser.INT_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(T__9);
			setState(285);
			match(INT_CONSTANT);
			setState(286);
			match(T__3);
			setState(287);
			((ArrayContext)_localctx).type = type();
			setState(288);
			match(T__10);

			        ((ArrayContext)_localctx).ast =  new ArrayType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((ArrayContext)_localctx).type.ast);
			        
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

	public static class StructContext extends ParserRuleContext {
		public Type ast;
		public RecordFieldsContext recordFields;
		public List<RecordFieldsContext> r = new ArrayList<RecordFieldsContext>();
		public List<RecordFieldsContext> recordFields() {
			return getRuleContexts(RecordFieldsContext.class);
		}
		public RecordFieldsContext recordFields(int i) {
			return getRuleContext(RecordFieldsContext.class,i);
		}
		public StructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct; }
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_struct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(T__37);
			setState(292);
			match(T__4);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(293);
				((StructContext)_localctx).recordFields = recordFields();
				((StructContext)_localctx).r.add(((StructContext)_localctx).recordFields);
				}
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(299);
			match(T__5);

			                    List<VarDef> varDefs = new ArrayList<>();

			                            for (var varDef1: ((StructContext)_localctx).r) {
			                                for (var varDef2: varDef1.ast) {
			                                    varDefs.add(varDef2);
			                                }
			                            }
			                    ((StructContext)_localctx).ast =  new StructType (_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, varDefs);
			                
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

	public static class RecordFieldsContext extends ParserRuleContext {
		public List<VarDef> ast = new ArrayList<>();
		public Token ID;
		public List<Token> ids = new ArrayList<Token>();
		public TypeContext type;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(XanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XanaParser.ID, i);
		}
		public RecordFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordFields; }
	}

	public final RecordFieldsContext recordFields() throws RecognitionException {
		RecordFieldsContext _localctx = new RecordFieldsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_recordFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			((RecordFieldsContext)_localctx).ID = match(ID);
			((RecordFieldsContext)_localctx).ids.add(((RecordFieldsContext)_localctx).ID);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(303);
				match(T__8);
				setState(304);
				((RecordFieldsContext)_localctx).ID = match(ID);
				((RecordFieldsContext)_localctx).ids.add(((RecordFieldsContext)_localctx).ID);
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(310);
			match(T__3);
			setState(311);
			((RecordFieldsContext)_localctx).type = type();

			        for(var id : ((RecordFieldsContext)_localctx).ids) {
			            _localctx.ast.add(new VarDef(id.getLine(), id.getCharPositionInLine() + 1, id.getText(), ((RecordFieldsContext)_localctx).type.ast));
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u013d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3=\n\3\f\3\16\3@\13\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\5\4J\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5S\n\5\f\5"+
		"\16\5V\13\5\3\5\3\5\3\5\3\6\5\6\\\n\6\3\6\3\6\7\6`\n\6\f\6\16\6c\13\6"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\bv\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0097"+
		"\n\b\f\b\16\b\u009a\13\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u00a4"+
		"\n\13\3\f\5\f\u00a7\n\f\3\f\3\f\7\f\u00ab\n\f\f\f\16\f\u00ae\13\f\3\r"+
		"\3\r\3\r\3\r\7\r\u00b4\n\r\f\r\16\r\u00b7\13\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\7\r\u00bf\n\r\f\r\16\r\u00c2\13\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u00ca\n"+
		"\r\r\r\16\r\u00cb\3\r\3\r\3\r\7\r\u00d1\n\r\f\r\16\r\u00d4\13\r\3\r\3"+
		"\r\3\r\7\r\u00d9\n\r\f\r\16\r\u00dc\13\r\5\r\u00de\n\r\3\r\3\r\3\r\3\r"+
		"\6\r\u00e4\n\r\r\r\16\r\u00e5\3\r\3\r\3\r\7\r\u00eb\n\r\f\r\16\r\u00ee"+
		"\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00f9\n\r\3\16\3\16\3\16"+
		"\7\16\u00fe\n\16\f\16\16\16\u0101\13\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u010d\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u0115\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u011d\n\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\7\23\u0129\n\23\f\23\16\23\u012c"+
		"\13\23\3\23\3\23\3\23\3\24\3\24\3\24\7\24\u0134\n\24\f\24\16\24\u0137"+
		"\13\24\3\24\3\24\3\24\3\24\3\24\2\3\16\25\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&\2\5\3\2\22\27\3\2\30\31\4\2\21\21\32\32\2\u015d\2,\3\2"+
		"\2\2\4\62\3\2\2\2\6I\3\2\2\2\bK\3\2\2\2\n[\3\2\2\2\fd\3\2\2\2\16u\3\2"+
		"\2\2\20\u009b\3\2\2\2\22\u009d\3\2\2\2\24\u00a3\3\2\2\2\26\u00a6\3\2\2"+
		"\2\30\u00f8\3\2\2\2\32\u00fa\3\2\2\2\34\u010c\3\2\2\2\36\u0114\3\2\2\2"+
		" \u011c\3\2\2\2\"\u011e\3\2\2\2$\u0125\3\2\2\2&\u0130\3\2\2\2(+\5\32\16"+
		"\2)+\5\4\3\2*(\3\2\2\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-/\3\2\2"+
		"\2.,\3\2\2\2/\60\5\b\5\2\60\61\b\2\1\2\61\3\3\2\2\2\62\63\7\3\2\2\63\64"+
		"\7+\2\2\64\65\7\4\2\2\65\66\5\n\6\2\66\67\7\5\2\2\678\7\6\2\289\5\6\4"+
		"\29>\7\7\2\2:=\5\32\16\2;=\5\30\r\2<:\3\2\2\2<;\3\2\2\2=@\3\2\2\2><\3"+
		"\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\7\b\2\2BC\b\3\1\2C\5\3\2\2\2DE"+
		"\5 \21\2EF\b\4\1\2FJ\3\2\2\2GH\7\t\2\2HJ\b\4\1\2ID\3\2\2\2IG\3\2\2\2J"+
		"\7\3\2\2\2KL\7\3\2\2LM\7\n\2\2MN\7\4\2\2NO\7\5\2\2OT\7\7\2\2PS\5\32\16"+
		"\2QS\5\30\r\2RP\3\2\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2"+
		"\2\2VT\3\2\2\2WX\7\b\2\2XY\b\5\1\2Y\t\3\2\2\2Z\\\5\f\7\2[Z\3\2\2\2[\\"+
		"\3\2\2\2\\a\3\2\2\2]^\7\13\2\2^`\5\f\7\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2"+
		"ab\3\2\2\2b\13\3\2\2\2ca\3\2\2\2de\7+\2\2ef\7\6\2\2fg\5\34\17\2g\r\3\2"+
		"\2\2hi\b\b\1\2iv\7*\2\2jv\7,\2\2kv\7/\2\2lv\7+\2\2mn\7\20\2\2nv\5\16\b"+
		"\top\7\21\2\2pv\5\16\b\bqr\7\4\2\2rs\5\16\b\2st\7\5\2\2tv\3\2\2\2uh\3"+
		"\2\2\2uj\3\2\2\2uk\3\2\2\2ul\3\2\2\2um\3\2\2\2uo\3\2\2\2uq\3\2\2\2v\u0098"+
		"\3\2\2\2wx\f\13\2\2xy\7\16\2\2y\u0097\5\16\b\fz{\f\7\2\2{|\5\24\13\2|"+
		"}\5\16\b\b}\u0097\3\2\2\2~\177\f\6\2\2\177\u0080\5\22\n\2\u0080\u0081"+
		"\5\16\b\7\u0081\u0097\3\2\2\2\u0082\u0083\f\5\2\2\u0083\u0084\t\2\2\2"+
		"\u0084\u0097\5\16\b\6\u0085\u0086\f\4\2\2\u0086\u0087\5\20\t\2\u0087\u0088"+
		"\5\16\b\5\u0088\u0097\3\2\2\2\u0089\u008a\f\r\2\2\u008a\u008b\7\4\2\2"+
		"\u008b\u008c\5\26\f\2\u008c\u008d\7\5\2\2\u008d\u0097\3\2\2\2\u008e\u008f"+
		"\f\f\2\2\u008f\u0090\7\f\2\2\u0090\u0091\5\16\b\2\u0091\u0092\7\r\2\2"+
		"\u0092\u0097\3\2\2\2\u0093\u0094\f\n\2\2\u0094\u0095\7\17\2\2\u0095\u0097"+
		"\5 \21\2\u0096w\3\2\2\2\u0096z\3\2\2\2\u0096~\3\2\2\2\u0096\u0082\3\2"+
		"\2\2\u0096\u0085\3\2\2\2\u0096\u0089\3\2\2\2\u0096\u008e\3\2\2\2\u0096"+
		"\u0093\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\17\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\t\3\2\2\u009c\21"+
		"\3\2\2\2\u009d\u009e\t\4\2\2\u009e\23\3\2\2\2\u009f\u00a4\3\2\2\2\u00a0"+
		"\u00a4\7\33\2\2\u00a1\u00a4\7\34\2\2\u00a2\u00a4\7\35\2\2\u00a3\u009f"+
		"\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4"+
		"\25\3\2\2\2\u00a5\u00a7\5\16\b\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2"+
		"\2\u00a7\u00ac\3\2\2\2\u00a8\u00a9\7\13\2\2\u00a9\u00ab\5\16\b\2\u00aa"+
		"\u00a8\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\27\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7\36\2\2\u00b0\u00b5"+
		"\5\16\b\2\u00b1\u00b2\7\13\2\2\u00b2\u00b4\5\16\b\2\u00b3\u00b1\3\2\2"+
		"\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8"+
		"\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\b\r\1\2\u00b9\u00f9\3\2\2\2\u00ba"+
		"\u00bb\7\37\2\2\u00bb\u00c0\5\16\b\2\u00bc\u00bd\7\13\2\2\u00bd\u00bf"+
		"\5\16\b\2\u00be\u00bc\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2"+
		"\u00c0\u00c1\3\2\2\2\u00c1\u00f9\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4"+
		"\5\16\b\2\u00c4\u00c5\7 \2\2\u00c5\u00c6\5\16\b\2\u00c6\u00f9\3\2\2\2"+
		"\u00c7\u00c9\7!\2\2\u00c8\u00ca\5\16\b\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00d2\7\7\2\2\u00ce\u00d1\5\16\b\2\u00cf\u00d1\5\30\r\2\u00d0\u00ce\3"+
		"\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00dd\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00da\7\""+
		"\2\2\u00d6\u00d9\5\16\b\2\u00d7\u00d9\5\30\r\2\u00d8\u00d6\3\2\2\2\u00d8"+
		"\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00d5\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\7\b\2\2\u00e0\u00f9\3\2"+
		"\2\2\u00e1\u00e3\7#\2\2\u00e2\u00e4\5\16\b\2\u00e3\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7\u00ec\7\7\2\2\u00e8\u00eb\5\16\b\2\u00e9\u00eb\5\30\r\2\u00ea"+
		"\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2"+
		"\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef"+
		"\u00f0\7\b\2\2\u00f0\u00f9\3\2\2\2\u00f1\u00f2\7$\2\2\u00f2\u00f9\5\16"+
		"\b\2\u00f3\u00f4\5\16\b\2\u00f4\u00f5\7\4\2\2\u00f5\u00f6\5\26\f\2\u00f6"+
		"\u00f7\7\5\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00af\3\2\2\2\u00f8\u00ba\3\2"+
		"\2\2\u00f8\u00c3\3\2\2\2\u00f8\u00c7\3\2\2\2\u00f8\u00e1\3\2\2\2\u00f8"+
		"\u00f1\3\2\2\2\u00f8\u00f3\3\2\2\2\u00f9\31\3\2\2\2\u00fa\u00ff\7+\2\2"+
		"\u00fb\u00fc\7\13\2\2\u00fc\u00fe\7+\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0101"+
		"\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0102\u0103\7\6\2\2\u0103\u0104\5\34\17\2\u0104\u0105\b"+
		"\16\1\2\u0105\33\3\2\2\2\u0106\u0107\5 \21\2\u0107\u0108\b\17\1\2\u0108"+
		"\u010d\3\2\2\2\u0109\u010a\5\36\20\2\u010a\u010b\b\17\1\2\u010b\u010d"+
		"\3\2\2\2\u010c\u0106\3\2\2\2\u010c\u0109\3\2\2\2\u010d\35\3\2\2\2\u010e"+
		"\u010f\5\"\22\2\u010f\u0110\b\20\1\2\u0110\u0115\3\2\2\2\u0111\u0112\5"+
		"$\23\2\u0112\u0113\b\20\1\2\u0113\u0115\3\2\2\2\u0114\u010e\3\2\2\2\u0114"+
		"\u0111\3\2\2\2\u0115\37\3\2\2\2\u0116\u0117\7%\2\2\u0117\u011d\b\21\1"+
		"\2\u0118\u0119\7&\2\2\u0119\u011d\b\21\1\2\u011a\u011b\7\'\2\2\u011b\u011d"+
		"\b\21\1\2\u011c\u0116\3\2\2\2\u011c\u0118\3\2\2\2\u011c\u011a\3\2\2\2"+
		"\u011d!\3\2\2\2\u011e\u011f\7\f\2\2\u011f\u0120\7*\2\2\u0120\u0121\7\6"+
		"\2\2\u0121\u0122\5\34\17\2\u0122\u0123\7\r\2\2\u0123\u0124\b\22\1\2\u0124"+
		"#\3\2\2\2\u0125\u0126\7(\2\2\u0126\u012a\7\7\2\2\u0127\u0129\5&\24\2\u0128"+
		"\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2"+
		"\2\2\u012b\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\7\b\2\2\u012e"+
		"\u012f\b\23\1\2\u012f%\3\2\2\2\u0130\u0135\7+\2\2\u0131\u0132\7\13\2\2"+
		"\u0132\u0134\7+\2\2\u0133\u0131\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133"+
		"\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138"+
		"\u0139\7\6\2\2\u0139\u013a\5\34\17\2\u013a\u013b\b\24\1\2\u013b\'\3\2"+
		"\2\2#*,<>IRT[au\u0096\u0098\u00a3\u00a6\u00ac\u00b5\u00c0\u00cb\u00d0"+
		"\u00d2\u00d8\u00da\u00dd\u00e5\u00ea\u00ec\u00f8\u00ff\u010c\u0114\u011c"+
		"\u012a\u0135";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}