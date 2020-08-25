import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        permutation("1234");
    }
    public static void permutation(String str){
        List<String> lst = new ArrayList<String>();

        for (int i = 0; i < str.length() + 1; i++) {
            for (int j = 0; j < i; j++){
                lst.add(str.substring(j, i));
            }
        }
        System.out.println((lst));
    }
}
