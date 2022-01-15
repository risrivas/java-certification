package org.paumard.files;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PlayWithPath1 {

    public static void main(String[] args) {
        Path path1 = Paths.get("c:/images/jpegs/../../videos/../videos");

        // new in Java 11
        Path path2 = Path.of("c:/images/pngs/");

        System.out.println("path1 = " + path1);
        System.out.println("path2 = " + path2);
        System.out.println("path1 = " + path1.getClass());

        // relativize - if path1 is absolute and path2 is not - exception
        Path relativize = path1.relativize(path2);
        System.out.println("relativize = " + relativize);

        // normalize - will resolve ../ or ./ or symbolic links
        Path normalize1 = path1.normalize();
        System.out.println("normalize1 = " + normalize1);

        // getting a path from File System
        File file = new File("files/images");
        Path path = Paths.get("files/images");

        FileSystem fileSystem = path.getFileSystem();
        System.out.println("fileSystem = " + fileSystem);
    }
}
