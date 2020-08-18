import com.sun.tools.javac.util.List;

import java.util.ArrayList;

public class RemoveAll {
    public static void main(String[] args) {
        removeAll(new ArrayList<String>(List.of("hi","hello","bye","selam")),"hello");
    }
    public static void removeAll(ArrayList<String> words, String target){
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).equals(target))
                words.remove(i);
        }
        System.out.println(words);
    }
}
