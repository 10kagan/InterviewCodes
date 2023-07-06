package part10_LeetcodeArrays;

public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int [] indices = {4,5,6,7,0,2,1,3};
//        Output: "leetcode"
//        Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
        System.out.println(restoreString(s,indices));
    }
    public static String restoreString(String s, int[] indices) {
        StringBuilder restore = new StringBuilder(s);
        for (int i = 0; i < indices.length; i++) {
            restore.replace(indices[i], indices[i] + 1, String.valueOf(s.charAt(i)));
        }
        return restore.toString();
    }
}
