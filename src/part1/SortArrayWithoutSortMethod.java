package part1;

import java.util.Arrays;

public class SortArrayWithoutSortMethod {
    public static void main(String[] args) {
        sortArray(new int[] {12,3,44,63,8});
    }

    public static void sortArray(int [] arr){
        for (int i = 0 ; i < arr.length; i++){
            for (int j = 0; j < arr.length - 1; j++){

                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr [j] = arr[j + 1];
                    arr [j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}


//4.Write a method where u sort an Array int[] without using the sort method
