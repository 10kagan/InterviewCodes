package part4.BinarySearchTree;

public class _3FindMinimumMaximumElements {
    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data = data;
        }
    }
    public static boolean search(TreeNode root, TreeNode nodeToBeSeached){
        if (root == null)
            return false;
        if (root.data == nodeToBeSeached.data)
            return true;
        boolean result = false;
        if (root.data > nodeToBeSeached.data)
            result = search(root.left, nodeToBeSeached);
        else if (root.data < nodeToBeSeached.data)
            result = search(root.right, nodeToBeSeached);
        return result;
    }
    public static TreeNode minimumElement (TreeNode root){
        if (root.left == null)
            return root;
        else
            return minimumElement(root.left);
    }
    public static TreeNode maximumElement (TreeNode root){
        if (root.right == null)
            return root;
        else
            return maximumElement(root.right);
    }
    public static TreeNode insert (TreeNode root, TreeNode nodeToBeInserted){
        if (root == null){
            root = nodeToBeInserted;
            return root;
        }
        if (root.data > nodeToBeInserted.data){
            if (root.left == null)
                root.left = nodeToBeInserted;
            else
                insert(root.left, nodeToBeInserted);
        }
        else if (root.data < nodeToBeInserted.data){
            if (root.right == null)
                root.right = nodeToBeInserted;
            else
                insert(root.right, nodeToBeInserted);
        }
        return root;
    }
    public static void inOrder(TreeNode root){
        if (root == null)
            return;
        inOrder(root.left);
        System.out.println(root.data + "  ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        TreeNode rootNode = createBinarySearchTree();
        System.out.println("Minimum element in binary search tree: " + minimumElement(rootNode).data);
        System.out.println("Maximum element in binary search tree: " + maximumElement(rootNode).data);
    }
    public static TreeNode createBinarySearchTree(){
        TreeNode rootNode =new TreeNode(40);
        TreeNode node20=new TreeNode(20);
        TreeNode node10=new TreeNode(10);
        TreeNode node30=new TreeNode(30);
        TreeNode node60=new TreeNode(60);
        TreeNode node50=new TreeNode(50);
        TreeNode node70=new TreeNode(70);

        TreeNode node5=new TreeNode(5);
        TreeNode node55=new TreeNode(55);

        insert(null,rootNode);
        insert(rootNode,node20);
        insert(rootNode,node10);
        insert(rootNode,node30);
        insert(rootNode,node60);
        insert(rootNode,node50);
        insert(rootNode,node70);
        insert(rootNode,node5);
        insert(rootNode,node55);

        return rootNode;

    }
}
