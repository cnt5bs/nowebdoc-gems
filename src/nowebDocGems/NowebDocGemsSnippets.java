package nowebDocGems;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NowebDocGemsSnippets {

    NowebDocGemsSnippets() {
        inSnippet = false;
        snippetName = null;
        SNIPPETNAME = "^" + BEGIN_SNIPPET + "([^>]+)" + END_SNIPPET + "=\\s*";
        snippetNamePat = Pattern.compile(SNIPPETNAME);
        BEGIN_CODE = "^\\~\\~\\~.*";
        END_CODE = "^\\~\\~\\~";
    }
    boolean inSnippet;
    String snippetName;
    Map<String, List<String>> snippetMap;
    private final Pattern snippetNamePat;
    static final String BEGIN_SNIPPET = "<<";
    static final String END_SNIPPET = ">>";
    private final String SNIPPETNAME;
    String BEGIN_CODE;
    String END_CODE;

    void process(String line) {
        if (line.matches(BEGIN_CODE) && !inSnippet) {
            // Read code chunck
            inSnippet = true;
        } else if (line.matches(SNIPPETNAME) && inSnippet) {
            // Read fragment name
            Matcher matcher = snippetNamePat.matcher(line);
            while (matcher.find()) {
                snippetName = matcher.group(1);
                snippetMap.put(snippetName, new ArrayList<>());
            }
        } else if (line.matches(END_CODE) && inSnippet) {
            // Read specification
            inSnippet = false;
            snippetName = null;
        } else if (snippetName != null) {
            // Read code fragment
            snippetMap.get(snippetName).add(line);
        }
    }

    void configure(String nowebdoccfg) {
        try {
            Path documento = Paths.get(nowebdoccfg);
            List<String> texto = java.nio.file.Files.readAllLines(documento);
            Pattern dInicial = Pattern.compile("code\\.begin\\s*=\\s*(.+)");
            Pattern dFinal = Pattern.compile("code\\.end\\s*=\\s*(.+)");
            for (String line : texto) {
                if (line.matches("^\\s*#.+")) {
                    continue;
                }
                Matcher m = dInicial.matcher(line);
                while (m.find()) {
                    BEGIN_CODE = m.group(1);
                }
                m = dFinal.matcher(line);
                while (m.find()) {
                    END_CODE = m.group(1);
                }
            }
        } catch (IOException ex) {
            System.out.printf("*** FATAL! %s not found\n", nowebdoccfg);
            System.exit(0);
        }
    }

}
