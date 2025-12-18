package Chain100Days;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileLineReader {

    public String readFirstLine (String filePath) throws IOException {

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            return reader.readLine();
        }
    }
}

// Test a method that reads from a file