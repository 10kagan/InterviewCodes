package part3;

import java.util.Arrays;

public class _1ReverseArray {
    public static void main(String[] args) {
        int [] arrOriginal = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverseArr(arrOriginal)));

    }
    public static int[] reverseArr (int [] arr){
        int len = arr.length;
        int arrRev [] = new int [len];

        for (int i = 0; i < len; i++){
            arrRev[i] = arr[len - 1 -i];
        }
        return arrRev;
    }
}
