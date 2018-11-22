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
		Integer [] umbrella = {2,1,3};
		
		int noOfUmbrella = solveUmbrella(N,umbrella);
		
		System.out.println(noOfUmbrella);

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

}
