package main.com.crackingcodinginterview.practice.treesgraphs;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Construct a binary tree from in-order traverse path and pre-order traverse path.
 * You are provided with in-order and pre-order traverse path of a tree as list. Construct tree from these paths.
 */
public class ConstructBinaryTree {

    public BinaryNode constructTree (ArrayList<String> inorder, ArrayList<String> preorder) {

        Collections.reverse(preorder);

        String rootValue = preorder.get(preorder.size()-1);
        BinaryNode root = new BinaryNode(rootValue);

        preorder.remove(preorder.size()-1);

        int idx = inorder.indexOf(rootValue);

        ArrayList<String> leftTreeNodes = new ArrayList<>(inorder.subList(0, idx));
        ArrayList<String> rightTreeNodes = new ArrayList<>(inorder.subList(idx+1, inorder.size()));

        constructSubTree (root, true, preorder, leftTreeNodes);
        constructSubTree (root, false, preorder, rightTreeNodes);

        return root;
    }

    private void constructSubTree(BinaryNode root, boolean isLeftSubTree, ArrayList<String> preorder, ArrayList<String> treeNodes) {

        BinaryNode currentNode = null;
        if(treeNodes == null || treeNodes.isEmpty()) return;

        String nodeToInsert = preorder.get(preorder.size()-1);

        preorder.remove(preorder.size()-1);

        currentNode = new BinaryNode(nodeToInsert);
        if(isLeftSubTree){
            root.left = currentNode;
        }else{
            root.right = currentNode;
        }

        int idx = treeNodes.indexOf(nodeToInsert);

        ArrayList<String> leftTreeNodes = null;
        ArrayList<String> rightTreeNodes = null;


        if(idx == treeNodes.size()-1){
            //No right subtree
            leftTreeNodes = new ArrayList<>(treeNodes.subList(0, idx));
        }else if(idx == 0){
            //no left subtree
            rightTreeNodes = new ArrayList<>(treeNodes.subList(idx+1, treeNodes.size()));
        }else{
            leftTreeNodes = new ArrayList<>(treeNodes.subList(0, idx));
            rightTreeNodes = new ArrayList<>(treeNodes.subList(idx+1, treeNodes.size()));
        }
        constructSubTree(currentNode, true, preorder, leftTreeNodes);
        constructSubTree(currentNode, false, preorder, rightTreeNodes);

        return;
    }
}
