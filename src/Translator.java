import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Translator {
    public static void main(String[] args) throws Exception {
        try{
            // crear un analizador léxico que se alimenta a partir de la entrada
            b2bLexer lexer = new b2bLexer(CharStreams.fromFileName("./input/input.in"));
            // Identificar al analizador léxico como fuente de tokens para el sintactico
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // Crear el objeto correspondiente al analizador sintáctico que se alimenta a partir del buffer de tokens
            b2bParser parser = new b2bParser(tokens);
            ParseTree tree = parser.root(); // Iniciar el analisis sintáctico en la regla inicial: root
            //System.out.println(tree.toStringTree(parser)); imprime el arbol al estilo LISP
        } catch (Exception e){
            System.err.println("Error (Test): " + e);
        }
    }
}

