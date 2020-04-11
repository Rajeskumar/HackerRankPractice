package main.com.crackingcodinginterview.practice.sortandsearch;

import java.util.Arrays;

public class MergeSort {

    public static int[] sort(int[] array){
        int len = array.length;
        if(len < 2){
            return array;
        }else if(len==2){
            if(array[0] > array[1]){
                int tmp = array[0];
                array[0] = array[1];
                array[1] = tmp;
                return array;
            }else{
                return array;
            }
        }

        int[] sortedLeft = sort(Arrays.copyOfRange(array,0,len/2));
        int[] sortedRight = sort(Arrays.copyOfRange(array,(len/2),len));

        return merge(sortedLeft, sortedRight);
    }

    private static int[] merge(int[] sortedLeft, int[] sortedRight) {
        int tmpLen = sortedLeft.length+sortedRight.length;
        int[] sortedArray = new int[tmpLen];
        int i=0,j=0,x=0;
        while(x<tmpLen){
            if(i<sortedLeft.length && j<sortedRight.length){
                if(sortedLeft[i] > sortedRight[j]){
                    sortedArray[x++]=sortedRight[j];
                    j++;
                }else{
                    sortedArray[x++]=sortedLeft[i];
                    i++;
                }
            }else{
                if(i == sortedLeft.length){
                    for(int y=j; y< sortedRight.length;y++){
                        sortedArray[x++]=sortedRight[y];
                    }
                }else{
                    for(int y=i; y< sortedLeft.length;y++){
                        sortedArray[x++]=sortedLeft[y];
                    }
                }
            }

        }
        return sortedArray;
    }

}
