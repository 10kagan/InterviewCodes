package Chain100Days;

public class StringCompression {
    public static void main(String[] args) {
        System.out.println(compress("aabcccccaaa"));  // a2b1c5a3
        System.out.println(compress("abc"));          // abc
        System.out.println(compress("aabbbcc"));       // a2b2c2
        System.out.println(compress("aaAAAAaa"));       // a2A2a2
        System.out.println(compress(""));
        System.out.println(compress("Aabbaaaaaaaaaa"));
    }

    public static String compress (String str){
        if (str == null || str.isEmpty()) return str;

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        compressed.append(str.charAt(str.length() - 1)).append(count);

        return compressed.length() < str.length() ? compressed.toString() : str;
    }
}
