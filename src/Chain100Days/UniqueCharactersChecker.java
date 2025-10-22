package Chain100Days;

public class UniqueCharactersChecker {
    public static void main(String[] args) {
        System.out.println(hasAllUniqueChars("abcdef"));   // true
        System.out.println(hasAllUniqueChars("hello"));    // false
        System.out.println(hasAllUniqueChars(""));         // true (opsiyonel)
        System.out.println(hasAllUniqueChars("AaBbCc"));   // true (case-sensitive)
    }
    public static boolean hasAllUniqueChars (String str){
        int n = str.length();

        for (int i = 0; i < n - 1; i++){
            for (int j = i + 1; j < n; j++){
                if (str.charAt(i) == str.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}
