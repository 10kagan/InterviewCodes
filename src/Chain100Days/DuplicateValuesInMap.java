package Chain100Days;

import java.util.*;

public class DuplicateValuesInMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 10);
        map.put("D", 30);

        boolean hasDuplicates = hasDuplicateValues(map);
        System.out.println("Map contains duplicate values? " + hasDuplicates);

    }
    public static boolean hasDuplicateValues (Map <?,?> map){
        Set<Object> valueSet = new HashSet<>();

        for (Object value : map.values()){
            if (!valueSet.add(value)){
                return true;
            }
        }
        return false;
    }
}
// Detect if a Map has duplicate values.

// O(n) zaman ve O(n) ek alan