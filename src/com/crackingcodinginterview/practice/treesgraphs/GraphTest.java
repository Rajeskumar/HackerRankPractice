package com.crackingcodinginterview.practice.treesgraphs;

public class GraphTest {

    public static void main(String[] args) {
        Graph graph = new Graph();

        Graph.Node rootNode = new Graph.Node(0);

        Graph.Node node1 = new Graph.Node(1);
        Graph.Node node5 = new Graph.Node(5);
        Graph.Node node4 = new Graph.Node(4);
        Graph.Node node3 = new Graph.Node(3);
        Graph.Node node2 = new Graph.Node(2);

        graph.addGraphNode(node5, rootNode);
        graph.addGraphNode(node4, rootNode);
        graph.addGraphNode(node1, rootNode);
        graph.addGraphNode(node4, node1);
        graph.addGraphNode(node3, node1);
        graph.addGraphNode(node2, node3);
        graph.addGraphNode(node1, node2);

        System.out.println("Is Route Exists : "+ graph.doesPathExists(0,2,rootNode));

    }
}
