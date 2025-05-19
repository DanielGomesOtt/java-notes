package zip_output_stream;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

// zipando um arquivo
public class FirstZipOutputStream {

    public static void main(String[] args) {
        //arquivo zip que será gerado
        Path arquivoZip = Paths.get("pasta1/subpasta1/subpasta2/arquivo.zip");
        //arquivo que será zipado
        Path arquivoParaZipar = Paths.get("pasta1");
        zip(arquivoZip, arquivoParaZipar);
    }

    public static void zip(Path arquivoZip, Path arquivoParaZipar) {
        //chama um ZipOutputStream no try com resources para fechar ele. Precisa passar um outputstream para dizer que o output será o arquivo zip passado
        //tambem é passado um directory stream para percorrer as pastas que serão zipadas
        try (ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(arquivoZip)); DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivoParaZipar)) {

            for (Path file : directoryStream) {
                //preparada a entrada do arquivo no zip
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                //coloca o arquivo no zip
                zipOutputStream.putNextEntry(zipEntry);
                //fecha entrada no arquivo no zip
                zipOutputStream.closeEntry();
            }

            System.out.println("Arquivos zipados com sucesso");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
