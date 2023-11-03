// Generated from c:/Users/cjrba/OneDrive/Documentos/Universidad/2023Parte2/Compiladores/Sprint3-GeneracionDeCodigoEnsamblador-ConstruccionDeCompiladores/YAPL.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class YAPLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, OPEN_COMMENT=11, CLOSE_COMMENT=12, COMMENT=13, ONE_LINE_COMMENT=14, 
		WHITESPACE=15, CLASS=16, INHERITS=17, TRUE=18, FALSE=19, ASSIGNMENT=20, 
		IF=21, ELSE=22, THEN=23, FI=24, WHILE=25, LOOP=26, POOL=27, LET=28, IN=29, 
		CASE=30, OF=31, ESAC=32, CASEARR=33, NEW=34, ISVOID=35, ADD=36, MINUS=37, 
		MULT=38, DIV=39, NOT=40, LT=41, LE=42, EQ=43, TYPE=44, STR=45, ID=46, 
		INT=47;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_class_exp = 2, RULE_feature = 3, 
		RULE_formal = 4, RULE_declaration = 5, RULE_expr = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "program", "class_exp", "feature", "formal", "declaration", 
			"expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "'('", "','", "')'", "':'", "'@'", "'.'", 
			"'~'", "'(*'", "'*)'", null, null, null, null, null, null, null, "'<-'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'=>'", null, null, "'+'", "'-'", "'*'", "'/'", null, "'<'", "'<='", 
			"'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "OPEN_COMMENT", 
			"CLOSE_COMMENT", "COMMENT", "ONE_LINE_COMMENT", "WHITESPACE", "CLASS", 
			"INHERITS", "TRUE", "FALSE", "ASSIGNMENT", "IF", "ELSE", "THEN", "FI", 
			"WHILE", "LOOP", "POOL", "LET", "IN", "CASE", "OF", "ESAC", "CASEARR", 
			"NEW", "ISVOID", "ADD", "MINUS", "MULT", "DIV", "NOT", "LT", "LE", "EQ", 
			"TYPE", "STR", "ID", "INT"
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
	public String getGrammarFileName() { return "YAPL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public YAPLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode EOF() { return getToken(YAPLParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			program();
			setState(15);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EndContext extends ProgramContext {
		public TerminalNode EOF() { return getToken(YAPLParser.EOF, 0); }
		public EndContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitEnd(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Class_listContext extends ProgramContext {
		public Class_expContext class_exp() {
			return getRuleContext(Class_expContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public Class_listContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterClass_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitClass_list(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			setState(22);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				_localctx = new Class_listContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				class_exp();
				setState(18);
				match(T__0);
				setState(19);
				program();
				}
				break;
			case EOF:
				_localctx = new EndContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Class_expContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(YAPLParser.CLASS, 0); }
		public List<TerminalNode> TYPE() { return getTokens(YAPLParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(YAPLParser.TYPE, i);
		}
		public TerminalNode INHERITS() { return getToken(YAPLParser.INHERITS, 0); }
		public List<FeatureContext> feature() {
			return getRuleContexts(FeatureContext.class);
		}
		public FeatureContext feature(int i) {
			return getRuleContext(FeatureContext.class,i);
		}
		public Class_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterClass_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitClass_exp(this);
		}
	}

	public final Class_expContext class_exp() throws RecognitionException {
		Class_expContext _localctx = new Class_expContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(CLASS);
			setState(25);
			match(TYPE);
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(26);
				match(INHERITS);
				setState(27);
				match(TYPE);
				}
			}

			setState(30);
			match(T__1);
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(31);
				feature();
				setState(32);
				match(T__0);
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FeatureContext extends ParserRuleContext {
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
	 
		public FeatureContext() { }
		public void copyFrom(FeatureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodContext extends FeatureContext {
		public TerminalNode ID() { return getToken(YAPLParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(YAPLParser.TYPE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public MethodContext(FeatureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitMethod(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends FeatureContext {
		public TerminalNode ID() { return getToken(YAPLParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(YAPLParser.TYPE, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(YAPLParser.ASSIGNMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AttributeContext(FeatureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitAttribute(this);
		}
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_feature);
		int _la;
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new MethodContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(ID);
				setState(42);
				match(T__3);
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(43);
					formal();
					setState(48);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(44);
						match(T__4);
						setState(45);
						formal();
						}
						}
						setState(50);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(55);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(56);
				match(T__5);
				setState(57);
				match(T__6);
				setState(58);
				match(TYPE);
				setState(59);
				match(T__1);
				setState(60);
				expr(0);
				setState(61);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new AttributeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(ID);
				setState(64);
				match(T__6);
				setState(65);
				match(TYPE);
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGNMENT) {
					{
					setState(66);
					match(ASSIGNMENT);
					setState(67);
					expr(0);
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class FormalContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(YAPLParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(YAPLParser.TYPE, 0); }
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterFormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitFormal(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(ID);
			setState(73);
			match(T__6);
			setState(74);
			match(TYPE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(YAPLParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(YAPLParser.TYPE, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(YAPLParser.ASSIGNMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(ID);
			setState(77);
			match(T__6);
			setState(78);
			match(TYPE);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(79);
				match(ASSIGNMENT);
				setState(80);
				expr(0);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LetInContext extends ExprContext {
		public TerminalNode LET() { return getToken(YAPLParser.LET, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public TerminalNode IN() { return getToken(YAPLParser.IN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LetInContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterLetIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitLetIn(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(YAPLParser.MINUS, 0); }
		public MinusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitMinus(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegationContext extends ExprContext {
		public TerminalNode NOT() { return getToken(YAPLParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegationContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitNegation(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DispatchContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(YAPLParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(YAPLParser.TYPE, 0); }
		public DispatchContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterDispatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitDispatch(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ExprContext {
		public TerminalNode WHILE() { return getToken(YAPLParser.WHILE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LOOP() { return getToken(YAPLParser.LOOP, 0); }
		public TerminalNode POOL() { return getToken(YAPLParser.POOL, 0); }
		public WhileContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitWhile(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivisionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(YAPLParser.DIV, 0); }
		public DivisionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitDivision(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewObjectContext extends ExprContext {
		public TerminalNode NEW() { return getToken(YAPLParser.NEW, 0); }
		public TerminalNode TYPE() { return getToken(YAPLParser.TYPE, 0); }
		public NewObjectContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterNewObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitNewObject(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessThanContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(YAPLParser.LT, 0); }
		public LessThanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitLessThan(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BlockContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitBlock(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegIntegerContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegIntegerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterNegInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitNegInteger(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(YAPLParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitId(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ExprContext {
		public TerminalNode IF() { return getToken(YAPLParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(YAPLParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(YAPLParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(YAPLParser.FI, 0); }
		public IfContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitIf(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CaseContext extends ExprContext {
		public TerminalNode CASE() { return getToken(YAPLParser.CASE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OF() { return getToken(YAPLParser.OF, 0); }
		public TerminalNode ESAC() { return getToken(YAPLParser.ESAC, 0); }
		public List<TerminalNode> ID() { return getTokens(YAPLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(YAPLParser.ID, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(YAPLParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(YAPLParser.TYPE, i);
		}
		public List<TerminalNode> CASEARR() { return getTokens(YAPLParser.CASEARR); }
		public TerminalNode CASEARR(int i) {
			return getToken(YAPLParser.CASEARR, i);
		}
		public CaseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitCase(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(YAPLParser.ADD, 0); }
		public AddContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitAdd(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(YAPLParser.MULT, 0); }
		public StarContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitStar(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ExprContext {
		public TerminalNode ID() { return getToken(YAPLParser.ID, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(YAPLParser.ASSIGNMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitAssignment(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(YAPLParser.FALSE, 0); }
		public FalseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitFalse(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesisContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitParenthesis(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(YAPLParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitInt(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallContext extends ExprContext {
		public TerminalNode ID() { return getToken(YAPLParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitCall(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrContext extends ExprContext {
		public TerminalNode STR() { return getToken(YAPLParser.STR, 0); }
		public StrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitStr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(YAPLParser.EQ, 0); }
		public EqualContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitEqual(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IsVoidContext extends ExprContext {
		public TerminalNode ISVOID() { return getToken(YAPLParser.ISVOID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IsVoidContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterIsVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitIsVoid(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(YAPLParser.TRUE, 0); }
		public TrueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitTrue(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessEqualContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LE() { return getToken(YAPLParser.LE, 0); }
		public LessEqualContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterLessEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitLessEqual(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(84);
				match(ID);
				setState(85);
				match(T__3);
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 247443034473492L) != 0)) {
					{
					{
					setState(86);
					expr(0);
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(87);
						match(T__4);
						setState(88);
						expr(0);
						}
						}
						setState(93);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(99);
				match(T__5);
				}
				break;
			case 2:
				{
				_localctx = new IfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				match(IF);
				setState(101);
				expr(0);
				setState(102);
				match(THEN);
				setState(103);
				expr(0);
				setState(104);
				match(ELSE);
				setState(105);
				expr(0);
				setState(106);
				match(FI);
				}
				break;
			case 3:
				{
				_localctx = new WhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				match(WHILE);
				setState(109);
				expr(0);
				setState(110);
				match(LOOP);
				setState(111);
				expr(0);
				setState(112);
				match(POOL);
				}
				break;
			case 4:
				{
				_localctx = new BlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				match(T__1);
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(115);
					expr(0);
					setState(116);
					match(T__0);
					}
					}
					setState(120); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 247443034473492L) != 0) );
				setState(122);
				match(T__2);
				}
				break;
			case 5:
				{
				_localctx = new LetInContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				match(LET);
				setState(125);
				declaration();
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(126);
					match(T__4);
					setState(127);
					declaration();
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(133);
				match(IN);
				setState(134);
				expr(20);
				}
				break;
			case 6:
				{
				_localctx = new CaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				match(CASE);
				setState(137);
				expr(0);
				setState(138);
				match(OF);
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(139);
					match(ID);
					setState(140);
					match(T__6);
					setState(141);
					match(TYPE);
					setState(142);
					match(CASEARR);
					setState(143);
					expr(0);
					setState(144);
					match(T__0);
					}
					}
					setState(148); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(150);
				match(ESAC);
				}
				break;
			case 7:
				{
				_localctx = new NewObjectContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(152);
				match(NEW);
				setState(153);
				match(TYPE);
				}
				break;
			case 8:
				{
				_localctx = new IsVoidContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				match(ISVOID);
				setState(155);
				expr(17);
				}
				break;
			case 9:
				{
				_localctx = new NegIntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				match(T__9);
				setState(157);
				expr(12);
				}
				break;
			case 10:
				{
				_localctx = new NegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				match(NOT);
				setState(159);
				expr(8);
				}
				break;
			case 11:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				match(T__3);
				setState(161);
				expr(0);
				setState(162);
				match(T__5);
				}
				break;
			case 12:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				match(INT);
				}
				break;
			case 13:
				{
				_localctx = new StrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				match(STR);
				}
				break;
			case 14:
				{
				_localctx = new TrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				match(TRUE);
				}
				break;
			case 15:
				{
				_localctx = new FalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				match(FALSE);
				}
				break;
			case 16:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				match(ID);
				}
				break;
			case 17:
				{
				_localctx = new AssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				match(ID);
				setState(170);
				match(ASSIGNMENT);
				setState(171);
				expr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(217);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new StarContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(174);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(175);
						match(MULT);
						setState(176);
						expr(17);
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(178);
						match(DIV);
						setState(179);
						expr(16);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(181);
						match(ADD);
						setState(182);
						expr(15);
						}
						break;
					case 4:
						{
						_localctx = new MinusContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(183);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(184);
						match(MINUS);
						setState(185);
						expr(14);
						}
						break;
					case 5:
						{
						_localctx = new LessThanContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(186);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(187);
						match(LT);
						setState(188);
						expr(12);
						}
						break;
					case 6:
						{
						_localctx = new LessEqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(189);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(190);
						match(LE);
						setState(191);
						expr(11);
						}
						break;
					case 7:
						{
						_localctx = new EqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(192);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(193);
						match(EQ);
						setState(194);
						expr(10);
						}
						break;
					case 8:
						{
						_localctx = new DispatchContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(195);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(198);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__7) {
							{
							setState(196);
							match(T__7);
							setState(197);
							match(TYPE);
							}
						}

						setState(200);
						match(T__8);
						setState(201);
						match(ID);
						setState(202);
						match(T__3);
						setState(213);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 247443034473492L) != 0)) {
							{
							{
							setState(203);
							expr(0);
							setState(208);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__4) {
								{
								{
								setState(204);
								match(T__4);
								setState(205);
								expr(0);
								}
								}
								setState(210);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							}
							setState(215);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(216);
						match(T__5);
						}
						break;
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 25);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001/\u00df\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u0017\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u001d\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002#\b\u0002\n\u0002\f\u0002&\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003/\b"+
		"\u0003\n\u0003\f\u00032\t\u0003\u0005\u00034\b\u0003\n\u0003\f\u00037"+
		"\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003E\b\u0003\u0003\u0003G\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005R\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006Z\b\u0006\n\u0006\f\u0006"+
		"]\t\u0006\u0005\u0006_\b\u0006\n\u0006\f\u0006b\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004"+
		"\u0006w\b\u0006\u000b\u0006\f\u0006x\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0081\b\u0006\n\u0006"+
		"\f\u0006\u0084\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u0093\b\u0006\u000b\u0006"+
		"\f\u0006\u0094\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00ad\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00c7\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00cf\b\u0006\n\u0006"+
		"\f\u0006\u00d2\t\u0006\u0005\u0006\u00d4\b\u0006\n\u0006\f\u0006\u00d7"+
		"\t\u0006\u0001\u0006\u0005\u0006\u00da\b\u0006\n\u0006\f\u0006\u00dd\t"+
		"\u0006\u0001\u0006\u0000\u0001\f\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000"+
		"\u0000\u00ff\u0000\u000e\u0001\u0000\u0000\u0000\u0002\u0016\u0001\u0000"+
		"\u0000\u0000\u0004\u0018\u0001\u0000\u0000\u0000\u0006F\u0001\u0000\u0000"+
		"\u0000\bH\u0001\u0000\u0000\u0000\nL\u0001\u0000\u0000\u0000\f\u00ac\u0001"+
		"\u0000\u0000\u0000\u000e\u000f\u0003\u0002\u0001\u0000\u000f\u0010\u0005"+
		"\u0000\u0000\u0001\u0010\u0001\u0001\u0000\u0000\u0000\u0011\u0012\u0003"+
		"\u0004\u0002\u0000\u0012\u0013\u0005\u0001\u0000\u0000\u0013\u0014\u0003"+
		"\u0002\u0001\u0000\u0014\u0017\u0001\u0000\u0000\u0000\u0015\u0017\u0005"+
		"\u0000\u0000\u0001\u0016\u0011\u0001\u0000\u0000\u0000\u0016\u0015\u0001"+
		"\u0000\u0000\u0000\u0017\u0003\u0001\u0000\u0000\u0000\u0018\u0019\u0005"+
		"\u0010\u0000\u0000\u0019\u001c\u0005,\u0000\u0000\u001a\u001b\u0005\u0011"+
		"\u0000\u0000\u001b\u001d\u0005,\u0000\u0000\u001c\u001a\u0001\u0000\u0000"+
		"\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000"+
		"\u0000\u001e$\u0005\u0002\u0000\u0000\u001f \u0003\u0006\u0003\u0000 "+
		"!\u0005\u0001\u0000\u0000!#\u0001\u0000\u0000\u0000\"\u001f\u0001\u0000"+
		"\u0000\u0000#&\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001"+
		"\u0000\u0000\u0000%\'\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000"+
		"\'(\u0005\u0003\u0000\u0000(\u0005\u0001\u0000\u0000\u0000)*\u0005.\u0000"+
		"\u0000*5\u0005\u0004\u0000\u0000+0\u0003\b\u0004\u0000,-\u0005\u0005\u0000"+
		"\u0000-/\u0003\b\u0004\u0000.,\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000"+
		"\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000014\u0001\u0000"+
		"\u0000\u000020\u0001\u0000\u0000\u00003+\u0001\u0000\u0000\u000047\u0001"+
		"\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u0000"+
		"68\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000089\u0005\u0006\u0000"+
		"\u00009:\u0005\u0007\u0000\u0000:;\u0005,\u0000\u0000;<\u0005\u0002\u0000"+
		"\u0000<=\u0003\f\u0006\u0000=>\u0005\u0003\u0000\u0000>G\u0001\u0000\u0000"+
		"\u0000?@\u0005.\u0000\u0000@A\u0005\u0007\u0000\u0000AD\u0005,\u0000\u0000"+
		"BC\u0005\u0014\u0000\u0000CE\u0003\f\u0006\u0000DB\u0001\u0000\u0000\u0000"+
		"DE\u0001\u0000\u0000\u0000EG\u0001\u0000\u0000\u0000F)\u0001\u0000\u0000"+
		"\u0000F?\u0001\u0000\u0000\u0000G\u0007\u0001\u0000\u0000\u0000HI\u0005"+
		".\u0000\u0000IJ\u0005\u0007\u0000\u0000JK\u0005,\u0000\u0000K\t\u0001"+
		"\u0000\u0000\u0000LM\u0005.\u0000\u0000MN\u0005\u0007\u0000\u0000NQ\u0005"+
		",\u0000\u0000OP\u0005\u0014\u0000\u0000PR\u0003\f\u0006\u0000QO\u0001"+
		"\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000R\u000b\u0001\u0000\u0000"+
		"\u0000ST\u0006\u0006\uffff\uffff\u0000TU\u0005.\u0000\u0000U`\u0005\u0004"+
		"\u0000\u0000V[\u0003\f\u0006\u0000WX\u0005\u0005\u0000\u0000XZ\u0003\f"+
		"\u0006\u0000YW\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000"+
		"][\u0001\u0000\u0000\u0000^V\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000"+
		"\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ac\u0001\u0000"+
		"\u0000\u0000b`\u0001\u0000\u0000\u0000c\u00ad\u0005\u0006\u0000\u0000"+
		"de\u0005\u0015\u0000\u0000ef\u0003\f\u0006\u0000fg\u0005\u0017\u0000\u0000"+
		"gh\u0003\f\u0006\u0000hi\u0005\u0016\u0000\u0000ij\u0003\f\u0006\u0000"+
		"jk\u0005\u0018\u0000\u0000k\u00ad\u0001\u0000\u0000\u0000lm\u0005\u0019"+
		"\u0000\u0000mn\u0003\f\u0006\u0000no\u0005\u001a\u0000\u0000op\u0003\f"+
		"\u0006\u0000pq\u0005\u001b\u0000\u0000q\u00ad\u0001\u0000\u0000\u0000"+
		"rv\u0005\u0002\u0000\u0000st\u0003\f\u0006\u0000tu\u0005\u0001\u0000\u0000"+
		"uw\u0001\u0000\u0000\u0000vs\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000"+
		"\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0001\u0000"+
		"\u0000\u0000z{\u0005\u0003\u0000\u0000{\u00ad\u0001\u0000\u0000\u0000"+
		"|}\u0005\u001c\u0000\u0000}\u0082\u0003\n\u0005\u0000~\u007f\u0005\u0005"+
		"\u0000\u0000\u007f\u0081\u0003\n\u0005\u0000\u0080~\u0001\u0000\u0000"+
		"\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0085\u0001\u0000\u0000"+
		"\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u001d\u0000"+
		"\u0000\u0086\u0087\u0003\f\u0006\u0014\u0087\u00ad\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0005\u001e\u0000\u0000\u0089\u008a\u0003\f\u0006\u0000\u008a"+
		"\u0092\u0005\u001f\u0000\u0000\u008b\u008c\u0005.\u0000\u0000\u008c\u008d"+
		"\u0005\u0007\u0000\u0000\u008d\u008e\u0005,\u0000\u0000\u008e\u008f\u0005"+
		"!\u0000\u0000\u008f\u0090\u0003\f\u0006\u0000\u0090\u0091\u0005\u0001"+
		"\u0000\u0000\u0091\u0093\u0001\u0000\u0000\u0000\u0092\u008b\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0005 \u0000\u0000\u0097\u00ad\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0005\"\u0000\u0000\u0099\u00ad\u0005,\u0000\u0000"+
		"\u009a\u009b\u0005#\u0000\u0000\u009b\u00ad\u0003\f\u0006\u0011\u009c"+
		"\u009d\u0005\n\u0000\u0000\u009d\u00ad\u0003\f\u0006\f\u009e\u009f\u0005"+
		"(\u0000\u0000\u009f\u00ad\u0003\f\u0006\b\u00a0\u00a1\u0005\u0004\u0000"+
		"\u0000\u00a1\u00a2\u0003\f\u0006\u0000\u00a2\u00a3\u0005\u0006\u0000\u0000"+
		"\u00a3\u00ad\u0001\u0000\u0000\u0000\u00a4\u00ad\u0005/\u0000\u0000\u00a5"+
		"\u00ad\u0005-\u0000\u0000\u00a6\u00ad\u0005\u0012\u0000\u0000\u00a7\u00ad"+
		"\u0005\u0013\u0000\u0000\u00a8\u00ad\u0005.\u0000\u0000\u00a9\u00aa\u0005"+
		".\u0000\u0000\u00aa\u00ab\u0005\u0014\u0000\u0000\u00ab\u00ad\u0003\f"+
		"\u0006\u0001\u00acS\u0001\u0000\u0000\u0000\u00acd\u0001\u0000\u0000\u0000"+
		"\u00acl\u0001\u0000\u0000\u0000\u00acr\u0001\u0000\u0000\u0000\u00ac|"+
		"\u0001\u0000\u0000\u0000\u00ac\u0088\u0001\u0000\u0000\u0000\u00ac\u0098"+
		"\u0001\u0000\u0000\u0000\u00ac\u009a\u0001\u0000\u0000\u0000\u00ac\u009c"+
		"\u0001\u0000\u0000\u0000\u00ac\u009e\u0001\u0000\u0000\u0000\u00ac\u00a0"+
		"\u0001\u0000\u0000\u0000\u00ac\u00a4\u0001\u0000\u0000\u0000\u00ac\u00a5"+
		"\u0001\u0000\u0000\u0000\u00ac\u00a6\u0001\u0000\u0000\u0000\u00ac\u00a7"+
		"\u0001\u0000\u0000\u0000\u00ac\u00a8\u0001\u0000\u0000\u0000\u00ac\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ad\u00db\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\n\u0010\u0000\u0000\u00af\u00b0\u0005&\u0000\u0000\u00b0\u00da\u0003"+
		"\f\u0006\u0011\u00b1\u00b2\n\u000f\u0000\u0000\u00b2\u00b3\u0005\'\u0000"+
		"\u0000\u00b3\u00da\u0003\f\u0006\u0010\u00b4\u00b5\n\u000e\u0000\u0000"+
		"\u00b5\u00b6\u0005$\u0000\u0000\u00b6\u00da\u0003\f\u0006\u000f\u00b7"+
		"\u00b8\n\r\u0000\u0000\u00b8\u00b9\u0005%\u0000\u0000\u00b9\u00da\u0003"+
		"\f\u0006\u000e\u00ba\u00bb\n\u000b\u0000\u0000\u00bb\u00bc\u0005)\u0000"+
		"\u0000\u00bc\u00da\u0003\f\u0006\f\u00bd\u00be\n\n\u0000\u0000\u00be\u00bf"+
		"\u0005*\u0000\u0000\u00bf\u00da\u0003\f\u0006\u000b\u00c0\u00c1\n\t\u0000"+
		"\u0000\u00c1\u00c2\u0005+\u0000\u0000\u00c2\u00da\u0003\f\u0006\n\u00c3"+
		"\u00c6\n\u0019\u0000\u0000\u00c4\u00c5\u0005\b\u0000\u0000\u00c5\u00c7"+
		"\u0005,\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005"+
		"\t\u0000\u0000\u00c9\u00ca\u0005.\u0000\u0000\u00ca\u00d5\u0005\u0004"+
		"\u0000\u0000\u00cb\u00d0\u0003\f\u0006\u0000\u00cc\u00cd\u0005\u0005\u0000"+
		"\u0000\u00cd\u00cf\u0003\f\u0006\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00cb\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8\u00da\u0005\u0006\u0000\u0000"+
		"\u00d9\u00ae\u0001\u0000\u0000\u0000\u00d9\u00b1\u0001\u0000\u0000\u0000"+
		"\u00d9\u00b4\u0001\u0000\u0000\u0000\u00d9\u00b7\u0001\u0000\u0000\u0000"+
		"\u00d9\u00ba\u0001\u0000\u0000\u0000\u00d9\u00bd\u0001\u0000\u0000\u0000"+
		"\u00d9\u00c0\u0001\u0000\u0000\u0000\u00d9\u00c3\u0001\u0000\u0000\u0000"+
		"\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000"+
		"\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\r\u0001\u0000\u0000\u0000\u00dd"+
		"\u00db\u0001\u0000\u0000\u0000\u0013\u0016\u001c$05DFQ[`x\u0082\u0094"+
		"\u00ac\u00c6\u00d0\u00d5\u00d9\u00db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}