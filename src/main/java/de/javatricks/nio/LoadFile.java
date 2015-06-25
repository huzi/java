package de.javatricks.nio;

import org.testng.reporters.Files;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Created by thomas18 on 19.05.2015.
 */
public class LoadFile {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Bier");
        list.get(2);


        Integer.parseInt("Bier statt Zahlen");
        System.out.println(getFileContent("D:\\globdatdfa.ini"));
    }

    private static String getFileContent(String fileName) {
        try {
            return Files.readFile(Paths.get(fileName).toFile());
        } catch (IOException e) {
            e.printStackTrace();
            // exception handling etc.
        } finally {
            return "";
        }
    }
//
//    private static String getFileContent(String fileName) throws IOException {
//            return Files.readFile(Paths.get(fileName).toFile());
//    }

}
