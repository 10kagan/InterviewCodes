package Chain100Days;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");

        List<List<String>> grouped = groupAnagrams(words);

        System.out.println(grouped);
    }
    public static List<List<String>> groupAnagrams (List<String> words){
        Map<String, List<String>> map = new HashMap<>();

        for (String word : words){
            char [] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }
}

// Group words that are anagrams using Map.