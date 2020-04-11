package main.com.crackingcodinginterview.practice.treesgraphs;

/**
 * Validate whether the given Binary tree is Binary Search tree or not.
 */
public class ValidateBST {

    //TODO not fully working.
    public boolean validateBST(BinaryNode root){

        boolean isBST = true;

        if(root == null) return false;

        if(root.left != null){
            if(root.value < root.left.value){
                return false;
            }else{
                isBST =  validateBST(root.left);
            }
        }

        if(root.right != null){
            if(root.value > root.right.value){
                return false;
            }else{
                isBST = validateBST(root.right);
            }
        }
        return isBST;
    }

}
