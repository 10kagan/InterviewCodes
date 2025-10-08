package Chain100Days;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something please: ");
        String s = scanner.nextLine();

        Map<Character, Integer> freqMap = freqOfChar(s);

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }
    }
    public static Map<Character, Integer> freqOfChar(String str){
        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (c == ' ') continue; // boşlukları sayma
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        return map;
    }
}
