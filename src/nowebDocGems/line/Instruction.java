
package nowebDocGems.line;

import java.util.ArrayList;
import java.util.List;
import nowebDocGems.NowebDocGems;

public class Instruction extends Line {

    public Instruction(String instruction) {
        super(instruction);
    }

    @Override
    public List<String> expand(NowebDocGems x) {
        List<String> r = new ArrayList<>();
        r.add(text);
        return r;
    }
}
