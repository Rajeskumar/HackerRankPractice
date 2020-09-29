package main.com.crackingcodinginterview.practice.sortandsearch;

public class FindMinMax {

    public int[] findMinAndMax (int[] input){
        int len = input.length;

        if(len < 1) return null;

        int min = input[0];
        int max = input[0];

        for(int i=1;i<len;i++){
            if(input[i] > input[i-1]){
                max = Math.max(input[i], max);
            }else if(input[i] < input[i-1]){
                min = Math.min(input[i], min);
            }
        }

        int[] result = new int[]{min, max};

        return result;
    }
}
