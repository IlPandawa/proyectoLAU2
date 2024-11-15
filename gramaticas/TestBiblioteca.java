import org.antlr.runtime.*;

public class TestBiblioteca {
    public static void main(String[] args) throws Exception {
        
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        bibliotecaLexer lexer = new bibliotecaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        bibliotecaParser parser = new bibliotecaParser(tokens);
        parser.inicio();
    }
}
