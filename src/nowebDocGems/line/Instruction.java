
package nowebDocGems.line;

import java.util.ArrayList;
import java.util.List;
import nowebDocGems.Generator;

public class Instruction extends Line {

    public Instruction(String instruction) {
        super(instruction);
    }

    @Override
    public List<String> expand(Generator x, String indent) {
        List<String> r = new ArrayList<>();
        r.add(text);
        return r;
    }
}
