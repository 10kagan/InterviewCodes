package Chain100Days;

import java.util.HashSet;
import java.util.Set;

public class UniqueSubstrings {
    public static void main(String[] args) {
        String input = "banana";
        Set<String> substrings = findUniqueSubstrings(input);

        for (String s : substrings){
            System.out.println(s);
        }
        System.out.println("Total substring count is: " + substrings.size());
    }
    public static Set<String> findUniqueSubstrings (String str){
        Set<String> uniqueSubstrings = new HashSet<>();

        int n = str.length();
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j <= n; j++){
                uniqueSubstrings.add(str.substring(i, j));
            }
        }
        return uniqueSubstrings;
    }
}
// Find all substrings of a given string.