package buffered_reader;

import java.io.*;

public class FirstBufferedReader {

    public static void main(String[] args) {
        File file  = new File("buffered_writer.txt");

        // no buffered reader já conseguimos retornar a linha inteira se quisermos e quando o arquivo acaba ele retorna null ao inès de -1
        try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)) {
            String linha;
            while((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
