package part2;

import java.util.Arrays;
import java.util.Scanner;

public class Java_Arraylist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arrayCount = scan.nextInt();
        int[] arr = new int[arrayCount];
        for (int i = 0; i < arrayCount; i++) {
            int arraySize = scan.nextInt();
            for (int j = 0; j < arraySize; j++) {
                arr[i] = scan.nextInt();
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
