package part3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _2PyramidInvertedWithNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int rows = scanner.nextInt();
        scanner.close();
        invertedPyramid(rows);
    }
    public static void printString(String s, int times){
        for (int j = 0; j < times; j++){
            System.out.print(s + " ");
        }
    }
    public static void invertedPyramid (int rows){
        for (int i = rows; i >= rows; i--){
            int numberOfWhiteSpaces = (rows - i)*2;
            printString(" ", numberOfWhiteSpaces);
            printString( " ", i);
            for (int k = i; k >= i; k--){
             //   printString(" ", k);
                System.out.print(k+ " ");
            }
            System.out.println("");;
        }
    }
}
