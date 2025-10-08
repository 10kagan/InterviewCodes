package part10_LeetcodeArrays;

import java.util.Arrays;

public class DecodeXORedArray {
    public static void main(String[] args) {
        int [] encoded = {1,2,3};
        int first = 1;
//        Output: [1,0,2,1]
//        Explanation: If arr = [1,0,2,1], then first = 1 and encoded = [1 XOR 0, 0 XOR 2, 2 XOR 1] = [1,2,3]
        System.out.println(Arrays.toString(decode(encoded, first)));
    }
    public static int[] decode(int[] encoded, int first) {
        return encoded;
    }
}
