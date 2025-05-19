package first_path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FirstPath {

    public static void main(String[] args) {

        Path p1 = Paths.get("D:\\Documentos\\projetos\\io operations\\file_writer.txt"); // aqui eu consigo pegar um arquivo utilizando o caminho dele

        Path p2 = Paths.get("pasta");

        try {
            //criando uma pasta
            if(Files.notExists(p2)){
                Path pastaCriada = Files.createDirectory(p2);
                System.out.println(pastaCriada.getFileName());
            }

            //criando subpastas
            Path subpastas = Paths.get("pasta1/subpasta1/subpasta2");

            if(Files.notExists(subpastas)){
                Path subspastasCriadas = Files.createDirectories(subpastas);
                System.out.println(subspastasCriadas.getFileName());
            }

            //criando arquivo nas subpastas
            Path file1 = Paths.get("pasta1/subpasta1/subpasta2/arquivo1.txt");
            if(Files.notExists(file1)) {
                Path arquivoCriado = Files.createFile(file1);
                System.out.println(arquivoCriado.getFileName());
            }

            // copiando o arquivo criado com outro nome na subpasta
            Path source = file1;
            Path target = Paths.get(file1.getParent().toString(), "arquivo1_renomeado.txt");
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(p1.getFileName()); // aqui consigo exibir o caminho do arquivo
    }
}
