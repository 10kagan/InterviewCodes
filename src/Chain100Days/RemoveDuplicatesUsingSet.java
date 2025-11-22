package Chain100Days;

import java.util.*;

public class RemoveDuplicatesUsingSet {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        List<Integer> uniqueList = removeDuplicates(numbers);

        System.out.println("Original list: " + numbers);
        System.out.println("Unique list: " + uniqueList);
    }
    public static List<Integer> removeDuplicates(List<Integer> list){
        Set<Integer> set = new HashSet<>(list);

        return new ArrayList<>(set);
    }
}

// Remove duplicates from a list using Set.