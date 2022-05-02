package part4.Arrays;

public class _16FindSubarraysSumInArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 4, 9, 0, 11};
        int target = 11;
        System.out.print("arr[]: {");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }

        System.out.println(" }");
        solveEfficient(arr, target);
    }

    private static void solveEfficient(int[] arr, int target) {
        int start = 0;
        int end = 0;
        int currSum = 0;
        while (start < arr.length && end <= arr.length){
            if (currSum == target){
                System.out.println("starting index : " + start + ", " + "Ending index : " + (int) (end - 1));
                if (end <= arr.length - 1){
                    currSum += arr[end];
                }
                end++;
            }else{
                if (currSum > target){
                    currSum -= arr[start];
                    start++;
                }else {
                    if (end <= arr.length - 1){
                        currSum += arr[end];
                    }
                    end++;
                }
            }
        }
    }
}
