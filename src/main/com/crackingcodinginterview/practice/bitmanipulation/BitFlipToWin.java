package main.com.crackingcodinginterview.practice.bitmanipulation;

import java.util.ArrayList;

/**
 * You have an Integer and you can flip exactly one bit from a 0 to a 1. Write code to find the length of the longest
 * sequence of 1s you could create.
 * Example:
 * Input 1775 ( 11011101111 )
 * Output : 8
 */
public class BitFlipToWin {

    public int bitFlip(int num){
        ArrayList<Integer> idxList = new ArrayList<>();
        int i=0;
        idxList.add(0);
        while(num > 0){
            int lastBit = num & 1;
            if(lastBit == 0){
                idxList.add(i);
            }
            num = num >> 1;
            i++;
        }
        idxList.add(i-1);

        int maxLongest = Integer.MIN_VALUE;

        for(int x=1; x< idxList.size()-1 ; x++){
            int idx = idxList.get(x);

            int longest = idxList.get(x+1)- idxList.get(x-1);

            if(x+1 < idxList.size()-1 && x-1 !=0){
                longest -=1;
            }else if(x == 1 && (x+1 == idxList.size() -1)){
                longest+=1;
            }

            if(longest > maxLongest){
                maxLongest = longest;
            }
        }

        return maxLongest;
    }


}
