package part4.Linkedlist;

public class _7IntersectionTwoLinkedList {
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
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }
    public Node findIntersectionNode (Node list1, Node list2){
        int lengthOfList1 = 0;
        int lengthOfList2 = 0;
        Node temp1 = list1, temp2 = list2;
        if (temp1 == null || temp2 == null)
            return null;
        while (temp1 != null){
            lengthOfList1++;
            temp1 = temp1.next;
        }
        while (temp2 != null){
            lengthOfList2++;
            temp2 = temp2.next;
        }
        int difference = 0;
        Node ptr1 = list1;
        Node ptr2 = list2;

        if (lengthOfList1 > lengthOfList2){
            difference = lengthOfList1 - lengthOfList2;
            int i = 0;
            while (i < difference){
                ptr1 = ptr1.next;
                i++;
            }
        }else {
            difference = lengthOfList2 - lengthOfList1;
            int i = 0;
            while (i < difference){
                ptr2 = ptr2.next;
                i++;
            }
        }
        while (ptr1 != null && ptr2 != null){
            if (ptr1 == ptr2){
                return ptr1;
            }
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return null;
    }

    public static void main(String[] args) {
        _7IntersectionTwoLinkedList list1 = new _7IntersectionTwoLinkedList();
        // Creating a linked list
        Node head1=new Node(5);
        list1.addToTheLast(head1);
        list1.addToTheLast(new Node(6));
        Node node = new Node(7);
        list1.addToTheLast(node);
        list1.addToTheLast(new Node(1));
        list1.addToTheLast(new Node(2));

        _7IntersectionTwoLinkedList list2 = new _7IntersectionTwoLinkedList();
        Node head2=new Node(4);
        list2.addToTheLast(head2);
        list2.addToTheLast(node);

        Node findIntersectionNode = list1.findIntersectionNode(head1, head2);
        if(findIntersectionNode==null) {
            System.out.println("Two linked lists do not intersect!!");
        } else {
            System.out.println("Intersecting node: "+findIntersectionNode.value);
        }
    }
}
