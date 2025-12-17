package Chain100Days;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileBufferedReader {
    public static void main(String[] args) {

        String filePath = "input.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));{

                String line;
                while ((line = reader.readLine()) != null){
                    System.out.println(line);
                }
            }
        }catch (IOException e){
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}

// Read a text file line by line using BufferedReader