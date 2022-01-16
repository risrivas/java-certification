package org.paumard.writer;

import java.io.IOException;
import java.io.StringWriter;

public class PlayWithStringWriter {

    public static void main(String[] args) {

        try (StringWriter writer = new StringWriter()) {

            writer.write("Hello world!");

            writer.flush();

            StringBuffer buffer = writer.getBuffer();
            System.out.println("buffer = " + buffer);

            String string = writer.toString();
            System.out.println("string = " + string);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
