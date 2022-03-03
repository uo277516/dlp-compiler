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
		public ExpressionContext e;
		public ExpressionContext a;
		public ExpressionContext e1;
		public Token i;
		public Token r;
		public Token c;
		public Token id;
		public ExpressionContext expression;
		public ExpressionContext e2;
		public OperatorMultiplyContext op;
		public OperatorArithmeticContext op1;
		public Token op2;
		public OperatorLogicalContext op3;
		public ListExpressionsContext listExpressions;
		public ExpressionContext index;
		public Simple_typeContext s;
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
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_CONSTANT:
				{
				setState(103);
				((ExpressionContext)_localctx).i = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new IntLiteral(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).i!=null?((ExpressionContext)_localctx).i.getText():null))); 
				}
				break;
			case REAL_CONSTANT:
				{
				setState(105);
				((ExpressionContext)_localctx).r = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new RealLiteral(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).r!=null?((ExpressionContext)_localctx).r.getText():null))); 
				}
				break;
			case CHAR_CONSTANT:
				{
				setState(107);
				((ExpressionContext)_localctx).c = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new CharLiteral(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).c!=null?((ExpressionContext)_localctx).c.getText():null))); 
				}
				break;
			case ID:
				{
				setState(109);
				((ExpressionContext)_localctx).id = match(ID);
				((ExpressionContext)_localctx).ast =  new Variable(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, (((ExpressionContext)_localctx).id!=null?((ExpressionContext)_localctx).id.getText():null)); 
				}
				break;
			case T__13:
				{
				setState(111);
				match(T__13);
				setState(112);
				((ExpressionContext)_localctx).e = ((ExpressionContext)_localctx).expression = expression(7);

				        ((ExpressionContext)_localctx).ast =  new UnaryNot(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((ExpressionContext)_localctx).e.ast);
				        
				}
				break;
			case T__14:
				{
				setState(115);
				match(T__14);
				setState(116);
				((ExpressionContext)_localctx).e = ((ExpressionContext)_localctx).expression = expression(6);

				         ((ExpressionContext)_localctx).ast =  new UnaryMinus(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((ExpressionContext)_localctx).e.ast);
				         
				}
				break;
			case T__1:
				{
				setState(119);
				match(T__1);
				setState(120);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(121);
				match(T__2);

				        ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expression.ast;
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(168);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(126);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(127);
						match(T__11);
						setState(128);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(10);

						                  ((ExpressionContext)_localctx).ast =  new FileAccess(((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast, _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
						                  
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(131);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(132);
						((ExpressionContext)_localctx).op = operatorMultiply();
						setState(133);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(6);

						                  ((ExpressionContext)_localctx).ast =  new ArithmeticMultiply(((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).op.ast, ((ExpressionContext)_localctx).e2.ast,
						                      _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
						                  
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(136);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(137);
						((ExpressionContext)_localctx).op1 = operatorArithmetic();
						setState(138);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(5);

						                  ((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).op1.ast, ((ExpressionContext)_localctx).e2.ast,
						                       _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
						                  
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(141);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(142);
						((ExpressionContext)_localctx).op2 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
							((ExpressionContext)_localctx).op2 = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(143);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(4);

						                  ((ExpressionContext)_localctx).ast =  new Comparator(((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).op2!=null?((ExpressionContext)_localctx).op2.getText():null), ((ExpressionContext)_localctx).e2.ast,
						                               _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
						                  
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(146);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(147);
						((ExpressionContext)_localctx).op3 = operatorLogical();
						setState(148);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(3);

						                  ((ExpressionContext)_localctx).ast =  new Logical(((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).op3.ast, ((ExpressionContext)_localctx).e2.ast,
						                               _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
						                  
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(151);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(152);
						match(T__1);
						setState(153);
						((ExpressionContext)_localctx).listExpressions = listExpressions();
						setState(154);
						match(T__2);

						                   ((ExpressionContext)_localctx).ast =  new Invocation(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1,
						                                       ((ExpressionContext)_localctx).e.ast, ((ExpressionContext)_localctx).listExpressions.ast);
						                   
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(157);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(158);
						match(T__9);
						setState(159);
						((ExpressionContext)_localctx).index = ((ExpressionContext)_localctx).expression = expression(0);
						setState(160);
						match(T__10);

						                   ((ExpressionContext)_localctx).ast =  new ArrayAccess(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1,
						                      ((ExpressionContext)_localctx).a.ast, ((ExpressionContext)_localctx).index.ast);
						                  
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(163);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(164);
						match(T__12);
						setState(165);
						((ExpressionContext)_localctx).s = simple_type();

						                  ((ExpressionContext)_localctx).ast =  new Cast(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1,
						                      ((ExpressionContext)_localctx).e.ast, ((ExpressionContext)_localctx).s.ast);
						                  
						}
						break;
					}
					} 
				}
				setState(172);
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
		public String ast;
		public Token a;
		public Token o;
		public OperatorLogicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorLogical; }
	}

	public final OperatorLogicalContext operatorLogical() throws RecognitionException {
		OperatorLogicalContext _localctx = new OperatorLogicalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_operatorLogical);
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				((OperatorLogicalContext)_localctx).a = match(T__21);
				((OperatorLogicalContext)_localctx).ast =  (((OperatorLogicalContext)_localctx).a!=null?((OperatorLogicalContext)_localctx).a.getText():null);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				((OperatorLogicalContext)_localctx).o = match(T__22);
				((OperatorLogicalContext)_localctx).ast =  (((OperatorLogicalContext)_localctx).o!=null?((OperatorLogicalContext)_localctx).o.getText():null);
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

	public static class OperatorArithmeticContext extends ParserRuleContext {
		public String ast;
		public Token m;
		public Token mi;
		public OperatorArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorArithmetic; }
	}

	public final OperatorArithmeticContext operatorArithmetic() throws RecognitionException {
		OperatorArithmeticContext _localctx = new OperatorArithmeticContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operatorArithmetic);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				((OperatorArithmeticContext)_localctx).m = match(T__23);
				((OperatorArithmeticContext)_localctx).ast =  (((OperatorArithmeticContext)_localctx).m!=null?((OperatorArithmeticContext)_localctx).m.getText():null);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				((OperatorArithmeticContext)_localctx).mi = match(T__14);
				((OperatorArithmeticContext)_localctx).ast =  (((OperatorArithmeticContext)_localctx).mi!=null?((OperatorArithmeticContext)_localctx).mi.getText():null);
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

	public static class OperatorMultiplyContext extends ParserRuleContext {
		public String ast;
		public Token d;
		public Token m;
		public Token p;
		public OperatorMultiplyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorMultiply; }
	}

	public final OperatorMultiplyContext operatorMultiply() throws RecognitionException {
		OperatorMultiplyContext _localctx = new OperatorMultiplyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operatorMultiply);
		try {
			setState(192);
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
				setState(186);
				((OperatorMultiplyContext)_localctx).d = match(T__24);
				((OperatorMultiplyContext)_localctx).ast =  (((OperatorMultiplyContext)_localctx).d!=null?((OperatorMultiplyContext)_localctx).d.getText():null);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				((OperatorMultiplyContext)_localctx).m = match(T__25);
				((OperatorMultiplyContext)_localctx).ast =  (((OperatorMultiplyContext)_localctx).m!=null?((OperatorMultiplyContext)_localctx).m.getText():null);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 4);
				{
				setState(190);
				((OperatorMultiplyContext)_localctx).p = match(T__26);
				((OperatorMultiplyContext)_localctx).ast =  (((OperatorMultiplyContext)_localctx).p!=null?((OperatorMultiplyContext)_localctx).p.getText():null);
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
		public List<Expression> ast = new ArrayList<>();
		public ExpressionContext expression;
		public List<ExpressionContext> exps = new ArrayList<ExpressionContext>();
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
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__13) | (1L << T__14) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				setState(194);
				((ListExpressionsContext)_localctx).expression = expression(0);
				((ListExpressionsContext)_localctx).exps.add(((ListExpressionsContext)_localctx).expression);
				}
			}

			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(197);
				match(T__8);
				setState(198);
				((ListExpressionsContext)_localctx).expression = expression(0);
				((ListExpressionsContext)_localctx).exps.add(((ListExpressionsContext)_localctx).expression);
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			            for (var e: ((ListExpressionsContext)_localctx).exps)
			            {
			                _localctx.ast.add(e.ast);
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
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> condiciones = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> ifExps = new ArrayList<ExpressionContext>();
		public StatementContext statement;
		public List<StatementContext> ifSts = new ArrayList<StatementContext>();
		public List<ExpressionContext> elseExps = new ArrayList<ExpressionContext>();
		public List<StatementContext> elseSts = new ArrayList<StatementContext>();
		public List<StatementContext> sts = new ArrayList<StatementContext>();
		public ListExpressionsContext listExpressions;
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
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(T__27);
				setState(207);
				((StatementContext)_localctx).expression = expression(0);
				((StatementContext)_localctx).exps.add(((StatementContext)_localctx).expression);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(208);
					match(T__8);
					setState(209);
					((StatementContext)_localctx).expression = expression(0);
					((StatementContext)_localctx).exps.add(((StatementContext)_localctx).expression);
					}
					}
					setState(214);
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
				setState(217);
				match(T__28);
				setState(218);
				((StatementContext)_localctx).expression = expression(0);
				((StatementContext)_localctx).exps.add(((StatementContext)_localctx).expression);
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(219);
					match(T__8);
					setState(220);
					((StatementContext)_localctx).expression = expression(0);
					((StatementContext)_localctx).exps.add(((StatementContext)_localctx).expression);
					}
					}
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

				                List<Expression> expressions = new ArrayList<>();
				                for (var e: ((StatementContext)_localctx).exps) {
				                    expressions.add(e.ast);
				                }
				                ((StatementContext)_localctx).ast =  new Read(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, expressions);
				            
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				((StatementContext)_localctx).e1 = expression(0);
				setState(229);
				match(T__29);
				setState(230);
				((StatementContext)_localctx).e2 = expression(0);

				                ((StatementContext)_localctx).ast =  new Assigment(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).e2.ast);
				            
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(233);
				match(T__30);
				setState(235); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(234);
					((StatementContext)_localctx).expression = expression(0);
					((StatementContext)_localctx).condiciones.add(((StatementContext)_localctx).expression);
					}
					}
					setState(237); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__13) | (1L << T__14) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0) );
				setState(239);
				match(T__4);
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__13) | (1L << T__14) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					setState(242);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(240);
						((StatementContext)_localctx).expression = expression(0);
						((StatementContext)_localctx).ifExps.add(((StatementContext)_localctx).expression);
						}
						break;
					case 2:
						{
						setState(241);
						((StatementContext)_localctx).statement = statement();
						((StatementContext)_localctx).ifSts.add(((StatementContext)_localctx).statement);
						}
						break;
					}
					}
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__31) {
					{
					setState(247);
					match(T__31);
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__13) | (1L << T__14) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
						{
						setState(250);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
						case 1:
							{
							setState(248);
							((StatementContext)_localctx).expression = expression(0);
							((StatementContext)_localctx).elseExps.add(((StatementContext)_localctx).expression);
							}
							break;
						case 2:
							{
							setState(249);
							((StatementContext)_localctx).statement = statement();
							((StatementContext)_localctx).elseSts.add(((StatementContext)_localctx).statement);
							}
							break;
						}
						}
						setState(254);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(257);
				match(T__5);

				                List<Expression> condiciones = new ArrayList<>();
				                List<Expression> ifExps = new ArrayList<>();
				                List<Statemment> ifSts= new ArrayList<>();
				                List<Expression> elseExps= new ArrayList<>();
				                List<Statemment> elseSts= new ArrayList<>();

				                for (var c: ((StatementContext)_localctx).condiciones) {condiciones.add(c.ast);}
				                for (var c: ((StatementContext)_localctx).ifExps) {ifExps.add(c.ast);}
				                for (var c: ((StatementContext)_localctx).ifSts) {ifSts.add(c.ast);}
				                for (var c: ((StatementContext)_localctx).elseExps) {elseExps.add(c.ast);}
				                for (var c: ((StatementContext)_localctx).elseSts) {elseSts.add(c.ast);}

				                ((StatementContext)_localctx).ast =  new IfElse(condiciones, ifExps, ifSts, elseExps, elseSts, _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
				            
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(260);
				match(T__32);
				setState(262); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(261);
					((StatementContext)_localctx).expression = expression(0);
					((StatementContext)_localctx).condiciones.add(((StatementContext)_localctx).expression);
					}
					}
					setState(264); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__13) | (1L << T__14) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0) );
				setState(266);
				match(T__4);
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__13) | (1L << T__14) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					setState(269);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						setState(267);
						((StatementContext)_localctx).expression = expression(0);
						((StatementContext)_localctx).exps.add(((StatementContext)_localctx).expression);
						}
						break;
					case 2:
						{
						setState(268);
						((StatementContext)_localctx).statement = statement();
						((StatementContext)_localctx).sts.add(((StatementContext)_localctx).statement);
						}
						break;
					}
					}
					setState(273);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

				                List<Expression> condiciones = new ArrayList<>();
				                List<Expression> exps = new ArrayList<>();
				                List<Statemment> sts= new ArrayList<>();

				                for (var c: ((StatementContext)_localctx).condiciones) {condiciones.add(c.ast);}
				                for (var c: ((StatementContext)_localctx).exps) {exps.add(c.ast);}
				                for (var c: ((StatementContext)_localctx).sts) {sts.add(c.ast);}

				                ((StatementContext)_localctx).ast =  new While(condiciones, exps, sts, _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
				            
				setState(275);
				match(T__5);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(277);
				match(T__33);
				setState(278);
				((StatementContext)_localctx).expression = expression(0);

				                ((StatementContext)_localctx).ast =  new Return(((StatementContext)_localctx).expression.ast, _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
				            
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(281);
				((StatementContext)_localctx).expression = expression(0);
				setState(282);
				match(T__1);
				setState(283);
				((StatementContext)_localctx).listExpressions = listExpressions();
				setState(284);
				match(T__2);


				                ((StatementContext)_localctx).ast =  new InvocationStatement(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1,
				                    ((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).listExpressions.ast);
				            
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
			setState(289);
			((VarDefContext)_localctx).ID = match(ID);
			((VarDefContext)_localctx).ids.add(((VarDefContext)_localctx).ID);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(290);
				match(T__8);
				setState(291);
				((VarDefContext)_localctx).ID = match(ID);
				((VarDefContext)_localctx).ids.add(((VarDefContext)_localctx).ID);
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297);
			match(T__3);
			setState(298);
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
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				((TypeContext)_localctx).simple_type = simple_type();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).simple_type.ast; 
				}
				break;
			case T__9:
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
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
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				((Complex_typeContext)_localctx).array = array();
				 ((Complex_typeContext)_localctx).ast =  ((Complex_typeContext)_localctx).array.ast; 
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
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
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(T__34);
				 ((Simple_typeContext)_localctx).ast =  new IntType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1); 
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				match(T__35);
				 ((Simple_typeContext)_localctx).ast =  new RealType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1); 
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
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
			setState(325);
			match(T__9);
			setState(326);
			match(INT_CONSTANT);
			setState(327);
			match(T__3);
			setState(328);
			((ArrayContext)_localctx).type = type();
			setState(329);
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
			setState(332);
			match(T__37);
			setState(333);
			match(T__4);
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(334);
				((StructContext)_localctx).recordFields = recordFields();
				((StructContext)_localctx).r.add(((StructContext)_localctx).recordFields);
				}
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(340);
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
			setState(343);
			((RecordFieldsContext)_localctx).ID = match(ID);
			((RecordFieldsContext)_localctx).ids.add(((RecordFieldsContext)_localctx).ID);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(344);
				match(T__8);
				setState(345);
				((RecordFieldsContext)_localctx).ID = match(ID);
				((RecordFieldsContext)_localctx).ids.add(((RecordFieldsContext)_localctx).ID);
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(351);
			match(T__3);
			setState(352);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0166\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3=\n\3\f\3\16\3@\13\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\5\4J\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5S\n\5\f\5"+
		"\16\5V\13\5\3\5\3\5\3\5\3\6\5\6\\\n\6\3\6\3\6\7\6`\n\6\f\6\16\6c\13\6"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\177\n\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\7\b\u00ab\n\b\f\b\16\b\u00ae\13\b\3\t\3\t\3\t\3\t\5\t\u00b4\n\t\3"+
		"\n\3\n\3\n\3\n\5\n\u00ba\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00c3"+
		"\n\13\3\f\5\f\u00c6\n\f\3\f\3\f\7\f\u00ca\n\f\f\f\16\f\u00cd\13\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\7\r\u00d5\n\r\f\r\16\r\u00d8\13\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\7\r\u00e0\n\r\f\r\16\r\u00e3\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\6\r\u00ee\n\r\r\r\16\r\u00ef\3\r\3\r\3\r\7\r\u00f5\n\r\f\r\16"+
		"\r\u00f8\13\r\3\r\3\r\3\r\7\r\u00fd\n\r\f\r\16\r\u0100\13\r\5\r\u0102"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\6\r\u0109\n\r\r\r\16\r\u010a\3\r\3\r\3\r\7\r"+
		"\u0110\n\r\f\r\16\r\u0113\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u0122\n\r\3\16\3\16\3\16\7\16\u0127\n\16\f\16\16\16\u012a"+
		"\13\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0136\n"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u013e\n\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u0146\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\7\23\u0152\n\23\f\23\16\23\u0155\13\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\7\24\u015d\n\24\f\24\16\24\u0160\13\24\3\24\3\24\3\24\3\24\3\24"+
		"\2\3\16\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\3\3\2\22\27\2"+
		"\u0188\2,\3\2\2\2\4\62\3\2\2\2\6I\3\2\2\2\bK\3\2\2\2\n[\3\2\2\2\fd\3\2"+
		"\2\2\16~\3\2\2\2\20\u00b3\3\2\2\2\22\u00b9\3\2\2\2\24\u00c2\3\2\2\2\26"+
		"\u00c5\3\2\2\2\30\u0121\3\2\2\2\32\u0123\3\2\2\2\34\u0135\3\2\2\2\36\u013d"+
		"\3\2\2\2 \u0145\3\2\2\2\"\u0147\3\2\2\2$\u014e\3\2\2\2&\u0159\3\2\2\2"+
		"(+\5\32\16\2)+\5\4\3\2*(\3\2\2\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2"+
		"\2-/\3\2\2\2.,\3\2\2\2/\60\5\b\5\2\60\61\b\2\1\2\61\3\3\2\2\2\62\63\7"+
		"\3\2\2\63\64\7+\2\2\64\65\7\4\2\2\65\66\5\n\6\2\66\67\7\5\2\2\678\7\6"+
		"\2\289\5\6\4\29>\7\7\2\2:=\5\32\16\2;=\5\30\r\2<:\3\2\2\2<;\3\2\2\2=@"+
		"\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\7\b\2\2BC\b\3\1\2C"+
		"\5\3\2\2\2DE\5 \21\2EF\b\4\1\2FJ\3\2\2\2GH\7\t\2\2HJ\b\4\1\2ID\3\2\2\2"+
		"IG\3\2\2\2J\7\3\2\2\2KL\7\3\2\2LM\7\n\2\2MN\7\4\2\2NO\7\5\2\2OT\7\7\2"+
		"\2PS\5\32\16\2QS\5\30\r\2RP\3\2\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3"+
		"\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7\b\2\2XY\b\5\1\2Y\t\3\2\2\2Z\\\5\f\7\2["+
		"Z\3\2\2\2[\\\3\2\2\2\\a\3\2\2\2]^\7\13\2\2^`\5\f\7\2_]\3\2\2\2`c\3\2\2"+
		"\2a_\3\2\2\2ab\3\2\2\2b\13\3\2\2\2ca\3\2\2\2de\7+\2\2ef\7\6\2\2fg\5\34"+
		"\17\2g\r\3\2\2\2hi\b\b\1\2ij\7*\2\2j\177\b\b\1\2kl\7,\2\2l\177\b\b\1\2"+
		"mn\7/\2\2n\177\b\b\1\2op\7+\2\2p\177\b\b\1\2qr\7\20\2\2rs\5\16\b\tst\b"+
		"\b\1\2t\177\3\2\2\2uv\7\21\2\2vw\5\16\b\bwx\b\b\1\2x\177\3\2\2\2yz\7\4"+
		"\2\2z{\5\16\b\2{|\7\5\2\2|}\b\b\1\2}\177\3\2\2\2~h\3\2\2\2~k\3\2\2\2~"+
		"m\3\2\2\2~o\3\2\2\2~q\3\2\2\2~u\3\2\2\2~y\3\2\2\2\177\u00ac\3\2\2\2\u0080"+
		"\u0081\f\13\2\2\u0081\u0082\7\16\2\2\u0082\u0083\5\16\b\f\u0083\u0084"+
		"\b\b\1\2\u0084\u00ab\3\2\2\2\u0085\u0086\f\7\2\2\u0086\u0087\5\24\13\2"+
		"\u0087\u0088\5\16\b\b\u0088\u0089\b\b\1\2\u0089\u00ab\3\2\2\2\u008a\u008b"+
		"\f\6\2\2\u008b\u008c\5\22\n\2\u008c\u008d\5\16\b\7\u008d\u008e\b\b\1\2"+
		"\u008e\u00ab\3\2\2\2\u008f\u0090\f\5\2\2\u0090\u0091\t\2\2\2\u0091\u0092"+
		"\5\16\b\6\u0092\u0093\b\b\1\2\u0093\u00ab\3\2\2\2\u0094\u0095\f\4\2\2"+
		"\u0095\u0096\5\20\t\2\u0096\u0097\5\16\b\5\u0097\u0098\b\b\1\2\u0098\u00ab"+
		"\3\2\2\2\u0099\u009a\f\r\2\2\u009a\u009b\7\4\2\2\u009b\u009c\5\26\f\2"+
		"\u009c\u009d\7\5\2\2\u009d\u009e\b\b\1\2\u009e\u00ab\3\2\2\2\u009f\u00a0"+
		"\f\f\2\2\u00a0\u00a1\7\f\2\2\u00a1\u00a2\5\16\b\2\u00a2\u00a3\7\r\2\2"+
		"\u00a3\u00a4\b\b\1\2\u00a4\u00ab\3\2\2\2\u00a5\u00a6\f\n\2\2\u00a6\u00a7"+
		"\7\17\2\2\u00a7\u00a8\5 \21\2\u00a8\u00a9\b\b\1\2\u00a9\u00ab\3\2\2\2"+
		"\u00aa\u0080\3\2\2\2\u00aa\u0085\3\2\2\2\u00aa\u008a\3\2\2\2\u00aa\u008f"+
		"\3\2\2\2\u00aa\u0094\3\2\2\2\u00aa\u0099\3\2\2\2\u00aa\u009f\3\2\2\2\u00aa"+
		"\u00a5\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\17\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7\30\2\2\u00b0\u00b4"+
		"\b\t\1\2\u00b1\u00b2\7\31\2\2\u00b2\u00b4\b\t\1\2\u00b3\u00af\3\2\2\2"+
		"\u00b3\u00b1\3\2\2\2\u00b4\21\3\2\2\2\u00b5\u00b6\7\32\2\2\u00b6\u00ba"+
		"\b\n\1\2\u00b7\u00b8\7\21\2\2\u00b8\u00ba\b\n\1\2\u00b9\u00b5\3\2\2\2"+
		"\u00b9\u00b7\3\2\2\2\u00ba\23\3\2\2\2\u00bb\u00c3\3\2\2\2\u00bc\u00bd"+
		"\7\33\2\2\u00bd\u00c3\b\13\1\2\u00be\u00bf\7\34\2\2\u00bf\u00c3\b\13\1"+
		"\2\u00c0\u00c1\7\35\2\2\u00c1\u00c3\b\13\1\2\u00c2\u00bb\3\2\2\2\u00c2"+
		"\u00bc\3\2\2\2\u00c2\u00be\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\25\3\2\2"+
		"\2\u00c4\u00c6\5\16\b\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00cb\3\2\2\2\u00c7\u00c8\7\13\2\2\u00c8\u00ca\5\16\b\2\u00c9\u00c7\3"+
		"\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\b\f\1\2\u00cf\27\3\2\2"+
		"\2\u00d0\u00d1\7\36\2\2\u00d1\u00d6\5\16\b\2\u00d2\u00d3\7\13\2\2\u00d3"+
		"\u00d5\5\16\b\2\u00d4\u00d2\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3"+
		"\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9"+
		"\u00da\b\r\1\2\u00da\u0122\3\2\2\2\u00db\u00dc\7\37\2\2\u00dc\u00e1\5"+
		"\16\b\2\u00dd\u00de\7\13\2\2\u00de\u00e0\5\16\b\2\u00df\u00dd\3\2\2\2"+
		"\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4"+
		"\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\b\r\1\2\u00e5\u0122\3\2\2\2\u00e6"+
		"\u00e7\5\16\b\2\u00e7\u00e8\7 \2\2\u00e8\u00e9\5\16\b\2\u00e9\u00ea\b"+
		"\r\1\2\u00ea\u0122\3\2\2\2\u00eb\u00ed\7!\2\2\u00ec\u00ee\5\16\b\2\u00ed"+
		"\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f6\7\7\2\2\u00f2\u00f5\5\16\b\2\u00f3"+
		"\u00f5\5\30\r\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3"+
		"\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u0101\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f9\u00fe\7\"\2\2\u00fa\u00fd\5\16\b\2\u00fb\u00fd\5"+
		"\30\r\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2"+
		"\2\2\u0101\u00f9\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0104\7\b\2\2\u0104\u0105\b\r\1\2\u0105\u0122\3\2\2\2\u0106\u0108\7#"+
		"\2\2\u0107\u0109\5\16\b\2\u0108\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u0111\7\7"+
		"\2\2\u010d\u0110\5\16\b\2\u010e\u0110\5\30\r\2\u010f\u010d\3\2\2\2\u010f"+
		"\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\b\r\1\2\u0115"+
		"\u0116\7\b\2\2\u0116\u0122\3\2\2\2\u0117\u0118\7$\2\2\u0118\u0119\5\16"+
		"\b\2\u0119\u011a\b\r\1\2\u011a\u0122\3\2\2\2\u011b\u011c\5\16\b\2\u011c"+
		"\u011d\7\4\2\2\u011d\u011e\5\26\f\2\u011e\u011f\7\5\2\2\u011f\u0120\b"+
		"\r\1\2\u0120\u0122\3\2\2\2\u0121\u00d0\3\2\2\2\u0121\u00db\3\2\2\2\u0121"+
		"\u00e6\3\2\2\2\u0121\u00eb\3\2\2\2\u0121\u0106\3\2\2\2\u0121\u0117\3\2"+
		"\2\2\u0121\u011b\3\2\2\2\u0122\31\3\2\2\2\u0123\u0128\7+\2\2\u0124\u0125"+
		"\7\13\2\2\u0125\u0127\7+\2\2\u0126\u0124\3\2\2\2\u0127\u012a\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0128\3\2"+
		"\2\2\u012b\u012c\7\6\2\2\u012c\u012d\5\34\17\2\u012d\u012e\b\16\1\2\u012e"+
		"\33\3\2\2\2\u012f\u0130\5 \21\2\u0130\u0131\b\17\1\2\u0131\u0136\3\2\2"+
		"\2\u0132\u0133\5\36\20\2\u0133\u0134\b\17\1\2\u0134\u0136\3\2\2\2\u0135"+
		"\u012f\3\2\2\2\u0135\u0132\3\2\2\2\u0136\35\3\2\2\2\u0137\u0138\5\"\22"+
		"\2\u0138\u0139\b\20\1\2\u0139\u013e\3\2\2\2\u013a\u013b\5$\23\2\u013b"+
		"\u013c\b\20\1\2\u013c\u013e\3\2\2\2\u013d\u0137\3\2\2\2\u013d\u013a\3"+
		"\2\2\2\u013e\37\3\2\2\2\u013f\u0140\7%\2\2\u0140\u0146\b\21\1\2\u0141"+
		"\u0142\7&\2\2\u0142\u0146\b\21\1\2\u0143\u0144\7\'\2\2\u0144\u0146\b\21"+
		"\1\2\u0145\u013f\3\2\2\2\u0145\u0141\3\2\2\2\u0145\u0143\3\2\2\2\u0146"+
		"!\3\2\2\2\u0147\u0148\7\f\2\2\u0148\u0149\7*\2\2\u0149\u014a\7\6\2\2\u014a"+
		"\u014b\5\34\17\2\u014b\u014c\7\r\2\2\u014c\u014d\b\22\1\2\u014d#\3\2\2"+
		"\2\u014e\u014f\7(\2\2\u014f\u0153\7\7\2\2\u0150\u0152\5&\24\2\u0151\u0150"+
		"\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\u0156\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0157\7\b\2\2\u0157\u0158\b\23"+
		"\1\2\u0158%\3\2\2\2\u0159\u015e\7+\2\2\u015a\u015b\7\13\2\2\u015b\u015d"+
		"\7+\2\2\u015c\u015a\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e"+
		"\u015f\3\2\2\2\u015f\u0161\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0162\7\6"+
		"\2\2\u0162\u0163\5\34\17\2\u0163\u0164\b\24\1\2\u0164\'\3\2\2\2%*,<>I"+
		"RT[a~\u00aa\u00ac\u00b3\u00b9\u00c2\u00c5\u00cb\u00d6\u00e1\u00ef\u00f4"+
		"\u00f6\u00fc\u00fe\u0101\u010a\u010f\u0111\u0121\u0128\u0135\u013d\u0145"+
		"\u0153\u015e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}