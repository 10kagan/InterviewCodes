package Chain100Days;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class WriteListToFile {
    public static void main(String[] args) {

        List<String> lines = Arrays.asList(
                "Apple",
                "Banana",
                "Cherry"
        );

        String filePath = "output.txt";

        try {
            Files.write(Paths.get(filePath), lines);
            System.out.println("File written successfully.");
        } catch (IOException e){
            System.err.println("Error writing file: " + e.getMessage());
        }
    }
}

// Write a list of strings to a text file