package Chain100Days;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCsvToList {

    public static void main(String[] args) {
        String filePath = "users.csv";
        List<String[]> rows = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){

            String line;
            while ((line = br.readLine()) != null) {
                String [] columns = line.split(",");
                rows.add(columns);
            }
        }catch(IOException e){
            System.err.println("Error reading CSV file: " + e.getMessage());
        }

        for (String [] row : rows){
            System.out.println(
                    "Name: " + row[0] +
                            " , Age: " + row[1] +
                            " , Country: + " + row[2]
            );
        }
    }
}

// Write a program that reads a CSV file into a list