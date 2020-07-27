import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram2("baari", "biraa"));
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
        if ( str1 == null || str2 == null || str1.equals("") || str2.equals("")){
            throw new IllegalArgumentException();
        }
        if (str1.length() != str2.length())
            result = false;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        Map <String, Integer> map1 = new HashMap<>();
        for (int i = 0; i < str1.length(); i++){
            if (!map1.containsKey(str1.charAt(i)))
                map1.put(str1.substring(i, i+1), 1);
        }

        Map <String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < str2.length(); i++){
            if (!map2.containsKey(str2.charAt(i)))
                map2.put(str2.substring(i, i+1), 1);
        }

        System.out.println(map1);
        System.out.println(map2);
        if (!map1.equals(map2))
            result = false;

        return result;
    }
}



