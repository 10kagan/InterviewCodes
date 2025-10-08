package part11_LeetcodeString;

public class MinimizeStringLength {
    public static void main(String[] args) {
        String s = "acc";
//        Output: 3
//        Explanation: In this example, s is "aaabc". We can start by selecting the character 'a' at index 1. We then remove the closest 'a' to the left of index 1, which is at index 0, and the closest 'a' to the right of index 1, which is at index 2. After this operation, the string becomes "abc". Any further operation we perform on the string will leave it unchanged. Therefore, the length of the minimized string is 3.
        System.out.println(minimizedStringLength(s));
    }
    public static int minimizedStringLength(String s) {
        int count = s.length();

        if (s.length() >= 3) {
            for (int i = 1; i < s.length() - 1; i++) {
                if (s.charAt(i - 1) == s.charAt(i) && s.charAt(i) == s.charAt(i + 1)) {
                    count -= 2;
                    i++; // Increment by 1 instead of 2
                } else if (s.charAt(i - 1) == s.charAt(i) || s.charAt(i + 1) == s.charAt(i)) {
                    count--;
                }
            }
            return count;
        } else if (s.length() == 2) {
            if (s.charAt(0) == s.charAt(1)) {
                count = 1;
            }
        } else if (s.length() == 1) {
            count = 1;
        }
        return count;
    }
}
