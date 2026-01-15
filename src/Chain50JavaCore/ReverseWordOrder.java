package Chain50JavaCore;

public class ReverseWordOrder {

    public static String reverseWordOrder (String sentence){

        if (sentence == null || sentence.isEmpty()) return sentence;

        String [] words = sentence.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--){
            result.append(words[i]);
            if (i > 0) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWordOrder("Hello World"));
        System.out.println(reverseWordOrder("Java is fun"));
        System.out.println(reverseWordOrder("  I love  Java "));
    }
}

// Reverse the order of words in a string