package main.com.crackingcodinginterview.practice.moderate;

import java.util.ArrayList;
import java.util.List;

public class SubSort {

    public List<Integer> subSort (int[] array){

        int firstIndxChange = 0;
        int lastIndxChange = array.length -1;
        boolean isFirstFound = false;
        boolean isLastFound = false;
        int firstElemChange = 0;
        int lastElemChange = 0;
        ArrayList<Integer> result = new ArrayList<>();

        while (firstIndxChange < lastIndxChange && (!isFirstFound || !isLastFound)){

            if(!isFirstFound && (array[firstIndxChange] > array[firstIndxChange+1])){
                isFirstFound = true;
                firstElemChange = array[firstIndxChange+1];
            }else{
                firstIndxChange++;
            }

            if(!isLastFound && (array[lastIndxChange] < array[lastIndxChange - 1])){
                isLastFound = true;
                lastElemChange = array[lastIndxChange-1];
            }else{
                lastIndxChange--;
            }
        }

        firstIndxChange = 0;
        lastIndxChange = array.length -1;
        isFirstFound = false;
        isLastFound = false;
        int m = 0;
        int n = 0;

        while (firstIndxChange < lastIndxChange && (!isFirstFound || !isLastFound)){
            if(!isFirstFound && array[firstIndxChange] > firstElemChange ){
                if(firstIndxChange == 0){
                    m = 0;
                }else{
                    m = firstIndxChange-1;
                }
                isFirstFound=true;
            }else{
                firstIndxChange++;
            }

            if(!isLastFound && array[lastIndxChange] < lastElemChange){
                n = lastIndxChange;
                isLastFound= true;
            }else{
                lastIndxChange--;
            }
        }
        result.add(m);
        result.add(n);
        return result;
    }
}
