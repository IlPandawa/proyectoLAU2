import org.antlr.runtime.*;

public class TestPrestamos {
    public static void main(String[] args) throws Exception {
        
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        gramPrestamoLexer lexer = new gramPrestamoLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        gramPrestamoParser parser = new gramPrestamoParser(tokens);
        parser.inicio();
    }
}
