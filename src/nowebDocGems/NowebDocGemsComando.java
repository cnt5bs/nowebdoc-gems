package nowebDocGems;
import gram.NowebDocGemsBaseListener;
import gram.NowebDocGemsLexer;
import gram.NowebDocGemsParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
public class NowebDocGemsComando
    extends NowebDocGemsBaseListener {
    @Override
    public void exitConfiguracao( NowebDocGemsParser.ConfiguracaoContext ctx) {
        cmd.configuration = ctx.TEXTO().getText();
    }
    @Override
    public void exitTrecho( NowebDocGemsParser.TrechoContext ctx) {
        cmd.snippetName = ctx.TEXTO().getText();
    }
    @Override
    public void exitDocumento(NowebDocGemsParser.DocumentoContext ctx) {
        cmd.descriptionName = ctx.TEXTO().getText();
    }
    @Override
    public void exitVersao(NowebDocGemsParser.VersaoContext ctx) {
        System.out.printf( "%s\n", NowebDocGems.versao );
        System.exit( 0 );
    }
    @Override
    public void exitAjuda(NowebDocGemsParser.AjudaContext ctx) {
        System.out.printf( "Use:\n" );
        System.out.printf( "\tnowebdoc-gems [options] file.md > code\n" );
        System.out.printf( "Options:\n\n" );
        System.out.printf( "-R frag\t\tcode fragment extraction\n" );
        System.out.printf( "-v, --version\t\ttool version\n" );
        System.out.printf( "-h, --help\t\tthis information\n" );
        System.exit( 0 );
    }
    @Override
    public void exitErro(NowebDocGemsParser.ErroContext ctx) {
        String cadeia = ctx.ErroIsolado().toString();
        System.out.printf("*** FATAL! What means '%s'\n", cadeia);
        System.out.printf("\tin: '$s'?\n", ctx.getStart().getInputStream());
        System.out.println("\tnoweb-pandoc --help");
        System.exit(-1);
    }
    NowebDocGemsComando() {
        cmd = new NowebDocGems();
    }
    NowebDocGems cmd;
    static NowebDocGems construirCmd( String[] args ) {
        String linha = "";
        for (String arg : args) {
            linha += arg + " ";
        }
        ANTLRInputStream input = new ANTLRInputStream(linha);
        NowebDocGemsLexer lexer = new NowebDocGemsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        NowebDocGemsParser parser = new NowebDocGemsParser(tokens);
        parser.setBuildParseTree(true);
        RuleContext arvore = parser.cmds();
        ParseTreeWalker walker = new ParseTreeWalker();
        NowebDocGemsComando analisador = new NowebDocGemsComando();
        walker.walk(analisador, arvore);
        return analisador.cmd;
    }
}
