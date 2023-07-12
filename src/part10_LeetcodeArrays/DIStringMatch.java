package part10_LeetcodeArrays;

import java.util.Arrays;

public class DIStringMatch {
    public static void main(String[] args) {
        String s = "IDID";
        //Output: [0,4,1,3,2]
        System.out.println(Arrays.toString(diStringMatch(s)));
    }
    public static int[] diStringMatch(String s) {
        int n = s.length();
        int[] permutation = new int[n + 1];

        int start = 0;
        int end = n;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'I') {
                    permutation[i] = start;
                    start++;
                } else {
                    permutation[i] = end;
                    end--;
                }
        }
        permutation[n] = start;

        return permutation;
    }
}
 /*
A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:

s[i] == 'I' if perm[i] < perm[i + 1], and
s[i] == 'D' if perm[i] > perm[i + 1].
Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return any of them.


 */