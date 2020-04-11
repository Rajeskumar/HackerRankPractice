package main.com.crackingcodinginterview.practice.sortandsearch;

public class BubbleSort {

    public int[] sort(int[] input){

        int swapCount = 1;

        while(swapCount>0){
            swapCount = 0;
            for(int i=0;i<input.length-1;i++){
                if(input[i] > input[i+1]){
                    int tmp = input[i];
                    input[i] = input[i+1];
                    input[i+1] = tmp;
                    swapCount++;
                }
            }
        }
        return input;
    }
}
