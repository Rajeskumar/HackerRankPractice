package main.com.crackingcodinginterview.practice.LinkedLists;

public class ListNode {
    int val;
    ListNode next;
    public ListNode(int x) { val = x; }

    public String toString(){

        StringBuilder stringBuilder = new StringBuilder();
        ListNode node = this;
        while(node != null){
            if(stringBuilder.length() == 0){
                stringBuilder.append(node.val);
            }else{
                stringBuilder.append("->").append(node.val);
            }
            node = node.next;
        }
        return stringBuilder.toString();
    }
}