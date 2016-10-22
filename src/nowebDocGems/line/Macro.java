
package nowebDocGems.line;

import java.util.List;
import nowebDocGems.NowebDocGems;

public class Macro extends Line {

    public Macro(String instruction) {
        super(instruction);
    }

    @Override
    public List<String> expand(NowebDocGems x) {
        List<String> subProgram = x.expand(text);
        return subProgram;
    }

}
