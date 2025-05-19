package first_normalize;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FirstNormalize {

    public static void main(String[] args) {
        String path = "pasta_normalize/subpasta_normalize";
        String arquivoTxt = "../../arquivo.txt";

        Path path1 = Paths.get(path, arquivoTxt);

        System.out.println(path1);
        System.out.println(path1.normalize()); //normalize retorna o path normalizado tirando os elementos redundantes
    }
}
