
package nowebDocGems;
public class NowebDocGems {
    
void configure(String[] args) {
    
generator = new Generator();
semantic = new Semantic();
semantic.owner(generator);

    
Params params = new Params();
params.processar(args, semantic);

    
semantic.construir();

}
Generator generator;
Semantic semantic;

    
void generate() {
    generator.generate(semantic.snippetName);
    generator.showDic();
}

}
