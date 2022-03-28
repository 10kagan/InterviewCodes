package part2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HowManyWords {
    public static void main(String[] args) {
        System.out.println(count("How many words in this sentence, 7?"));
    }
    public static int count (String str){
        int result = 0;
        String [] arr = str.split(" ");

        Set<String> wordSet = new HashSet<String>(Arrays.asList(arr));
        for(int i = 0; i< arr.length; i++){
            if(!wordSet.add(arr[i])){
                result++;
            }

//            if(!arr[i].contains("7"))
//                result++;
        }

        System.out.println(wordSet);
        return result;
    }
}
