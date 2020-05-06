package test.com.crackingcodinginterview.practice.treesgraphs;

import main.com.crackingcodinginterview.practice.treesgraphs.CustomBinaryNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomBinaryNodeTest {

    CustomBinaryNode customBinaryNode;

    @BeforeEach
    void setUp() {
        customBinaryNode = new CustomBinaryNode();
        customBinaryNode.insertNode(6);
        customBinaryNode.insertNode(7);
        customBinaryNode.insertNode(8);
        customBinaryNode.insertNode(10);
        customBinaryNode.insertNode(11);
    }

    @Test
    void getRandomNode() {
        customBinaryNode.getRandomNode().printNode();
        customBinaryNode.getRandomNode().printNode();
        customBinaryNode.getRandomNode().printNode();
        customBinaryNode.getRandomNode().printNode();
        customBinaryNode.getRandomNode().printNode();
        customBinaryNode.getRandomNode().printNode();
    }
}