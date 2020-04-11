package main.com.crackingcodinginterview.practice.stackqueues;

public class AnimalShelter {

    private static class ListNode {
        String data;
        ListNode next;

        ListNode(String value) {
            data = value;
        }
    }

    ListNode first;
    ListNode last;

    public AnimalShelter() {
        first = null;
        last = null;
    }

    void enqueueAnimals(String value) {
        ListNode newNode = new ListNode(value);
        if(first == null){
            first = newNode;
            last = newNode;
        }else{
            last.next = newNode;
            last = newNode;
        }
    }


    String dequeueAny() {
        if (first == null) return null;
        String enqueuedValue = first.data;
        first = first.next;
        return enqueuedValue;
    }

    String dequeueDog() {
        if (first == null) return null;
        if(first.data.equalsIgnoreCase("Dog")) {
            first = first.next;
            return first.data;
        }
        ListNode current = first;
        ListNode previous = first;
        while(current!=null && !current.data.equalsIgnoreCase("Dog")){
            previous = current;
            current = current.next;
        }

        if(current == null) {
            return null;
        }
        else{
            previous.next = current.next;
            return current.data;
        }
    }

    String dequeueCat() {
        if (first == null) return null;
        if(first.data.equalsIgnoreCase("Cat")) {
            first = first.next;
            return first.data;
        }
        ListNode current = first;
        ListNode previous = first;
        while(current!=null && !current.data.equalsIgnoreCase("Cat")){
            previous = current;
            current = current.next;
        }

        if(current == null) {
            return null;
        }
        else{
            previous.next = current.next;
            return current.data;
        }
    }

    String first(){
        return first.data;
    }

    public boolean isEmpty(){
        return first == null;
    }

    void printQueue(){
        ListNode printNode = first;
        if (printNode == null) System.out.println("Queue is Emtpy.");
        while (printNode != null){
            System.out.print(printNode.data+"->");
            printNode = printNode.next;
        }
        System.out.println();
    }
}
