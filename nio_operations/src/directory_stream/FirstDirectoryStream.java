package directory_stream;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FirstDirectoryStream {

    public static void main(String[] args) {
         Path dir = Paths.get(".");
         //com directory stream eu consigo pegar uma lista de diretórios do path que passo criando ele
        //depois só iterar e ver os diretorios
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for(Path path: stream) {
                System.out.println(path.getFileName());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
