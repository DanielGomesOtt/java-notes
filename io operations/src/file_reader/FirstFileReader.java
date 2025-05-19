package file_reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FirstFileReader {

    public static void main(String[] args) {
        File file  = new File("file_writer.txt");
        // aqui ele retorna o número da tabela ascii correspondente ao caracter do texto, por isso que usando casting para char no output.
        //fazemos um while aonde i vai recebendo e escrevendo enquanto é diferente de -1, porque quando o .read() retornar -1, quer dizer que o conteudo acabou
        try (FileReader fr = new FileReader(file)) {
            int i;
            while((i=fr.read()) != -1){
                System.out.print((char)i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
