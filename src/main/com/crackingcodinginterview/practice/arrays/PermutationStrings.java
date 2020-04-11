package main.com.crackingcodinginterview.practice.arrays;

import java.util.Arrays;

public class PermutationStrings {


    public static void main(String[] args) {
        String s1 = "cbaa";
        String s2 = "bcaa";

        System.out.println("Is Permuation:"+isPermuation(s1, s2));
    }

    private static boolean isPermuation(String s1, String s2) {

        if(s1.equalsIgnoreCase(s2)){
            return true;
        }else if(s1.length() != s2.length()){
            return false;
        }

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        s1 = String.valueOf(ch1);
        s2 = String.valueOf(ch2);

        System.out.println("S1 = "+s1+ ", S2 = "+s2);

        if(s1.equalsIgnoreCase(s2)){
            return true;
        }else{
            return false;
        }
    }
}
