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
		RULE_parameterList = 4, RULE_param = 5, RULE_expression = 6, RULE_listExpressions = 7, 
		RULE_statement = 8, RULE_varDef = 9, RULE_type = 10, RULE_complex_type = 11, 
		RULE_simple_type = 12, RULE_array = 13, RULE_struct = 14, RULE_recordFields = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "funDef", "returnType", "funMain", "parameterList", "param", 
			"expression", "listExpressions", "statement", "varDef", "type", "complex_type", 
			"simple_type", "array", "struct", "recordFields"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'('", "')'", "'::'", "'do'", "'end'", "'void'", "'main'", 
			"','", "'['", "']'", "'.'", "'as'", "'!'", "'-'", "'*'", "'/'", "'%'", 
			"'+'", "'<'", "'>'", "'<='", "'>='", "'!='", "'=='", "'&&'", "'||'", 
			"'puts'", "'in'", "'='", "'if'", "'else'", "'while'", "'return'", "'int'", 
			"'double'", "'char'", "'defstruct'"
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
			setState(36);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(34);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(32);
						((ProgramContext)_localctx).varDef = varDef();
						((ProgramContext)_localctx).v.add(((ProgramContext)_localctx).varDef);
						}
						break;
					case T__0:
						{
						setState(33);
						((ProgramContext)_localctx).funDef = funDef();
						((ProgramContext)_localctx).funDefs.add(((ProgramContext)_localctx).funDef);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(38);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(39);
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
		public ParameterListContext parameterList;
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
			setState(42);
			match(T__0);
			setState(43);
			((FunDefContext)_localctx).id = match(ID);
			setState(44);
			match(T__1);
			setState(45);
			((FunDefContext)_localctx).parameterList = parameterList();
			setState(46);
			match(T__2);
			setState(47);
			match(T__3);
			setState(48);
			((FunDefContext)_localctx).returnType = returnType();
			setState(49);
			match(T__4);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__13) | (1L << T__14) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				setState(52);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(50);
					((FunDefContext)_localctx).varDef = varDef();
					((FunDefContext)_localctx).v.add(((FunDefContext)_localctx).varDef);
					}
					break;
				case 2:
					{
					setState(51);
					((FunDefContext)_localctx).statement = statement();
					((FunDefContext)_localctx).statements.add(((FunDefContext)_localctx).statement);
					}
					break;
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
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
			            ((FunDefContext)_localctx).ast =  new FunDef(varDefs, sts, (((FunDefContext)_localctx).id!=null?((FunDefContext)_localctx).id.getText():null), new FunType(((FunDefContext)_localctx).parameterList.ast, ((FunDefContext)_localctx).returnType.ast, _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1),
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
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				((ReturnTypeContext)_localctx).simple_type = simple_type();
				((ReturnTypeContext)_localctx).ast =  ((ReturnTypeContext)_localctx).simple_type.ast; 
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
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
		public FunDef ast;
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
			setState(67);
			match(T__0);
			setState(68);
			match(T__7);
			setState(69);
			match(T__1);
			setState(70);
			match(T__2);
			setState(71);
			match(T__4);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__13) | (1L << T__14) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				setState(74);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(72);
					((FunMainContext)_localctx).varDef = varDef();
					((FunMainContext)_localctx).v.add(((FunMainContext)_localctx).varDef);
					}
					break;
				case 2:
					{
					setState(73);
					((FunMainContext)_localctx).statement = statement();
					((FunMainContext)_localctx).sts.add(((FunMainContext)_localctx).statement);
					}
					break;
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
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

			                VoidType tipo = new VoidType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
			                FunType ft = new FunType(new ArrayList<VarDef>(), tipo, _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
			                ((FunMainContext)_localctx).ast =  new FunDef(varDefs, sts, "main", ft, _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);

			              
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
		public List<VarDef> ast = new ArrayList<>();
		public ParamContext param;
		public List<ParamContext> params = new ArrayList<ParamContext>();
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
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(82);
				((ParameterListContext)_localctx).param = param();
				((ParameterListContext)_localctx).params.add(((ParameterListContext)_localctx).param);
				}
			}

			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(85);
				match(T__8);
				setState(86);
				((ParameterListContext)_localctx).param = param();
				((ParameterListContext)_localctx).params.add(((ParameterListContext)_localctx).param);
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        for(var p: ((ParameterListContext)_localctx).params)
			        {
			            _localctx.ast.add(p.ast);
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
		public VarDef ast;
		public Token id;
		public TypeContext t;
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
			setState(94);
			((ParamContext)_localctx).id = match(ID);
			setState(95);
			match(T__3);
			setState(96);
			((ParamContext)_localctx).t = type();
			((ParamContext)_localctx).ast =  new VarDef(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, (((ParamContext)_localctx).id!=null?((ParamContext)_localctx).id.getText():null), ((ParamContext)_localctx).t.ast);
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
		public Token op;
		public Token op1;
		public Token op2;
		public Token op3;
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
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_CONSTANT:
				{
				setState(100);
				((ExpressionContext)_localctx).i = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new IntLiteral(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).i!=null?((ExpressionContext)_localctx).i.getText():null))); 
				}
				break;
			case REAL_CONSTANT:
				{
				setState(102);
				((ExpressionContext)_localctx).r = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new RealLiteral(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).r!=null?((ExpressionContext)_localctx).r.getText():null))); 
				}
				break;
			case CHAR_CONSTANT:
				{
				setState(104);
				((ExpressionContext)_localctx).c = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new CharLiteral(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).c!=null?((ExpressionContext)_localctx).c.getText():null))); 
				}
				break;
			case ID:
				{
				setState(106);
				((ExpressionContext)_localctx).id = match(ID);
				((ExpressionContext)_localctx).ast =  new Variable(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, (((ExpressionContext)_localctx).id!=null?((ExpressionContext)_localctx).id.getText():null)); 
				}
				break;
			case T__13:
				{
				setState(108);
				match(T__13);
				setState(109);
				((ExpressionContext)_localctx).e = ((ExpressionContext)_localctx).expression = expression(7);

				        ((ExpressionContext)_localctx).ast =  new UnaryNot(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((ExpressionContext)_localctx).e.ast);
				        
				}
				break;
			case T__14:
				{
				setState(112);
				match(T__14);
				setState(113);
				((ExpressionContext)_localctx).e = ((ExpressionContext)_localctx).expression = expression(6);

				         ((ExpressionContext)_localctx).ast =  new UnaryMinus(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((ExpressionContext)_localctx).e.ast);
				         
				}
				break;
			case T__1:
				{
				setState(116);
				match(T__1);
				setState(117);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(118);
				match(T__2);

				        ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expression.ast;
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(165);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(123);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(124);
						match(T__11);
						setState(125);
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
						setState(128);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(129);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(130);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(6);

						                  ((ExpressionContext)_localctx).ast =  new ArithmeticMultiply(((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e2.ast,
						                      _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
						                  
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(133);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(134);
						((ExpressionContext)_localctx).op1 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__14 || _la==T__18) ) {
							((ExpressionContext)_localctx).op1 = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(135);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(5);

						                  ((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).op1!=null?((ExpressionContext)_localctx).op1.getText():null), ((ExpressionContext)_localctx).e2.ast,
						                       _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
						                  
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(138);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(139);
						((ExpressionContext)_localctx).op2 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
							((ExpressionContext)_localctx).op2 = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(140);
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
						setState(143);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(144);
						((ExpressionContext)_localctx).op3 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__26) ) {
							((ExpressionContext)_localctx).op3 = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(145);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(3);

						                  ((ExpressionContext)_localctx).ast =  new Logical(((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).op3!=null?((ExpressionContext)_localctx).op3.getText():null), ((ExpressionContext)_localctx).e2.ast,
						                               _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
						                  
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(148);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(149);
						match(T__1);
						setState(150);
						((ExpressionContext)_localctx).listExpressions = listExpressions();
						setState(151);
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
						setState(154);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(155);
						match(T__9);
						setState(156);
						((ExpressionContext)_localctx).index = ((ExpressionContext)_localctx).expression = expression(0);
						setState(157);
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
						setState(160);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(161);
						match(T__12);
						setState(162);
						((ExpressionContext)_localctx).s = simple_type();

						                  ((ExpressionContext)_localctx).ast =  new Cast(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1,
						                      ((ExpressionContext)_localctx).e.ast, ((ExpressionContext)_localctx).s.ast);
						                  
						}
						break;
					}
					} 
				}
				setState(169);
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
		enterRule(_localctx, 14, RULE_listExpressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__13) | (1L << T__14) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				setState(170);
				((ListExpressionsContext)_localctx).expression = expression(0);
				((ListExpressionsContext)_localctx).exps.add(((ListExpressionsContext)_localctx).expression);
				}
			}

			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(173);
				match(T__8);
				setState(174);
				((ListExpressionsContext)_localctx).expression = expression(0);
				((ListExpressionsContext)_localctx).exps.add(((ListExpressionsContext)_localctx).expression);
				}
				}
				setState(179);
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
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(T__27);
				setState(183);
				((StatementContext)_localctx).expression = expression(0);
				((StatementContext)_localctx).exps.add(((StatementContext)_localctx).expression);
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(184);
					match(T__8);
					setState(185);
					((StatementContext)_localctx).expression = expression(0);
					((StatementContext)_localctx).exps.add(((StatementContext)_localctx).expression);
					}
					}
					setState(190);
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
				setState(193);
				match(T__28);
				setState(194);
				((StatementContext)_localctx).expression = expression(0);
				((StatementContext)_localctx).exps.add(((StatementContext)_localctx).expression);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(195);
					match(T__8);
					setState(196);
					((StatementContext)_localctx).expression = expression(0);
					((StatementContext)_localctx).exps.add(((StatementContext)_localctx).expression);
					}
					}
					setState(201);
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
				setState(204);
				((StatementContext)_localctx).e1 = expression(0);
				setState(205);
				match(T__29);
				setState(206);
				((StatementContext)_localctx).e2 = expression(0);

				                ((StatementContext)_localctx).ast =  new Assigment(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).e2.ast);
				            
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				match(T__30);
				setState(211); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(210);
					((StatementContext)_localctx).expression = expression(0);
					((StatementContext)_localctx).condiciones.add(((StatementContext)_localctx).expression);
					}
					}
					setState(213); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__13) | (1L << T__14) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0) );
				setState(215);
				match(T__4);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__13) | (1L << T__14) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					setState(218);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(216);
						((StatementContext)_localctx).expression = expression(0);
						((StatementContext)_localctx).ifExps.add(((StatementContext)_localctx).expression);
						}
						break;
					case 2:
						{
						setState(217);
						((StatementContext)_localctx).statement = statement();
						((StatementContext)_localctx).ifSts.add(((StatementContext)_localctx).statement);
						}
						break;
					}
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__31) {
					{
					setState(223);
					match(T__31);
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__13) | (1L << T__14) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
						{
						setState(226);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
						case 1:
							{
							setState(224);
							((StatementContext)_localctx).expression = expression(0);
							((StatementContext)_localctx).elseExps.add(((StatementContext)_localctx).expression);
							}
							break;
						case 2:
							{
							setState(225);
							((StatementContext)_localctx).statement = statement();
							((StatementContext)_localctx).elseSts.add(((StatementContext)_localctx).statement);
							}
							break;
						}
						}
						setState(230);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(233);
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
				setState(236);
				match(T__32);
				setState(238); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(237);
					((StatementContext)_localctx).expression = expression(0);
					((StatementContext)_localctx).condiciones.add(((StatementContext)_localctx).expression);
					}
					}
					setState(240); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__13) | (1L << T__14) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0) );
				setState(242);
				match(T__4);
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__13) | (1L << T__14) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					setState(245);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						setState(243);
						((StatementContext)_localctx).expression = expression(0);
						((StatementContext)_localctx).exps.add(((StatementContext)_localctx).expression);
						}
						break;
					case 2:
						{
						setState(244);
						((StatementContext)_localctx).statement = statement();
						((StatementContext)_localctx).sts.add(((StatementContext)_localctx).statement);
						}
						break;
					}
					}
					setState(249);
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
				            
				setState(251);
				match(T__5);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(253);
				match(T__33);
				setState(254);
				((StatementContext)_localctx).expression = expression(0);

				                ((StatementContext)_localctx).ast =  new Return(((StatementContext)_localctx).expression.ast, _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
				            
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(257);
				((StatementContext)_localctx).expression = expression(0);
				setState(258);
				match(T__1);
				setState(259);
				((StatementContext)_localctx).listExpressions = listExpressions();
				setState(260);
				match(T__2);


				                ((StatementContext)_localctx).ast =  new Invocation(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1,
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
		enterRule(_localctx, 18, RULE_varDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			((VarDefContext)_localctx).ID = match(ID);
			((VarDefContext)_localctx).ids.add(((VarDefContext)_localctx).ID);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(266);
				match(T__8);
				setState(267);
				((VarDefContext)_localctx).ID = match(ID);
				((VarDefContext)_localctx).ids.add(((VarDefContext)_localctx).ID);
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273);
			match(T__3);
			setState(274);
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
		enterRule(_localctx, 20, RULE_type);
		try {
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				((TypeContext)_localctx).simple_type = simple_type();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).simple_type.ast; 
				}
				break;
			case T__9:
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
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
		enterRule(_localctx, 22, RULE_complex_type);
		try {
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				((Complex_typeContext)_localctx).array = array();
				 ((Complex_typeContext)_localctx).ast =  ((Complex_typeContext)_localctx).array.ast; 
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
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
		enterRule(_localctx, 24, RULE_simple_type);
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				match(T__34);
				 ((Simple_typeContext)_localctx).ast =  new IntType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1); 
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				match(T__35);
				 ((Simple_typeContext)_localctx).ast =  new RealType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1); 
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(297);
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
		enterRule(_localctx, 26, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(T__9);
			setState(302);
			match(INT_CONSTANT);
			setState(303);
			match(T__3);
			setState(304);
			((ArrayContext)_localctx).type = type();
			setState(305);
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
		enterRule(_localctx, 28, RULE_struct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(T__37);
			setState(309);
			match(T__4);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(310);
				((StructContext)_localctx).recordFields = recordFields();
				((StructContext)_localctx).r.add(((StructContext)_localctx).recordFields);
				}
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(316);
			match(T__5);

			                    List<RecordField> varDefs = new ArrayList<>();

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
		public List<RecordField> ast = new ArrayList<>();
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
		enterRule(_localctx, 30, RULE_recordFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			((RecordFieldsContext)_localctx).ID = match(ID);
			((RecordFieldsContext)_localctx).ids.add(((RecordFieldsContext)_localctx).ID);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(320);
				match(T__8);
				setState(321);
				((RecordFieldsContext)_localctx).ID = match(ID);
				((RecordFieldsContext)_localctx).ids.add(((RecordFieldsContext)_localctx).ID);
				}
				}
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(327);
			match(T__3);
			setState(328);
			((RecordFieldsContext)_localctx).type = type();

			        for(var id : ((RecordFieldsContext)_localctx).ids) {
			            _localctx.ast.add(new RecordField(id.getLine(), id.getCharPositionInLine() + 1, id.getText(), ((RecordFieldsContext)_localctx).type.ast));
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u014e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\7"+
		"\2%\n\2\f\2\16\2(\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\7\3\67\n\3\f\3\16\3:\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4D\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5M\n\5\f\5\16\5P\13\5\3\5\3\5\3\5\3\6"+
		"\5\6V\n\6\3\6\3\6\7\6Z\n\6\f\6\16\6]\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b|\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00a8\n\b"+
		"\f\b\16\b\u00ab\13\b\3\t\5\t\u00ae\n\t\3\t\3\t\7\t\u00b2\n\t\f\t\16\t"+
		"\u00b5\13\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u00bd\n\n\f\n\16\n\u00c0\13\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00c8\n\n\f\n\16\n\u00cb\13\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u00d6\n\n\r\n\16\n\u00d7\3\n\3\n\3\n\7\n"+
		"\u00dd\n\n\f\n\16\n\u00e0\13\n\3\n\3\n\3\n\7\n\u00e5\n\n\f\n\16\n\u00e8"+
		"\13\n\5\n\u00ea\n\n\3\n\3\n\3\n\3\n\3\n\6\n\u00f1\n\n\r\n\16\n\u00f2\3"+
		"\n\3\n\3\n\7\n\u00f8\n\n\f\n\16\n\u00fb\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u010a\n\n\3\13\3\13\3\13\7\13\u010f\n\13"+
		"\f\13\16\13\u0112\13\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u011e\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0126\n\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u012e\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\7\20\u013a\n\20\f\20\16\20\u013d\13\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\7\21\u0145\n\21\f\21\16\21\u0148\13\21\3\21\3\21\3\21\3\21\3\21"+
		"\2\3\16\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\6\3\2\22\24\4\2\21"+
		"\21\25\25\3\2\26\33\3\2\34\35\2\u016e\2&\3\2\2\2\4,\3\2\2\2\6C\3\2\2\2"+
		"\bE\3\2\2\2\nU\3\2\2\2\f`\3\2\2\2\16{\3\2\2\2\20\u00ad\3\2\2\2\22\u0109"+
		"\3\2\2\2\24\u010b\3\2\2\2\26\u011d\3\2\2\2\30\u0125\3\2\2\2\32\u012d\3"+
		"\2\2\2\34\u012f\3\2\2\2\36\u0136\3\2\2\2 \u0141\3\2\2\2\"%\5\24\13\2#"+
		"%\5\4\3\2$\"\3\2\2\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\')\3\2\2"+
		"\2(&\3\2\2\2)*\5\b\5\2*+\b\2\1\2+\3\3\2\2\2,-\7\3\2\2-.\7+\2\2./\7\4\2"+
		"\2/\60\5\n\6\2\60\61\7\5\2\2\61\62\7\6\2\2\62\63\5\6\4\2\638\7\7\2\2\64"+
		"\67\5\24\13\2\65\67\5\22\n\2\66\64\3\2\2\2\66\65\3\2\2\2\67:\3\2\2\28"+
		"\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\7\b\2\2<=\b\3\1\2=\5\3\2\2"+
		"\2>?\5\32\16\2?@\b\4\1\2@D\3\2\2\2AB\7\t\2\2BD\b\4\1\2C>\3\2\2\2CA\3\2"+
		"\2\2D\7\3\2\2\2EF\7\3\2\2FG\7\n\2\2GH\7\4\2\2HI\7\5\2\2IN\7\7\2\2JM\5"+
		"\24\13\2KM\5\22\n\2LJ\3\2\2\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2"+
		"OQ\3\2\2\2PN\3\2\2\2QR\7\b\2\2RS\b\5\1\2S\t\3\2\2\2TV\5\f\7\2UT\3\2\2"+
		"\2UV\3\2\2\2V[\3\2\2\2WX\7\13\2\2XZ\5\f\7\2YW\3\2\2\2Z]\3\2\2\2[Y\3\2"+
		"\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\b\6\1\2_\13\3\2\2\2`a\7+\2\2ab"+
		"\7\6\2\2bc\5\26\f\2cd\b\7\1\2d\r\3\2\2\2ef\b\b\1\2fg\7*\2\2g|\b\b\1\2"+
		"hi\7,\2\2i|\b\b\1\2jk\7/\2\2k|\b\b\1\2lm\7+\2\2m|\b\b\1\2no\7\20\2\2o"+
		"p\5\16\b\tpq\b\b\1\2q|\3\2\2\2rs\7\21\2\2st\5\16\b\btu\b\b\1\2u|\3\2\2"+
		"\2vw\7\4\2\2wx\5\16\b\2xy\7\5\2\2yz\b\b\1\2z|\3\2\2\2{e\3\2\2\2{h\3\2"+
		"\2\2{j\3\2\2\2{l\3\2\2\2{n\3\2\2\2{r\3\2\2\2{v\3\2\2\2|\u00a9\3\2\2\2"+
		"}~\f\13\2\2~\177\7\16\2\2\177\u0080\5\16\b\f\u0080\u0081\b\b\1\2\u0081"+
		"\u00a8\3\2\2\2\u0082\u0083\f\7\2\2\u0083\u0084\t\2\2\2\u0084\u0085\5\16"+
		"\b\b\u0085\u0086\b\b\1\2\u0086\u00a8\3\2\2\2\u0087\u0088\f\6\2\2\u0088"+
		"\u0089\t\3\2\2\u0089\u008a\5\16\b\7\u008a\u008b\b\b\1\2\u008b\u00a8\3"+
		"\2\2\2\u008c\u008d\f\5\2\2\u008d\u008e\t\4\2\2\u008e\u008f\5\16\b\6\u008f"+
		"\u0090\b\b\1\2\u0090\u00a8\3\2\2\2\u0091\u0092\f\4\2\2\u0092\u0093\t\5"+
		"\2\2\u0093\u0094\5\16\b\5\u0094\u0095\b\b\1\2\u0095\u00a8\3\2\2\2\u0096"+
		"\u0097\f\r\2\2\u0097\u0098\7\4\2\2\u0098\u0099\5\20\t\2\u0099\u009a\7"+
		"\5\2\2\u009a\u009b\b\b\1\2\u009b\u00a8\3\2\2\2\u009c\u009d\f\f\2\2\u009d"+
		"\u009e\7\f\2\2\u009e\u009f\5\16\b\2\u009f\u00a0\7\r\2\2\u00a0\u00a1\b"+
		"\b\1\2\u00a1\u00a8\3\2\2\2\u00a2\u00a3\f\n\2\2\u00a3\u00a4\7\17\2\2\u00a4"+
		"\u00a5\5\32\16\2\u00a5\u00a6\b\b\1\2\u00a6\u00a8\3\2\2\2\u00a7}\3\2\2"+
		"\2\u00a7\u0082\3\2\2\2\u00a7\u0087\3\2\2\2\u00a7\u008c\3\2\2\2\u00a7\u0091"+
		"\3\2\2\2\u00a7\u0096\3\2\2\2\u00a7\u009c\3\2\2\2\u00a7\u00a2\3\2\2\2\u00a8"+
		"\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\17\3\2\2"+
		"\2\u00ab\u00a9\3\2\2\2\u00ac\u00ae\5\16\b\2\u00ad\u00ac\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00b3\3\2\2\2\u00af\u00b0\7\13\2\2\u00b0\u00b2\5"+
		"\16\b\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\b\t"+
		"\1\2\u00b7\21\3\2\2\2\u00b8\u00b9\7\36\2\2\u00b9\u00be\5\16\b\2\u00ba"+
		"\u00bb\7\13\2\2\u00bb\u00bd\5\16\b\2\u00bc\u00ba\3\2\2\2\u00bd\u00c0\3"+
		"\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c1\u00c2\b\n\1\2\u00c2\u010a\3\2\2\2\u00c3\u00c4\7\37"+
		"\2\2\u00c4\u00c9\5\16\b\2\u00c5\u00c6\7\13\2\2\u00c6\u00c8\5\16\b\2\u00c7"+
		"\u00c5\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\b\n\1\2\u00cd"+
		"\u010a\3\2\2\2\u00ce\u00cf\5\16\b\2\u00cf\u00d0\7 \2\2\u00d0\u00d1\5\16"+
		"\b\2\u00d1\u00d2\b\n\1\2\u00d2\u010a\3\2\2\2\u00d3\u00d5\7!\2\2\u00d4"+
		"\u00d6\5\16\b\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3"+
		"\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00de\7\7\2\2\u00da"+
		"\u00dd\5\16\b\2\u00db\u00dd\5\22\n\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3"+
		"\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00e9\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e6\7\"\2\2\u00e2\u00e5\5\16"+
		"\b\2\u00e3\u00e5\5\22\n\2\u00e4\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5"+
		"\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00ea\3\2"+
		"\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00e1\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ec\7\b\2\2\u00ec\u00ed\b\n\1\2\u00ed\u010a\3\2"+
		"\2\2\u00ee\u00f0\7#\2\2\u00ef\u00f1\5\16\b\2\u00f0\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\u00f9\7\7\2\2\u00f5\u00f8\5\16\b\2\u00f6\u00f8\5\22\n\2\u00f7"+
		"\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2"+
		"\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc"+
		"\u00fd\b\n\1\2\u00fd\u00fe\7\b\2\2\u00fe\u010a\3\2\2\2\u00ff\u0100\7$"+
		"\2\2\u0100\u0101\5\16\b\2\u0101\u0102\b\n\1\2\u0102\u010a\3\2\2\2\u0103"+
		"\u0104\5\16\b\2\u0104\u0105\7\4\2\2\u0105\u0106\5\20\t\2\u0106\u0107\7"+
		"\5\2\2\u0107\u0108\b\n\1\2\u0108\u010a\3\2\2\2\u0109\u00b8\3\2\2\2\u0109"+
		"\u00c3\3\2\2\2\u0109\u00ce\3\2\2\2\u0109\u00d3\3\2\2\2\u0109\u00ee\3\2"+
		"\2\2\u0109\u00ff\3\2\2\2\u0109\u0103\3\2\2\2\u010a\23\3\2\2\2\u010b\u0110"+
		"\7+\2\2\u010c\u010d\7\13\2\2\u010d\u010f\7+\2\2\u010e\u010c\3\2\2\2\u010f"+
		"\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0113\3\2"+
		"\2\2\u0112\u0110\3\2\2\2\u0113\u0114\7\6\2\2\u0114\u0115\5\26\f\2\u0115"+
		"\u0116\b\13\1\2\u0116\25\3\2\2\2\u0117\u0118\5\32\16\2\u0118\u0119\b\f"+
		"\1\2\u0119\u011e\3\2\2\2\u011a\u011b\5\30\r\2\u011b\u011c\b\f\1\2\u011c"+
		"\u011e\3\2\2\2\u011d\u0117\3\2\2\2\u011d\u011a\3\2\2\2\u011e\27\3\2\2"+
		"\2\u011f\u0120\5\34\17\2\u0120\u0121\b\r\1\2\u0121\u0126\3\2\2\2\u0122"+
		"\u0123\5\36\20\2\u0123\u0124\b\r\1\2\u0124\u0126\3\2\2\2\u0125\u011f\3"+
		"\2\2\2\u0125\u0122\3\2\2\2\u0126\31\3\2\2\2\u0127\u0128\7%\2\2\u0128\u012e"+
		"\b\16\1\2\u0129\u012a\7&\2\2\u012a\u012e\b\16\1\2\u012b\u012c\7\'\2\2"+
		"\u012c\u012e\b\16\1\2\u012d\u0127\3\2\2\2\u012d\u0129\3\2\2\2\u012d\u012b"+
		"\3\2\2\2\u012e\33\3\2\2\2\u012f\u0130\7\f\2\2\u0130\u0131\7*\2\2\u0131"+
		"\u0132\7\6\2\2\u0132\u0133\5\26\f\2\u0133\u0134\7\r\2\2\u0134\u0135\b"+
		"\17\1\2\u0135\35\3\2\2\2\u0136\u0137\7(\2\2\u0137\u013b\7\7\2\2\u0138"+
		"\u013a\5 \21\2\u0139\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2"+
		"\2\2\u013b\u013c\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013b\3\2\2\2\u013e"+
		"\u013f\7\b\2\2\u013f\u0140\b\20\1\2\u0140\37\3\2\2\2\u0141\u0146\7+\2"+
		"\2\u0142\u0143\7\13\2\2\u0143\u0145\7+\2\2\u0144\u0142\3\2\2\2\u0145\u0148"+
		"\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0149\u014a\7\6\2\2\u014a\u014b\5\26\f\2\u014b\u014c\b"+
		"\21\1\2\u014c!\3\2\2\2\"$&\668CLNU[{\u00a7\u00a9\u00ad\u00b3\u00be\u00c9"+
		"\u00d7\u00dc\u00de\u00e4\u00e6\u00e9\u00f2\u00f7\u00f9\u0109\u0110\u011d"+
		"\u0125\u012d\u013b\u0146";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}