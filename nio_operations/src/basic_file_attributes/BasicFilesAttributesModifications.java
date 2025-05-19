package basic_file_attributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFilesAttributesModifications {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta1/subpasta1/subpasta2/arquivo1.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);

        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModified = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();

        System.out.println("creationTime " + creationTime);
        System.out.println("lastModified " + lastModified);
        System.out.println("lastAccessTime " + creationTime);
        System.out.println("----------------------------------");
        BasicFileAttributeView basicFileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        basicFileAttributeView.setTimes(lastModified, newCreationTime, creationTime);

        creationTime = basicFileAttributeView.readAttributes().creationTime();
        lastModified = basicFileAttributeView.readAttributes().lastModifiedTime();
        lastAccessTime = basicFileAttributeView.readAttributes().lastAccessTime();

        System.out.println("creationTime " + creationTime);
        System.out.println("lastModified " + lastModified);
        System.out.println("lastAccessTime " + creationTime);


    }
}
