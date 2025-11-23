package Chain100Days;

import java.util.HashMap;
import java.util.Map;

public class WordCountMap {
    public static void main(String[] args) {
        String paragraph = "Java is great and Java is powerful and great";

        Map<String, Integer> result = countWordOccurrences(paragraph);

        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    public static Map<String, Integer> countWordOccurrences (String text){
        if (text == null || text.isEmpty()) return new HashMap<>();

        text = text.toLowerCase();

        String [] words = text.split("\\W+");

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words){
            if (word.isEmpty()) continue;

            wordCount.put(
                    word,
                    wordCount.getOrDefault(word, 0) + 1
            );
        }
        return wordCount;
    }
}

// Count word occurrences in a paragraph using Map.