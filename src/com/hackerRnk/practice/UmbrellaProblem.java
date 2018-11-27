/**
 * 
 */
package com.hackerRnk.practice;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author Rajeshkumar
 *
 *Given a number of people N and an array of integers, each one representing the amount of people a type of 
 *umbrella can handle, output the minimum number of umbrellas needed to handle N people.
 *No umbrella could have left spaces. Which means if a umbrella can handle 2 people, 
 *there should be 2 people under it.If there's no solution, return -1.
 *
 *solve(3, [1, 2]) means that we have 3 people and two kinds of umbrellas, 
 *one that hanled one person and one that handles 2. We can give one two-sized umbrella to 2 of them 
 *and the other to the last person. Therefore the solution is 2 (umbrellas). 
 *You could give 3 one-sized umbrellas, but we want the minimum number.
 */
public class UmbrellaProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int N = 22;
		Integer [] umbrella = {2,3};
		
		int noOfUmbrella = solveUmbrella(N,umbrella);
		
		
		System.out.println(noOfUmbrella);

		int[] umbr = {2,3};
		System.out.println(minUmbrellaCount(N, umbr));
	}

	/*
	 * Method to solve Umbrella problem.
	 * 
	 */
	private static int solveUmbrella(int n, Integer[] umbrella) {
		
		Arrays.sort(umbrella, Collections.reverseOrder());
		int totalUmb=0;
		int i=0;
		for(int umb:umbrella) {
				if(n%umb==0) {
					return (totalUmb+=n/umb);
				}else if(i<umbrella.length -1) {
					totalUmb+=n/umb;
					n=n%umb;
				}else{
					return -1;
				}
				i+=1;
			
		}
		
		return totalUmb;
	}
	
	private static int minUmbrellaCount(int n, int[] arr) {
		int count = 0;
		int counter = 0;
		
		//{1,3,5,6,4}
		for(int k = 1; k < arr.length; k++){
			
			for(int i = 0; i <= k ; i++) {
					if(arr[i] < arr[k]) {
						int a = arr[i];
						arr[i] = arr[k];
						arr[k] = a;
					}
				}
			
		}
		
		for(int x : arr) {

			int d = (n - count)/x;
			if(d > 0 && count + (x * d) <= n) {
				counter += d;
				count += (x * d);
				
			}
			/*if(count+x <= n){
				count += x;
				counter++;
			}*/
			if(count == n) {
				break;
			}

		}
		if(count != n) {
			counter = -1;
		}
		
		
		return counter;
	}

}
