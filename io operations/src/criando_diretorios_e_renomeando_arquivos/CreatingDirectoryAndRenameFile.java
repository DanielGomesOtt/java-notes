package criando_diretorios_e_renomeando_arquivos;

import java.io.File;
import java.io.IOException;

public class CreatingDirectoryAndRenameFile {

    public static void main(String[] args) {
        File dir = new File("pasta");
        dir.mkdir();

        File file1 = new File(dir, "arquivo1.txt");
        try {
            if(file1.createNewFile()) {
                System.out.println("Criou arquivo 1 na pasta");

                File file2 = new File(dir, "arquivo2.txt");
                if(file1.renameTo(file2)) {
                    System.out.println("Renomeou arquivo para arquivo2.txt");

                    File dir2 = new File("dir2");
                    if(dir.renameTo(dir2)) {
                        System.out.println("Renomeou dir para dir2");
                    }
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
