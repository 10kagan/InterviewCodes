package Chain100Days;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStrings {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "", null, "banana", "   ", "cat");

        List<String> result = cleanList(list);

        System.out.println(result);
    }
    public static List<String> cleanList (List<String> list){
        return list.stream()
                .filter(s -> s != null && !s.trim().isEmpty())
                .collect(Collectors.toList());
    }
}

// Filter out null or empty strings from a list using Stream

// Time Complexity: O(n·k)