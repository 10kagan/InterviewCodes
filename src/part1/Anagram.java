package part1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram2("anagram", "nagaram"));
    }

//    public static boolean isAnagram1(String str1, String str2) {
//        boolean result = true;
//        if (str1 == null || str2 == null || str1.equals("") || str2.equals("")) {
//            throw new IllegalArgumentException();
//        }
//        if (str1.length() != str2.length())
//            result = false;
//        str1 = str1.toLowerCase();
//        str2 = str2.toLowerCase();
//
//        char[] ch1 = str1.toCharArray();
//        char[] ch2 = str2.toCharArray();
//
//        Arrays.sort(ch1);
//        Arrays.sort(ch2);
//
//        for (int i = 0; i < ch1.length; i++) {
//
//            if (ch1[i] != ch2[i])
//                result = false;
//            break;
//        }
//
//        return result;
//    }

    public static boolean isAnagram2(String str1, String str2) {
        boolean result = true;
        if (str1 == null || str2 == null || str1.equals("") || str2.equals("")) {
            throw new IllegalArgumentException();
        }
        if (str1.length() != str2.length())
            result = false;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        Map<Character, Integer> map1 = new HashMap<Character, Integer>();
        for (int i = 0; i < arr1.length; i++) {
            if (map1.get(arr1[i]) == null)
                map1.put(arr1[i], 1);
            else {
                Integer c = (int) map1.get(arr1[i]);
                map1.put(arr1[i], ++c);
            }
        }

        Map<Character, Integer> map2 = new HashMap<Character, Integer>();
        for (int j = 0; j < arr2.length; j++) {
            if (map2.get(arr2[j]) == null)
                map2.put(arr2[j], 1);
            else {
                Integer d = (int) map2.get(arr2[j]);
                map2.put(arr2[j], ++d);
            }

            if (map1.equals(map2)) {
                result = true;
            }else
                result = false;

        }
        System.out.println(map1);
        System.out.println(map2);
        return result;
    }
}



