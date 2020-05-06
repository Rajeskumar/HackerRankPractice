package test.com.crackingcodinginterview.practice.treesgraphs;

import main.com.crackingcodinginterview.practice.treesgraphs.BSTSequence;
import main.com.crackingcodinginterview.practice.treesgraphs.BinaryNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BSTSequenceTest {

    BSTSequence bstSequence;
    BinaryNode root;

    @BeforeEach
    void setUp() {
        bstSequence = new BSTSequence();
        root = new BinaryNode(2);
        root.right = new BinaryNode(3);
        root.left = new BinaryNode(1);
    }

    @Test
    void findBSTSequence_SimpleCase() {

        List<List<Integer>> actual = bstSequence.findBSTSequence(root);

        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        subList.add(2);
        subList.add(1);
        subList.add(3);
        expected.addAll(Collections.singleton(subList));

        subList = new ArrayList<>();
        subList.add(2);
        subList.add(3);
        subList.add(1);
        expected.addAll(Collections.singleton(subList));

        System.out.println("Output : "+actual.toString());

        Arrays.equals(expected.toArray(), actual.toArray());

    }

    @Test
    void findBSTSequence_BigTree(){
        root = new BinaryNode(7);
        root.right = new BinaryNode(11);
        root.left = new BinaryNode(3);
        root.right.parent = root;
        root.left.parent = root;

        root.left.left = new BinaryNode(2);
        root.left.right = new BinaryNode(5);
        root.left.left.parent = root.left;
        root.left.right.parent = root.left;

        root.right.left = new BinaryNode(9);
        root.right.left.parent = root.right;

        root.right.right = new BinaryNode(13);
        root.right.right.parent = root.right;

        List<List<Integer>> actual = bstSequence.findBSTSequence(root);

        System.out.println("Output : "+actual.toString());
        System.out.println("Output Size: "+actual.size());
    }
}