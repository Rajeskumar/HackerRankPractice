package test.com.crackingcodinginterview.practice.treesgraphs;

import main.com.crackingcodinginterview.practice.treesgraphs.BinaryNode;
import main.com.crackingcodinginterview.practice.treesgraphs.SymmetricTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricTreeTest {

    SymmetricTree symmetricTree;
    @BeforeEach
    void setUp() {
        symmetricTree = new SymmetricTree();
    }

    @Test
    void isSymmetricTree_happyPath() {

        BinaryNode root = new BinaryNode(5);
        root.right = new BinaryNode(7);
        root.left = new BinaryNode(7);

        root.left.left = new BinaryNode(8);
        root.left.right = new BinaryNode(4);
        root.left.left.left = new BinaryNode(3);
        root.left.right.left = new BinaryNode(2);

        root.right.left = new BinaryNode(8);
        root.right.right = new BinaryNode(4);
        root.right.left.left = new BinaryNode(3);
        root.right.right.left = new BinaryNode(2);

        boolean actual = symmetricTree.isSymmetricTree(root);

        assertEquals(true, actual);
    }

    @Test
    void isSymmetricTree_nonSymmetric() {

        BinaryNode root = new BinaryNode(5);
        root.right = new BinaryNode(7);
        root.left = new BinaryNode(7);

        root.left.left = new BinaryNode(8);
        root.left.right = new BinaryNode(4);
        root.left.left.left = new BinaryNode(3);
        root.left.right.left = new BinaryNode(2);

        root.right.left = new BinaryNode(8);
        root.right.right = new BinaryNode(4);
        root.right.left.left = new BinaryNode(3);
        root.right.right.left = new BinaryNode(15);

        boolean actual = symmetricTree.isSymmetricTree(root);

        assertEquals(false, actual);
    }
}