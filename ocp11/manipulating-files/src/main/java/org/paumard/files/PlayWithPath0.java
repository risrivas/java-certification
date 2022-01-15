package org.paumard.files;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PlayWithPath0 {

    public static void main(String[] args) {
        Path path1 = Paths.get("c:/images/seaside.jpg");

        // new in Java 11
        Path path2 = Path.of("mountain.jpg");

        System.out.println("path1 = " + path1);
        System.out.println("path2 = " + path2);
        System.out.println("path1 = " + path1.getClass());

        boolean absolute = path1.isAbsolute();
        System.out.println("absolute = " + absolute);

        Path root = path1.getRoot();
        System.out.println("root = " + root);

        // resolve - concat path1 and path2
        // if path2 is absolute, then no concat and only path2 is returned
        Path resolve = path1.resolve(path2);
        System.out.println("resolve = " + resolve);

        // resolve sibling - concat parent of path1 with path2
        // if path1 parent is null, then only return path2
        Path resolveSibling = path1.resolveSibling(path2);
        System.out.println("resolveSibling = " + resolveSibling);
    }
}
