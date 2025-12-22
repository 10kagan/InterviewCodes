package Chain100Days;

public class ReversedLinkedList {
    public static Node reverse (Node head){

         Node prev = null;
         Node current = head;

         while (current != null){
             Node nextTemp = current.next;
             current.next = prev;
             prev = current;
             current = nextTemp;
         }
         return prev;
    }
}
class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

