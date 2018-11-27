/**
 * 
 */
package com.hackerRnk.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Rajeshkumar
 *
 */
public class EncryptStringProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		ArrayList<String> input = new ArrayList<String>();
		input.add("dskfjdsfjsfklhjgfrehitaaaaaaaakjhkdhsjhfehfeeuuuuuuuuuuuuoetiroitoritttttttttttttttdfnbsfdhs");
		input.add("aaabc");
		for(String in : input)
			encryptString(in);
	}

	public static void encryptString(String input) {
		String[] str = input.split("");
		List<String> output = new ArrayList<String>();
		int count=1;
		for(int i=0;i<str.length;i++) {
			if(i==0) {
				output.add(str[i]);
			}else {
				if(str[i].equalsIgnoreCase(str[i-1])) {
					count+=1;
				}else {
					output.add(Integer.toString(count));
					count=1;
					output.add(str[i]);
				}
			}
			if(i+1==str.length) {
				output.add(Integer.toString(count));
			}
			
		}
		Collections.reverse(output);
		output.stream().forEach(System.out::print);	
		System.out.println();
	}
}
