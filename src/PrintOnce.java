import java.util.ArrayList;
import java.util.Arrays;

public class PrintOnce {
    public static void main(String[] args) {
        int [] nums = {0,1,1,2,3,4,3,4,5,6,6,6,6,8};
        printOnce(nums);
    }
    public static void printOnce(int [] arr){
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!al.contains(arr[i]))
                al.add(arr[i]);
        }
        System.out.println(al);
    }
}
