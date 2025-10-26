package Chain100Days;

public class URLify {
    public static void main(String[] args) {
        String input = "Mr John Smith";
        String output = urlify(input);
        System.out.println(output);  // ➜ "Mr%20John%20Smith"
    }
    public static String urlify (String url){
        if (url == null) return null;

        return url.replaceAll(" ", "%20");
    }
}
// Replace all spaces in a string with '%20' (URLify).