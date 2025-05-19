package basic_file_attributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class LastModified {

    public static void main(String[] args) throws IOException {
        //definindo a data que desejamos modificar
        LocalDateTime date = LocalDateTime.now().minusDays(10);

        //pegando o caminho do arquivo
        Path path = Paths.get("pasta1/subpasta1/subpasta2/arquivo1.txt");
        //Criando o atributo de timestamp do arquivo
        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        //setando atributo de timestamp no arquivo
        Files.setLastModifiedTime(path, fileTime);
    }
}
