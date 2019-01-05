//主函数
import com.antlr.out.prologLexer;
import com.antlr.out.prologParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileInputStream;

public class Mytranslation {
    public static void main(String[] args) throws Exception {
        File file = new File("E:\\prolog2NL\\src\\main\\java\\t.prolog");
        FileInputStream is = new FileInputStream(file);
        ANTLRInputStream input = new ANTLRInputStream(is);
        prologLexer lexer = new prologLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        prologParser parser = new prologParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.p_text();
        ParseTreeWalker walker = new ParseTreeWalker();
        prolog2NL.prologEmitter converter = new prolog2NL.prologEmitter();
        walker.walk(converter, tree);
        System.out.println(converter.getprolog(tree));

    }
}
