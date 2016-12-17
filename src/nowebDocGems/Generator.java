
package nowebDocGems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import nowebDocGems.line.Instruction;
import nowebDocGems.line.Line;
import nowebDocGems.line.Macro;

public class Generator {

    Generator() {
        snippetMap = new HashMap<>();
        dicMap = new TreeMap<>();
    }
    Map<String, List<Line>> snippetMap;
    Map<String, List<String>> dicMap;

    void generate(String snippetName) {
        List<String> program = expand(snippetName, "");
        program.forEach((lin) -> {
            System.out.print(lin);
        });
    }

    public List<String> expand(String snippetName, String indent) {
        if (!snippetMap.containsKey(snippetName)) {
            System.out.printf("*** FATAL! Code snippet\n");
            System.out.printf("\t%s not found in description '%s'", snippetName, snippetName);
            System.exit(-1);
        }
        List<Line> snippetLst = snippetMap.get(snippetName);
        List<String> program = new ArrayList<>();
        snippetLst.stream().forEach(
            line -> {
                List<String> subProgram = line.expand(this, indent);
                program.addAll(subProgram);
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

    void addSingle(String currentKeyName, Instruction n) {
        List<Line> instruction = snippetMap.get(currentKeyName);
        int k = instruction.size()-1;
        Line l = instruction.get(k);
        l.add(n);
    }

    void createCodeFrag(String currentKeyName) {
        snippetMap.put(currentKeyName, new ArrayList<>());
    }

    
    void dic(String currentKeyName, String currentSpecification) {
        List<String> list;
        if (dicMap.containsKey(currentKeyName)) {
            list = dicMap.get(currentKeyName);
        } else {
            list = new ArrayList<>();
            dicMap.put(currentKeyName, list);
        }
        list.add(0, currentSpecification);
    }

    void used(String macro, String currentKeyName) {
        List<String> list;
        if (dicMap.containsKey(macro)) {
            list = dicMap.get(macro);
        } else {
            list = new ArrayList<>();
            dicMap.put(macro, list);
        }
        list.add(currentKeyName);
    }

    void showDic() {
        dicMap.keySet().forEach((key) -> {
            System.out.println(key);
            boolean def = true;
            for (String ref : dicMap.get(key)) {
                System.out.print("\t" + ref);
                if (def) {
                    System.out.println(" (Def.)");
                    def = false;
                } else {
                    System.out.println("");
                }
            }
        });
    }
}
