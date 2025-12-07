package Chain100Days;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapKeysToList {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        List<String> keys = getKeys(map);

        System.out.println(keys);
    }
    public static <K, V> List<K> getKeys(Map<K, V> map){
        return map.keySet()
                .stream()
                .collect(Collectors.toList());
    }
}
// Convert a Map to a list of keys using Stream

// Time Complexity: O(n)