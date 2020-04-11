package main.com.crackingcodinginterview.practice.sortandsearch;


import java.util.Arrays;

class BubbleSortTest {

    public static void main(String[] args) {
        int[] input = new int[] {6,2,8,5,3,7,4,1};
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("Bubble Sorted = "+ Arrays.toString(bubbleSort.sort(input)));
    }
}