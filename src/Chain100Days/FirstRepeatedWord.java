package Chain100Days;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstRepeatedWord {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "apple", "banana", "cat", "banana", "dog", "apple"
        );

        String result = findFirstRepeated(words);
        System.out.println("First repeated word: " + result);  // banana
    }

    public static String findFirstRepeated (List<String> words) {
        Set<String> seen = new HashSet<>();

        for (String word : words){
            if (seen.contains(word)){
                return word;
            }
            seen.add(word);
        }
        return null;
    }
}

// Find the first repeated word in a list.

// Time Complexity: O(n)