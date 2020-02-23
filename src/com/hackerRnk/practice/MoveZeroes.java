package com.hackerRnk.practice;

import java.util.Arrays;

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Example:
 *
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 *
 * Note:
 *
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */
public class MoveZeroes {

    public static void moveZeroes(int[] nums) {

        for (int i=0; i< nums.length;i++){
            if(nums[i]==0){
                int j = i+1;
                while(j < nums.length){
                    if(nums[j] != 0 ){

                        int tmp = nums [j];
                        nums[j] = nums [i];
                        nums[i] = tmp;
                        break;
                    }
                    j++;
                }
            }
        }

        System.out.println("Output : "+ Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = new int[] {0,0,1,0,3,5,0,0,12,9, 8, 0, -12, 90, 0};

        moveZeroes(nums);

    }
}
