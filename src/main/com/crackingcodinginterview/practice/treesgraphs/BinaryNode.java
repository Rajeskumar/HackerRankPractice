package main.com.crackingcodinginterview.practice.treesgraphs;

import java.util.List;

public class BinaryNode<T> {
    public T value;
    public BinaryNode<T> left;
    public BinaryNode<T> right;
    public BinaryNode<T> parent;

    public BinaryNode(T nodeValue) {
        value = nodeValue;
        left = null;
        right = null;
        parent = null;
    }

    public void printNode(){
        System.out.println("Node: "+value);
    }

    public void doInOrderTraverse(BinaryNode root, List<BinaryNode> nodeOrder) {

        BinaryNode node = null;
        if(root == null) return;

        if(root.left !=null){
            doInOrderTraverse(root.left, nodeOrder);
            nodeOrder.add(root);
        }else{
            nodeOrder.add(root);
        }

        if(root.right != null){
            doInOrderTraverse(root.right, nodeOrder);
        }

        return;
    }
}

