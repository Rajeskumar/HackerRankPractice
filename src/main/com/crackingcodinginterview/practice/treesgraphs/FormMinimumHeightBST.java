package main.com.crackingcodinginterview.practice.treesgraphs;

import java.util.Arrays;

public class FormMinimumHeightBST {

    public BinaryNode minimalHeightBST (int[] input, String nodeType) {
        int bstHeight = 0;
        BinaryNode rootNode = null;
        int len = input.length;
        if(len == 1) return new BinaryNode(input[0]);
        if(len == 2 && nodeType.equalsIgnoreCase("left")){
            rootNode = new BinaryNode(input[1]);
            rootNode.left = new BinaryNode(input[0]);
            return rootNode;
        }else if(len == 2 && nodeType.equalsIgnoreCase("right")){
            rootNode = new BinaryNode(input[0]);
            rootNode.right = new BinaryNode(input[1]);
            return rootNode;
        }
        int mididx=0;
        if(len%2 == 0) {
            mididx = len/2 -1;
        }else{
            mididx = len/2;
        }
        rootNode = new BinaryNode(input[mididx]);
        rootNode.left = minimalHeightBST (Arrays.copyOfRange(input, 0,mididx), "left");
        rootNode.right = minimalHeightBST (Arrays.copyOfRange(input, mididx+1, len), "right");
        return rootNode;
    }

}
