package Chain100Days;

public class ReverseEachWord {
    public static void main(String[] args) {
        String sentence = "Hello world from Java";
        String reversed = reverseWordsInSentence(sentence);
        System.out.println(reversed);  // ➜ olleH dlrow morf avaJ
    }
    public static String reverseWordsInSentence (String sentence){
        if (sentence == null || sentence.isEmpty()) return sentence;

        String [] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words){
            result.append(new StringBuilder(word).reverse().toString()).append(" ");
        }

        return result.toString().trim();
    }
}
// Reverse each word in a given sentence string.