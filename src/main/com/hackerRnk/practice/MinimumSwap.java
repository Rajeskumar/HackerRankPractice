package main.com.hackerRnk.practice;

import java.io.IOException;
import java.util.Arrays;
/*
 You are given an unordered array consisting of consecutive integers  [1, 2, 3, ..., n] without any duplicates. 
 You are allowed to swap any two elements. You need to find the minimum number of swaps required to sort the array in ascending order.
 */
public class MinimumSwap {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] q) {
    	int len = q.length;
        boolean isSorted = false;
        int [] sortedArray =Arrays.copyOf(q, len);;
        Arrays.sort(sortedArray);
        
        int swapCount =0;
        int checkElem = 0;
        int i=0;
        while(i<len){
            int firstElem = q[i];
            if(firstElem!=sortedArray[i]){
                int temp = q[i];
                q[i]=q[temp-1];
                q[temp-1]=temp;
                swapCount++;
            }else {
                i++;
            }
           
            System.out.println("Array after "+swapCount+" swap :"+Arrays.toString(q));
            if(Arrays.equals(q, sortedArray)) {
            	break;
            }
        }
        return swapCount;
    }


    public static void main(String[] args) throws IOException {
    	int [] arr = {7, 1, 3, 2, 4, 5, 6};
        int res = minimumSwaps(arr);
        
        System.out.print("Swap Count :"+res);

    }
}
