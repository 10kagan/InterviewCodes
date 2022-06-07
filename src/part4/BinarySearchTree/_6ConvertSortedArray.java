package part4.BinarySearchTree;

public class _6ConvertSortedArray {
    public static class TreeNode {
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
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80,90};
        TreeNode rootNode = createBinarySearchTreeFromSortedArray(arr, 0, arr.length - 1);
        System.out.println("Preorder traversal of created binary search tree: ");
        preOrder(rootNode);
    }

    private static TreeNode createBinarySearchTreeFromSortedArray(int[] arr, int start, int end) {
        if (start > end)
            return null;
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(arr[mid]);
        node.left = createBinarySearchTreeFromSortedArray(arr, start, mid - 1);
        node.right = createBinarySearchTreeFromSortedArray(arr, mid + 1, end);
        return node;
    }
}
