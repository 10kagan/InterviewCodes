package part4.Arrays;

import java.util.Scanner;

public class _18FindPeakElements {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int arr [] = new int[scan.nextInt()];

        for (int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();
        }
        int peakIndex = solve(0, arr.length - 1, arr);

        System.out.print("arr[]: {");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
        System.out.println(" }");
        System.out.println("Peak element is : " + arr[peakIndex] +
                " found at index " + peakIndex);
    }
    private static int solve(int start, int end, int[] arr) {
        int mid = (start + end)/2;
        if ((mid > 0 && mid < arr.length - 1) && (arr[mid] >= arr[mid + 1] && arr[mid] >= arr[mid - 1])){
            return mid;
        }else if (mid == 0 && mid != arr.length - 1 && arr[mid] >= arr[mid + 1]){
            return mid;
        }else if (mid == arr.length - 1 && mid != 0 && arr[mid - 1] <= arr[mid]){
            return mid;
        }else if (mid != 0 && arr[mid - 1] > arr[mid]){
            return solve(start, mid - 1, arr);
        }else{
            if (mid + 1 <= arr.length - 1){
                return  solve(mid + 1, end, arr);
            }
        }
        return 0;
    }
}
