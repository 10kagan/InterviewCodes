package part1;

import java.util.Arrays;

public class ShiftAnArray {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        System.out.println(Arrays.toString(shift(arr1)));
    }
    public static int[] shift (int [] arr){
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            temp = arr[i];
            arr[i] = arr [i + 1];
            arr[i + 1] = temp;
        }
        return arr;
    }
}
