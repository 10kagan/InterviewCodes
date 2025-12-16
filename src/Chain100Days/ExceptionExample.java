package Chain100Days;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ExceptionExample {

    public static int divideNumberFromFile(String filePath, int divisor){
        try{
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            String value = lines.get(0);

            int number = Integer.parseInt(value);

            return number / divisor;
        } catch (IOException e){
            System.out.println("File error: " + e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("Invalid number format " + e.getMessage());
        } catch (ArithmeticException e){
            System.out.println("Math error (division by zero?): " + e.getMessage());
        }

        return 0;
    }

    public static void main(String[] args) {
        int result = divideNumberFromFile("number.txt", 0);
        System.out.println("Result: " + result);
    }
}

// Create a method that handles multiple exceptions