package se.lexicon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Exercise8 {
    public static void main(String[] args) {
        writeToFile();
    }

    private static void writeToFile() {

        Path path = Path.of("src/main/resources/names.txt");

        try (BufferedWriter writer = Files.newBufferedWriter(path, StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {

            writer.append("baraa");
            writer.append(",");

            System.out.println("Data written successfully");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
