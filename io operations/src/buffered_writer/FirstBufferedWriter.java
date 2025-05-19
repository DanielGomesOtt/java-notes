package buffered_writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FirstBufferedWriter {

    public static void main(String[] args) {
        File file = new File("buffered_writer.txt");

        try (FileWriter fw = new FileWriter(file); BufferedWriter bw = new BufferedWriter(fw)) { // você precisa de um file writer para criar um buffered file writer
            file.createNewFile();

            if(file.exists()) {
                bw.write("Escrevendo com buffered writer.... Ele é mais brabo, por escrever em memória");
                bw.newLine();// ao invés de usar \n, com buffered writer você pode usar o .newLine que garante a quebra de linha em qualquer sistema operacional
                bw.flush();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
