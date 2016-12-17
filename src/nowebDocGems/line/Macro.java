
package nowebDocGems.line;

import java.util.List;
import nowebDocGems.Generator;

public class Macro extends Line {

    public Macro(String instruction) {
        super(instruction);
    }

    @Override
    public List<String> expand(Generator x, String indent) {
        List<String> subProgram = x.expand(text, indent);
        return subProgram;
    }

}
