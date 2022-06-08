package part4.BinarySearchTree;

public class _7ConvertSortedLinkedList {
    private Node head;
    private static class Node{
        private int value;
        private Node next;
        Node(int value){
            this.value = value;
        }
    }
    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data = data;
        }
    }
    public static void preOrder(TreeNode root){
        if (root == null)
            return;
        System.out.println(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public void addToTheLast(Node node){
        if (head == null){
            head = node;
        } else{
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }
    public void printList(Node head){
        Node temp = head;
        while (temp != null){
            System.out.format("%d", temp.value);
            temp = temp.next;
        }
        System.out.println();
    }
    public int lengthOfLinkedList(){
        Node temp = head;
        int count = 0;
        while (temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    public TreeNode converSortedLinkedListToBST(int n){
        if (n <= 0)
            return null;
        TreeNode left = converSortedLinkedListToBST(n/2);
        TreeNode root = new TreeNode(head.value);
        root.left = left;
        head = head.next;
        root.right = converSortedLinkedListToBST(n - n/2 - 1);
        return root;
    }

    public static void main(String[] args) {
        _7ConvertSortedLinkedList list = new _7ConvertSortedLinkedList();
        Node head = new Node(10);
        list.addToTheLast(head);
        list.addToTheLast(new Node(20));
        list.addToTheLast(new Node(30));
        list.addToTheLast(new Node(40));
        list.addToTheLast(new Node(50));
        list.addToTheLast(new Node(60));
        list.addToTheLast(new Node(70));
        list.addToTheLast(new Node(80));
        list.addToTheLast(new Node(90));
        System.out.println("Printing linked list :");
        list.printList(head);
        int n = list.lengthOfLinkedList();
        TreeNode bst = list.converSortedLinkedListToBST(n);
        System.out.println("---------------");
        System.out.println("Pre order traversal of binary search tree: ");
        preOrder(bst);
    }
}
