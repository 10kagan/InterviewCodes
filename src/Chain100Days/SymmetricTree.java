package Chain100Days;

public class SymmetricTree {
    public static boolean isSymmetric(TreeNode root){
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    public static boolean isMirror(TreeNode a, TreeNode b){
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;

        if (a.val != b.val) return false;

        return isMirror(a.left, b.right) && isMirror(a.right, b.left);
    }
}

class TreeNode{
    int val;
    TreeNode right;
    TreeNode left;

    TreeNode(int val){
        this.val = val;
    }
}

// Check if a binary tree is symmetric