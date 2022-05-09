package part3;

import java.util.HashMap;
import java.util.Map;

public class _19FindWordCounts {
    public static void main(String[] args) {
        String sentence = "kalem kalem silgi ail al ver 1 bir";
        System.out.println(wordCount(sentence));
    }
    public static Map<String, Integer> wordCount(String sentence){
        Map<String, Integer> map = new HashMap<>();
        String [] words = sentence.split(" ");

        for (String word: words) {
            if (!map.containsKey(word))
                map.put(word, 1);
            else
                map.put(word, map.get(word) + 1);
        }
        return map;
    }
}
