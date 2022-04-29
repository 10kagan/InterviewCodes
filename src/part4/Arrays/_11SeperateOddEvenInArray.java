package part4.Arrays;

import java.util.Arrays;

public class _11SeperateOddEvenInArray {
    public static void main(String[] args) {
        int array[] = {12, 17, 70, 15, 22, 65, 21, 90};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(seperateEvenOddNumber(array)));
    }
    public static int[] seperateEvenOddNumber(int arr[]){
        int left = 0;
        int right = arr.length - 1;
        for (int i = 0; i < arr.length; i++){
            while (arr[left] % 2 == 0){
                left++;
            }
            while (arr[right] % 2 == 1){
                right--;
            }
            if (left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        return arr;
    }
}
