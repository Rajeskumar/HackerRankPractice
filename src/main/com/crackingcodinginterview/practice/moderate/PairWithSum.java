package main.com.crackingcodinginterview.practice.moderate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

/**
 * Write an alogrithm to find pairs within an array that sums to specified value.
 */
public class PairWithSum {

    public List<List<Integer>> findPairsWithSum(int [] input, int sum){

        List<List<Integer>> rootList = new ArrayList<>();
        Arrays.sort(input);
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int item : input){
            map.put(item, item);
        }

        for(int item: input){
            int diff = sum - item;

            if( diff < item){
                break;
            }
            if(map.containsKey(diff)){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(item);
                list.add(diff);
                rootList.add(list);
            }
        }

        return rootList;
    }
}
