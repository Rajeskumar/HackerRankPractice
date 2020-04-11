package main.com.crackingcodinginterview.practice.sortandsearch;

import java.util.Arrays;

public class MergeSortTest {

    public static void main(String[] args) {
        int[] input = new int[] {6,2,8,5,3,7,4,1};

        System.out.println("Merge Sorted Array = "+ Arrays.toString(MergeSort.sort(input)));
    }
}
