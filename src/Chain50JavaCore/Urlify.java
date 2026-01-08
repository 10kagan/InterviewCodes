package Chain50JavaCore;

public class Urlify {
    public static String urlify (String str){
        if (str == null) return null;

        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()){
            if (c == ' '){
                result.append("%20");
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(urlify("Mr John Smith")); // Mr%20John%20Smith
        System.out.println(urlify("Hello World"));  // Hello%20World
    }
}

// Replace all spaces in a string with %20 (URLify)