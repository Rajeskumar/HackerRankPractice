package main.com.crackingcodinginterview.practice.treesgraphs;

/**
 * Write an alogorithm to find the "next" node (in-order successor) of a given node in a binary search tree.
 * You may assume that each node has a link to its parent.
 * Given node can be leaf node or root node or any other parent of sub-tree node.
 */
public class SuccessorNodeBST {

    public BinaryNode findSuccessorNode(BinaryNode node){
        if(node == null) return null;

        if(node.right != null){
            return findLeftMostNode(node.right);
        }else{
            return findParentSuccessor(node);
        }
    }

    private BinaryNode findParentSuccessor(BinaryNode node) {
        if(node.parent == null) return null;
        if(node.parent.value > node.value){
            return node.parent;
        }else{
            return findParentSuccessor(node.parent);
        }
    }

    private BinaryNode findLeftMostNode(BinaryNode node){

        if(node.left == null) {
            return node;
        }
        else{
            return findLeftMostNode(node.left);
        }
    }
}
