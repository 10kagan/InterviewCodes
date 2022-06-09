package part4.BinarySearchTree;

import java.util.Stack;

public class _8BinarySearchTreeCheck {
    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data = data;
        }
    }
    public void inOrder(TreeNode root){
        if (root != null){
            inOrder(root.left);
            System.out.printf("%d ", root.data);
            inOrder(root.right);
        }
    }
    public void inOrderIter(TreeNode root){
        if (root == null)
            return;
        Stack<TreeNode> s = new Stack<>();
        TreeNode currentNode = root;
        while (!s.empty() || currentNode != null){
            if (currentNode != null){
                s.push(currentNode);
                currentNode = currentNode.left;
            } else {
                TreeNode n = s.pop();
                System.out.printf("%d ", n.data);
                currentNode = n.right;
            }
        }
    }
    public static void main(String[] args) {
        TreeNode rootNode=createBinarySearchTree();

        System.out.println("-------------------------");
        System.out.println("Using inorder method");

        TreeNode prev=new TreeNode(Integer.MIN_VALUE);
        System.out.println(isBSTInOrder(rootNode,prev));

        System.out.println("-------------------------");
        System.out.println("Using min max method");
        System.out.println(isBST(rootNode,Integer.MIN_VALUE,Integer.MAX_VALUE));

        // Creating a binary tree which is not BST
        TreeNode rootNodeBinaryTree=createBinaryTree();

        System.out.println("-------------------------");
        System.out.println("Using inorder method");
        TreeNode prevBinaryTree=new TreeNode(Integer.MIN_VALUE);
        System.out.println(isBSTInOrder(rootNodeBinaryTree,prevBinaryTree));

        System.out.println("-------------------------");
        System.out.println("Using min max method");
        System.out.println(isBST(rootNodeBinaryTree,Integer.MIN_VALUE,Integer.MAX_VALUE));
        System.out.println("-------------------------");

    }
    public static TreeNode createBinarySearchTree (){
        TreeNode rootNode =new TreeNode(40);
        TreeNode node20=new TreeNode(20);
        TreeNode node10=new TreeNode(10);
        TreeNode node30=new TreeNode(30);
        TreeNode node60=new TreeNode(60);
        TreeNode node50=new TreeNode(50);
        TreeNode node70=new TreeNode(70);
        TreeNode node5=new TreeNode(5);
        TreeNode node55=new TreeNode(55);

        rootNode.left=node20;
        rootNode.right=node60;

        node20.left=node10;
        node20.right=node30;

        node60.left=node50;
        node60.right=node70;

        node10.left=node5;
        node50.right=node55;
        return rootNode;
    }
    public static TreeNode createBinaryTree(){
        TreeNode rootNode =new TreeNode(40);
        TreeNode node20=new TreeNode(20);
        TreeNode node10=new TreeNode(10);
        TreeNode node30=new TreeNode(30);
        TreeNode node60=new TreeNode(60);
        TreeNode node50=new TreeNode(50);
        TreeNode node70=new TreeNode(70);
        TreeNode node5=new TreeNode(5);
        TreeNode node55=new TreeNode(55);

        rootNode.left=node20;
        rootNode.right=node10;

        node20.left=node60;
        node20.right=node30;

        node60.left=node50;
        node60.right=node70;

        node10.left=node5;
        node50.right=node55;
        return rootNode;
    }
    public static boolean isBST(TreeNode root, int min, int max){
        if (root == null)
            return true;
        return (root.data > min && root.data > max &&
                isBST(root.left, min, root.data) &&
                isBST(root.right, root.data, max));
    }
    public static boolean isBSTInOrder(TreeNode root, TreeNode prev){
        if (root == null)
            return true;
        if (!isBSTInOrder(root.left, prev))
            return false;
        if (prev.data > root.data)
            return false;
        prev.data = root.data;
        return isBSTInOrder(root.right, prev);
    }
}
