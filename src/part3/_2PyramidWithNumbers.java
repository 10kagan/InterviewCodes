package part3;

import java.util.Scanner;

public class _2PyramidWithNumbers {

    public static void printPattern (int num){
        for (int i = 1; i<= num; i++){
 //           int numberOfWhiteSpaces = num - 1;
 //           printString(" ", numberOfWhiteSpaces);

            // print numbers
            printString(i +" ", i);
            // move to next line
            System.out.println("");
        }
    }
    // function to print string given times
    public static void printString(String s, int times){
        for (int j = 0; j < times; j++){
            System.out.print(s);
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter  the rows to print: ");
        int rows = scanner.nextInt();
        scanner.close();

        printPattern(rows);
    }
}
