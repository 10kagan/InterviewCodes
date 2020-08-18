import java.util.Arrays;

public class Populate {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(populate(14)));
    }
    public static int[] populate(int num){
        int [] arr = new int[num];
        for (int i = 0; i < num; i++){
            arr[i] = i + 1;
        }
        return  arr;
    }
}
