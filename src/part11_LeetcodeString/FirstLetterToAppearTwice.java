package part11_LeetcodeString;

import java.util.HashMap;

public class FirstLetterToAppearTwice {
    public static void main(String[] args) {
        String s = "abccbaacz";
//        Output: "c"
//        Explanation:
//        The letter 'a' appears on the indexes 0, 5 and 6.
//        The letter 'b' appears on the indexes 1 and 4.
//        The letter 'c' appears on the indexes 2, 3 and 7.
//        The letter 'z' appears on the index 8.
//        The letter 'c' is the first letter to appear twice, because out of all the letters the index of its second occurrence is the smallest.
        System.out.println(repeatedCharacter(s));
    }
    public static char repeatedCharacter(String s) {
        HashMap<Character, Integer> letterIndexMap = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (letterIndexMap.containsKey(c)) {
                return c;
            } else {
                letterIndexMap.put(c, i);
            }
        }
        return '\0';
    }
}
//nwcn