package part6;

public class StringReverse {
    public static void main(String[] args) {
        String a1 = "Kagan";
        System.out.println(stringRev(a1));
    }

    public static String stringRev (String s1){
        String result = "";
        for (int i =  s1.length() - 1; i >= 0; i--){
            result = result + s1.charAt(i);
        }
        return result;
    }
}
