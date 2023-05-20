package part6;

public class FindMaxNumInArray {
    public static int maxInt (int [] array){
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null.");
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;

        }

    public static void main(String[] args) {
        int [] arrInt = {10,2,3,4,-5};
        System.out.println("Max int is: " + maxInt(arrInt));
    }
}
