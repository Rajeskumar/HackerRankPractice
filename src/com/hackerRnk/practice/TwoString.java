/**
 * 
 */
package com.hackerRnk.practice;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Set;

public class TwoString {

	// Complete the checkMagazine function below.
	static String twoStrings(String s1, String s2) {
		
		Hashtable<String,Integer> s1Table = new Hashtable<String, Integer>();
		Hashtable<String,Integer> s2Table = new Hashtable<String, Integer>();
		String[] s1Split = s1.split("");
		String[] s2Split = s2.split("");
		for(String s1Words:s1Split){
			if(!s1Words.trim().isEmpty()){
				if(s1Table.containsKey(s1Words)){
					int wordCount = s1Table.get(s1Words);
					s1Table.put(s1Words, ++wordCount);
				}else{
					s1Table.put(s1Words, 1);
				}
			}
		}
		
		for(String s2Words:s2Split){
			if(!s2Words.trim().isEmpty()){
				if(s2Table.containsKey(s2Words)){
					int wordCount = s2Table.get(s2Words);
					s2Table.put(s2Words, ++wordCount);
				}else{
					s2Table.put(s2Words, 1);
				}
			}
		}
		
		String matches = "NO";
		Set<String> keys = s2Table.keySet();
        for(String key: keys){
        	if(s1Table.containsKey(key)){
        		matches = "YES";
        	}
        }
        return (matches);
	}

	public static void main(String[] args) {
		String s1 = "rajesh kumar";
		String s2 = "yollwozld xyz";
//		twoStrings(s1, s2);
		String[] splitStr = s1.split("");
		System.out.println(twoStrings(s1,s2));
	}

}
