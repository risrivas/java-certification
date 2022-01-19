package org.paumard.bytes;

import org.paumard.bytes.model.User;

import java.io.*;

public class PlayWithObjectStream {

    public static void main(String[] args) {

        User u1 = new User("Paul", 23);
        User u2 = new User("Jennifer", 25);

        // write object
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("files/users.bin"))) {

            oos.writeObject(u1);
            oos.writeObject(u2);

        } catch (IOException e) {
            e.printStackTrace();
        }

        // read object
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("files/users.bin"))) {

            User paul = (User) ois.readObject();
            User jennifer = (User) ois.readObject();

            System.out.println("paul = " + paul);
            System.out.println("jennifer = " + jennifer);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
