package part3;

import java.util.Scanner;

public class _2PyramidWithCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter  the rows to print: ");
        int rows = scanner.nextInt();
        scanner.close();
        printChars(rows);
    }
    public static void printChars(int rows){
        for (int i = 0; i <= rows; i++){
            int numberOfWhiteSpace = rows - i;
            printString(" ", numberOfWhiteSpace);
            printString(" *", i);
            System.out.println(" ");
        }
    }
    public static void printString(String s, int times){
        for (int j = 0; j < times; j++){
            System.out.print(s);
        }
    }
}
