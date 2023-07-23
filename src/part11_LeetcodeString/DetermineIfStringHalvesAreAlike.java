package part11_LeetcodeString;

public class DetermineIfStringHalvesAreAlike {
    public static void main(String[] args) {
        String  s = "textbook";
//        Output: false
//        Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
//                Notice that the vowel o is counted twice.
        System.out.println(halvesAreAlike(s));
    }
    public static boolean halvesAreAlike(String s) {
        String vowels = "aeiouAEIOU";
        int a = 0;
        int b = 0;
        int len = s.length()/2;
        String s1 = s.substring(0, len);
        String s2 = s.substring(len);
        for (int i = 0; i < len; i++){
            for (int j = 0; j < 10; j++){
                if (s1.charAt(i) == vowels.charAt(j)){
                    a++;
                }
            }
            for (int k = 0; k < 10; k++){
                if (s2.charAt(i) == vowels.charAt(k)){
                    b++;
                }
            }
        }
        return a == b;
    }
}
