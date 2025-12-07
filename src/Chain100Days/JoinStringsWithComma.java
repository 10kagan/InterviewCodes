package Chain100Days;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringsWithComma {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");

        String result = joinWithComma(words);

        System.out.println(result);
    }
    public static String joinWithComma (List<String> list){
        return list.stream()
                .collect(Collectors.joining(", "));
    }
}

// Use Stream to join a list of strings with commas

// Time Complexity: O(n)
