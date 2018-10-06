/**
 * 
 */
package com.hackerRnk.practice;

import java.util.Hashtable;
import java.util.Set;

public class HashTableRansomNote {

	// Complete the checkMagazine function below.
	static void checkMagazine(String[] magazine, String[] note) {

		Hashtable<String,Integer> noteTable = new Hashtable<String, Integer>();
		Hashtable<String,Integer> magzineTable = new Hashtable<String, Integer>();
		for(String magWords:magazine){
			if(magzineTable.containsKey(magWords)){
				int wordCount = magzineTable.get(magWords);
				magzineTable.put(magWords, ++wordCount);
			}else{
				magzineTable.put(magWords, 1);
			}
		}
		
		for(String noteWords:note){
			if(noteTable.containsKey(noteWords)){
				int wordCount = noteTable.get(noteWords);
				noteTable.put(noteWords, ++wordCount);
			}else{
				noteTable.put(noteWords, 1);
			}
		}
		
		String matches = "Yes";
		Set<String> keys = noteTable.keySet();
        for(String key: keys){
        	if(null!=magzineTable.get(key)){
        		int magWordCount = magzineTable.get(key);
                int noteWordCount = noteTable.get(key);
                if(magWordCount<noteWordCount){
                	matches="No";
                	break;
                }
        	}else{
        		matches="No";
        		break;
        	}
            
        }
        System.out.println(matches);
	}

	public static void main(String[] args) {
		String[] magazine = {"two","times","two","is","not","of","four","two","two"};
		String[] note = {"two","times","two","is","four"};
		checkMagazine(magazine, note);
	}

}
