package com.hackerRnk.practice;

/**
 * You are given a string containing characters  and  only. Your task is to change it into a string such that there are no matching adjacent characters.
 * To do this, you are allowed to delete zero or more characters in the string.
 *
 * Your task is to find the minimum number of required deletions.
 *
 * For example, given the string , remove an  at positions  and  to make  in  deletions.
 */
public class AlternatingCharacters {

    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {

        int result = 0;

        String[] arr = s.split("");

        int len = arr.length;
        int i=0;
        while(i<len){

            if(i!=len-1 && arr[i].equalsIgnoreCase(arr[i+1])){
               result +=1;
            }
            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        String input = "ABAABBAA";

        int result = alternatingCharacters(input);

        System.out.println("Output is : "+result);
    }
}
