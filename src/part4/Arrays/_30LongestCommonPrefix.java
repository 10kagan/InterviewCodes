package part4.Arrays;

public class _30LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strArr={"java2blog","javaworld","javabean","javatemp"};
        String longestPrefix=getLongestCommonPrefix(strArr);
        System.out.println("Longest Prefix : "+longestPrefix);
    }
    
    public static String getLongestCommonPrefix(String [] strArr){
        if (strArr.length == 0) return "";
        String minStr = getMinString(strArr);
        int minPrefixStringLength = minStr.length();
        for (int i = 0; i < strArr.length; i++){
            for (int j = 0; j < minPrefixStringLength; j++){
                if (minStr.charAt(j) != strArr[i].charAt(j))
                    break;
                if (j<minPrefixStringLength)
                    minPrefixStringLength = j;
            }
        }return minStr.substring(0, minPrefixStringLength);
    }

    private static String getMinString(String[] strArr) {
        String minStr = strArr[0];
        for (int i = 1; i < strArr.length; i++){
            if (strArr[i].length() < minStr.length())
                minStr = strArr[i];
        }
        return minStr;
    }
}
