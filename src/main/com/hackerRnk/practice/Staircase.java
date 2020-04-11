/**
 * 
 */
package main.com.hackerRnk.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Staircase {

	 // Complete the staircase function below.
    static void staircase(int n) {
    	int j=0;
    	int i=0;
    	int a=0;
    	for(i=n,a=1;i>0;i--){
    		for(j=1;j<i;j++){
    			System.out.print(" ");
    		}
    		for(int x=0;x<a;x++){
    			System.out.print("#");
    		}
    		a++;    		
    		System.out.println();
    	}

    }

    public static void main(String[] args) {
    	int n=6;
    	staircase(n);
    }
}
