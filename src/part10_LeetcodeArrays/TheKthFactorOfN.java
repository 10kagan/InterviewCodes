package part10_LeetcodeArrays;

import java.util.ArrayList;
import java.util.List;

public class TheKthFactorOfN {
    public static void main(String[] args) {
        int n = 12, k = 3;
//        Output: 3
//        Explanation: Factors list is [1, 2, 3, 4, 6, 12], the 3rd factor is 3.
        System.out.println(kthFactor(n,k));
    }
    public static int kthFactor(int n, int k) {
        List<Integer> factors = new ArrayList<>();

        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                factors.add(i);
            }
        }
        if (k > factors.size()){
            return  -1;
        } else {
            return factors.get(k - 1);
        }
    }
}
