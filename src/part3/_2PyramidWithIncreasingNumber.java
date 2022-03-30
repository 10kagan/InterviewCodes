package part3;

import java.util.Scanner;

public class _2PyramidWithIncreasingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter  the rows to print: ");
        int rows = scanner.nextInt();
        scanner.close();
        printIncreasingPattern(rows);

    }
    private static void printIncreasingPattern(int rows) {
        for(int i = 1; i <=rows; i++){
            int numberOfSpace = rows - i;
            printString(" ", numberOfSpace);
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
    public static void printString(String s, int times){
        for (int j = 0; j < times; j++){
            System.out.print(s);
        }
    }

}
