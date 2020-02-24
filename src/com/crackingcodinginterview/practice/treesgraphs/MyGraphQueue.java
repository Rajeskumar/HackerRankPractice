package com.crackingcodinginterview.practice.treesgraphs;

import java.util.ArrayList;

public class MyGraphQueue {

    private static class ListNode {
        Graph.Node node;
        ListNode next;

        ListNode(Graph.Node newNode) {
            node = newNode;
        }
    }

    ListNode first;
    ListNode last;

    public MyGraphQueue() {
        first = null;
        last = null;
    }

    void enqueue(ArrayList<Graph.Node> nodes) {
        for (Graph.Node node: nodes) {
            if(node != null){
                ListNode newNode = new ListNode(node);
                if (first == null) {
                    first = newNode;
                } else {
                    last.next = newNode;
                }
                last = newNode;
            }
        }
    }


    Graph.Node dequeue() {
        if (first == null) return null;
        Graph.Node dequeuedNode = first.node;
        first = first.next;
        return dequeuedNode;
    }

    Graph.Node first() {
        return first.node;
    }

    public boolean isEmpty() {
        return first == null;
    }

    void printGraphQueue() {
        ListNode printNode = first;
        if (printNode == null) System.out.println("Graph Queue is Emtpy.");
        while (printNode != null) {
            System.out.print(printNode.node.value + "->");
            printNode = printNode.next;
        }
        System.out.println();
    }
}
