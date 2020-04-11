package test.com.crackingcodinginterview.practice.treesgraphs;

import main.com.crackingcodinginterview.practice.treesgraphs.BinaryNode;
import main.com.crackingcodinginterview.practice.treesgraphs.SuccessorNodeBST;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuccessorNodeBSTTest {

    SuccessorNodeBST successorNodeBST;

    BinaryNode root;

    @BeforeEach
    void setUp() {
        successorNodeBST = new SuccessorNodeBST();
        root = new BinaryNode(10);
        root.right = new BinaryNode(15);
        root.left = new BinaryNode(6);
        root.right.parent = root;
        root.left.parent = root;

        root.left.left = new BinaryNode(4);
        root.left.right = new BinaryNode(8);
        root.left.left.parent = root.left;
        root.left.right.parent = root.left;

        root.left.left.right = new BinaryNode(5);
        root.left.left.right.parent = root.left.left;


        root.right.left = new BinaryNode(12);
        root.right.left.parent = root.right;
        root.right.left.left = new BinaryNode(11);
        root.right.left.right = new BinaryNode(13);
        root.right.left.left.parent = root.right.left;
        root.right.left.right.parent = root.right.left;

        root.right.right = new BinaryNode(18);
        root.right.right.parent = root.right;
        root.right.right.left = new BinaryNode(16);
        root.right.right.right = new BinaryNode(19);
        root.right.right.left.parent = root.right.right;
        root.right.right.right.parent = root.right.right;
    }

    @Test
    void findSuccessorNodeHappyPath() {

        BinaryNode actual = successorNodeBST.findSuccessorNode(root);

        BinaryNode expected = root.right.left.left;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    void findSuccessorNodeForRightMostLeaftNode() {

        BinaryNode actual = successorNodeBST.findSuccessorNode(root.right.right.right);

        Assertions.assertEquals(actual, null);

    }

    @Test
    void findSuccessorNodeForLeftMostLeafNode() {

        BinaryNode actual = successorNodeBST.findSuccessorNode(root.left.left.right);

        BinaryNode expected = root.left;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    void findSuccessorNodeForAnyLeftLeafNode() {

        BinaryNode actual = successorNodeBST.findSuccessorNode(root.right.left.left);

        BinaryNode expected = root.right.left;

        Assertions.assertEquals(actual, expected);

    }
}