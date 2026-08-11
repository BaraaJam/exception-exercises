package se.lexicon;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public class Exercise4 {
    static void main(String[] args) {
        readAndParseInt();
    }

    private static void readAndParseInt() {
        Path path = Path.of("src/main/resources/numbers.txt");

        try {
            for (String line : Files.readAllLines(path)) {
                try {
                    System.out.println(Integer.parseInt(line));
                } catch (NumberFormatException e) {
                    System.err.println("Invalid number: " + line);
                }
            }
        } catch(NoSuchFileException e) {
            System.out.println("Error: File not found or invalid path - " + e.getMessage());
        } catch (IOException e){
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
