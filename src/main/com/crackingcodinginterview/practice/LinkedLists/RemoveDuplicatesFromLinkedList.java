package main.com.crackingcodinginterview.practice.LinkedLists;


import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromLinkedList {

    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> nodevalues = new HashSet<Integer>();
        ListNode currentNode = head;
        nodevalues.add(head.val);
        while(currentNode.next != null){
            int value = currentNode.next.val;
            if(!nodevalues.contains(value)){
                nodevalues.add(value);
            }else{
                ListNode toRemove = currentNode.next;
                currentNode.next = toRemove.next;
            }
            currentNode = currentNode.next;
        }

        return head;
    }
}

