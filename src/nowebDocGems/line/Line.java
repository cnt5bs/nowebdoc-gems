
package nowebDocGems.line;

import java.util.List;
import nowebDocGems.NowebDocGems;

public abstract class Line {

    Line(String instruction) {
        text = instruction;
    }
    String text;

    public abstract List<String> expand(NowebDocGems x);


    @Override
    public String toString() {
        return text;
    }
}

