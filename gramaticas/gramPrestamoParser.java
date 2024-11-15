// $ANTLR 3.5.2 .\\gramPrestamo.g 2024-11-15 08:28:16

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class gramPrestamoParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMA", "DATE", "INT", "WS"
	};
	public static final int EOF=-1;
	public static final int COMMA=4;
	public static final int DATE=5;
	public static final int INT=6;
	public static final int WS=7;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public gramPrestamoParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public gramPrestamoParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return gramPrestamoParser.tokenNames; }
	@Override public String getGrammarFileName() { return ".\\gramPrestamo.g"; }



	// $ANTLR start "inicio"
	// .\\gramPrestamo.g:3:1: inicio : ( prestamo )+ ;
	public final void inicio() throws RecognitionException {
		try {
			// .\\gramPrestamo.g:3:7: ( ( prestamo )+ )
			// .\\gramPrestamo.g:3:9: ( prestamo )+
			{
			// .\\gramPrestamo.g:3:9: ( prestamo )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==INT) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// .\\gramPrestamo.g:3:9: prestamo
					{
					pushFollow(FOLLOW_prestamo_in_inicio9);
					prestamo();
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



	// $ANTLR start "prestamo"
	// .\\gramPrestamo.g:5:1: prestamo : numeroPedido= INT COMMA codigoLibro= INT COMMA codigoUsuario= INT COMMA fechaSalida= DATE COMMA fechaMaxima= DATE COMMA fechaDevolucion= DATE ;
	public final void prestamo() throws RecognitionException {
		Token numeroPedido=null;
		Token codigoLibro=null;
		Token codigoUsuario=null;
		Token fechaSalida=null;
		Token fechaMaxima=null;
		Token fechaDevolucion=null;

		try {
			// .\\gramPrestamo.g:5:9: (numeroPedido= INT COMMA codigoLibro= INT COMMA codigoUsuario= INT COMMA fechaSalida= DATE COMMA fechaMaxima= DATE COMMA fechaDevolucion= DATE )
			// .\\gramPrestamo.g:6:5: numeroPedido= INT COMMA codigoLibro= INT COMMA codigoUsuario= INT COMMA fechaSalida= DATE COMMA fechaMaxima= DATE COMMA fechaDevolucion= DATE
			{
			numeroPedido=(Token)match(input,INT,FOLLOW_INT_in_prestamo24); 
			match(input,COMMA,FOLLOW_COMMA_in_prestamo26); 
			codigoLibro=(Token)match(input,INT,FOLLOW_INT_in_prestamo35); 
			match(input,COMMA,FOLLOW_COMMA_in_prestamo37); 
			codigoUsuario=(Token)match(input,INT,FOLLOW_INT_in_prestamo46); 
			match(input,COMMA,FOLLOW_COMMA_in_prestamo48); 
			fechaSalida=(Token)match(input,DATE,FOLLOW_DATE_in_prestamo57); 
			match(input,COMMA,FOLLOW_COMMA_in_prestamo59); 
			fechaMaxima=(Token)match(input,DATE,FOLLOW_DATE_in_prestamo68); 
			match(input,COMMA,FOLLOW_COMMA_in_prestamo70); 
			fechaDevolucion=(Token)match(input,DATE,FOLLOW_DATE_in_prestamo79); 

			        // Generación de RDF con base en los valores extraídos
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



	public static final BitSet FOLLOW_prestamo_in_inicio9 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_INT_in_prestamo24 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_prestamo26 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_INT_in_prestamo35 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_prestamo37 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_INT_in_prestamo46 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_prestamo48 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_DATE_in_prestamo57 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_prestamo59 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_DATE_in_prestamo68 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_prestamo70 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_DATE_in_prestamo79 = new BitSet(new long[]{0x0000000000000002L});
}
