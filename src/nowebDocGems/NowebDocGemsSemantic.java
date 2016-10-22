
package nowebDocGems;

import nowebDocGems.line.Macro;
import nowebDocGems.line.Instruction;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import nowebDocGems.gram.NowebDocGemsLexer;
import nowebDocGems.gram.NowebDocGemsParser;
import nowebDocGems.gram.NowebDocGemsParserBaseListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class NowebDocGemsSemantic extends NowebDocGemsParserBaseListener {

    NowebDocGemsSemantic() {
        specificationLst = new ArrayList<>();
    }
    String versao = "nowebdoc-gems (C) 2016, v0.2.2";
    String configuration;
    String snippetName;
    List<String> specificationLst;

    void addSpecification(String specification) {
        specificationLst.add(specification);
    }



    @Override
    public void enterBlock(NowebDocGemsParser.BlockContext ctx) {
        String macro = ctx.MACROTEXT().getText();
        Macro m = new Macro(macro);
        owner.addMacro(currentKeyName, m);
    }

    @Override
    public void enterInstructionText(NowebDocGemsParser.InstructionTextContext ctx) {
        String instruction = ctx.SNIPPETTEXT().getText();
        Instruction n = new Instruction(instruction);
        owner.addInstruction(currentKeyName, n);
    }

    @Override
    public void enterMinor(NowebDocGemsParser.MinorContext ctx) {
        String instruction = ctx.MINOR().getText();
        Instruction n = new Instruction(instruction);
        owner.addInstruction(currentKeyName, n);
    }

    @Override
    public void enterTil(NowebDocGemsParser.TilContext ctx) {
        String instruction = ctx.TIL().getText();
        Instruction n = new Instruction(instruction);
        owner.addInstruction(currentKeyName, n);
    }

    @Override
    public void exitKeyName(NowebDocGemsParser.KeyNameContext ctx) {
        currentKeyName = ctx.MACROTEXT().getText();
        owner.createCodeFrag(currentKeyName);
    }
    String currentKeyName;

    void construir() {
        for (String specification : specificationLst) {
            InputStream is = null;
            try {
                is = new FileInputStream(specification);
                ANTLRInputStream input = null;
                try {
                    input = new ANTLRInputStream(is);
                } catch (IOException ex) {

                }
                NowebDocGemsLexer lexer = new NowebDocGemsLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                NowebDocGemsParser parser = new NowebDocGemsParser(tokens);
                parser.setBuildParseTree(true);
                RuleContext arvore = parser.specification();
                ParseTreeWalker walker = new ParseTreeWalker();
                walker.walk(this, arvore);
            } catch (FileNotFoundException ex) {

            } finally {
                try {
                    is.close();
                } catch (IOException ex) {

                }
            }
        }
    }

    void owner(NowebDocGems aThis) {
        owner = aThis;
    }
    NowebDocGems owner;
}

