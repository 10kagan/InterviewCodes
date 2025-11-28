package Chain100Days;

public class ReverseLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Reverse method
    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next; // 1️⃣ sonraki node'u kaybetme
            current.next = prev;      // 2️⃣ pointer yönünü ters çevir
            prev = current;           // 3️⃣ prev ileri kaydır
            current = next;           // 4️⃣ current ileri kaydır
        }

        return prev; // yeni head
    }



    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " → ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // LinkedList oluştur
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Original List:");
        printList(head);

        head = reverse(head);

        System.out.println("Reversed List:");
        printList(head);
    }
}
