package part6;

public class ReverseSentence {
    //bir cumleyi kelimeleri ile birlikte reverse yap
    public static String reverseWords(String sentence) {
        String words[] = sentence.split("\\s+");
        String reversedSentence = "";

        for (int i = words.length - 1; i >= 0; i--){
            String reversedWords = reverseString(words[i]);
            reversedSentence += reversedWords;
            if (i != 0){
                reversedSentence += " ";
            }
        }
        return reversedSentence;
    }

    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        String sentence = "The house that Jack built";
        String reversed = reverseWords(sentence);
        System.out.println(reversed);
    }
}
