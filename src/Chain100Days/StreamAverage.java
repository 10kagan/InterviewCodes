package Chain100Days;

import java.util.*;

public class StreamAverage {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);

        double avg = findAverage(numbers);

        System.out.println("Average: " + avg);  // 25.0
    }
    public static double findAverage (List<Integer> list){
        return list.stream()
                .mapToInt(n -> n)
                // Integer → int primitive
                .average()
                // OptionalDouble döner
                .orElse(0.0); // boş liste içine default değer
    }
}

// Find average of a list of numbers using Stream

// Time Complexity: O(n)