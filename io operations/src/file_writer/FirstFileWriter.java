package file_writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FirstFileWriter {

    public static void main(String[] args) {
        File file = new File("file_writer.txt");

        try (FileWriter fw = new FileWriter(file, true)){  //garante que o processo de escrever arquivo será fechado no final, da para usar um fw.close() no final também. Segundo arqgumento do file wirter diz se vai adicionar mais texto = true
            boolean isCreated = file.createNewFile();
            fw.write("Olá tudo bem\n");
            fw.flush(); //envia tudo do buffer antes de fechar o arquivo para que não se perca informações
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
