/**
 * 
 */
package main.com.hackerRnk.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulation {

    // Complete the minimumBribes function below.
    static long arrayManipulation(int n, int[][] queries) {
    	long[] initArray = new long[n];
    	int size = queries.length;
    	for(int i=0;i<size;i++){
    		int froElem = queries[i][0]-1;
    		int tillElem = queries[i][1]-1;
    		int add = queries[i][2];
    		for(int a=froElem;a<=tillElem;a++){
    			initArray[a]+=add;
    		}
    	}
//    	System.out.println(Arrays.toString(initArray));
    	Arrays.sort(initArray);
//    	System.out.println(Arrays.toString(initArray));
//    	System.out.println(initArray[n-1]);
		return initArray[n-1];
    }

    public static void main(String[] args) {
    	int[][] queries = new int [3][3];
    	queries[0][0]=1;
    	queries[0][1]=3;
    	queries[0][2]=150;
    	queries[1][0]=2;
    	queries[1][1]=5;
    	queries[1][2]=120;
    	queries[2][0]=3;
    	queries[2][1]=4;
    	queries[2][2]=140;
    	
//    	arrayManipulation(5,queries);
    	arrayManipulation_tuning(5,queries);
    }
    
    // Complete the minimumBribes function below.
    static long arrayManipulation_tuning(int n, int[][] queries) {
    	
    	int m=queries.length;
    	long [] array = new long[n + 1];
        while (m-- > 0) {
            int a = queries[m][0];
            int b = queries[m][1];
            int k = queries[m][2];
            array[a-1] += k;
            array[b]   -= k; // see comment at end of code
        }
        
        /* Find max value */
        long sum = 0;
        long max = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
            max = Math.max(max, sum);
        }
        
        System.out.println(max);
		return max;
    }
}
