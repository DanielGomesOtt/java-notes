package first_relative;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FirstRelative {

    public static void main(String[] args) {
        Path dir = Paths.get("/home/daniel");
        Path classe = Paths.get("/home/daniel/projetos/classes/OlaMundo.java");
        //como chegar na classe a partir do caminho que já estou que é o dir
        Path pathToClasse = dir.relativize(classe);
        System.out.println(pathToClasse);

        //como voltar da classe para o caminho que eu estava
        Path classeToPath = classe.relativize(dir);
        System.out.println(classeToPath);
    }
}
