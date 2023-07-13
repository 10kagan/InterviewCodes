package part10_LeetcodeArrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Set;

public class FindNUniqueIntegersSumUpToZero {
    public static void main(String[] args) {
        int n = 5;
//        Output: [-7,-1,1,3,4]
//        Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
        System.out.println(Arrays.toString(sumZero(n)));
    }
    public static int[] sumZero(int n) {
        int [] arr = new int[n];
        Set<Integer> set = new HashSet<>();
        int sum = 0;

        for (int i = 0; i < n - 1; i++){
            int num;
            do {
                num = ThreadLocalRandom.current().nextInt(-1000, 1000);
            } while (!set.add(num)); // Check uniqueness using a Set
            arr[i] = num;
            sum += num;
        }
        arr[n - 1] = 0 - sum;
        return arr;
    }

}
