import org.antlr.runtime.*;
public class Test2 {

   public static void main(String[] args) throws Exception 
	 {
      // create a CharStream that reads from standard input
      ANTLRInputStream input = new ANTLRInputStream(System.in);
   	T2Lexer lexer = new T2Lexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      T2Parser parser = new T2Parser(tokens);
      
      parser.inicio();
     }
}