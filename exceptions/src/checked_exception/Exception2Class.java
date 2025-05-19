package checked_exception;

import java.io.File;
import java.io.IOException;

public class Exception2Class {

    public static void main(String[] args) {
        try {
            Exception2Class.criarArquivo();
        } catch (IOException e) {
            System.out.println("deu ruim");
        }
    }

    private static void criarArquivo() throws IOException {
        File file = new File("test.txt");

        try {
            file.createNewFile(); //checked exception que precisa ser trada obrigatóriamente para ser compilada
            System.out.println("Arquivo criado");
        } catch(IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
