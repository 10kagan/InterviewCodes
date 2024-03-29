package part5;

import java.util.LinkedHashMap;
import java.util.Map;

public class ArrayContainsString {
    public static void main(String[] args) {
        // https://leetcode.com/problems/string-matching-in-an-array/
        String[] arr={"abc","bcba", "abcd", "ggh", "klsrtabcabc", "118*90", "ggggggg"};
        String str = "abbc";
        arrayContains(arr, str);
    }
    private static void arrayContains(String [] arr, String str){
        for (int i = 0; i < arr.length; i++){
            String [] element = arr[i].split("");
            Map<String, Integer> map = new LinkedHashMap<>();
            for (String s : element){
                if (!map.containsKey(s)){
                    map.put(s,1);
                } else {
                    map.put(s,map.get(s)+1);
                }
            }
            if (map.keySet().contains("a") && map.keySet().contains("b") && map.keySet().contains("c")){
                if (map.get("a") >= 1 && map.get("b") >= 2 && map.get("c") >= 1){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
