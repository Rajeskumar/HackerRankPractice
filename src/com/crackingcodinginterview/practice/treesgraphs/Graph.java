package com.crackingcodinginterview.practice.treesgraphs;

import java.util.ArrayList;

public class Graph {

    static class Node {
        int value;
        ArrayList<Node> adjacentNodes;
        boolean isVisited;

        public Node(int item){
            value = item;
            isVisited = false;
            adjacentNodes = new ArrayList<>();
        }
    }

    Node rootNode;

    public Graph(){
        rootNode = null;
    }

    void addGraphNode(Node node, Node parentNode){
        if(parentNode == null){
            rootNode = node;
        }else{
            parentNode.adjacentNodes.add(node);
        }
    }

    public boolean doesPathExists ( int nodeValue1, int nodeValue2, Node root) {
        Boolean isRouteStarted = false;
        if(root == null) return false;
        if(nodeValue1 == nodeValue2) return true;
        root.isVisited = true;
        isRouteStarted = (root.value == nodeValue1);
        MyGraphQueue nodeQueue = new MyGraphQueue();
        if(root.adjacentNodes.size()>0){
            nodeQueue.enqueue(root.adjacentNodes);
        }
        while (!nodeQueue.isEmpty()){
            Node nodeVisiting = nodeQueue.dequeue();
            if(nodeVisiting != null && !nodeVisiting.isVisited){
                nodeVisiting.isVisited = true;
                int visitingValue = nodeVisiting.value;
                if(nodeValue1 == visitingValue){
                    isRouteStarted = true;
                }else if (isRouteStarted && nodeValue2 == visitingValue){
                    return true;
                }
                if(!nodeVisiting.adjacentNodes.isEmpty()){
                    nodeQueue.enqueue(nodeVisiting.adjacentNodes);
                }
            }
        }
        return false;
    }

}
