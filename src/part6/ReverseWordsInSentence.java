package part6;

public class ReverseWordsInSentence {
    // sadece cumledeki kelimeleri kendi icinde reverse yap
    public static String reverseWords(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder reversedSentence = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String reversedWord = reverseString(words[i]);
            reversedSentence.append(reversedWord);
            if (i != words.length - 1) {
                reversedSentence.append(" ");
            }
        }

        return reversedSentence.toString();
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String sentence = "Hello world, how are you?";
        String reversed = reverseWords(sentence);
        System.out.println(reversed);
    }

}
