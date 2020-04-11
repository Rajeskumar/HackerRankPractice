package test.com.crackingcodinginterview.practice.treesgraphs;

import main.com.crackingcodinginterview.practice.treesgraphs.BinaryNode;
import main.com.crackingcodinginterview.practice.treesgraphs.FormMinimumHeightBST;
import main.com.crackingcodinginterview.practice.treesgraphs.ValidateBST;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateBSTTest {

    ValidateBST validateBST;

    FormMinimumHeightBST formMinimumHeightBST;

    @BeforeEach
    void setUp() {
        validateBST = new ValidateBST();
        formMinimumHeightBST = new FormMinimumHeightBST();
    }

    @Test
    void validateBSTHappyPath() {
        int[] input = new int []{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        BinaryNode root = formMinimumHeightBST.minimalHeightBST(input,null);

        boolean isBST = validateBST.validateBST(root);

        Assertions.assertTrue(isBST);
    }

    @Test
    void validateBSTFailCase(){

        BinaryNode root = new BinaryNode(10);
        root.right = new BinaryNode(15);
        root.left = new BinaryNode(6);

        root.left.left = new BinaryNode(4);
        root.left.right = new BinaryNode(8);

        root.left.left.right = new BinaryNode(5);


        root.right.left = new BinaryNode(12);
        root.right.left.left = new BinaryNode(11);
        root.right.left.right = new BinaryNode(13);

        root.right.right = new BinaryNode(7);
        root.right.right.left = new BinaryNode(16);
        root.right.right.right = new BinaryNode(19);

        boolean isBst = validateBST.validateBST(root);

        Assertions.assertFalse(isBst);

    }
}