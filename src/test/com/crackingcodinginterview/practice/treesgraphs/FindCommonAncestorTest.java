package test.com.crackingcodinginterview.practice.treesgraphs;

import main.com.crackingcodinginterview.practice.treesgraphs.BinaryNode;
import main.com.crackingcodinginterview.practice.treesgraphs.FindCommonAncestor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindCommonAncestorTest {

    FindCommonAncestor findCommonAncestor;
    BinaryNode root;

    @BeforeEach
    void setUp() {
        findCommonAncestor = new FindCommonAncestor();
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
    void findFirstCommonAncestor() {

        BinaryNode node1 = root.left.right;
        BinaryNode node2 = root.left.left;

        BinaryNode actual = findCommonAncestor.findFirstCommonAncestor(root, node1, node2);

        BinaryNode expected = root.left;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void findFirstCommonAncestor_rootIsAncestor() {

        BinaryNode node1 = root.left.right;
        BinaryNode node2 = root.right.left;

        BinaryNode actual = findCommonAncestor.findFirstCommonAncestor(root, node1, node2);

        BinaryNode expected = root;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void findFirstCommonAncestor_ancestorAtRightTree() {

        BinaryNode node1 = root.right.left.left;
        BinaryNode node2 = root.right.right.right;

        BinaryNode actual = findCommonAncestor.findFirstCommonAncestor(root, node1, node2);

        BinaryNode expected = root.right;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void findFirstCommonAncestor_NoAncestor() {

        BinaryNode node1 = root.right.left.left;
        BinaryNode node2 = new BinaryNode(25);

        BinaryNode actual = findCommonAncestor.findFirstCommonAncestor(root, node1, node2);

        Assertions.assertEquals(null, actual);

    }
}