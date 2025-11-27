package Chain100Days;

import java.util.HashMap;
import java.util.Map;

public class IterateHashMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Apple", 5);
        map.put("Banana", 2);
        map.put("Orange", 7);

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

// Iterate through a HashMap and print keys and values.

// Time complexity: O(1)