package part4.Linkedlist;

public class _5DetectLoop {
    private Node head;
    private static class Node{
        private int value;
        private Node next;
        Node(int value){
            this.value = value;
        }
    }
    public void addToTheLast(Node node){
        if (head == null){
            head = node;
        } else {
            Node temp = head;
            while (temp != null){
                System.out.format("%d", temp.value);
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.format("%d ", temp.value);
            temp = temp.next;
        }
        System.out.println();
    }
    public boolean ifLoopExists(){
        Node fastPtr = head;
        Node slowPtr = head;
        while (fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(slowPtr == fastPtr)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        _5DetectLoop list = new _5DetectLoop();
        // Creating a linked list

        list.addToTheLast(new Node(5));
        list.addToTheLast(new Node(6));
        list.addToTheLast(new Node(7));
        list.addToTheLast(new Node(1));
        list.addToTheLast(new Node(2));

        list.printList();

        // Test if loop existed or not
        System.out.println("Loop existed-->" + list.ifLoopExists());

    }
}
