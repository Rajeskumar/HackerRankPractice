package main.com.crackingcodinginterview.practice.treesgraphs;

/**
 * T1 and T2 are two very large binary trees, with t1 much bigger than t2.
 * Create an algorithm to determine if T2 is a subtree of T1.
 *
 * A tree T2 is a subtree of T1 if there eixsts a node n in T1 such that the subtree of n is identical to T2.
 * That is, if you cut off the tree at node n, the two trees would be identical.
 */
public class CheckSubTree {

    public boolean checkSubTree  (BinaryNode t1, BinaryNode t2){
        if(t1 == null || t2 == null) return false;

        BinaryNode t2rootAtT1 = findT2RootAtT1(t1, t2);

        if(t2rootAtT1 != null){
            return compareTrees(t2rootAtT1, t2);
        }else{
            return false;
        }
    }

    /**
     * Finding t2 root node at t1 and return t1 node.
     * @param t1
     * @param t2
     * @return
     */
    private BinaryNode findT2RootAtT1(BinaryNode t1, BinaryNode t2) {
        if(t1 == null) return null;

        if(t1.value == t2.value) return t1;


        BinaryNode node = findT2RootAtT1(t1.left, t2);

        if(node == null){
            node = findT2RootAtT1(t1.right, t2);
        }
        return node;
    }


    /**
     * Compares both trees and return true if same childs at every level, else false.
     * @param t1
     * @param t2
     * @return
     */
    private boolean compareTrees(BinaryNode t1, BinaryNode t2) {

        if(t1 == null && t2 == null) return true;
        else if (t1 == null || t2 == null) return false;
        else if(t1.value != t2.value) return false;
        else return compareTrees(t1.left, t2.left) && compareTrees(t1.right, t2.right);
    }

}
