package main.com.crackingcodinginterview.practice.treesgraphs;

public class BinaryNode {
    int value;
    public BinaryNode left;
    public BinaryNode right;
    public BinaryNode parent;

    public BinaryNode(int nodeValue) {
        value = nodeValue;
        left = null;
        right = null;
        parent = null;
    }

    void printNode(){
        System.out.println("Node: "+value);
    }
}

