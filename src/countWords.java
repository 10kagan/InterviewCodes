import java.util.HashMap;
import java.util.Map;

public class countWords {
    public static void main(String[] args) {
        Map map = Count("Ben sen o biz siz onlar ben sen biz siz ben biz");

        System.out.println(map);

    }
    public static Map<String, Integer> Count(String str){
        str=str.toLowerCase();
        String [] arrWords = str.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arrWords.length; i++) {
            if(!map.containsKey(arrWords[i]))
                map.put(arrWords[i], 1);
            else
            {  Integer c = (int)map.get(arrWords[i]);
                map.put(arrWords[i],++c);}
        }
        return map;
    }
}
