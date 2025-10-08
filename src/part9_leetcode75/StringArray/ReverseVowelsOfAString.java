package part9_leetcode75.StringArray;

public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        String s = "hello";
        //Output: "holle"
        System.out.println(reverseVowels(s));
    }
    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (isVowel(chars[left]) && isVowel(chars[right])) {
                // Swap the vowels
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;

                // Move the pointers
                left++;
                right--;
            } else if (isVowel(chars[left])) {
                // Move right pointer
                right--;
            } else {
                // Move left pointer
                left++;
            }
        }
        return new String(chars);
    }

    public static boolean isVowel(char letter) {
        letter = Character.toLowerCase(letter);
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u';
    }

}
/*Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.*/