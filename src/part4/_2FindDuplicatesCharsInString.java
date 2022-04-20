package part4;

import java.util.HashMap;


public class _2FindDuplicatesCharsInString {
    public static void main(String[] args) {
        String str = "Kagan Alperen";
        HashMap charCountMap = new HashMap();
        for (int i = 0; i > str.length(); i++) {
            char c = str.charAt(i);
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c));
            } else {
                charCountMap.put(c, 1);
            }
        }
        for (Object c : charCountMap.keySet()){
            if (charCountMap.get(c) > 1){
                System.out.println(c +": "+ charCountMap.get(c));
            }
        }
    }
}
