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

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                if(a < 10 && b < 10){
                    return b - a;
                }else{
                    List<Integer> aDigits = convertToDigits(a);
                    List<Integer> bDigits = convertToDigits(b);

                    int aIdx = aDigits.size();
                    int bIdx = bDigits.size();

                    while(aIdx > -1 && bIdx > -1 ){
                        if(aDigits.get(aIdx) == bDigits.get(bIdx)){
                            aIdx--;
                            bIdx--;
                            continue;
                        }else{
                            return bDigits.get(bIdx) - aDigits.get(aIdx);
                        }
                    }
                    return a - b;
                }
            }

            private List<Integer> convertToDigits(Integer a) {
                List<Integer> digits = new ArrayList<>();

                while (a > 9){
                    if(a == 10){
                        digits.add(0);
                        digits.add(1);
                        return digits;
                    }else{
                        int digit = a%10;
                        digits.add(digit);
                        a = a/10;
                    }
                }
                digits.add(a);

                return digits;

            }

        };

        nums = Arrays.stream(nums).boxed().sorted(comparator).mapToInt(i -> i).toArray();

        StringBuilder sb = new StringBuilder();

        for(int nos : nums){
            sb.append(nos);
        }

        return sb.toString();
    }
}
