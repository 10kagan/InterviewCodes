package part6;

public class FindSecondMaxIntInArray {
    public static int secondMax (int [] array){
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++){
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax && array[i] != max) {
                secondMax = array[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(secondMax(arr));
    }
}
