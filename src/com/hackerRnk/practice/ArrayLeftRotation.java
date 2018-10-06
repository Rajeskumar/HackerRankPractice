/**
 * 
 */
package com.hackerRnk.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author A2ND9ZZ
 *
 */
public class ArrayLeftRotation {

	
	static int[] rotLeft(int[] a, int d) {
        int size = a.length;
        //int[]output = new int[size];
        
        while( d > 0){
            
            for(int i = size-1; i > 0 ; i--){      
               // System.out.println("i:"+i+", a[i]:"+a[i]+"a[size-1]:"+a[size-1]);
                    int t = a[i-1];
                    a[i-1] = a[size-1];
                    a[size-1]= t;         
            }
            d--;
        }
        return a;
    } 
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] q = {1,2,5,4,3};
		int rot=2;
		List<Integer> a = new ArrayList<Integer>();
		a.add(8);
		if(a.contains(9)){
			System.out.println("Yes");
		}
//		Arrays.binarySearch(q, rot);
//		rotLeft(q,rot);
	}

}
