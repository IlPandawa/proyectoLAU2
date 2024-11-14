import org.antlr.runtime.*;

public class TestLibro {
    public static void main(String[] args) throws Exception {
        
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        gramLibroLexer lexer = new gramLibroLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        gramLibroParser parser = new gramLibroParser(tokens);
        parser.inicio();
    }
}
