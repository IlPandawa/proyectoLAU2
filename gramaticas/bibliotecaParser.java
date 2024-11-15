// $ANTLR 3.5.2 .\\biblioteca.g 2024-11-15 10:42:03

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class bibliotecaParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMA", "DATE", "DOUBLE", "INT", 
		"STRING", "WS", "'Libros'", "'Prestamos'", "'Usuarios'"
	};
	public static final int EOF=-1;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int COMMA=4;
	public static final int DATE=5;
	public static final int DOUBLE=6;
	public static final int INT=7;
	public static final int STRING=8;
	public static final int WS=9;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public bibliotecaParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public bibliotecaParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return bibliotecaParser.tokenNames; }
	@Override public String getGrammarFileName() { return ".\\biblioteca.g"; }



	// $ANTLR start "inicio"
	// .\\biblioteca.g:3:1: inicio : ( seccion )+ ;
	public final void inicio() throws RecognitionException {
		try {
			// .\\biblioteca.g:3:7: ( ( seccion )+ )
			// .\\biblioteca.g:3:9: ( seccion )+
			{
			// .\\biblioteca.g:3:9: ( seccion )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 10 && LA1_0 <= 12)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// .\\biblioteca.g:3:9: seccion
					{
					pushFollow(FOLLOW_seccion_in_inicio9);
					seccion();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "inicio"



	// $ANTLR start "seccion"
	// .\\biblioteca.g:6:1: seccion : ( 'Libros' ( WS )? registrosLibros | 'Usuarios' ( WS )? registrosUsuarios | 'Prestamos' ( WS )? registrosPrestamos );
	public final void seccion() throws RecognitionException {
		try {
			// .\\biblioteca.g:7:5: ( 'Libros' ( WS )? registrosLibros | 'Usuarios' ( WS )? registrosUsuarios | 'Prestamos' ( WS )? registrosPrestamos )
			int alt5=3;
			switch ( input.LA(1) ) {
			case 10:
				{
				alt5=1;
				}
				break;
			case 12:
				{
				alt5=2;
				}
				break;
			case 11:
				{
				alt5=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// .\\biblioteca.g:7:7: 'Libros' ( WS )? registrosLibros
					{
					match(input,10,FOLLOW_10_in_seccion23); 
					// .\\biblioteca.g:7:16: ( WS )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==WS) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// .\\biblioteca.g:7:16: WS
							{
							match(input,WS,FOLLOW_WS_in_seccion25); 
							}
							break;

					}

					pushFollow(FOLLOW_registrosLibros_in_seccion28);
					registrosLibros();
					state._fsp--;

					}
					break;
				case 2 :
					// .\\biblioteca.g:8:7: 'Usuarios' ( WS )? registrosUsuarios
					{
					match(input,12,FOLLOW_12_in_seccion36); 
					// .\\biblioteca.g:8:18: ( WS )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==WS) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// .\\biblioteca.g:8:18: WS
							{
							match(input,WS,FOLLOW_WS_in_seccion38); 
							}
							break;

					}

					pushFollow(FOLLOW_registrosUsuarios_in_seccion41);
					registrosUsuarios();
					state._fsp--;

					}
					break;
				case 3 :
					// .\\biblioteca.g:9:7: 'Prestamos' ( WS )? registrosPrestamos
					{
					match(input,11,FOLLOW_11_in_seccion49); 
					// .\\biblioteca.g:9:19: ( WS )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==WS) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// .\\biblioteca.g:9:19: WS
							{
							match(input,WS,FOLLOW_WS_in_seccion51); 
							}
							break;

					}

					pushFollow(FOLLOW_registrosPrestamos_in_seccion54);
					registrosPrestamos();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "seccion"



	// $ANTLR start "registrosLibros"
	// .\\biblioteca.g:13:1: registrosLibros : ( libro )+ ;
	public final void registrosLibros() throws RecognitionException {
		try {
			// .\\biblioteca.g:13:16: ( ( libro )+ )
			// .\\biblioteca.g:13:18: ( libro )+
			{
			// .\\biblioteca.g:13:18: ( libro )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==INT) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// .\\biblioteca.g:13:19: libro
					{
					pushFollow(FOLLOW_libro_in_registrosLibros68);
					libro();
					state._fsp--;

					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "registrosLibros"



	// $ANTLR start "libro"
	// .\\biblioteca.g:15:1: libro : id= INT COMMA nombre= STRING COMMA editorial= STRING COMMA autor= STRING COMMA genero= STRING COMMA paisAutor= STRING COMMA numeroPaginas= INT COMMA anioEdicion= DATE COMMA precio= DOUBLE ;
	public final void libro() throws RecognitionException {
		Token id=null;
		Token nombre=null;
		Token editorial=null;
		Token autor=null;
		Token genero=null;
		Token paisAutor=null;
		Token numeroPaginas=null;
		Token anioEdicion=null;
		Token precio=null;

		try {
			// .\\biblioteca.g:16:5: (id= INT COMMA nombre= STRING COMMA editorial= STRING COMMA autor= STRING COMMA genero= STRING COMMA paisAutor= STRING COMMA numeroPaginas= INT COMMA anioEdicion= DATE COMMA precio= DOUBLE )
			// .\\biblioteca.g:16:7: id= INT COMMA nombre= STRING COMMA editorial= STRING COMMA autor= STRING COMMA genero= STRING COMMA paisAutor= STRING COMMA numeroPaginas= INT COMMA anioEdicion= DATE COMMA precio= DOUBLE
			{
			id=(Token)match(input,INT,FOLLOW_INT_in_libro84); 
			match(input,COMMA,FOLLOW_COMMA_in_libro86); 
			nombre=(Token)match(input,STRING,FOLLOW_STRING_in_libro96); 
			match(input,COMMA,FOLLOW_COMMA_in_libro98); 
			editorial=(Token)match(input,STRING,FOLLOW_STRING_in_libro108); 
			match(input,COMMA,FOLLOW_COMMA_in_libro110); 
			autor=(Token)match(input,STRING,FOLLOW_STRING_in_libro120); 
			match(input,COMMA,FOLLOW_COMMA_in_libro122); 
			genero=(Token)match(input,STRING,FOLLOW_STRING_in_libro132); 
			match(input,COMMA,FOLLOW_COMMA_in_libro134); 
			paisAutor=(Token)match(input,STRING,FOLLOW_STRING_in_libro144); 
			match(input,COMMA,FOLLOW_COMMA_in_libro146); 
			numeroPaginas=(Token)match(input,INT,FOLLOW_INT_in_libro156); 
			match(input,COMMA,FOLLOW_COMMA_in_libro158); 
			anioEdicion=(Token)match(input,DATE,FOLLOW_DATE_in_libro168); 
			match(input,COMMA,FOLLOW_COMMA_in_libro170); 
			precio=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_libro180); 

			        // Generar RDF para el libro
			        System.out.println("<!-- Instancia libro -->");
			        System.out.println("<rdf:Description rdf:about=\"#codigoLibro "+(id!=null?id.getText():null)+"\">");
			        System.out.println("  <rdf:type rdf:resource=\"#Libro\" />");
			        System.out.println("  <biblioteca:codigoLibro>"+(id!=null?id.getText():null)+"</biblioteca:codigoLibro>");
			        System.out.println("  <biblioteca:nombreLibro>"+(nombre!=null?nombre.getText():null)+"</biblioteca:nombreLibro>");
			        System.out.println("  <biblioteca:editorial>"+(editorial!=null?editorial.getText():null)+"</biblioteca:editorial>");
			        System.out.println("  <biblioteca:autor>"+(autor!=null?autor.getText():null)+"</biblioteca:autor>");
			        System.out.println("  <biblioteca:genero>"+(genero!=null?genero.getText():null)+"</biblioteca:genero>");
			        System.out.println("  <biblioteca:paisAutor>"+(paisAutor!=null?paisAutor.getText():null)+"</biblioteca:paisAutor>");
			        System.out.println("  <biblioteca:numeroPaginas>"+(numeroPaginas!=null?numeroPaginas.getText():null)+"</biblioteca:numeroPaginas>");
			        System.out.println("  <biblioteca:anioEdicion>"+(anioEdicion!=null?anioEdicion.getText():null)+"</biblioteca:anioEdicion>");
			        System.out.println("  <biblioteca:precioLibro>"+(precio!=null?precio.getText():null)+"</biblioteca:precioLibro>");
			        System.out.println("</rdf:Description>\n");
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "libro"



	// $ANTLR start "registrosUsuarios"
	// .\\biblioteca.g:43:1: registrosUsuarios : ( usuario )+ ;
	public final void registrosUsuarios() throws RecognitionException {
		try {
			// .\\biblioteca.g:43:18: ( ( usuario )+ )
			// .\\biblioteca.g:43:20: ( usuario )+
			{
			// .\\biblioteca.g:43:20: ( usuario )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==INT) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// .\\biblioteca.g:43:21: usuario
					{
					pushFollow(FOLLOW_usuario_in_registrosUsuarios195);
					usuario();
					state._fsp--;

					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "registrosUsuarios"



	// $ANTLR start "usuario"
	// .\\biblioteca.g:45:1: usuario : id= INT COMMA nombre= STRING COMMA apellido= STRING COMMA ine= INT COMMA domicilio= STRING COMMA estado= STRING COMMA municipio= STRING COMMA nacimiento= DATE ;
	public final void usuario() throws RecognitionException {
		Token id=null;
		Token nombre=null;
		Token apellido=null;
		Token ine=null;
		Token domicilio=null;
		Token estado=null;
		Token municipio=null;
		Token nacimiento=null;

		try {
			// .\\biblioteca.g:45:8: (id= INT COMMA nombre= STRING COMMA apellido= STRING COMMA ine= INT COMMA domicilio= STRING COMMA estado= STRING COMMA municipio= STRING COMMA nacimiento= DATE )
			// .\\biblioteca.g:46:7: id= INT COMMA nombre= STRING COMMA apellido= STRING COMMA ine= INT COMMA domicilio= STRING COMMA estado= STRING COMMA municipio= STRING COMMA nacimiento= DATE
			{
			id=(Token)match(input,INT,FOLLOW_INT_in_usuario213); 
			match(input,COMMA,FOLLOW_COMMA_in_usuario215); 
			nombre=(Token)match(input,STRING,FOLLOW_STRING_in_usuario225); 
			match(input,COMMA,FOLLOW_COMMA_in_usuario227); 
			apellido=(Token)match(input,STRING,FOLLOW_STRING_in_usuario237); 
			match(input,COMMA,FOLLOW_COMMA_in_usuario239); 
			ine=(Token)match(input,INT,FOLLOW_INT_in_usuario249); 
			match(input,COMMA,FOLLOW_COMMA_in_usuario251); 
			domicilio=(Token)match(input,STRING,FOLLOW_STRING_in_usuario261); 
			match(input,COMMA,FOLLOW_COMMA_in_usuario263); 
			estado=(Token)match(input,STRING,FOLLOW_STRING_in_usuario273); 
			match(input,COMMA,FOLLOW_COMMA_in_usuario275); 
			municipio=(Token)match(input,STRING,FOLLOW_STRING_in_usuario285); 
			match(input,COMMA,FOLLOW_COMMA_in_usuario287); 
			nacimiento=(Token)match(input,DATE,FOLLOW_DATE_in_usuario297); 

			        // Generar RDF para el usuario
			        System.out.println("<!-- Instancia usuario -->");
			        System.out.println("<rdf:Description rdf:about=\"#"+(id!=null?id.getText():null)+"\">");
			        System.out.println("  <rdf:type rdf:resource=\"#Usuario\" />");
			        System.out.println("  <biblioteca:codigoUsuario>"+(id!=null?id.getText():null)+"</biblioteca:codigoUsuario>");
			        System.out.println("  <biblioteca:nombre>"+(nombre!=null?nombre.getText():null)+"</biblioteca:nombre>");
			        System.out.println("  <biblioteca:apellidos>"+(apellido!=null?apellido.getText():null)+"</biblioteca:apellidos>");
			        System.out.println("  <biblioteca:noIdentificacion>"+(ine!=null?ine.getText():null)+"</biblioteca:noIdentificacion>");
			        System.out.println("  <biblioteca:domicilio>"+(domicilio!=null?domicilio.getText():null)+"</biblioteca:domicilio>");
			        System.out.println("  <biblioteca:estado>"+(estado!=null?estado.getText():null)+"</biblioteca:estado>");
			        System.out.println("  <biblioteca:municipio>"+(municipio!=null?municipio.getText():null)+"</biblioteca:municipio>");
			        System.out.println("  <biblioteca:nacimiento>"+(nacimiento!=null?nacimiento.getText():null)+"</biblioteca:nacimiento>");
			        System.out.println("</rdf:Description>\n");
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "usuario"



	// $ANTLR start "registrosPrestamos"
	// .\\biblioteca.g:71:1: registrosPrestamos : ( prestamo )+ ;
	public final void registrosPrestamos() throws RecognitionException {
		try {
			// .\\biblioteca.g:71:19: ( ( prestamo )+ )
			// .\\biblioteca.g:71:21: ( prestamo )+
			{
			// .\\biblioteca.g:71:21: ( prestamo )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==INT) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// .\\biblioteca.g:71:22: prestamo
					{
					pushFollow(FOLLOW_prestamo_in_registrosPrestamos312);
					prestamo();
					state._fsp--;

					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "registrosPrestamos"



	// $ANTLR start "prestamo"
	// .\\biblioteca.g:73:1: prestamo : numeroPedido= INT COMMA codigoLibro= INT COMMA codigoUsuario= INT COMMA fechaSalida= DATE COMMA fechaMaxima= DATE COMMA fechaDevolucion= DATE ;
	public final void prestamo() throws RecognitionException {
		Token numeroPedido=null;
		Token codigoLibro=null;
		Token codigoUsuario=null;
		Token fechaSalida=null;
		Token fechaMaxima=null;
		Token fechaDevolucion=null;

		try {
			// .\\biblioteca.g:73:9: (numeroPedido= INT COMMA codigoLibro= INT COMMA codigoUsuario= INT COMMA fechaSalida= DATE COMMA fechaMaxima= DATE COMMA fechaDevolucion= DATE )
			// .\\biblioteca.g:74:7: numeroPedido= INT COMMA codigoLibro= INT COMMA codigoUsuario= INT COMMA fechaSalida= DATE COMMA fechaMaxima= DATE COMMA fechaDevolucion= DATE
			{
			numeroPedido=(Token)match(input,INT,FOLLOW_INT_in_prestamo329); 
			match(input,COMMA,FOLLOW_COMMA_in_prestamo331); 
			codigoLibro=(Token)match(input,INT,FOLLOW_INT_in_prestamo341); 
			match(input,COMMA,FOLLOW_COMMA_in_prestamo343); 
			codigoUsuario=(Token)match(input,INT,FOLLOW_INT_in_prestamo353); 
			match(input,COMMA,FOLLOW_COMMA_in_prestamo355); 
			fechaSalida=(Token)match(input,DATE,FOLLOW_DATE_in_prestamo365); 
			match(input,COMMA,FOLLOW_COMMA_in_prestamo367); 
			fechaMaxima=(Token)match(input,DATE,FOLLOW_DATE_in_prestamo377); 
			match(input,COMMA,FOLLOW_COMMA_in_prestamo379); 
			fechaDevolucion=(Token)match(input,DATE,FOLLOW_DATE_in_prestamo389); 

			        // Generar RDF para el préstamo
			        System.out.println("<!-- Instancia prestamo -->");
			        System.out.println("<rdf:Description rdf:about=\"#numeroPedido "+(codigoLibro!=null?codigoLibro.getText():null)+"\">");
			        System.out.println("  <rdf:type rdf:resource=\"#Prestamo\" />");
			        System.out.println("  <biblioteca:codigoLibro>"+(codigoLibro!=null?codigoLibro.getText():null)+"</biblioteca:codigoLibro>");
			        System.out.println("  <biblioteca:codigoUsuario>"+(codigoUsuario!=null?codigoUsuario.getText():null)+"</biblioteca:codigoUsuario>");
			        System.out.println("  <biblioteca:fechaSalida>"+(fechaSalida!=null?fechaSalida.getText():null)+"</biblioteca:fechaSalida>");
			        System.out.println("  <biblioteca:fechaMaxima>"+(fechaMaxima!=null?fechaMaxima.getText():null)+"</biblioteca:fechaMaxima>");
			        System.out.println("  <biblioteca:fechaDevolucion>"+(fechaDevolucion!=null?fechaDevolucion.getText():null)+"</biblioteca:fechaDevolucion>");
			        System.out.println("</rdf:Description>\n");
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "prestamo"

	// Delegated rules



	public static final BitSet FOLLOW_seccion_in_inicio9 = new BitSet(new long[]{0x0000000000001C02L});
	public static final BitSet FOLLOW_10_in_seccion23 = new BitSet(new long[]{0x0000000000000280L});
	public static final BitSet FOLLOW_WS_in_seccion25 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_registrosLibros_in_seccion28 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_seccion36 = new BitSet(new long[]{0x0000000000000280L});
	public static final BitSet FOLLOW_WS_in_seccion38 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_registrosUsuarios_in_seccion41 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_seccion49 = new BitSet(new long[]{0x0000000000000280L});
	public static final BitSet FOLLOW_WS_in_seccion51 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_registrosPrestamos_in_seccion54 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_libro_in_registrosLibros68 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_INT_in_libro84 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_libro86 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_STRING_in_libro96 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_libro98 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_STRING_in_libro108 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_libro110 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_STRING_in_libro120 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_libro122 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_STRING_in_libro132 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_libro134 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_STRING_in_libro144 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_libro146 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_INT_in_libro156 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_libro158 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_DATE_in_libro168 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_libro170 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_DOUBLE_in_libro180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_usuario_in_registrosUsuarios195 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_INT_in_usuario213 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_usuario215 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_STRING_in_usuario225 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_usuario227 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_STRING_in_usuario237 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_usuario239 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_INT_in_usuario249 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_usuario251 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_STRING_in_usuario261 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_usuario263 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_STRING_in_usuario273 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_usuario275 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_STRING_in_usuario285 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_usuario287 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_DATE_in_usuario297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_prestamo_in_registrosPrestamos312 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_INT_in_prestamo329 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_prestamo331 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_INT_in_prestamo341 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_prestamo343 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_INT_in_prestamo353 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_prestamo355 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_DATE_in_prestamo365 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_prestamo367 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_DATE_in_prestamo377 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_prestamo379 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_DATE_in_prestamo389 = new BitSet(new long[]{0x0000000000000002L});
}
