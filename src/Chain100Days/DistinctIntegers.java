package Chain100Days;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctIntegers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        List<Integer> distinctList = getDistinct(numbers);

        System.out.println(distinctList);
    }
    public static List<Integer> getDistinct(List<Integer> list){
        return list.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}

// Get distinct integers from a list using Stream

// Time Complexity: O(n)