package part1;

import java.util.HashMap;
import java.util.Map;

public class CountLetters {
    public static void main(String[] args) {
        System.out.println(countLetter("ahmet ahmed jjjjjkkkll 3"));
    }
    public static Map<String, Integer> countLetter(String str){
        Map<String, Integer> map = new HashMap<>();
        String [] strArr = str.split("");


        for (String each: strArr) {
            if(!map.containsKey(each)){
                map.put(each, 1);
            }else
                map.put(each, each.length() + 1);
        }
        return map;
    }
}

// Write a method which returns how many times each letter is repeated?
