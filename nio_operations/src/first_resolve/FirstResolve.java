package first_resolve;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FirstResolve {

    public static void main(String[] args) {
        Path dir = Paths.get("/pasta1/subpasta1/");
        Path file = Paths.get("subpasta2/arquivo.txt");

        //junta os dois paths, o primeiro é um caminho absoluto e o outro um relativo. Só funciona absoluto resolvendo relativo. Caminhos absolutos não sãao resolvidos, porque já são absolutos
        Path resolve = dir.resolve(file);

        System.out.println(resolve);
    }
}
