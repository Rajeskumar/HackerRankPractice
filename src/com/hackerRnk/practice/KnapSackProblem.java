/**
 * 
 */
package com.hackerRnk.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Rajeshkumar
 *
 */
public class KnapSackProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sackWeight = 4;
		HashMap<Integer, Integer> valwei = new HashMap<Integer, Integer>();
		valwei.put(1, 4);
		valwei.put(5, 2);
		valwei.put(3, 1);
		valwei.put(4, 4);
		
		HashMap<Integer, Integer> valwei1 = new HashMap<Integer, Integer>();
		valwei1.put(5, 2);
		valwei1.put(3, 1);
		valwei1.put(9, 5);
		valwei1.put(8, 3);
		List<HashMap<Integer, Integer>> items = new ArrayList<HashMap<Integer, Integer>>();
		items.add(valwei);
		items.add(valwei1);
		
		System.out.println(solveKnapSackProblem(sackWeight, items));
	}

	private static ArrayList<Integer> solveKnapSackProblem(int sackWeight, List<HashMap<Integer, Integer>> items) {
		
		ArrayList<Integer> results = new ArrayList<Integer>();
		for (HashMap<Integer, Integer> item : items) {
			int itemMaxVal = 0;
			int itemMaxWeight = 0;
			HashMap<Integer,Integer> sorted =
				    item.entrySet().stream()
				       .sorted(Map.Entry.comparingByValue())
				       .collect(Collectors.toMap(
				    	          Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
			
			for(Map.Entry<Integer, Integer> eachItem : sorted.entrySet()) {
				int itemVal = eachItem.getKey();
				int itemWeight = eachItem.getValue();
				if(itemWeight<=sackWeight) {
					if(itemWeight+itemMaxWeight <= sackWeight ) {
						itemMaxVal+=itemVal;
						itemMaxWeight+=itemWeight;
					}else if(itemVal>itemMaxVal){
						itemMaxVal = itemVal;
						itemMaxWeight = itemWeight;
					}
				}
			}
			results.add(itemMaxVal);
		}
		
		return results;
	}

}
