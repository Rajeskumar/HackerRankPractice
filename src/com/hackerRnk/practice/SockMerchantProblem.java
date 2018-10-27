package com.hackerRnk.practice;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/*
 John works at a clothing store. He has a large pile of socks that he must pair by color for sale. Given an array of integers representing the color of each sock, 
 determine how many pairs of socks with matching colors there are.
 For example, there are  socks with colors . There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .
 */
public class SockMerchantProblem {

	// Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
		
    	Arrays.sort(ar);
    	int noOfPairs = 0;
    	int count =1;
    	int temp =0;
    	
    	for(int i=0;i<n;i++) {
    		if((i+1)==n) {
    			noOfPairs += Math.abs(count/2); 
    			break;
    		}
    		temp = ar[i];
    		if(temp == ar[i+1]) {
    			count++;
    		}else {
    			noOfPairs += Math.abs(count/2); 
    			count=1;
    		}
    		
    	}
    	

    	return noOfPairs;
    }

    /*
     * Efficent method
     */
    static int sockMerchantMethod2(int n, int[] ar) {
    	int noOfPairs = 0;
    	
    	Set<Integer> tempSet = new HashSet<Integer>();
    	
    	for(int i=0;i<n;i++) {
    		if(!tempSet.contains(ar[i])) {
    			tempSet.add(ar[i]);
    		}else {
    			noOfPairs++;
    			tempSet.remove(ar[i]);
    		}
    	}
    	
    	return noOfPairs;
    }

    public static void main(String[] args) throws IOException {
    	int n =10;
    	int [] arr = {1,1,1,3,1,2,1,3,3,3,3};
        int res = sockMerchantMethod2(n,arr);
        
        System.out.print("No of Pair can be sold :"+res);

    }
}
