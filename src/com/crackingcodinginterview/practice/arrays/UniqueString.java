package com.crackingcodinginterview.practice.arrays;

/**
 * Implement an algorithm to determine if a String has all unique characters. What if you cannot use any other data structures?
 */
public class UniqueString {

    public static void main(String[] args) {
        String s = "a,bcA";
        System.out.println(" Is Unique : "+isUniqueString(s));
    }

    private static boolean isUniqueString(String s) {
        String x = new String();

        int len = s.length();
        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            int val = s.charAt(i);
            System.out.println("Ch = "+val);
            if(x.indexOf(ch) != -1){
                return false;
            }
            x = x+ch;
        }
        return true;
    }
}
