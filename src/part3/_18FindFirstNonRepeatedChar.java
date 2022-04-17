package part3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class _18FindFirstNonRepeatedChar {
    public static void main(String[] args) {
        String s = "aabbcdd";
        System.out.println(getNonRepeatedChar(s));
    }
    public static Character getNonRepeatedChar(String str){
        Map<Character, Integer> countChar = new LinkedHashMap<>();
        for(int i = 0; i < str.length(); i++){
            Character c = str.charAt(i);
            if(!countChar.containsKey(c)){
                countChar.put(c,1);
            }else {
                countChar.put(c,countChar.get(c)+1);
            }
        }
        for (Entry<Character, Integer> e: countChar.entrySet()) {
            if (e.getValue() == 1)
                return e.getKey();
        }
        return null;
    }
}
