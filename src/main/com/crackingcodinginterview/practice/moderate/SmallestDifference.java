package main.com.crackingcodinginterview.practice.moderate;

import java.util.Arrays;

/**
 * Given two arrays of integers, compute the pair of values (one value in each array) with the smallest
 * (non-negative) difference. Return the difference.
 *
 * Input: {1,3,15,11,2}, {23,127,255,8,19}
 * Output: 3, That is, the pair (11,8)
 *
 */
public class SmallestDifference {

    public int smallestDifference (int[] arr1, int[] arr2){
        int minDiff = Integer.MAX_VALUE;
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int arr2Idx = 0;

        for(int i=0; i <arr1.length && arr2Idx < arr2.length; i++){

            minDiff = getMinDiff(minDiff, arr1[i], arr2[arr2Idx]);

            if(arr1[i] > arr2[arr2Idx]){
                 do{
                     arr2Idx++;
                     if(arr2Idx < arr2.length){
                         minDiff = getMinDiff(minDiff, arr1[i], arr2[arr2Idx]);
                     }else{
                         break;
                     }
                 }while (arr1[i] > arr2[arr2Idx]);
            }
        }

        return minDiff;
    }

    private int getMinDiff(int minDiff, int no1, int no2) {

        int currDiff = Math.abs(no1 - no2);

        if (currDiff < minDiff) {
            minDiff = currDiff;
        }
        return minDiff;
    }
}
