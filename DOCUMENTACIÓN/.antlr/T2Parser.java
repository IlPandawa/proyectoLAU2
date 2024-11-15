// Generated from c:/Users/HP/OneDrive - Instituto Tecnológico de Morelia/UNIVERSIDAD/8 SEMESTRE/Lenguajes y Automatas II/UNIDAD 2/PROYECTO/proyectoU2/DOCUMENTACIÓN/T2.g by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class T2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CERRAR=1, NUMERICO=2, ALFABETICO=3, FECHA=4, TABLA=5, INICIO=6, FIN=7, 
		USAR=8, CREAR=9, ID=10, WS=11;
	public static final int
		RULE_inicio = 0, RULE_creacion = 1, RULE_usar = 2, RULE_tabla = 3, RULE_campo = 4, 
		RULE_cerrar = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "creacion", "usar", "tabla", "campo", "cerrar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'cerrar'", "'numeros'", "'letras'", "'fecha'", "'tabla'", "'inicio'", 
			"'fin'", "'usar'", "'crear'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CERRAR", "NUMERICO", "ALFABETICO", "FECHA", "TABLA", "INICIO", 
			"FIN", "USAR", "CREAR", "ID", "WS"
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
	public String getGrammarFileName() { return "T2.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public T2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InicioContext extends ParserRuleContext {
		public CreacionContext creacion() {
			return getRuleContext(CreacionContext.class,0);
		}
		public UsarContext usar() {
			return getRuleContext(UsarContext.class,0);
		}
		public CerrarContext cerrar() {
			return getRuleContext(CerrarContext.class,0);
		}
		public List<TablaContext> tabla() {
			return getRuleContexts(TablaContext.class);
		}
		public TablaContext tabla(int i) {
			return getRuleContext(TablaContext.class,i);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			creacion();
			setState(13);
			usar();
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				tabla();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TABLA );
			setState(19);
			cerrar();
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
	public static class CreacionContext extends ParserRuleContext {
		public TerminalNode CREAR() { return getToken(T2Parser.CREAR, 0); }
		public TerminalNode ID() { return getToken(T2Parser.ID, 0); }
		public CreacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creacion; }
	}

	public final CreacionContext creacion() throws RecognitionException {
		CreacionContext _localctx = new CreacionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_creacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(CREAR);
			setState(22);
			match(ID);
			System.out.println("CREATE DATABASE "+(((CreacionContext)_localctx).ID!=null?((CreacionContext)_localctx).ID.getText():null)); 
			                    
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
	public static class UsarContext extends ParserRuleContext {
		public TerminalNode USAR() { return getToken(T2Parser.USAR, 0); }
		public TerminalNode ID() { return getToken(T2Parser.ID, 0); }
		public UsarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usar; }
	}

	public final UsarContext usar() throws RecognitionException {
		UsarContext _localctx = new UsarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_usar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(USAR);
			setState(26);
			match(ID);
			System.out.println("USE DATABASE "+(((UsarContext)_localctx).ID!=null?((UsarContext)_localctx).ID.getText():null)); 
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
	public static class TablaContext extends ParserRuleContext {
		public TerminalNode TABLA() { return getToken(T2Parser.TABLA, 0); }
		public TerminalNode ID() { return getToken(T2Parser.ID, 0); }
		public TerminalNode INICIO() { return getToken(T2Parser.INICIO, 0); }
		public TerminalNode FIN() { return getToken(T2Parser.FIN, 0); }
		public List<CampoContext> campo() {
			return getRuleContexts(CampoContext.class);
		}
		public CampoContext campo(int i) {
			return getRuleContext(CampoContext.class,i);
		}
		public TablaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabla; }
	}

	public final TablaContext tabla() throws RecognitionException {
		TablaContext _localctx = new TablaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tabla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(TABLA);
			setState(30);
			match(ID);
			setState(31);
			match(INICIO);
			 
			                    //código para generar SQL
			      System.out.println("CREATE TABLE "+(((TablaContext)_localctx).ID!=null?((TablaContext)_localctx).ID.getText():null) ); 
			      System.out.println(" ("+(((TablaContext)_localctx).ID!=null?((TablaContext)_localctx).ID.getText():null)+"_key INTEGER AUTOINCREMENT NOT NULL"); 
			                     //código para crear estructura de datos
			                       
			                     //
			                   
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(33);
				campo();
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(38);
			match(FIN);

			                     System.out.println("   );   "); 
			                  
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
	public static class CampoContext extends ParserRuleContext {
		public Token t;
		public TerminalNode ID() { return getToken(T2Parser.ID, 0); }
		public TerminalNode NUMERICO() { return getToken(T2Parser.NUMERICO, 0); }
		public TerminalNode ALFABETICO() { return getToken(T2Parser.ALFABETICO, 0); }
		public TerminalNode FECHA() { return getToken(T2Parser.FECHA, 0); }
		public CampoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campo; }
	}

	public final CampoContext campo() throws RecognitionException {
		CampoContext _localctx = new CampoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_campo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(ID);
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERICO:
				{
				setState(42);
				((CampoContext)_localctx).t = match(NUMERICO);
				}
				break;
			case ALFABETICO:
				{
				setState(43);
				((CampoContext)_localctx).t = match(ALFABETICO);
				}
				break;
			case FECHA:
				{
				setState(44);
				((CampoContext)_localctx).t = match(FECHA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 //aquí hay que agregar código para generar SQL
			                    if(((((CampoContext)_localctx).t!=null?((CampoContext)_localctx).t.getText():null)).compareTo("letras")==0) 
			                       System.out.println(", "+(((CampoContext)_localctx).ID!=null?((CampoContext)_localctx).ID.getText():null) + " VARCHAR(300)" ); 
			                    else if(((((CampoContext)_localctx).t!=null?((CampoContext)_localctx).t.getText():null)).compareTo("numeros")==0) 
			                       System.out.println(", "+(((CampoContext)_localctx).ID!=null?((CampoContext)_localctx).ID.getText():null) + " INTEGER" ); 
			                    else if(((((CampoContext)_localctx).t!=null?((CampoContext)_localctx).t.getText():null)).compareTo("fecha")==0) 
			                       System.out.println(", "+(((CampoContext)_localctx).ID!=null?((CampoContext)_localctx).ID.getText():null) + " DATE" ); 
			                    else
			                       System.out.println(", "+(((CampoContext)_localctx).ID!=null?((CampoContext)_localctx).ID.getText():null) + " " +(((CampoContext)_localctx).t!=null?((CampoContext)_localctx).t.getText():null) );  
			                
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
	public static class CerrarContext extends ParserRuleContext {
		public TerminalNode CERRAR() { return getToken(T2Parser.CERRAR, 0); }
		public CerrarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cerrar; }
	}

	public final CerrarContext cerrar() throws RecognitionException {
		CerrarContext _localctx = new CerrarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cerrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(CERRAR);
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

	public static final String _serializedATN =
		"\u0004\u0001\u000b4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0010"+
		"\b\u0000\u000b\u0000\f\u0000\u0011\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0004\u0003#\b\u0003\u000b\u0003\f\u0003$\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004.\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0000"+
		"\u0000\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u00001\u0000\f\u0001\u0000"+
		"\u0000\u0000\u0002\u0015\u0001\u0000\u0000\u0000\u0004\u0019\u0001\u0000"+
		"\u0000\u0000\u0006\u001d\u0001\u0000\u0000\u0000\b)\u0001\u0000\u0000"+
		"\u0000\n1\u0001\u0000\u0000\u0000\f\r\u0003\u0002\u0001\u0000\r\u000f"+
		"\u0003\u0004\u0002\u0000\u000e\u0010\u0003\u0006\u0003\u0000\u000f\u000e"+
		"\u0001\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u000f"+
		"\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0013"+
		"\u0001\u0000\u0000\u0000\u0013\u0014\u0003\n\u0005\u0000\u0014\u0001\u0001"+
		"\u0000\u0000\u0000\u0015\u0016\u0005\t\u0000\u0000\u0016\u0017\u0005\n"+
		"\u0000\u0000\u0017\u0018\u0006\u0001\uffff\uffff\u0000\u0018\u0003\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0005\b\u0000\u0000\u001a\u001b\u0005\n"+
		"\u0000\u0000\u001b\u001c\u0006\u0002\uffff\uffff\u0000\u001c\u0005\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0005\u0005\u0000\u0000\u001e\u001f\u0005"+
		"\n\u0000\u0000\u001f \u0005\u0006\u0000\u0000 \"\u0006\u0003\uffff\uffff"+
		"\u0000!#\u0003\b\u0004\u0000\"!\u0001\u0000\u0000\u0000#$\u0001\u0000"+
		"\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%&\u0001"+
		"\u0000\u0000\u0000&\'\u0005\u0007\u0000\u0000\'(\u0006\u0003\uffff\uffff"+
		"\u0000(\u0007\u0001\u0000\u0000\u0000)-\u0005\n\u0000\u0000*.\u0005\u0002"+
		"\u0000\u0000+.\u0005\u0003\u0000\u0000,.\u0005\u0004\u0000\u0000-*\u0001"+
		"\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-,\u0001\u0000\u0000\u0000"+
		"./\u0001\u0000\u0000\u0000/0\u0006\u0004\uffff\uffff\u00000\t\u0001\u0000"+
		"\u0000\u000012\u0005\u0001\u0000\u00002\u000b\u0001\u0000\u0000\u0000"+
		"\u0003\u0011$-";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}