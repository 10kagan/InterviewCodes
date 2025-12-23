package Chain100Days;

public class LinkedListCycleDetectorMain {
    public static void main(String[] args) {

        Node1 n1 = new Node1(0);
        Node1 n2 = new Node1(1);
        Node1 n3 = new Node1(2);
        Node1 n4 = new Node1(3);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;

        System.out.println(LinkedListCycleDetector.hasCycle(n1));
    }
}

// Detect a cycle in a LinkedList