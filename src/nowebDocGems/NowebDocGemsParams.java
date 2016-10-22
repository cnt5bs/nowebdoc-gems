
package nowebDocGems;

import nowebDocGems.gram.ParamBaseListener;
import nowebDocGems.gram.ParamLexer;
import nowebDocGems.gram.ParamParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class NowebDocGemsParams extends ParamBaseListener {
    
@Override
public void exitTrecho(ParamParser.TrechoContext ctx) {
    paramRec.snippetName = ctx.TEXTO().getText();
}

    
@Override
public void exitSpecification(ParamParser.SpecificationContext ctx) {
    paramRec.addSpecification(ctx.TEXTO().getText());
}

    
@Override
public void exitConfiguracao(ParamParser.ConfiguracaoContext ctx) {
    paramRec.configuration = ctx.TEXTO().getText();
}

    
@Override
public void exitVersion(ParamParser.VersionContext ctx) {
    System.out.printf("%s\n", paramRec.versao);
    System.exit(0);
}

    
@Override
public void exitHelp(ParamParser.HelpContext ctx) {
    System.out.printf("%s\n", paramRec.versao);
    System.out.printf("Use:\n");
    System.out.printf("\tnowebdoc-gems [options] file.md ... > code\n");
    System.out.printf("Options:\n\n");
    System.out.printf("-R frag\t\t\tcode fragment extraction\n");
    System.out.printf("-v, --version\t\ttool version\n");
    System.out.printf("-h, --help\t\tthis information\n");
    System.exit(0);
}

    
@Override
public void exitErro(ParamParser.ErroContext ctx) {
    String cadeia = ctx.ErroIsolado().toString();
    System.out.printf("*** FATAL! What means '%s'\n", cadeia);
    System.out.printf("\tin: '$s'?\n", ctx.getStart().getInputStream());
    System.out.println("\tnowebdoc-gems --help");
    System.exit(-1);
}

    
void processar(String[] args, NowebDocGemsSemantic paramRec) {
    this.paramRec = paramRec;
    String linha = "";
    for (String arg : args) {
        linha += arg + " ";
    }
    ANTLRInputStream input = new ANTLRInputStream(linha);
    ParamLexer lexer = new ParamLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    ParamParser parser = new ParamParser(tokens);
    parser.setBuildParseTree(true);
    RuleContext arvore = parser.params();
    ParseTreeWalker walker = new ParseTreeWalker();
    walker.walk(this, arvore);
}

    NowebDocGemsSemantic paramRec;
}
