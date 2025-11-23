package Chain100Days;

import java.util.Map;

public class WordCountMap {
    public static void main(String[] args) {
        String paragraph = "Java is great and Java is powerful and great";

        Map<String, Integer> result = countWordOccurrences(paragraph);

        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    public static Map<String, Integer> countWordOccurrences (String text){

    }

}
