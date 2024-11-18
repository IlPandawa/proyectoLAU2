import org.antlr.runtime.*;

public class TestRDF {
    public static void main(String[] args) throws Exception {
        
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        gramRDFLexer lexer = new gramRDFLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        gramRDFParser parser = new gramRDFParser(tokens);
        parser.inicio();
    }
}
