package Chain100Days;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequencyStream {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "apple", "banana", "apple", "cat", "banana", "banana"
        );

        Map<String, Long> result = countWordFrequency(words);

        result.forEach((word, count) ->
                System.out.println(word + " = " + count)
        );
    }
    public static Map<String, Long> countWordFrequency (List<String> list){
        return list.stream()
                .collect(Collectors.groupingBy(
                        word -> word,
                        Collectors.counting()
                ));
    }
}

// Use Stream API to count frequency of words in a list

// Time Complexity: O(n)
