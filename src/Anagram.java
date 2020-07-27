import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram1("bari", "bira"));
    }

    public static boolean isAnagram1(String str1, String str2){
        boolean result = true;
        if( str1 == null || str2 == null || str1.equals("") || str2.equals("")){
            throw new IllegalArgumentException();
        }
        if (str1.length() != str2.length())
            result = false;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char [] ch1 = str1.toCharArray();
        char [] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for (int i = 0; i < ch1.length; i++) {

            if(ch1[i]!= ch2[i])
                result = false;
                break;
        }

        return result;
    }
    public static boolean isAnagram2(String str1, String str2){
        boolean result = true;
        if( str1 == null || str2 == null || str1.equals("") || str2.equals("")){
            throw new IllegalArgumentException();
        }




        return result;
    }
}



