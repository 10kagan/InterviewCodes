package Chain100Days;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostFrequentElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 3, 2, 3, 2);

        int result = findMostFrequent(numbers);
        System.out.println("Most frequent element: " + result);
        // Output: 3
    }
    public static int findMostFrequent (List<Integer> list){
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for(int num : list){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int mostFrequent = list.get(0);

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
            if (entry.getValue() > maxFreq){
                maxFreq = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }
        return mostFrequent;
    }
}

// Find the most frequent element in a list using HashMap.