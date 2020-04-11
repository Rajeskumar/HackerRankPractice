package main.com.hackerRnk.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * For a non-negative integer X, the array-form of X is an array of its digits in left to right order.  For example, if X = 1231, then the array form is [1,2,3,1].
 *
 * Given the array-form A of a non-negative integer X, return the array-form of the integer X+1.
 *
 * Example 1:
 *
 * Input: A = [1,2,0,0]
 * Output: [1,2,0,1]
 * Explanation: 1200 + 1 = 1201
 *
 * Example 1:
 *
 * Input: A = [9,9]
 * Output: [1,0,0]
 * Explanation: 99 + 1 = 100
 */
public class AddArrayFormInteger {

    public static List<Integer> addToArrayForm(int[] a, int k) {
        int size = a.length;

        a[size-1] = a[size-1]+k;

        for(int i=size-1;i>0;i--){

            if(a[i] > 10){
                int tmp = a[i];
                a[i] = tmp%10;
                a[i-1] = a[i-1]+(tmp/10);
            }else if(a[i] == 10){
                a[i] = 0;
                a[i-1] = a[i-1]+1;
            }
        }

        ArrayList<Integer> digits = getDigits(a[0], new ArrayList<>());

        ArrayList<Integer> res = new ArrayList<>();

        int j=0;
        int endIndex = digits.size()-1;

        while(j<digits.size()){
            res.add(digits.get(endIndex--));
            j++;
        }

        for (int i=1;i<a.length;i++){
            res.add(a[i]);
        }

        return res;
    }

    public static ArrayList<Integer> getDigits(int a, ArrayList<Integer> list){

        if(a > 9){
            list.add(a%10);
            getDigits(a/10, list);
        }else{
            list.add(a);
            return list;
        }
        return list;
    }
    public static void main(String[] args) {

        int[] a = new int[] {9,9,9,9,9,9,9,9,9,9};

        System.out.println("Output : "+addToArrayForm(a, 1).toString());

//        System.out.println("Digits :"+getDigits(1000, new Stack<>()).toString());
    }
}
