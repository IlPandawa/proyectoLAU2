// $ANTLR 3.5.2 .\\gramLibro.g 2024-11-14 11:38:44

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class gramLibroParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMA", "DATE", "DOUBLE", "INT", 
		"STRING", "WS"
	};
	public static final int EOF=-1;
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


	public gramLibroParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public gramLibroParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return gramLibroParser.tokenNames; }
	@Override public String getGrammarFileName() { return ".\\gramLibro.g"; }



	// $ANTLR start "inicio"
	// .\\gramLibro.g:3:1: inicio : ( libro )+ ;
	public final void inicio() throws RecognitionException {
		try {
			// .\\gramLibro.g:3:7: ( ( libro )+ )
			// .\\gramLibro.g:3:9: ( libro )+
			{
			// .\\gramLibro.g:3:9: ( libro )+
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
					// .\\gramLibro.g:3:9: libro
					{
					pushFollow(FOLLOW_libro_in_inicio9);
					libro();
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



	// $ANTLR start "libro"
	// .\\gramLibro.g:4:1: libro : id= INT COMMA nombre= STRING COMMA editorial= STRING COMMA autor= STRING COMMA genero= STRING COMMA paisAutor= STRING COMMA numeroPaginas= INT COMMA anioEdicion= DATE COMMA precio= DOUBLE ;
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
			// .\\gramLibro.g:4:6: (id= INT COMMA nombre= STRING COMMA editorial= STRING COMMA autor= STRING COMMA genero= STRING COMMA paisAutor= STRING COMMA numeroPaginas= INT COMMA anioEdicion= DATE COMMA precio= DOUBLE )
			// .\\gramLibro.g:5:4: id= INT COMMA nombre= STRING COMMA editorial= STRING COMMA autor= STRING COMMA genero= STRING COMMA paisAutor= STRING COMMA numeroPaginas= INT COMMA anioEdicion= DATE COMMA precio= DOUBLE
			{
			id=(Token)match(input,INT,FOLLOW_INT_in_libro21); 
			match(input,COMMA,FOLLOW_COMMA_in_libro23); 
			nombre=(Token)match(input,STRING,FOLLOW_STRING_in_libro30); 
			match(input,COMMA,FOLLOW_COMMA_in_libro32); 
			editorial=(Token)match(input,STRING,FOLLOW_STRING_in_libro39); 
			match(input,COMMA,FOLLOW_COMMA_in_libro41); 
			autor=(Token)match(input,STRING,FOLLOW_STRING_in_libro48); 
			match(input,COMMA,FOLLOW_COMMA_in_libro50); 
			genero=(Token)match(input,STRING,FOLLOW_STRING_in_libro57); 
			match(input,COMMA,FOLLOW_COMMA_in_libro59); 
			paisAutor=(Token)match(input,STRING,FOLLOW_STRING_in_libro66); 
			match(input,COMMA,FOLLOW_COMMA_in_libro68); 
			numeroPaginas=(Token)match(input,INT,FOLLOW_INT_in_libro75); 
			match(input,COMMA,FOLLOW_COMMA_in_libro77); 
			anioEdicion=(Token)match(input,DATE,FOLLOW_DATE_in_libro84); 
			match(input,COMMA,FOLLOW_COMMA_in_libro86); 
			precio=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_libro92); 

			        // Generación de RDF con base en los valores extraídos
			        System.out.println("<rdf:Description rdf:about=\"#"+(id!=null?id.getText():null)+"\">");
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

	// Delegated rules



	public static final BitSet FOLLOW_libro_in_inicio9 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_INT_in_libro21 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_libro23 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_STRING_in_libro30 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_libro32 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_STRING_in_libro39 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_libro41 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_STRING_in_libro48 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_libro50 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_STRING_in_libro57 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_libro59 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_STRING_in_libro66 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_libro68 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_INT_in_libro75 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_libro77 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_DATE_in_libro84 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_libro86 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_DOUBLE_in_libro92 = new BitSet(new long[]{0x0000000000000002L});
}
