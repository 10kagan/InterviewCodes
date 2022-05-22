package part4.Linkedlist;

public class _6PalindromeCheck {
    private Node head;

    private static class Node{
        private int value;
        private Node next;

        Node (int value){
            this.value = value;
        }
    }
    public void addToTheLast(Node node){
        if (head == null){
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }
    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.format("%d", temp.value);
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node findMiddleNode (Node head){
        Node slowPointer, fastPointer;
        slowPointer = fastPointer = head;
        while (fastPointer != null){
            fastPointer = fastPointer.next;
            if (fastPointer != null && fastPointer.next != null){
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next;
            }
        }
        return slowPointer;
    }
    public static boolean checkPalindrome(Node head){
        Node middleNode = findMiddleNode(head);
        Node secondHead = middleNode.next;
        middleNode.next = null;
        Node reverseSecondHead = reversedLinkedList(secondHead);
        while (head != null && reverseSecondHead != null){
            if (head.value == reverseSecondHead.value){
                head = head.next;
                reverseSecondHead = reverseSecondHead.next;
                continue;
            }else
                return false;
        }
        return true;
    }

    private static Node reversedLinkedList(Node currentNode) {
        Node previousNode = null;
        Node nextNode;
        while (currentNode != null){
            nextNode  = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return previousNode;
    }

    public static void main(String[] args) {
        _6PalindromeCheck list = new _6PalindromeCheck();
        // Creating a linked list
        Node head=new Node(1);
        list.addToTheLast(head);
        list.addToTheLast(new Node(2));
        list.addToTheLast(new Node(1));
        list.addToTheLast(new Node(2));
        list.addToTheLast(new Node(1));

        list.printList();

        System.out.println("Linked list palidrome: "+checkPalindrome(head));

    }
}
