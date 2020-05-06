package test.com.crackingcodinginterview.practice.treesgraphs;

import main.com.crackingcodinginterview.practice.treesgraphs.BinaryNode;
import main.com.crackingcodinginterview.practice.treesgraphs.CheckSubTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckSubTreeTest {

    CheckSubTree checkSubTree;
    BinaryNode root1;
    BinaryNode root2;
    @BeforeEach
    void setUp() {
        checkSubTree = new CheckSubTree();

        root1 = new BinaryNode(10);
        root1.right = new BinaryNode(15);
        root1.left = new BinaryNode(6);

        root1.left.left = new BinaryNode(4);
        root1.left.right = new BinaryNode(8);

        root1.left.left.right = new BinaryNode(5);


        root1.right.left = new BinaryNode(12);
        root1.right.left.left = new BinaryNode(11);
        root1.right.left.right = new BinaryNode(13);

        root1.right.right = new BinaryNode(18);
        root1.right.right.left = new BinaryNode(16);
        root1.right.right.right = new BinaryNode(19);

        root2 = new BinaryNode(18);
        root2.left = new BinaryNode(16);
        root2.right = new BinaryNode(19);
    }

    @Test
    void checkSubTree() {

        boolean actual = checkSubTree.checkSubTree(root1, root2);
        assertTrue(actual);
    }

    @Test
    void checkSubTree_t2DoesntExist() {

        root2 = new BinaryNode(25);
        root2.left = new BinaryNode(27);
        root2.right = new BinaryNode(29);

        boolean actual = checkSubTree.checkSubTree(root1, root2);
        assertFalse(actual);
    }

    @Test
    void checkSubTree_t2Exist_NotMatching() {

        root2 = new BinaryNode(18);
        root2.left = new BinaryNode(16);
        root2.right = new BinaryNode(22);

        boolean actual = checkSubTree.checkSubTree(root1, root2);
        assertFalse(actual);
    }

    @Test
    void checkSubTree_t2Exist_hasExtraNode_NotMatching() {

        root2 = new BinaryNode(18);
        root2.left = new BinaryNode(16);
        root2.right = new BinaryNode(19);
        root2.left.right = new BinaryNode(17);

        boolean actual = checkSubTree.checkSubTree(root1, root2);
        assertFalse(actual);
    }
}