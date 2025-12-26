package Chain100Days;

public class LowestCommonAncestorBST {
    public static BstNode findLca(BstNode root, int p, int q){

        BstNode current = root;

        while (current != null){

            if (p < current.value && q < current.value){
                current = current.left;
            } else if (p > current.value && q > current.value) {
                current = current.right;
            } else {
                return current;
            }
        }
        return null;
    }
}

class BstNode {
    int value;
    BstNode left;
    BstNode right;

    BstNode(int value) {
        this.value = value;
    }
}

