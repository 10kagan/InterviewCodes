package Chain100Days;

public class ReversedLinkedListMain {
    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        Node reversed = ReversedLinkedList.reverse(head);

        while (reversed != null){
            System.out.println(reversed.value + " ");
            reversed = reversed.next;
        }
    }
}

// Reverse a LinkedList iteratively