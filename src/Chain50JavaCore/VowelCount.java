package Chain50JavaCore;

public class VowelCount {
    public static int countVowels(String str){
        if (str == null || str.isEmpty()) return 0;

        int count = 0;
        String vowels = "aeiouAEIOU";

        for (char c : str.toCharArray()){
            if (vowels.indexOf(c) != -1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countVowels("Hello World")); // 3
        System.out.println(countVowels("JAVA"));        // 2
        System.out.println(countVowels("bcdf"));        // 0
    }
}

// Count the number of vowels in a string