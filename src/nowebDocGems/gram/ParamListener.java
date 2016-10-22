// Generated from Param.g4 by ANTLR 4.5.3
package nowebDocGems.gram;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParamParser}.
 */
public interface ParamListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParamParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(ParamParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParamParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(ParamParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParamParser#option}.
	 * @param ctx the parse tree
	 */
	void enterOption(ParamParser.OptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParamParser#option}.
	 * @param ctx the parse tree
	 */
	void exitOption(ParamParser.OptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParamParser#specification}.
	 * @param ctx the parse tree
	 */
	void enterSpecification(ParamParser.SpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParamParser#specification}.
	 * @param ctx the parse tree
	 */
	void exitSpecification(ParamParser.SpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParamParser#configuracao}.
	 * @param ctx the parse tree
	 */
	void enterConfiguracao(ParamParser.ConfiguracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParamParser#configuracao}.
	 * @param ctx the parse tree
	 */
	void exitConfiguracao(ParamParser.ConfiguracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParamParser#trecho}.
	 * @param ctx the parse tree
	 */
	void enterTrecho(ParamParser.TrechoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParamParser#trecho}.
	 * @param ctx the parse tree
	 */
	void exitTrecho(ParamParser.TrechoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParamParser#help}.
	 * @param ctx the parse tree
	 */
	void enterHelp(ParamParser.HelpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParamParser#help}.
	 * @param ctx the parse tree
	 */
	void exitHelp(ParamParser.HelpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParamParser#version}.
	 * @param ctx the parse tree
	 */
	void enterVersion(ParamParser.VersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParamParser#version}.
	 * @param ctx the parse tree
	 */
	void exitVersion(ParamParser.VersionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParamParser#erro}.
	 * @param ctx the parse tree
	 */
	void enterErro(ParamParser.ErroContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParamParser#erro}.
	 * @param ctx the parse tree
	 */
	void exitErro(ParamParser.ErroContext ctx);
}