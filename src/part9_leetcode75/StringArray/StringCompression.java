package part9_leetcode75.StringArray;

public class StringCompression {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        //Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
        //Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
        System.out.println(compress(chars));
    }
    public static String compress(char[] chars) {
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 0; i < chars.length; i++) {
            if (i + 1 < chars.length && chars[i] == chars[i + 1]) {
                count++;
            } else {
                result.append(chars[i]);
                if (count > 1) {
                    result.append(count);
                }
                count = 1;
            }
        }

        return result.toString();
    }
}
