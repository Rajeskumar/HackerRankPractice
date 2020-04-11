package main.com.crackingcodinginterview.practice.sortandsearch;

import java.util.Arrays;

public class SortedMergeProblem {

    public static void main(String[] args) {
        int[] arrA = new int[]{2,4,5,7,0,0,0};
        int[] arrb = new int[]{3,6,8};

        int[] sortedArr = merge(arrA,arrb);

        System.out.println("Sorted Array : "+ Arrays.toString(sortedArr));

    }

    private static int[] merge(int[] arrA, int[] arrB) {
        int idx = arrA.length-1;
        int aidx = (arrA.length - arrB.length)-1;
        int bidx = arrB.length-1;
        boolean isCompleted = false;
        while (idx > -1){
            if(aidx > -1 && bidx > -1){
                if(arrA[aidx] > arrB[bidx]){
                    arrA[idx--] = arrA[aidx--];
                }else{
                    arrA[idx--] = arrB[bidx--];
                }
            }else{
                if(aidx == -1){
                    while(bidx >-1){
                        arrA[idx--] = arrB[bidx--];
                    }
                }else{
                    while(aidx >-1){
                        arrA[idx--] = arrA[aidx--];
                    }
                }
            }

        }

        return arrA;
    }
}
