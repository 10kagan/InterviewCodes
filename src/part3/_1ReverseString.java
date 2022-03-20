package part3;

public class _1ReverseString {
    public static void main(String[] args) {
        String s = "Data base lllll";
        System.out.println(reverse(s));
    }
    public static String reverse (String str){
        String rev ="";
        for (int i = str.length()-1; i >=0; i--){
            rev = rev + str.substring(i, i+1);
        }
        return rev;
    }
}
