package com.crackingcodinginterview.practice.arrays;

public class Urlify {

    public static void main(String[] args) {
        String s = "Mr John Smith    ";
        int len = 13;

        System.out.println("Urlified String : "+urlify(s, len));
    }

    private static String urlify(String s, int len) {
        int idx =s.length();
        char[] res = s.toCharArray();
        for(int i=len-1;i>=0;i--){
            if(" ".equalsIgnoreCase(String.valueOf(res[i]))){
                res[--idx]= "0".toCharArray()[0];
                res[--idx]= "2".toCharArray()[0];
                res[--idx]= "%".toCharArray()[0];
            }else{
                res[--idx] = res[i];
            }
        }

        return new String(res);
    }
}
