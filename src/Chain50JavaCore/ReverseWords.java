package Chain50JavaCore;

public class ReverseWords{
    public static String reverseEachWord (String str){
        if (str == null || str.isEmpty()) return null;

        String [] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++){
            String reversedWord = new StringBuilder(words[i])
                    .reverse()
                    .toString();

            result.append(reversedWord);

            if (i < words.length - 1){
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseEachWord("Hello World"));
        System.out.println(reverseEachWord("Java is fun"));
    }
}

// Reverse each word in a sentence while keeping word order