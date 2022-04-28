package part4.Arrays;

import java.util.Arrays;

public class _10SeperateNumbers {
    public static void main(String[] args) {
        int arr[] = {0,1,0,0,1,1,1,0,1};
        System.out.println(Arrays.toString(seperate0s01(arr)));
    }
    public static int[] seperate0s01 (int arr[]){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                count++;
            }
        }
        for (int i = 0; i < count; i++){
            arr[i] = 0;
        }
        for (int i = count; i < arr.length; i++){
            arr[i] = 1;
        }
        return arr;
    }
}
