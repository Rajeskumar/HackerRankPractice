package main.com.crackingcodinginterview.practice.moderate;

import java.util.*;

/**
 * Given a list of non negative integers, arrange them such that they form the largest number.
 *
 * Example 1:
 *
 * Input: [10,2]
 * Output: "210"
 * Example 2:
 *
 * Input: [3,30,34,5,9]
 * Output: "9534330"
 *
 * @Link: https://leetcode.com/problems/largest-number/
 */
public class LargestNumber {

    public String largestNumber(int[] nums) {

        String[] strings = new String[nums.length];

        for(int i=0;i<strings.length;i++){
            strings[i] = String.valueOf(nums[i]);
        }

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String sum1 = a+b;
                String sum2 = b+a;
                return sum2.compareTo(sum1);
            }

        };

        Arrays.sort(strings, comparator);

        if(strings[0].equalsIgnoreCase("0")) return "0";

        StringBuilder sb = new StringBuilder();

        for(String str : strings){
            sb.append(str);
        }

        return sb.toString();
    }
}
