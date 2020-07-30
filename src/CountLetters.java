import java.util.HashMap;
import java.util.Map;

public class CountLetters {
    public static void main(String[] args) {
        System.out.println(countLetter("ahmet ahmed"));
    }
    public static  Map<String, Integer> countLetter(String str){
        Map<String, Integer> map = new HashMap<>();
        String [] strArr = str.split("");


        for (String each: strArr) {
            if(!map.containsKey(each)){
                map.put(each, 1);
            }else
                map.put(each, each.length() + 1);
        }
        return map;
    }
}

//5.Write a method which returns how many times each letter is repeated?
//Integer d = (int) map2.get(arr2[j]);
//                map2.put(arr2[j], ++d);
