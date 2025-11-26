package Chain100Days;

import java.util.*;

public class ListToMapWordLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "hi", "cat", "banana");

        Map<String, Integer> result = convertToMap(words);

        System.out.println(result);
        // Output: {apple=5, hi=2, cat=3, banana=6}
    }
    public static Map<String, Integer> convertToMap (List<String> list){
        Map<String, Integer> map = new HashMap<>();

        for (String word : list){
            map.put(word, word.length());
        }
        return map;
    }
}

// Convert a list of strings to a map with word and length.

// Time complexity: O(n)