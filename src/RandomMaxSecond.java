import java.util.Arrays;
import java.util.Random;

public class RandomMaxSecond {
    public static void main(String[] args) {
        System.out.println(maxSecond());
    }
    public static int maxSecond(){
        int [] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = new Random().nextInt(100);
        }
        System.out.println(Arrays.toString(arr));


        for (int j = 0; j < 9; j++) {
            for (int k = 0; k < 9; k++) {
                if (arr[k] < arr[k + 1]) {
                    int temp = arr [k];
                    arr [k] = arr [k + 1];
                    arr [k + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr[1];
    }
}
