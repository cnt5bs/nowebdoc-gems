
package nowebDocGems.line;

import java.util.List;
import nowebDocGems.Generator;

public abstract class Line {

    Line(String instruction) {
        text = instruction;
    }
    String text;

    public abstract List<String> expand(Generator x, String indent);

    public void add(Instruction n) {
        text += n.text;
    }

    @Override
    public String toString() {
        return text;
    }
}

