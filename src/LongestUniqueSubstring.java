import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        System.out.println(printLongestUniqueSubstring("2abbabacs"));
    }
    public static String printLongestUniqueSubstring(String str){
        String num = str.substring(0,1);
        int num2 = Integer.parseInt(num);
        str = str.substring(1);
        String substr = "";

        Map<String, Integer> map = new HashMap<String, Integer>();


        for(int i = 0; i < str.length() ; i++){
            for (int j = i+1; j < str.length()+1 ; j++) {
                substr = str.substring(i, j);
                System.out.println(substr);

                String [] strArr = substr.split("");
                for (String each: strArr) {
                    if(!map.containsKey(each)){
                        map.put(each, 1);
                    }else
                        map.put(each, each.length() + 1);
                }
                System.out.println(map);

            }
        }
        System.out.println(map);
    }
}
