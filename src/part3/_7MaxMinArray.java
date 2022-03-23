package part3;

public class _7MaxMinArray {
    public static void main(String[] args) {
        int [] arr = {12,2,3,4,597654,6,709,8,9,-1};
        System.out.println(maxArr(arr));
        System.out.println(minArr(arr));
    }
    public static int maxArr (int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
    public static int minArr (int[] arr){
        int min = arr[0];
        for (int j = 1; j < arr.length; j++){
            if (arr[j] < min)
                min = arr[j];
        }
        return min;
    }
}
