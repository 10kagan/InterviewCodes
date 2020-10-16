package part2;

public class FindTheMissingNumberInTheArray {
    public static void main(String[] args) {
        int [] nums = {2,4,6,1,5,8,7,3};
        System.out.println("missing number is: "+findMissingNumber(nums));
    }
    public static int findMissingNumber(int[] arr1){
        int miss = 0;
        int [] arr2 = new int[arr1.length+1];
        for (int i = 0; i < arr1.length+1; i++) {
            arr2[i] = i + 1;
        }
        int sumOfFirstArray = 0;
        int sumOfSecondArray = 0;
        for (int l = 0; l < arr1.length; l++) {
            sumOfFirstArray += arr1[l];
        }

        for (int k = 0; k < arr2.length; k++) {
            sumOfSecondArray += arr2[k];
        }

        miss = sumOfSecondArray - sumOfFirstArray;
        return miss;
    }
}