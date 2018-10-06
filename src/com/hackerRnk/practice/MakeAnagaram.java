/**
 * 
 */
package com.hackerRnk.practice;

import java.util.Arrays;
import java.util.List;

/**
 * @author A2ND9ZZ
 *
 */
public class MakeAnagaram {

	// Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
    	int[] lettercounts = new int[26];
		for(char c : a.toCharArray()){
			lettercounts[c-'a']++;
		}
		for(char c : b.toCharArray()){
			lettercounts[c-'a']--;
		}
		int result = 0;
		for(int i : lettercounts){
			result += Math.abs(i);
		}
		return result;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a = "asdc";
		String b = "cdef";
		System.out.println(makeAnagram(a,b));
	}

}
