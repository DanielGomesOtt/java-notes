package dos_file_attributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class FirstDosFileAttributes {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta1/subpasta1/subpasta2/arquivo1.txt");

        DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
        System.out.println(dosFileAttributes.isHidden());
        System.out.println(dosFileAttributes.isReadOnly());

        DosFileAttributeView dosFileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);
        dosFileAttributeView.setHidden(true);
        dosFileAttributeView.setReadOnly(true);
        System.out.println(dosFileAttributeView.readAttributes().isReadOnly());
        System.out.println(dosFileAttributeView.readAttributes().isHidden());
        dosFileAttributeView.setHidden(false);
        dosFileAttributeView.setReadOnly(false);


    }
}
