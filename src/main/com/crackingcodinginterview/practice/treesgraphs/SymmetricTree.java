package main.com.crackingcodinginterview.practice.treesgraphs;

public class SymmetricTree {

    public boolean isSymmetricTree(BinaryNode root){
        if(root == null) return false;

        if(root.left == null && root.right == null) return true;

        return checkEquality(root.left, root.right);
    }

    private boolean checkEquality(BinaryNode left, BinaryNode right) {
        if(left == null && right == null){
            return true;
        }else if (left == null || right == null) {
            return false;
        }

        if(left.value == right.value && checkEquality(left.left, right.left)){
            return checkEquality(left.right, right.right);
        }

        return false;
    }
}
