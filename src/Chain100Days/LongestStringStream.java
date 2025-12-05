package Chain100Days;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestStringStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("car", "elephant", "dog", "hippopotamus");

        String longest = findLongest(list);

        System.out.println("Longest string: " + longest);
    }
    public static String findLongest (List<String> list){
        return list.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
    }

}

// Find the longest string in a list using Stream

// Time Complexity: O(n)