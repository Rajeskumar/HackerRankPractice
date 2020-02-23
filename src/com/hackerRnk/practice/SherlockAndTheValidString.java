package com.hackerRnk.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Sherlock considers a string to be valid if all characters of the string appear the same number of times.
 * It is also valid if he can remove just 1 character at 1 index in the string, and the remaining characters will occur the same number of times. Given a string ,
 * determine if it is valid. If so, return YES, otherwise return NO.
 * For example, if ,s=abc it is a valid string because frequencies are {a:1,b:1,c:1}. So is s=abcc because we can remove one c and have 1 of each character in the remaining string.
 * If s=abccc however, the string is not valid as we can only remove 1 occurrence of c. That would leave character frequencies of {a:1,b:1,c:2}.
 */
public class SherlockAndTheValidString {

    // Complete the isValid function below.
    static String isValid(String s) {

        if(s.length()<=3) return "YES";
        String[] arr = s.split("");

        Arrays.sort(arr);

        int[] countArr = new int[26];
        int count = 0;
        int i =0, j=0;

        while(i<arr.length){
            if(i==0){
                count +=1;
                i++;
                continue;
            }
            if(arr[i].equalsIgnoreCase(arr[i-1])){
                count +=1;
            }else{
                countArr[j] = count;
                j++;
                count = 1;
            }
            if(i== arr.length-1){
                countArr[j]=count;
            }
            i++;
        }
        int diff = 0;
        Arrays.sort(countArr);

        int x=0;
        while(x<26 && countArr[x]==0){
            x++;
        }

        int index = x;

        Set<Integer> set = new HashSet<>();

        while(x<26){
            set.add(countArr[x]);
            x++;
        }

        if(set.size()==1){
            return "YES";
        }else if(set.size()>2){
            return "NO";
        }else{ // Two diff frequencies
            int f1=0;
            int f2=0;
            for(int y : set){
                if(f1 == 0){
                    f1 = y;
                }else{
                    f2 = y;
                }
            }
            int repeatedf1count=0;
            int repeatedf2count=0;
            while(index<26){
                if(f1 == countArr[index]){
                   repeatedf1count++;
                }else{
                    repeatedf2count++;
                }
                index++;
            }

            if((f1 == 1 && repeatedf1count == 1) || (f2==1 && repeatedf2count==1)){
                return "YES";
            }else if(Math.abs(f1-f2)==1 && (repeatedf1count==1 || repeatedf2count==1)){
                return "YES";
            }else{
                return "NO";
            }
        }
    }

    public static void main(String[] args) {
        String input = "a";

        if(input.isBlank()){
            System.out.println("NO");
        }else{
            System.out.println(isValid(input));
        }

    }
}
