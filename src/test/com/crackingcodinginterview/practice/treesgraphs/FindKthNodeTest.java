package test.com.crackingcodinginterview.practice.treesgraphs;

import main.com.crackingcodinginterview.practice.treesgraphs.BinaryNode;
import main.com.crackingcodinginterview.practice.treesgraphs.FindKthNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindKthNodeTest {

    FindKthNode findKthNode;

    @BeforeEach
    void setUp() {
        findKthNode = new FindKthNode();
    }

    @Test
    void findKthNode() {

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

        BinaryNode actual = findKthNode.findKthNode(root, 5);

        System.out.println("Kth Node : "+ actual.value);

    }
}