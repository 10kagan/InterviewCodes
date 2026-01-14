package Chain50JavaCore;

public class RemovePunctuation {
    public static String removePunctuation(String str){
        if (str == null) return null;

        return str.replaceAll("\\p{Punct}","");
    }

    public static void main(String[] args) {
        System.out.println(removePunctuation("Hello, World!"));
        System.out.println(removePunctuation("Java: clean-code."));
        System.out.println(removePunctuation("Hi!!! Are-you ok?"));
    }
}

// Remove all punctuation characters from a string