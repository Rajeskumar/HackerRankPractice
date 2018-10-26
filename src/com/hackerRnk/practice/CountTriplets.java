/**
 * 
 */
package com.hackerRnk.practice;

public class CountTriplets {

	 // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {

    	int len = arr.length;
    	int rightDiag = 0;
    	for(int i=0;i<len;i++){
    		rightDiag+=arr[i][i];
    	}
    	int leftDiag =0;
    	
    	for(int a=0,b=len-1;a<len;a++){
    		leftDiag+=arr[a][b--];
    	}
    	return Math.abs(rightDiag-leftDiag);
    }

	public static void main(String[] args) {
		int[][] array = new int[3][3];
		array[0][0]=10;
		array[0][1]=5;
		array[0][2]=6;
		array[1][0]=20;
		array[1][1]=15;
		array[1][2]=8;
		array[2][0]=25;
		array[2][1]=3;
		array[2][2]=2;
		System.out.println(diagonalDifference(array));
	}

}
