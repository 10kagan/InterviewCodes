import java.util.Arrays;

public class IntegerSort {
    public static void main(String[] args) {
        int [] arrS = {115,2,10055,41,5};
        System.out.println(Arrays.toString(sortArray(arrS)));
    }
    public static int[] sortArray (int [] arr){
        //int arrSort [] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1] < arr[j]){
                    arr[j] = arr[j + 1];
                }
            }
        }
        return arr;
    }
}
