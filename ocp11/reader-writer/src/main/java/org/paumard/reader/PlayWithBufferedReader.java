package org.paumard.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class PlayWithBufferedReader {

    public static void main(String[] args) {

        Path path = Path.of("files/sonnet.txt");

        // using readLine()
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line = reader.readLine();
            while (line != null) {
                System.out.println("line = " + line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // using Stream
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            Stream<String> lines = reader.lines();
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
