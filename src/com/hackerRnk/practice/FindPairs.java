/**
 * 
 */
package com.hackerRnk.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Rajeshkumar
 *
 */
public class FindPairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] arr = {1,5,3,4,2};
		int k = 2;
		pairs(k,arr);
		
	}
	
	private static void pairs(int k, int[]arr) {

		int pairs = 0;
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
		ArrayList<Integer> valList = null;
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i]%k)) {
				valList = map.get(arr[i]%k);
				valList.add(arr[i]);
				Collections.sort(valList);
				map.put(arr[i]%k, valList);
			}else {
				valList = new ArrayList<Integer>();
				valList.add(arr[i]);
				Collections.sort(valList);
				map.put(arr[i]%k, valList);
			}
		}
		Iterator<Map.Entry<Integer, ArrayList<Integer>>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, ArrayList<Integer>> entries = itr.next();
			ArrayList<Integer> val = entries.getValue();
			int j=0;
			while(j<val.size()) {
				if(j+1<val.size()) {
					if(val.get(j+1)-val.get(j) == k) {
						pairs+=1;
					}
				}
				
				j++;
			}
			
//			System.out.println(pairs);
		}
		System.out.println("Output : "+pairs);
	}

}
