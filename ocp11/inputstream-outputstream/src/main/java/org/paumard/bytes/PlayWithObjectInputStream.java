package org.paumard.bytes;

import java.io.*;

public class PlayWithObjectInputStream {

    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("files/users.bin"))) {

            Object o1 = ois.readObject();
            Object o2 = ois.readObject();

            System.out.println("paul = " + o1);
            System.out.println("jennifer = " + o2);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
