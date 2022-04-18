package part4;

import java.util.HashSet;

public class _1StringAllUniqueChar {
    public static void main(String[] args) {
        System.out.println(hasAllUnique("This sentence doesn't consist of all unique chars"));
    }
    public static boolean hasAllUnique (String word){
        HashSet hset = new HashSet();
        for (int index = 0; index < word.length(); index++){
            char c = word.charAt(index);
            if (!hset.add(c))
                return false;
        }
        return true;
    }
}
