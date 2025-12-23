package Chain100Days;

public class LinkedListCycleDetector {
    public static boolean hasCycle(Node1 head){
        if (head == null) return false;

        Node1 slow = head;
        Node1 fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // 1 adım
            fast = fast.next.next;     // 2 adım

            if (slow == fast){
                return true;
            }
        }
        return false;
    }
}

class Node1 {
    int value;
    Node1 next;

    Node1(int value) {
    this.value = value;
    this.next = null;
    }
}

