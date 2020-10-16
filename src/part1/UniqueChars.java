package part1;

public class UniqueChars {
    public static void main(String[] args) {
        System.out.println(printUniqueChars("missisipi"));

    }
    public static String printUniqueChars(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            String each = str.substring(i, i + 1);
            if (!result.contains(each))
                result += each;
        }
        return result;
    }
}
