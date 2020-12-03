package part1;

import java.util.Arrays;

public class IntegerSort {
    public static void main(String[] args) {
        int [] arrS = {115,2,10055,41,5};
        System.out.println(Arrays.toString(sortArray(arrS)));
    }
    public static int[] sortArray (int [] arr){
        //int arrSort [] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
}
