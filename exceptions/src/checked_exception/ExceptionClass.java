package checked_exception;

import java.io.File;
import java.io.IOException;

public class ExceptionClass {

    public static void main(String[] args) {
        ExceptionClass.criarArquivo();
    }

    private static void criarArquivo() {
        File file = new File("test.txt");

        try {
            file.createNewFile(); //checked exception que precisa ser trada obrigatóriamente para ser compilada
            System.out.println("Arquivo criado");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
