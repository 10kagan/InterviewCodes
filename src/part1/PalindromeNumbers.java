package part1;

import java.util.Arrays;

public class PalindromeNumbers {
    public static void main(String[] args) {
        System.out.println(isPalindromeNumber(12345432));

    }

    public static boolean isPalindromeNumber(int num){
        boolean result = true;
        int count = 0;

        int z =num;
        while (z > 0){
             z = z / 10;
            count ++;
        }

        int y =num;
        int [] arr1 = new int [count];
        for (int j = count - 1; j >= 0; j--) {
            arr1 [j] = y % 10;
            y = y / 10;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(count);

        int [] arr2 = new int [count];
        for (int i = 0; i < count; i++) {
            arr2 [i] = num % 10;
            num = num / 10;
        }
        System.out.println(Arrays.toString(arr2));

        for (int k = 0; k < count; k++) {
            if(arr1[k] != arr2[k])
                result = false;
                break;
        }

        return result;
    }
}
