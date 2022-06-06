package part4.BinarySearchTree;

public class _5InorderSuccessor {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node (int data){
            this.data = data;
        }
        public String toString(){
            return data + "";
        }
    }
    public static Node root;

    public static void main(String[] args) {
        root = new Node(6);
        root. left = new Node(4);
        root. right = new Node(10);
        root. left. left = new Node(1);
        root. left. right = new Node(5);
        root. right. right = new Node(12);
        root. right. left = new Node(8);
        root. right. left. left = new Node(7);
        root. right. left. right = new Node(9);

        System.out.println(getJustLarger(root, 9));
    }

    private static int getJustLarger(Node node, int target) {
        if (node == null)
            return Integer.MAX_VALUE;
        int lr = getJustLarger(node.left, target);
        int rr = getJustLarger(node.right, target);
        int rv = Integer.MAX_VALUE;
        if (node.data > target && node.data < rv)
            rv = node.data;
        if (lr > target && lr < rv)
            rv = lr;
        if (rr > target && rr < rv)
            rv = rr;
        return rv;
    }
}
