/**
 * 
 */
package com.hackerRnk.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class SherlocksAnagram {

	// Complete the checkMagazine function below.
	static int sherlockAndAnagrams(String s) {
		
		int len = s.length();
		ArrayList<String[]> strList;
		int anagrams = 0;
		HashMap<Integer,ArrayList<String[]>> possibleSubString = new HashMap<Integer,ArrayList<String[]>>();
		for(int i=0;i<len;i++){
			for(int j=i+1;j<=len;j++){
				String substr = s.substring(i, j);
				if(possibleSubString.containsKey(substr.length())){
					strList = possibleSubString.get(substr.length());
					String[] arrStr = substr.split("");
					Arrays.sort(arrStr);
					for(String[] arr:strList){
						if(Arrays.equals(arr, arrStr)){
							anagrams+=1;
						}
					}
					strList.add(arrStr);
					
					possibleSubString.put(substr.length(), strList);
				}else{
					strList = new ArrayList<String[]>();
					String[] arrStr = substr.split("");
					Arrays.sort(arrStr);
					strList.add(arrStr);
					possibleSubString.put(substr.length(), strList);
				}
//				possibleSubString.put(substr.length(), )
			}
		}
		return anagrams;
	}

	public static void main(String[] args) {
		String str = "ifailuhkqq";
		System.out.println(sherlockAndAnagrams(str));
	}

}
