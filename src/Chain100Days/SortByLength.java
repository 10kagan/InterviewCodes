package Chain100Days;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "hi", "banana", "cat");

        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });
        System.out.println(words);
    }
}

// Sort a list of strings by their lengths using Comparator.

// Time Complexity: O(n log n)