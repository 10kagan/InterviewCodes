package Chain50JavaCore;

import java.util.ArrayList;
import java.util.List;

public class AllSubstrings {
    public static List<String> generateSubstrings(String str){

        List<String> substrings = new ArrayList<>();

        if (str == null) return substrings;

        int n = str.length();

        for (int start = 0; start < n; start++){
            for (int end = start + 1; end <= n; end++){
                substrings.add(str.substring(start, end));
            }
        }
        return substrings;
    }

    public static void main(String[] args) {
        List<String> result = generateSubstrings("abc");

        for (String s : result) {
            System.out.println(s);
        }
    }
}

// Generate all substrings of a given string