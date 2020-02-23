package com.crackingcodinginterview.practice.LinkedLists;

import com.crackingcodinginterview.practice.LinkedLists.ListNode;

import java.util.HashSet;

public class RemoveDuplicatesII {

    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null ) return head;
        ListNode previous = null;
        ListNode currentNode = head;
        HashSet<Integer> dupValues = new HashSet<Integer>();
        while (currentNode != null){
            if(currentNode.next != null && currentNode.val == currentNode.next.val){
                dupValues.add(currentNode.val);
                if(previous != null){
                    if(currentNode.next.next != null) {
                        previous.next = currentNode.next.next;
                        currentNode = currentNode.next.next;
                    }else {
                        previous.next = null;
                        break;
                    }
                }else{
                    if(currentNode.next.next != null) {
                        head = currentNode.next.next;
                        currentNode = currentNode.next.next;
                    }else {
                        head = null;
                        break;
                    }
                }
            }else if (dupValues.contains(currentNode.val)){
                if(previous != null){
                    if (currentNode.next != null){
                        previous.next = currentNode.next;
                        currentNode = currentNode.next;
                    }else{
                        previous.next = null;
                        break;
                    }
                }else{
                    if(currentNode.next != null) {
                        head = currentNode.next;
                        currentNode = currentNode.next;
                    }else {
                        head = null;
                        break;
                    }
                }
            }else{
                previous = currentNode;
                currentNode = currentNode.next;
            }

        }

        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(1);
//        ListNode node4 = new ListNode(3);
//        ListNode node5 = new ListNode(4);
//        ListNode node6 = new ListNode(4);
//        ListNode node7 = new ListNode(5);

        head.next= node2;
        node2.next= node3;
        node3.next = null;
//        node4.next = node5;
//        node5.next = node6;
//        node6.next = node7;
//        node7.next = null;

        deleteDuplicates(head);
    }
}
