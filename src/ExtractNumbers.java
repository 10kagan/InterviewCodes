public class ExtractNumbers {
    public static void main(String[] args) {
        System.out.println(extractNumbers("123ijfsp345igsn4"));
    }
    public static String extractNumbers (String str){
        str = str.toLowerCase();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57)
                result += str.charAt(i);
        }
        return result;
    }
}
