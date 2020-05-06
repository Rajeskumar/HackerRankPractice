package main.com.crackingcodinginterview.practice.sortandsearch;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringArrayByAnagaram {

    public String[] sortArrayStringByAnagram(String[] strings){

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(s1.length() != s2.length()){
                    return s1.compareTo(s2);
                }else{
                    String[] arr1 = s1.split("");
                    String[] arr2 = s2.split("");
                    Arrays.sort(arr1);
                    Arrays.sort(arr2);
                    String a = convertArrayToString(arr1);
                    String b = convertArrayToString(arr2);

                    return a.compareTo(b);
                }
            }
        };

        Arrays.sort(strings, comparator);

        return strings;

    }

    private String convertArrayToString(String[] arr1) {
        String string = "";
        for(String str: arr1){
            string = string+str;
        }
        return string;
    }
}
