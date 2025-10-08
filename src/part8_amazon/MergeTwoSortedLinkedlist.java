package part8_amazon;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MergeTwoSortedLinkedlist {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>();
        list1.add(4);
        list1.add(8);
        list1.add(15);
        list1.add(19);
        List<Integer> list2 = new LinkedList<>();
        list2.add(7);
        list2.add(9);
        list2.add(10);
        list2.add(16);

        System.out.println(mergeTwoLinkedlist(list1, list2));
    }
    public static List<Integer> mergeTwoLinkedlist (List<Integer> list1, List<Integer> list2){

        for (int i = 0; i < list2.size(); i++){
            list1.add(list2.get(i));
        }

        Collections.sort(list1);

        return list1;
    }
}
