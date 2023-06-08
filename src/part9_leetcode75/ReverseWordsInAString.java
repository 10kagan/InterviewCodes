package part9_leetcode75;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "the sky is blue";
        //Output: "blue is sky the"

        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        String[] reverse = new String[str.length];

        for (int i = str.length - 1; i >= 0; i--){
            reverse[str.length - 1 - i] = str[i];
        }
        return String.join(" ", reverse);
    }
}
