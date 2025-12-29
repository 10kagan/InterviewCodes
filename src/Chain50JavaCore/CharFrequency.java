package Chain50JavaCore;

import java.util.HashMap;
import java.util.Map;

public class CharFrequency {

    public static Map<Character, Integer> countCharFrequency (String input){

        Map<Character, Integer> freqMap = new HashMap<>();

        if (input == null){
            return freqMap;
        }

        input = input.toLowerCase().replaceAll("\\s+", "");

        for (char c : input.toCharArray()){
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        return freqMap;
    }

    public static void main(String[] args) {

        String text = "aabccde eeeedffe";

        Map<Character, Integer> result = countCharFrequency(text);

        for (Map.Entry<Character, Integer> entry : result.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

// Count the frequency of each character in a string