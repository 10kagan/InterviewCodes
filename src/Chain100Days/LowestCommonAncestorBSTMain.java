package Chain100Days;

public class LowestCommonAncestorBSTMain {

    public static void main(String[] args) {
        BstNode root = new BstNode(6);
        root.left = new BstNode(2);
        root.right = new BstNode(8);
        root.left.left = new BstNode(0);
        root.left.right = new BstNode(4);
        root.right.left = new BstNode(7);
        root.right.right = new BstNode(9);

        BstNode lca1 = LowestCommonAncestorBST.findLca(root, 2, 8);
        System.out.println(lca1.value); // 6

        BstNode lca2 = LowestCommonAncestorBST.findLca(root, 0, 4);
        System.out.println(lca2.value); // 2
    }
}

// Find the lowest common ancestor in a binary search tree