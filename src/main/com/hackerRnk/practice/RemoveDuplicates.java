package main.com.hackerRnk.practice;

import java.util.Arrays;

/**
 * Given an sorted array, remove the duplicates and return the number of elements.
 * Donot use extra temp array. Space complexity should be O(1)
 */
public class RemoveDuplicates {


    static int removeDuplicates(int[] arr){

        int currentIndex =0;

        for (int i=1; i<arr.length;i++){
            if(arr[i-1] != arr[i]){
                currentIndex++;
                arr[currentIndex] = arr[i];
            }

        }
        System.out.println("Result arr :"+ Arrays.toString(arr));
        return currentIndex;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2,3,5,7,7,11,11,11,13,13,15,15,17,18};

        System.out.println("No of Elements :"+ removeDuplicates(arr));
    }
}
