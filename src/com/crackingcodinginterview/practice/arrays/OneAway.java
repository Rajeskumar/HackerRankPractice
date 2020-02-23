package com.crackingcodinginterview.practice.arrays;

/**
 * There are three types of edits that can be performed on strings; insert a char, delete a char, replace a char.
 * Given two strings write a function to check if they are one edit or zero edit away.
 *
 * pale, ple -> true
 * pales, pale -> true
 * pale, bake -> false
 */
public class OneAway {

    public static void main(String[] args) {
        String s1 = "pa";
        String s2 = "pac";

        System.out.println("Is one Away : "+isOneEditAway(s1,s2));
    }

    private static boolean isOneEditAway(String s1, String s2){
        if(s1.equals(s2) || (s1.length() == 1 &&  s2.length() == 1) || (s1.length()+s2.length())==1 ){
            return true;
        }

        if(Math.abs(s1.length() - s2.length()) > 1){
            return false;
        }
        int[] occurences = new int[128]; // this can be 26 if we convert char to numeric

        //Iterating first String and increment the value
        for (int i=0; i<s1.length();i++){
            int ch = s1.charAt(i);
            occurences[ch]++;
        }

        //Iterating 2nd String and decrement the value if already exists or increment if its new char
        for (int i=0; i < s2.length();i++){
            int ch = s2.charAt(i);
            if(occurences[ch] > 0){
                occurences[ch]--;
            }else {
                occurences[ch]++;
            }
        }

        int noOfCharDiff = 0;
        for (int i=0;i<occurences.length;i++){
            if(occurences[i] >0) {
                noOfCharDiff++;
            }

            if(noOfCharDiff > 1){
                return false;
            }
        }
        return true;
    }

}
