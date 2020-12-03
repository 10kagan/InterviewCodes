package data.SortingTypes;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};

        System.out.println(Arrays.toString(bubbleSorting(arr)));
    }
    public static int[] bubbleSorting(int arr[]){
        int x = arr.length;
        for (int i = 0; i < x - 1; i++) {
            for (int j = 0; j < x - 1 - i; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
