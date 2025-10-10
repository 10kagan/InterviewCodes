package Chain100Days;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static String removeDuplicates (String str){
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()){
            set.add(c);
        }

        for (char c : set){
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "hello world";
        System.out.println(removeDuplicates(s));
    }
}
//LinkedHashSet doesn't have duplicates. All items in it are UNIQUE.