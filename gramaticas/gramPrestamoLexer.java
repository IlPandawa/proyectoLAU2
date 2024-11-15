// $ANTLR 3.5.2 .\\gramPrestamo.g 2024-11-15 08:28:16

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class gramPrestamoLexer extends Lexer {
	public static final int EOF=-1;
	public static final int COMMA=4;
	public static final int DATE=5;
	public static final int INT=6;
	public static final int WS=7;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public gramPrestamoLexer() {} 
	public gramPrestamoLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public gramPrestamoLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return ".\\gramPrestamo.g"; }

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\gramPrestamo.g:23:4: ( ( '0' .. '9' )+ )
			// .\\gramPrestamo.g:23:6: ( '0' .. '9' )+
			{
			// .\\gramPrestamo.g:23:6: ( '0' .. '9' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// .\\gramPrestamo.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
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

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "DATE"
	public final void mDATE() throws RecognitionException {
		try {
			int _type = DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\gramPrestamo.g:24:5: ( INT '/' INT '/' INT )
			// .\\gramPrestamo.g:24:7: INT '/' INT '/' INT
			{
			mINT(); 

			match('/'); 
			mINT(); 

			match('/'); 
			mINT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\gramPrestamo.g:25:6: ( ',' )
			// .\\gramPrestamo.g:25:8: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\gramPrestamo.g:26:3: ( ( ' ' | '\\n' | '\\t' | '\\r' )+ )
			// .\\gramPrestamo.g:26:5: ( ' ' | '\\n' | '\\t' | '\\r' )+
			{
			// .\\gramPrestamo.g:26:5: ( ' ' | '\\n' | '\\t' | '\\r' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '\t' && LA2_0 <= '\n')||LA2_0=='\r'||LA2_0==' ') ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// .\\gramPrestamo.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			_channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// .\\gramPrestamo.g:1:8: ( INT | DATE | COMMA | WS )
		int alt3=4;
		alt3 = dfa3.predict(input);
		switch (alt3) {
			case 1 :
				// .\\gramPrestamo.g:1:10: INT
				{
				mINT(); 

				}
				break;
			case 2 :
				// .\\gramPrestamo.g:1:14: DATE
				{
				mDATE(); 

				}
				break;
			case 3 :
				// .\\gramPrestamo.g:1:19: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 4 :
				// .\\gramPrestamo.g:1:25: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA3 dfa3 = new DFA3(this);
	static final String DFA3_eotS =
		"\1\uffff\1\4\4\uffff";
	static final String DFA3_eofS =
		"\6\uffff";
	static final String DFA3_minS =
		"\1\11\1\57\4\uffff";
	static final String DFA3_maxS =
		"\2\71\4\uffff";
	static final String DFA3_acceptS =
		"\2\uffff\1\3\1\4\1\1\1\2";
	static final String DFA3_specialS =
		"\6\uffff}>";
	static final String[] DFA3_transitionS = {
			"\2\3\2\uffff\1\3\22\uffff\1\3\13\uffff\1\2\3\uffff\12\1",
			"\1\5\12\1",
			"",
			"",
			"",
			""
	};

	static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
	static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
	static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
	static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
	static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
	static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
	static final short[][] DFA3_transition;

	static {
		int numStates = DFA3_transitionS.length;
		DFA3_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
		}
	}

	protected class DFA3 extends DFA {

		public DFA3(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 3;
			this.eot = DFA3_eot;
			this.eof = DFA3_eof;
			this.min = DFA3_min;
			this.max = DFA3_max;
			this.accept = DFA3_accept;
			this.special = DFA3_special;
			this.transition = DFA3_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( INT | DATE | COMMA | WS );";
		}
	}

}
