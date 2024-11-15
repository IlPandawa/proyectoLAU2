// $ANTLR 3.5.2 .\\gramUsuario.g 2024-11-15 08:27:44

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class gramUsuarioParser extends Parser {
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


	public gramUsuarioParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public gramUsuarioParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return gramUsuarioParser.tokenNames; }
	@Override public String getGrammarFileName() { return ".\\gramUsuario.g"; }



	// $ANTLR start "inicio"
	// .\\gramUsuario.g:3:1: inicio : ( usuario )+ ;
	public final void inicio() throws RecognitionException {
		try {
			// .\\gramUsuario.g:3:7: ( ( usuario )+ )
			// .\\gramUsuario.g:3:9: ( usuario )+
			{
			// .\\gramUsuario.g:3:9: ( usuario )+
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
					// .\\gramUsuario.g:3:9: usuario
					{
					pushFollow(FOLLOW_usuario_in_inicio9);
					usuario();
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



	// $ANTLR start "usuario"
	// .\\gramUsuario.g:5:1: usuario : id= INT COMMA nombre= STRING COMMA apellido= STRING ( ( STRING )+ )? COMMA INE= INT COMMA domicilio= STRING ( ( STRING )+ )? COMMA estado= STRING ( ( STRING )+ )? COMMA municipio= STRING ( ( STRING )+ )? COMMA nacimiento= DATE ;
	public final void usuario() throws RecognitionException {
		Token id=null;
		Token nombre=null;
		Token apellido=null;
		Token INE=null;
		Token domicilio=null;
		Token estado=null;
		Token municipio=null;
		Token nacimiento=null;

		try {
			// .\\gramUsuario.g:5:8: (id= INT COMMA nombre= STRING COMMA apellido= STRING ( ( STRING )+ )? COMMA INE= INT COMMA domicilio= STRING ( ( STRING )+ )? COMMA estado= STRING ( ( STRING )+ )? COMMA municipio= STRING ( ( STRING )+ )? COMMA nacimiento= DATE )
			// .\\gramUsuario.g:6:5: id= INT COMMA nombre= STRING COMMA apellido= STRING ( ( STRING )+ )? COMMA INE= INT COMMA domicilio= STRING ( ( STRING )+ )? COMMA estado= STRING ( ( STRING )+ )? COMMA municipio= STRING ( ( STRING )+ )? COMMA nacimiento= DATE
			{
			id=(Token)match(input,INT,FOLLOW_INT_in_usuario26); 
			match(input,COMMA,FOLLOW_COMMA_in_usuario28); 
			nombre=(Token)match(input,STRING,FOLLOW_STRING_in_usuario38); 
			match(input,COMMA,FOLLOW_COMMA_in_usuario40); 
			apellido=(Token)match(input,STRING,FOLLOW_STRING_in_usuario50); 
			// .\\gramUsuario.g:8:23: ( ( STRING )+ )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==STRING) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// .\\gramUsuario.g:8:24: ( STRING )+
					{
					// .\\gramUsuario.g:8:24: ( STRING )+
					int cnt2=0;
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( (LA2_0==STRING) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// .\\gramUsuario.g:8:24: STRING
							{
							match(input,STRING,FOLLOW_STRING_in_usuario53); 
							}
							break;

						default :
							if ( cnt2 >= 1 ) break loop2;
							EarlyExitException eee = new EarlyExitException(2, input);
							throw eee;
						}
						cnt2++;
					}

					}
					break;

			}

			match(input,COMMA,FOLLOW_COMMA_in_usuario58); 
			INE=(Token)match(input,INT,FOLLOW_INT_in_usuario68); 
			match(input,COMMA,FOLLOW_COMMA_in_usuario70); 
			domicilio=(Token)match(input,STRING,FOLLOW_STRING_in_usuario79); 
			// .\\gramUsuario.g:10:23: ( ( STRING )+ )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==STRING) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// .\\gramUsuario.g:10:24: ( STRING )+
					{
					// .\\gramUsuario.g:10:24: ( STRING )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==STRING) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// .\\gramUsuario.g:10:24: STRING
							{
							match(input,STRING,FOLLOW_STRING_in_usuario82); 
							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					}
					break;

			}

			match(input,COMMA,FOLLOW_COMMA_in_usuario87); 
			estado=(Token)match(input,STRING,FOLLOW_STRING_in_usuario97); 
			// .\\gramUsuario.g:11:21: ( ( STRING )+ )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==STRING) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// .\\gramUsuario.g:11:22: ( STRING )+
					{
					// .\\gramUsuario.g:11:22: ( STRING )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==STRING) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// .\\gramUsuario.g:11:22: STRING
							{
							match(input,STRING,FOLLOW_STRING_in_usuario100); 
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
					break;

			}

			match(input,COMMA,FOLLOW_COMMA_in_usuario105); 
			municipio=(Token)match(input,STRING,FOLLOW_STRING_in_usuario115); 
			// .\\gramUsuario.g:12:24: ( ( STRING )+ )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==STRING) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// .\\gramUsuario.g:12:25: ( STRING )+
					{
					// .\\gramUsuario.g:12:25: ( STRING )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==STRING) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// .\\gramUsuario.g:12:25: STRING
							{
							match(input,STRING,FOLLOW_STRING_in_usuario118); 
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
					break;

			}

			match(input,COMMA,FOLLOW_COMMA_in_usuario123); 
			nacimiento=(Token)match(input,DATE,FOLLOW_DATE_in_usuario132); 

			        // Generación de RDF con base en los valores extraídos
			        System.out.println("<rdf:Description rdf:about=\"#"+(id!=null?id.getText():null)+"\">");
			        System.out.println("    <rdf:type rdf:resource=\"#Usuario\" />");
			        System.out.println("    <biblioteca:codigoUsuario>"+(id!=null?id.getText():null)+"</biblioteca:codigoUsuario>");
			        System.out.println("    <biblioteca:nombre>"+(nombre!=null?nombre.getText():null)+"</biblioteca:nombre>");
			        System.out.println("    <biblioteca:apellidos>"+(apellido!=null?apellido.getText():null)+"</biblioteca:apellidos>");
			        System.out.println("    <biblioteca:noIdentificacion>"+(INE!=null?INE.getText():null)+"</biblioteca:noIdentificacion>");
			        System.out.println("    <biblioteca:domicilio>"+(domicilio!=null?domicilio.getText():null)+"</biblioteca:domicilio>");
			        System.out.println("    <biblioteca:estado>"+(estado!=null?estado.getText():null)+"</biblioteca:estado>");
			        System.out.println("    <biblioteca:municipio>"+(municipio!=null?municipio.getText():null)+"</biblioteca:municipio>");
			        System.out.println("    <biblioteca:nacimiento>"+(nacimiento!=null?nacimiento.getText():null)+"</biblioteca:nacimiento>");
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

	// Delegated rules



	public static final BitSet FOLLOW_usuario_in_inicio9 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_INT_in_usuario26 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_usuario28 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_STRING_in_usuario38 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_usuario40 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_STRING_in_usuario50 = new BitSet(new long[]{0x0000000000000110L});
	public static final BitSet FOLLOW_STRING_in_usuario53 = new BitSet(new long[]{0x0000000000000110L});
	public static final BitSet FOLLOW_COMMA_in_usuario58 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_INT_in_usuario68 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_usuario70 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_STRING_in_usuario79 = new BitSet(new long[]{0x0000000000000110L});
	public static final BitSet FOLLOW_STRING_in_usuario82 = new BitSet(new long[]{0x0000000000000110L});
	public static final BitSet FOLLOW_COMMA_in_usuario87 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_STRING_in_usuario97 = new BitSet(new long[]{0x0000000000000110L});
	public static final BitSet FOLLOW_STRING_in_usuario100 = new BitSet(new long[]{0x0000000000000110L});
	public static final BitSet FOLLOW_COMMA_in_usuario105 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_STRING_in_usuario115 = new BitSet(new long[]{0x0000000000000110L});
	public static final BitSet FOLLOW_STRING_in_usuario118 = new BitSet(new long[]{0x0000000000000110L});
	public static final BitSet FOLLOW_COMMA_in_usuario123 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_DATE_in_usuario132 = new BitSet(new long[]{0x0000000000000002L});
}
