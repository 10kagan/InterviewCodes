package part11_LeetcodeString;

public class CountingWordsWithAGivenPrefix {
    public static void main(String[] args) {
        String [] words = {"pay","attention","practice","attend"};
        String  pref = "at";
//        Output: 2
//        Explanation: The 2 strings that contain "at" as a prefix are: "attention" and "attend".
        System.out.println(prefixCount(words, pref));
    }
    public static int prefixCount(String[] words, String pref) {
        int count = 0;
        int len = pref.length();
        for (int i = 0; i < words.length; i++){
            if (words[i].length() >= len && words[i].substring(0,len).equals(pref)){
                count++;
            }
        }
        return count;
    }
}
