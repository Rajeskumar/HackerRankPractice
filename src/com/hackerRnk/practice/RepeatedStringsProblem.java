package com.hackerRnk.practice;

import java.io.IOException;
/* Problem Description:
 * Lilah has a string, , of lowercase English letters that she repeated infinitely many times.

Given an integer, , find and print the number of letter a's in the first  letters of Lilah's infinite string.

For example, if the string  and , the substring we consider is , the first  characters of her infinite string. 
There are  occurrences of a in the substring.
 */
public class RepeatedStringsProblem {

	// Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

    	long count = s.chars().filter(ch -> ch == 'a').count();
    	int len = s.length();
    	long repeatedString = ((n/len)*count);
    	
    	if(n%len >0) {
    		String substr = s.substring(0, Math.toIntExact(n%len));
    		count = substr.chars().filter(ch -> ch =='a').count();
    		repeatedString +=count;
    	}
    	
    	return repeatedString;
    }
    public static void main(String[] args) throws IOException {
    	String s = "abbacc";    
        long n = 10;
        
        System.out.print("No of Jumps :"+repeatedString(s,n));

    }
}
