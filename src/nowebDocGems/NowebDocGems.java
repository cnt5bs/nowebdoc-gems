package nowebDocGems;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class NowebDocGems {
    NowebDocGems() {
        configuration = null;
        snippetName = "*";
        descriptionName = null;
    }
    String configuration;
    String snippetName;
    String descriptionName;
    static String versao = "nowebdoc-gems (C) 2016, v0.2.1";
    private List<String> readDescription(String descriptionName) {
        try {
            Path description = Paths.get(descriptionName);
            return java.nio.file.Files.readAllLines(description);
        } catch (NullPointerException | IOException ex) {
            System.out.printf("*** FATAL! Document '%s' not found\n", descriptionName);
            System.exit(-1);
        }
        return null;
    }
    void process( String descriptionName ) {
        List<String> description = readDescription( descriptionName );
        snippetMap = new HashMap<>();
        NowebDocGemsSnippets snippetProcessor = new NowebDocGemsSnippets();
        snippetProcessor.snippetMap = snippetMap;
        if( configuration != null) {
            snippetProcessor.configure( configuration );
        }
        description.stream().forEach(
            line -> {
                snippetProcessor.process(line);
            }
        );
    }
    Map<String, List<String>> snippetMap;
    List<String> expand( String snippetName, String indent ) {
        if( ! snippetMap.containsKey(snippetName) ) {
            System.out.printf( "*** FATAL! Code snippet\n" );
            System.out.printf( "\t<<%s>> not found in description '%s'", snippetName, descriptionName );
            System.exit( -1 );
        }
        List<String> snippetLst = snippetMap.get( snippetName );
        List<String> program = new ArrayList<>();
        String CODE_BLOCK = String.format("(\\s*)%s([^>]+)%s",
            NowebDocGemsSnippets.BEGIN_SNIPPET,
            NowebDocGemsSnippets.END_SNIPPET);
        snippetLst.stream().forEach(
            line -> {
                if (line.matches( CODE_BLOCK )) {
                    Pattern pattern = Pattern.compile( CODE_BLOCK );
                    Matcher matcher = pattern.matcher( line );
                    while (matcher.find()) {
                        String anotherFrag = matcher.group(2);
                        String gap = matcher.group(1);
                        // Recursive call
                        List<String> code = expand( anotherFrag, indent + gap );
                        program.addAll( code );
                    }
                }
                else {
                    program.add( indent + line );
                }
            }
        );
        return program;
    }
    void execute() {
        process( descriptionName );
        for( String line : expand( snippetName, "" ) ) {
            System.out.println( line );
        }
    }
    // Processamento principal
    public static void main( String[] args ) {
        // Objeto de processamento
        NowebDocGems cmd = NowebDocGemsComando.construirCmd( args );
        cmd.execute();
    }
}
