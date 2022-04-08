package part3;

import java.util.HashMap;

public class _16WordCount {
    public static void main(String[] args) {

        String str = "some words words freq count num num";
        String [] words = str.split(" ");
        HashMap<String,Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < words.length; i++){
            if (map.containsKey(words[i])){
                int count = map.get(words[i]);
                map.put(words[i], count+1);
            }else{
                map.put(words[i], 1);
            }
        }
        System.out.println(map);
    }

}
