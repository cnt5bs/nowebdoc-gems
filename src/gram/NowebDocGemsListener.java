// Generated from NowebDocGems.g4 by ANTLR 4.5.3
package gram;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NowebDocGemsParser}.
 */
public interface NowebDocGemsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NowebDocGemsParser#cmds}.
	 * @param ctx the parse tree
	 */
	void enterCmds(NowebDocGemsParser.CmdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NowebDocGemsParser#cmds}.
	 * @param ctx the parse tree
	 */
	void exitCmds(NowebDocGemsParser.CmdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NowebDocGemsParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(NowebDocGemsParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link NowebDocGemsParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(NowebDocGemsParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link NowebDocGemsParser#configuracao}.
	 * @param ctx the parse tree
	 */
	void enterConfiguracao(NowebDocGemsParser.ConfiguracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link NowebDocGemsParser#configuracao}.
	 * @param ctx the parse tree
	 */
	void exitConfiguracao(NowebDocGemsParser.ConfiguracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link NowebDocGemsParser#trecho}.
	 * @param ctx the parse tree
	 */
	void enterTrecho(NowebDocGemsParser.TrechoContext ctx);
	/**
	 * Exit a parse tree produced by {@link NowebDocGemsParser#trecho}.
	 * @param ctx the parse tree
	 */
	void exitTrecho(NowebDocGemsParser.TrechoContext ctx);
	/**
	 * Enter a parse tree produced by {@link NowebDocGemsParser#documento}.
	 * @param ctx the parse tree
	 */
	void enterDocumento(NowebDocGemsParser.DocumentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link NowebDocGemsParser#documento}.
	 * @param ctx the parse tree
	 */
	void exitDocumento(NowebDocGemsParser.DocumentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link NowebDocGemsParser#ajuda}.
	 * @param ctx the parse tree
	 */
	void enterAjuda(NowebDocGemsParser.AjudaContext ctx);
	/**
	 * Exit a parse tree produced by {@link NowebDocGemsParser#ajuda}.
	 * @param ctx the parse tree
	 */
	void exitAjuda(NowebDocGemsParser.AjudaContext ctx);
	/**
	 * Enter a parse tree produced by {@link NowebDocGemsParser#versao}.
	 * @param ctx the parse tree
	 */
	void enterVersao(NowebDocGemsParser.VersaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link NowebDocGemsParser#versao}.
	 * @param ctx the parse tree
	 */
	void exitVersao(NowebDocGemsParser.VersaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link NowebDocGemsParser#erro}.
	 * @param ctx the parse tree
	 */
	void enterErro(NowebDocGemsParser.ErroContext ctx);
	/**
	 * Exit a parse tree produced by {@link NowebDocGemsParser#erro}.
	 * @param ctx the parse tree
	 */
	void exitErro(NowebDocGemsParser.ErroContext ctx);
}