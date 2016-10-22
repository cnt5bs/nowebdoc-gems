
package nowebDocGems;

import nowebDocGems.line.Macro;
import nowebDocGems.line.Instruction;
import nowebDocGems.line.Line;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NowebDocGems {
    
NowebDocGems() {
    snippetMap = new HashMap<>();
}
NowebDocGemsSemantic semantic;
Map<String, List<Line>> snippetMap;

    
void configure(String[] args) {
    
semantic = new NowebDocGemsSemantic();
semantic.owner(this);

    
NowebDocGemsParams params = new NowebDocGemsParams();
params.processar(args, semantic);

    
semantic.construir();

}

    
void generate() {
    List<String> program = expand(semantic.snippetName);
    program.forEach( (lin) -> {
        System.out.print( lin );
    });
}

    
public List<String> expand(String snippetName) {
    if (!snippetMap.containsKey(snippetName)) {
        System.out.printf("*** FATAL! Code snippet\n");
        System.out.printf("\t%s not found in description '%s'", snippetName, snippetName);
        System.exit(-1);
    }
    List<Line> snippetLst = snippetMap.get(snippetName);
    List<String> program = new ArrayList<>();
    snippetLst.stream().forEach(
        line -> {
            List<String> subProgram = line.expand(this);
            program.addAll( subProgram );
        }
    );
    return program;
}

    
void addMacro(String currentKeyName, Macro m) {
    List<Line> instruction = snippetMap.get(currentKeyName);
    instruction.add(m);
}

    
void addInstruction(String currentKeyName, Instruction n) {
    List<Line> instruction = snippetMap.get(currentKeyName);
    instruction.add(n);
}

    
void createCodeFrag(String currentKeyName) {
    snippetMap.put(currentKeyName, new ArrayList<>());
}

}

