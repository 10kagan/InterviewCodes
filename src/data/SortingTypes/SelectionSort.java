package data.SortingTypes;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6 };
        System.out.println(Arrays.toString(selectionSorting(arr)));
    }
    public static int[] selectionSorting(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n - 1 ; i++) {
            int minElement = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[minElement])
                    minElement = j;

            int temp = arr[minElement];
            arr[minElement] = arr[i];
            arr[i] = temp;

        }
        return arr;
    }
}
