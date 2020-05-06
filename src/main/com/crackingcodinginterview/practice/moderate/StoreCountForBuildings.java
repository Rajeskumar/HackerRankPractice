package main.com.crackingcodinginterview.practice.moderate;

import java.util.List;

public class StoreCountForBuildings {

    public int numberGoStores (int rows, int column, List<List<Integer>> grid) {
        int storeCount = 0;

        for(List<Integer> l : grid){
            int curr_count = 0;
            for(int item : l){
                if(item == 1){
                    curr_count +=1;
                }else if(item ==0 && curr_count >0){
                    curr_count = 0;
                    storeCount +=1;
                }
            }
            if(curr_count > 0){
                storeCount +=1;
            }
        }
        return storeCount;
    }
}
