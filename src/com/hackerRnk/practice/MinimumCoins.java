/**
 * 
 */
package com.hackerRnk.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author Rajeshkumar
 *
 */
public class MinimumCoins {

	/**
	 * @param args
	 */
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner in = new Scanner(System.in);
	        int noOfCoins = in.nextInt();
	        int sum = in.nextInt();
	        in = new Scanner(System.in);
	        List<Integer> arr = new ArrayList<Integer>();
	        int i = 0;
	        while(i<noOfCoins) {
	        	arr.add(in.nextInt());
	        	i++;
	        }
	        int minCoins = solveMinimumCoinProblem(arr, sum);
	        System.out.println(minCoins);
	    }

	private static int solveMinimumCoinProblem(List<Integer> arr, int sum) {

		Collections.sort(arr, Collections.reverseOrder());
		int totalCoins =0;
//		System.out.println(arr.toString());
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i)<=sum) {
				if(sum%arr.get(i)==0) {
					return totalCoins+=sum/arr.get(i);
				}else if(i<arr.size()-1){
					totalCoins+=sum/arr.get(i);
					sum=sum%arr.get(i);
				}else {
					return -1;
				}
			}
			
		}
		return totalCoins;
	}

}
