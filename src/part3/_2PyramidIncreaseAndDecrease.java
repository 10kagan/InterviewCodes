package part3;

import java.util.Scanner;

public class _2PyramidIncreaseAndDecrease {
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
        PyramidIncDec(rows);
    }
    public static void PyramidIncDec(int rows){
        for (int i = 1; i <= rows; i++){
            int numberOfWhiteSpaces = (rows - i) * 2;
            printString(" ", numberOfWhiteSpaces);
            for (int k = 1; k <= i -1; k++){
                System.out.print(k+ " ");
            }
            for (int j = i; j >0; j--){
                System.out.print(j+ " ");
            }
            System.out.println("");
        }
    }



}
