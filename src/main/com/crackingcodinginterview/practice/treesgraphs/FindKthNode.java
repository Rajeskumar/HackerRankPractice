package main.com.crackingcodinginterview.practice.treesgraphs;

import java.util.ArrayList;
import java.util.List;

/**
 * Find kth node in in-order traversal of a tree
 */
public class FindKthNode {

    public BinaryNode findKthNode (BinaryNode root, int k){
        if (root == null) return null;

        if (k < 1) return null;

        List<BinaryNode> nodeOrder = new ArrayList<>();

        doInOrderTraverse(root, k, nodeOrder);

        return nodeOrder.get(k-1);

    }

    private void doInOrderTraverse(BinaryNode root, int k, List<BinaryNode> nodeOrder) {

        BinaryNode node = null;
        if(root == null) return;

        if(root.left !=null){
            doInOrderTraverse(root.left, k, nodeOrder);
            nodeOrder.add(root);
        }else{
            nodeOrder.add(root);
        }

        if(root.right != null){
            doInOrderTraverse(root.right, k, nodeOrder);
        }

        return;
    }
}
