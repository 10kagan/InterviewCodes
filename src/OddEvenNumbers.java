import java.util.HashMap;
import java.util.Map;

public class OddEvenNumbers {
    public static void main(String[] args) {
        int [] arr = {0,1,2,4,5,6,7,8,9,10};
        System.out.println(oddOrEven(arr));
    }
    public static Map<Integer, String> oddOrEven (int [] arr){
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                map.put(arr[i], "even");
            }else
                map.put(arr[i], "odd");
        }
        return map;
    }
}
