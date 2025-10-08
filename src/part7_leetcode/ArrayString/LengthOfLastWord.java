package part7_leetcode.ArrayString;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        //Output: 4
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        String [] arr = s.split(" ");
        return arr[arr.length-1].length();
    }
}