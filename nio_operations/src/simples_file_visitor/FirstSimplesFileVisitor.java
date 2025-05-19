package simples_file_visitor;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFiles extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult visitFile (Path file, BasicFileAttributes attributes) {
        if(file.getFileName().toString().endsWith(".java")){
            System.out.println(file.getFileName());
        }

        //o retorno de FileVisitResult tem que ser a regra que ele segue ao encontrar um conteudo. No caso ele está continuando a busca
        return FileVisitResult.CONTINUE;
    }
}

public class FirstSimplesFileVisitor {

    public static void main(String[] args) throws IOException {
        Path root = Paths.get(".");
        Files.walkFileTree(root, new ListAllFiles());
    }
}
