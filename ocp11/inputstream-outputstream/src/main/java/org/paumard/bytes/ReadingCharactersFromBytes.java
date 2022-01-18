package org.paumard.bytes;

import java.io.*;

public class ReadingCharactersFromBytes {

    public static void main(String[] args) {

        String hello = "Hello world!";

        ByteArrayOutputStream buffer = null;
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             OutputStreamWriter writer = new OutputStreamWriter(bos)) {

            writer.write(hello);
            buffer = bos;

        } catch (IOException e) {
            e.printStackTrace();
        }

        byte[] bytes = buffer.toByteArray();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bytes)))) {
            String s = reader.readLine();
            System.out.println("s = " + s);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
