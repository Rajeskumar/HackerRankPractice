package main.com.crackingcodinginterview.practice.LinkedLists;

import java.util.Stack;

public class PalindromLinkedLists {

    public static boolean isPalindromeLinkedList (ListNode head){
        if (head == null || head.next == null) return true; //assumptions
        int length = 0;
        Boolean isOdd = true;
        ListNode tailNode = head;
        // Loop to find length
        while(tailNode != null){
            length++;
            tailNode = tailNode.next;
        }

        Stack<Integer> letterStack = new Stack<>();
        if(length%2 == 0) isOdd = false;
        int pivotIndex = 0;
        if(isOdd){
            pivotIndex = (length/2)+1;
        }else{
            pivotIndex = length/2;
        }
        int currIndex = 0;
        while (head != null){
            currIndex++;
            int s = head.val;
            if(pivotIndex > currIndex){
                letterStack.push(s);
            }else if(pivotIndex == currIndex){
                if(!isOdd){
                    letterStack.push(s);
                }
            }else {
                int x = letterStack.pop();
                if(s != x){
                    return false;
                }
            }
            head = head.next;
        }

        if(letterStack.size() != 0) {
            return false;
        }else {
            return true;
        }
    }

    public static void main(String[] args) {
        ListNode root1 = new ListNode(1);
        ListNode node = new ListNode(2);
        root1.next= node;
        node = new ListNode(2);
        root1.next.next = node;
        node = new ListNode(2);
        root1.next.next.next = node;

        System.out.println("Is Palindrome: "+isPalindromeLinkedList(root1));
    }

}
