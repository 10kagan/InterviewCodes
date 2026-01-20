package Chain50JavaCore;

public class SecondLargest {
    public static int findSecondLargest(int [] nums){

        if (nums == null || nums.length < 2){
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int n : nums){

            if (n > largest){
                secondLargest = largest;
                largest = n;
            } else if (n < largest && n > secondLargest) {
                secondLargest = n;
            }
        }

        if (secondLargest == Integer.MIN_VALUE){
            throw new IllegalArgumentException("No second largest element");
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        System.out.println(findSecondLargest(new int[]{4, 2, 9, 1, 7})); // 7
        System.out.println(findSecondLargest(new int[]{10, 10, 8, 6})); // 8
        System.out.println(findSecondLargest(new int[]{8, 8, 8})); // No second largest element
        System.out.println(findSecondLargest(new int[]{})); // Array must have at least two elements
    }
}
