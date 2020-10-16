package part1;

public class TwoDigit {
    public static void main(String[] args) {
        int arr1 [] = {111,11,-23,4};
        System.out.println(Solution(arr1));
    }
    public static int Solution(int [] A){
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if ((A[i]>9 && A[i]<100)  || (A[i] < -9 && A[i] > -100))
                sum = sum + A[i];
        }
        return sum;
    }
}
