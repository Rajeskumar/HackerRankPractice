package main.com.crackingcodinginterview.practice.LinkedLists;

/**
 * Number's digit will be represented as node in a linked list in reverse order. ( 512 as 2->1->5).
 * Add two such lists and return the number. (512 + 20 = 532, Output 2 -> 3 -> 5)
 * in list format with each digit as node in reverse order.
 */
public class SumLists {

    public static ListNode sumList (ListNode l1, ListNode l2){

        int no1 = extractNumber (l1);
        int no2 = extractNumber (l2);
        int sum = no1+no2;
        ListNode sumListNode = extractDigitsAsList(sum);

        return sumListNode;
    }

    private static ListNode extractDigitsAsList(int sum) {
        ListNode sumListNode = null;
        ListNode node;
        ListNode currentNode = null;
        while(sum > 9){
            int digit = sum%10;
            sum = sum/10;
            node = new ListNode(digit);
            if(sumListNode == null){
                sumListNode = node;
                currentNode = node;
            }else{
                currentNode.next= node;
                currentNode = currentNode.next;
            }
        }
        node = new ListNode(sum);
        if(sumListNode == null){
            sumListNode = node;
            currentNode = node;
        }else{
            currentNode.next= node;
            currentNode = currentNode.next;
        }
        return sumListNode;
    }

    private static int extractNumber(ListNode listNode) {
        int multiplier = 1;
        int number = 0;
        if(listNode == null) return 0;
        boolean isFirstDigit = true;

        while(listNode != null){
            if(!isFirstDigit) multiplier = multiplier*10;

            number = (number) + (listNode.val * multiplier);
            listNode = listNode.next;
            isFirstDigit = false;
        }
        return number;
    }

    public static void main(String[] args) {
        ListNode root1 = new ListNode(7);
        ListNode node = new ListNode(1);
        root1.next= node;
        node = new ListNode(6);
        root1.next.next = node;

        ListNode root2 = new ListNode(5);
        node = new ListNode(9);
        root2.next= node;
        node = new ListNode(2);
        root2.next.next = node;

        System.out.println("Sum Lists : "+sumList(root1, root2).toString());
    }
}
