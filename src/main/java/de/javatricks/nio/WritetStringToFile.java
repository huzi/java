package de.javatricks.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Created by thomas on 12.02.15.
 */
public class WritetStringToFile {

    public static void main(String[] args) {
        List<String> lines = Arrays.asList("first line", "second line", "third line");
        try {
            Files.write(Paths.get("lines.txt"), lines);
            Files.write(Paths.get("output.txt"), "Some text".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
