package Chain100Days;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSquares {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        List<Integer> squared = squareList(numbers);

        System.out.println(squared);  // [1, 4, 9, 16]
    }
    public static List<Integer> squareList (List<Integer> list){
        List<Integer> result = new ArrayList<>();

        for (int num : list){
            result.add(num * num);
        }

        return result;
    }
}
// Convert a list of integers to a list of their squares

// Time Complexity: O(n)