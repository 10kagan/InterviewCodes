package part3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class _1ReverseLinkedList {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(13);
        list.add(366);list.add(2);list.add(-12);list.add(35);list.add(602);
        System.out.println(list);

        LinkedList<Integer> reverseList = new LinkedList<>();

        Iterator<Integer> listIterator = reverseList.descendingIterator();

        list.iterator().forEachRemaining(reverseList::add);

        System.out.println(reverseList);
        System.out.println(listIterator.toString());
    }
}
