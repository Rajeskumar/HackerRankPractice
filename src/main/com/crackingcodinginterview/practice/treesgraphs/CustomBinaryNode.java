package main.com.crackingcodinginterview.practice.treesgraphs;

import java.util.*;

public class CustomBinaryNode {
    public int value;
    public BinaryNode root;
    public BinaryNode left;
    public BinaryNode right;
    Queue<Integer> insertionOrder;
    List<Integer> randomToReturn;
    List<Integer> returnedRandom;

    public CustomBinaryNode() {
        this.insertionOrder = new PriorityQueue<>();
        randomToReturn = new ArrayList<>();
        returnedRandom = new ArrayList<>();
    }

    private CustomBinaryNode(int nodeValue) {
        value = nodeValue;
        left = null;
        right = null;
    }

    public void insertNode (int value){
        if(root == null){
            root = new BinaryNode(value);

        }else{
            int insertAtElem = insertionOrder.peek();
            BinaryNode insertAt = findNode(insertAtElem);
            if(insertAt.left == null){
                insertAt.left = new BinaryNode(value);
            }else{
                insertAt.right = new BinaryNode(value);
                insertionOrder.poll();
            }
        }
        insertionOrder.add(value);
        randomToReturn.add(value);
    }

    public BinaryNode findNode(int val) {
        if(root == null){
            return null;
        }
        return iterateAndFindNode(root, val);
    }

    private BinaryNode iterateAndFindNode(BinaryNode node, int val) {
        if(node == null) return null;
        if(node.value == val) return node;

        BinaryNode foundNode = null;

        foundNode = iterateAndFindNode(node.left, val);
        if(foundNode == null){
            foundNode = iterateAndFindNode(node.right, val);
        }

        return foundNode;
    }

    public void deleteNode(){

    }

    public BinaryNode getRandomNode(){
        if(!randomToReturn.isEmpty()){
            Random rand = new Random();
            int idx = rand.nextInt(randomToReturn.size());
            BinaryNode randNode = findNode(randomToReturn.get(idx));
            returnedRandom.add(randomToReturn.remove(idx));
            return randNode;
        }else{
            randomToReturn.addAll(returnedRandom);
            returnedRandom = new ArrayList<>();
            return getRandomNode();
        }
    }

    void printNode(){
        System.out.println("Node: "+value);
    }
}

