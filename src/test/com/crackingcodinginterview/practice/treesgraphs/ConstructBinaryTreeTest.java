package test.com.crackingcodinginterview.practice.treesgraphs;

import main.com.crackingcodinginterview.practice.treesgraphs.BinaryNode;
import main.com.crackingcodinginterview.practice.treesgraphs.ConstructBinaryTree;
import main.com.crackingcodinginterview.practice.treesgraphs.FindKthNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ConstructBinaryTreeTest {

    ConstructBinaryTree constructBinaryTree;
    @BeforeEach
    void setUp() {
        constructBinaryTree = new ConstructBinaryTree();
    }

    @Test
    void constructTree_normalCase() {
        ArrayList<String> inorder = new ArrayList<>(Arrays.asList("F","B","A","E","H","C","D","I","G"));
        ArrayList<String> preOrder = new ArrayList<>(Arrays.asList("H","B","F","E","A","C","D","G","I"));

        BinaryNode actual = constructBinaryTree.constructTree(inorder, preOrder);

        List<BinaryNode> inordernodes = new ArrayList<>();

        actual.doInOrderTraverse(actual, inordernodes);

        System.out.println("Expected : "+inorder.toString());
        System.out.print("Actual : ");
        for (BinaryNode<String> node : inordernodes){
            System.out.print(node.value+", ");
        }

    }

    @Test
    void constructTree_case2() {
        ArrayList<String> inorder = new ArrayList<>(Arrays.asList("E","C","H","D","F","B","I","A","J","G","K"));
        ArrayList<String> preOrder = new ArrayList<>(Arrays.asList("F","H","C","E","D","A","B","I","G","J","K"));

        BinaryNode actual = constructBinaryTree.constructTree(inorder, preOrder);

        List<BinaryNode> inordernodes = new ArrayList<>();

        actual.doInOrderTraverse(actual, inordernodes);

        System.out.println("Expected : "+inorder.toString());
        System.out.print("Actual : ");
        for (BinaryNode<String> node : inordernodes){
            System.out.print(node.value+", ");
        }


    }
}