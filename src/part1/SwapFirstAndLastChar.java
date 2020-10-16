package part1;

public class SwapFirstAndLastChar {
    public static void main(String[] args) {
        System.out.println(swap("lion"));
    }
    public static String swap(String str){
        return str.substring(str.length() - 1)
                + str.substring(1, str.length() - 1)
                + str.substring(0 ,1);
    }
}
