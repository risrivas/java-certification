package org.paumard.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PlayWithBufferedWriter {

    public static void main(String[] args) {

        Path path = Path.of("files/words.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write("Writing to a buffered writer using path");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
