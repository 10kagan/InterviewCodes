package part4.BinaryTree;

public class _7LeafNodeCount {
    public static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode (int data){
            this.data = data;
        }
    }
    public static int getLeadCountOfBinaryTree (TreeNode node){
        if (node == null)
            return 0;
        if (node.left == null && node.right == null)
            return 1;
        else
            return getLeadCountOfBinaryTree(node.left) + getLeadCountOfBinaryTree(node.right);
    }

    public static void main(String[] args) {
        TreeNode rootNode = createBinaryTree();
        System.out.println("Number of leaf nodes in binary tree :" + getLeadCountOfBinaryTree(rootNode));
    }

    private static TreeNode createBinaryTree() {
        TreeNode rootNode =new TreeNode(40);
        TreeNode node20=new TreeNode(20);
        TreeNode node10=new TreeNode(10);
        TreeNode node30=new TreeNode(30);
        TreeNode node60=new TreeNode(60);
        TreeNode node50=new TreeNode(50);
        TreeNode node70=new TreeNode(70);

        rootNode.left=node20;
        rootNode.right=node60;

        node20.left=node10;
        node20.right=node30;

        node60.left=node50;
        node60.right=node70;

        return rootNode;

    }
}
