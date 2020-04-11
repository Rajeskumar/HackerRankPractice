package main.com.crackingcodinginterview.practice.treesgraphs;

import java.util.List;

public class DepthListsTest {

    public static void main(String[] args) {
        DepthLists depthLists = new DepthLists();

        BinaryNode rootNode = new BinaryNode(5);
        rootNode.left = new BinaryNode(4);
        rootNode.right = new BinaryNode(6);

        rootNode.left.left = new BinaryNode(3);
        rootNode.left.right = new BinaryNode(2);

        rootNode.right.left = new BinaryNode(7);
        rootNode.right.right = new BinaryNode(8);

        rootNode.left.left.left = new BinaryNode(1);

//        List<List<BinaryNode>> resultNodeList = depthLists.depthLists(rootNode);
//
//        System.out.println("Depth of Tree: "+resultNodeList.size());

        int x = 10;
        System.out.println(" Bits : "+Integer.toBinaryString(9));
    }
}
