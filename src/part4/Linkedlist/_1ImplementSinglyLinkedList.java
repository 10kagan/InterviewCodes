//package part4.Linkedlist;
//
//import part4.Queue._2ImplementStackUsingTwoQueues;
//
//class Node{
//    public int data;
//    public Node next;
//
//    public void displayNodeData(){
//        System.out.println("{ " + data + " } ");
//    }
//}
//public class _1ImplementSinglyLinkedList {
//    private Node head;
//
//    public boolean isEmpty(){
//        return (head == null);
//    }
//    public void insertFirst(int data){
//        Node newNode = new Node();
//        newNode.data = data;
//        newNode.next = head;
//        head = newNode;
//    }
//    public Node deleteFirst(){
//        Node temp = head;
//        head = head.next;
//        return temp;
//    }
//    public void deleteAfter(Node after){
//        Node temp = head;
//        while (temp.next != null && temp.data != after.data){
//            temp = temp.next;
//        }
//        if (temp.next != null)
//            temp.next = temp.next.next;
//    }
//    public void insertLast(int data){
//        Node current = head;
//        while (current.next != null){
//            current = current.next;
//        }
//        Node newNode = new Node();
//        newNode.data = data;
//        current.next = newNode;
//    }
//    public void printLinkedList(){
//        System.out.println("Printing LinkedList (head --> last) ");
//        Node current = head;
//        while (current != null){
//            current.displayNodeData();
//            current = current.next;
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        _1ImplementSinglyLinkedList myLinkedlist = new _1ImplementSinglyLinkedList();
//        myLinkedlist.insertFirst(5);
//        myLinkedlist.insertFirst(6);
//        myLinkedlist.insertFirst(7);
//        myLinkedlist.insertFirst(1);
//        myLinkedlist.insertLast(2);
//        // Linked list will be
//        // 2 -> 1 ->  7 -> 6 -> 5
//        Node node=new Node();
//        node.data=1;
//        myLinkedlist.deleteAfter(node);
//        // After deleting node after 1,Linked list will be
//        // 2 -> 1 -> 6 -> 5
//        myLinkedlist.printLinkedList();
//
//    }
//}
