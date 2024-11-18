// $ANTLR 3.5.2 .\\gramRDF.g 2024-11-18 14:51:55

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class gramRDFParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALFABETICO", "CERRAR", "CREAR", 
		"FECHA", "FIN", "ID", "INICIO", "NUMERICO", "TABLA", "USAR", "WS"
	};
	public static final int EOF=-1;
	public static final int ALFABETICO=4;
	public static final int CERRAR=5;
	public static final int CREAR=6;
	public static final int FECHA=7;
	public static final int FIN=8;
	public static final int ID=9;
	public static final int INICIO=10;
	public static final int NUMERICO=11;
	public static final int TABLA=12;
	public static final int USAR=13;
	public static final int WS=14;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public gramRDFParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public gramRDFParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return gramRDFParser.tokenNames; }
	@Override public String getGrammarFileName() { return ".\\gramRDF.g"; }



	// $ANTLR start "inicio"
	// .\\gramRDF.g:3:1: inicio : creacion ( tabla )+ cerrar ;
	public final void inicio() throws RecognitionException {
		try {
			// .\\gramRDF.g:3:7: ( creacion ( tabla )+ cerrar )
			// .\\gramRDF.g:3:9: creacion ( tabla )+ cerrar
			{
			pushFollow(FOLLOW_creacion_in_inicio9);
			creacion();
			state._fsp--;

			// .\\gramRDF.g:3:18: ( tabla )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==TABLA) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// .\\gramRDF.g:3:18: tabla
					{
					pushFollow(FOLLOW_tabla_in_inicio11);
					tabla();
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

			pushFollow(FOLLOW_cerrar_in_inicio14);
			cerrar();
			state._fsp--;

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



	// $ANTLR start "creacion"
	// .\\gramRDF.g:6:1: creacion : CREAR ID ;
	public final void creacion() throws RecognitionException {
		Token ID1=null;

		try {
			// .\\gramRDF.g:6:9: ( CREAR ID )
			// .\\gramRDF.g:7:2: CREAR ID
			{
			match(input,CREAR,FOLLOW_CREAR_in_creacion23); 
			ID1=(Token)match(input,ID,FOLLOW_ID_in_creacion25); 

			        System.out.println("<?xml version=\"1.0\"?>");
			        System.out.println();
			        System.out.println("<!DOCTYPE rdf:RDF [<!ENTITY xsd \"http://www.w3.org/2001/XMLSchema#\">]>");
			        System.out.println();
			        System.out.println("<rdf:RDF ");
			        System.out.println("     xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"");
			        System.out.println("     xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"");
			        System.out.println("     xmlns:"+(ID1!=null?ID1.getText():null)+"=\"http://www.proyecto.com/"+(ID1!=null?ID1.getText():null)+"#\"");
			        System.out.println("     xml:base=\"http://www.proyecto.com/"+(ID1!=null?ID1.getText():null)+"#\">");
			        System.out.println();
			    
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
	// $ANTLR end "creacion"



	// $ANTLR start "tabla"
	// .\\gramRDF.g:21:1: tabla : TABLA ID INICIO ( campo )+ FIN ;
	public final void tabla() throws RecognitionException {
		Token ID2=null;

		try {
			// .\\gramRDF.g:21:6: ( TABLA ID INICIO ( campo )+ FIN )
			// .\\gramRDF.g:22:2: TABLA ID INICIO ( campo )+ FIN
			{
			match(input,TABLA,FOLLOW_TABLA_in_tabla36); 
			ID2=(Token)match(input,ID,FOLLOW_ID_in_tabla38); 
			match(input,INICIO,FOLLOW_INICIO_in_tabla40); 

			        // Inicio de la definición de la clase en RDF.
			        System.out.println("<!-- Clase: "+(ID2!=null?ID2.getText():null)+" -->");
			        System.out.println("<rdfs:Class rdf:about=\"http://www.proyecto.com/biblioteca#"+(ID2!=null?ID2.getText():null)+"\"/>");
			    
			// .\\gramRDF.g:26:7: ( campo )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==ID) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// .\\gramRDF.g:26:7: campo
					{
					pushFollow(FOLLOW_campo_in_tabla44);
					campo();
					state._fsp--;

					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			match(input,FIN,FOLLOW_FIN_in_tabla47); 

			        // Finaliza la tabla (no requiere acción adicional en RDF).
			    
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
	// $ANTLR end "tabla"



	// $ANTLR start "campo"
	// .\\gramRDF.g:31:1: campo : ID (t= NUMERICO |t= ALFABETICO |t= FECHA ) ;
	public final void campo() throws RecognitionException {
		Token t=null;
		Token ID3=null;

		try {
			// .\\gramRDF.g:31:6: ( ID (t= NUMERICO |t= ALFABETICO |t= FECHA ) )
			// .\\gramRDF.g:32:2: ID (t= NUMERICO |t= ALFABETICO |t= FECHA )
			{
			ID3=(Token)match(input,ID,FOLLOW_ID_in_campo58); 
			// .\\gramRDF.g:32:5: (t= NUMERICO |t= ALFABETICO |t= FECHA )
			int alt3=3;
			switch ( input.LA(1) ) {
			case NUMERICO:
				{
				alt3=1;
				}
				break;
			case ALFABETICO:
				{
				alt3=2;
				}
				break;
			case FECHA:
				{
				alt3=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// .\\gramRDF.g:32:6: t= NUMERICO
					{
					t=(Token)match(input,NUMERICO,FOLLOW_NUMERICO_in_campo65); 
					}
					break;
				case 2 :
					// .\\gramRDF.g:32:21: t= ALFABETICO
					{
					t=(Token)match(input,ALFABETICO,FOLLOW_ALFABETICO_in_campo73); 
					}
					break;
				case 3 :
					// .\\gramRDF.g:32:38: t= FECHA
					{
					t=(Token)match(input,FECHA,FOLLOW_FECHA_in_campo81); 
					}
					break;

			}


			        System.out.println("<!-- Propiedad: "+(ID3!=null?ID3.getText():null)+" -->");
			        System.out.println("<rdf:Property rdf:about=\"#"+(ID3!=null?ID3.getText():null)+"\">");
			        System.out.println("    <rdfs:domain rdf:resource=\"#"+(ID3!=null?ID3.getText():null)+"\"/>");
			        
			        // Asignar el rango correcto según el tipo.
			        if (((t!=null?t.getText():null)).compareTo("letras") == 0) {
			            System.out.println("    <rdfs:range rdf:resource=\"&xsd;string\"/>");
			        } else if (((t!=null?t.getText():null)).compareTo("numeros") == 0) {
			            System.out.println("    <rdfs:range rdf:resource=\"&xsd;integer\"/>");
			        } else if (((t!=null?t.getText():null)).compareTo("fecha") == 0) {
			            System.out.println("    <rdfs:range rdf:resource=\"&xsd;date\"/>");
			        }
			        System.out.println("</rdf:Property>");
			    
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
	// $ANTLR end "campo"



	// $ANTLR start "cerrar"
	// .\\gramRDF.g:48:1: cerrar : CERRAR ;
	public final void cerrar() throws RecognitionException {
		try {
			// .\\gramRDF.g:48:7: ( CERRAR )
			// .\\gramRDF.g:49:2: CERRAR
			{
			match(input,CERRAR,FOLLOW_CERRAR_in_cerrar92); 

			        System.out.println("</rdf:RDF>");
			    
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
	// $ANTLR end "cerrar"

	// Delegated rules



	public static final BitSet FOLLOW_creacion_in_inicio9 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_tabla_in_inicio11 = new BitSet(new long[]{0x0000000000001020L});
	public static final BitSet FOLLOW_cerrar_in_inicio14 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREAR_in_creacion23 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_creacion25 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLA_in_tabla36 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_tabla38 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INICIO_in_tabla40 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_campo_in_tabla44 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_FIN_in_tabla47 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_campo58 = new BitSet(new long[]{0x0000000000000890L});
	public static final BitSet FOLLOW_NUMERICO_in_campo65 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALFABETICO_in_campo73 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FECHA_in_campo81 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CERRAR_in_cerrar92 = new BitSet(new long[]{0x0000000000000002L});
}
