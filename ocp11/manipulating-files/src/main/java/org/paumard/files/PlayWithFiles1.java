package org.paumard.files;

import java.io.File;
import java.io.IOException;

public class PlayWithFiles1 {

    public static void main(String[] args) throws IOException {
        // Create file
        File file = new File("files/sonnet2.txt");
        boolean fileCreated = file.createNewFile();
        System.out.println("fileCreated = " + fileCreated);

        // Create dir
        File dir = new File("files/data");
        boolean dirCreated = dir.mkdir();
        System.out.println("dirCreated = " + dirCreated);

        // Create dir and sub-dir
        File mdir = new File("files/data2/more-data");
        boolean mdirCreated = mdir.mkdirs(); // mkdirs() is same as "mkdir -p" in bash
        System.out.println("mdirCreated = " + mdirCreated);

        // Delete dir
        boolean delete = mdir.delete();
        System.out.println("delete = " + delete);

        // Dir methods
        dir = new File("random");
        dirMethods(dir);

        dir = new File("images/mountain.jpg");
        dirMethods(dir);

        dir = new File("images/images/mountain.jpg");
        dirMethods(dir);

        dir = new File("images/.././././images/mountain.jpg");
        dirMethods(dir);
    }

    private static void dirMethods(File dir) throws IOException {
        String name = dir.getName();
        String parent = dir.getParent();
        String path = dir.getPath();
        String absolutePath = dir.getAbsolutePath();
        String canonicalPath = dir.getCanonicalPath();

        System.out.println("************************");
        System.out.println("name = " + name);
        System.out.println("parent = " + parent);
        System.out.println("path = " + path);
        System.out.println("absolutePath = " + absolutePath);
        System.out.println("canonicalPath = " + canonicalPath);
        System.out.println("************************");
    }
}
