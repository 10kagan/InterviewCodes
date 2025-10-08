package part7_leetcode.ArrayString;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "but";
        //Output: 0
        System.out.println(strStr(haystack, needle));
    }
    public static int strStr(String haystack, String needle) {
        int haystackLen = haystack.length();
        int needleLen = needle.length();

        for (int i = 0; i <= haystackLen - needleLen; i++) {
            int j;

            // Check if the current substring matches the needle
            for (j = 0; j < needleLen; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }

            // If the entire needle is found, return the starting index
            if (j == needleLen) {
                return i;
            }
        }

        // Needle not found
        return -1;
    }

}
