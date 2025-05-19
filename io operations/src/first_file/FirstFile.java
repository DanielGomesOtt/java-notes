package first_file;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FirstFile {

    public static void main(String[] args) throws IOException {

        File file = new File("first file.txt"); // posso passar o caminho absoluto ou só o nome para criar na raiz do projeto

        boolean isCreated = file.createNewFile(); // retorna um boolean dizendo se foi criado ou não

        if(isCreated){
            System.out.println("Arquivo criado: " + file.getName());
        }

        System.out.println("É um arquivo: " +  file.isFile());
        System.out.println("É um diretório: " +  file.isDirectory());
        System.out.println("Caminho: " +  file.getPath());
        System.out.println("Caminho absoluto: " +  file.getAbsolutePath());
        System.out.println("Último modificadoção: " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDateTime());
        boolean exists = file.exists();
        if(exists){
            file.delete();
            System.out.println("Arquivo deletado com sucesso");
        }


    }
}
