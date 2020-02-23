package com.hackerRnk.practice;

import java.util.Arrays;

/**
 * Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
 *
 * Example:
 *
 * Input:  [1,2,3,4]
 * Output: [24,12,8,6]
 * Note: Please solve it without division and in O(n).
 *
 * Follow up:
 * Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)
 */
public class ArrayProductExceptSelf {

    public static int[] productExceptSelf(int[] nums) {

        int size = nums.length;
        int prodVal = 1;
        boolean isAllZero = true;
        boolean isAllOne = true;

        for (int i=0;i<size;i++){
            if(nums[i]>0){
                prodVal = prodVal * nums[i];
                isAllZero = false;
                if(nums[i]!=1){
                    isAllOne = false;
                }
            }
        }

        if(isAllZero){
            prodVal =0;
        }
        for (int i=0;i<size;i++){
            if(isAllOne){
                nums[i] = 1;
            }else if(nums[i]!=0){
                nums[i] = findOtherMultiply(nums[i], prodVal);
            }else {
                nums[i] = prodVal;
            }
        }

        return nums;
    }

    private static int findOtherMultiply(int num, int prodVal) {

        if(num == prodVal ){
            if(num == 1){
                return 0;
            }else{
                return 1;
            }
        }
        int val = 0;
        int prodValNow = 0;
        while(prodValNow != prodVal){
            prodValNow+=num;
            val++;
        }

        return val;
    }

    public static void main(String[] args) {
        int[] input = new int[]{1,0};

        System.out.println("Output : "+ Arrays.toString(productExceptSelf(input)));
    }
}
