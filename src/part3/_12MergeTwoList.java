package part3;

import java.util.ArrayList;
import java.util.List;

public class _12MergeTwoList {
    public static void main(String[] args) {
        List<String> lst1 = new ArrayList<>();
        lst1.add("1");
        lst1.add("a");
        List<String> lst2 = new ArrayList<>();
        lst2.add("2");
        lst1.add("b");

        List<String> mergedList = new ArrayList<>(lst1);
        mergedList.addAll(lst2);
        System.out.println(mergedList);
    }
}
