package org.paumard.files;

import java.io.File;

public class PlayWithFiles0 {

    public static void main(String[] args) {
        File file = new File("files/sonnet.txt");
        System.out.printf("file = %s%n",file);

        System.out.println("file.exists() = " + file.exists());
        System.out.println("file.isDirectory() = " + file.isDirectory());
        System.out.println("file.isFile() = " + file.isFile());
    }
}
