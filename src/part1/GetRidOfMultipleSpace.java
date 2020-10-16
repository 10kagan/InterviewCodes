package part1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetRidOfMultipleSpace {
    public static void main(String[] args) {
        String word = "  ...and  justice for all!  ";
        System.out.println(withoutMultipleSpace(word));
    }
    public static String withoutMultipleSpace(String str){
        List<Character> list = new ArrayList<>();
        for (int j = 0; j < str.length(); j++) {
            list.add(str.charAt(j));
        }
//        System.out.println(list);
        for (int i = str.length() - 1; i > 0; i--) {
            if ((list.get(i) == list.get(i-1)) && (list.get(i) == ' '))
                list.remove(i);
        }
        String result = "";
        for (char each: list) {
            result = result + each;
        }
        return result;
    }
}
