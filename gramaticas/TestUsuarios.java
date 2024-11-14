import org.antlr.runtime.*;

public class TestUsuarios {
    public static void main(String[] args) throws Exception {
        
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        gramUsuarioLexer lexer = new gramUsuarioLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        gramUsuarioParser parser = new gramUsuarioParser(tokens);
        parser.inicio();
    }
}
