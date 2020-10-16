package part1;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(reverseArray(arr1)));
    }
    public static int[] reverseArray(int [] arr){
        int len = arr.length;
        int [] rev = new int[len];
        for (int i = 0; i < len; i++) {
            rev[i] = arr[len - i - 1];
        }
        return rev;
    }
}
