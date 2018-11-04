/**
 * 
 */
package com.hackerRnk.practice;

public class Solution2 {

	static void minimumBribes(int[] q) {
		 int size = q.length;
	        //System.out.println(size);
	        System.out.println(q[0] + ","+ q[1]+","+q[2]+","+q[3]+","+q[4]);
	        int mincount = 0;
	        for( int i = 1; i<= size; i++){
	            int e = q[i-1];
	            System.out.println("element:"+e + ", iteration" + i);
	            if(e > i){
	                int c = e - i;
	                System.out.println("diff:"+c);
	                if(c > 2){
	                System.out.println("Too Chaotic");
	                     break;
	                } else{
	                    mincount = mincount + c;
	                }
	            } 
	            if(i == size){
	                System.out.println("Output:" +mincount);
	            }
	           
	        }
	}

    public static void main(String[] args) {
    	int[] q = {1,2,5,4,3};
    	minimumBribes(q);
    }
}
