package com.crackingcodinginterview.practice.treesgraphs;

public class FormMinimumHeightBSTTest {

    public static void main(String[] args) {
        int[] input = new int []{1,2,3,4,5,6,7,8,9,10,11,12,13};

        BinaryNode node = FormMinimumHeightBST.minimalHeightBST(input, null);

        System.out.println("Node : "+node);
    }
}
