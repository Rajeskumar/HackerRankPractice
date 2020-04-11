package main.com.crackingcodinginterview.practice.arrays;

public class PalindromPermutation {

    public static void main(String[] args) {
        String s = "Tact Coabbb";

        System.out.println("Has PalindromPermutation : "+hasPalindromePerm(s));
    }

    private static boolean hasPalindromePerm(String s) {
        s = s.toLowerCase();
        int[] occurences = new int[128];
        for(int i=0;i<s.length();i++){
            int ch = s.charAt(i);
            if(ch!=32){
                occurences[ch]++;
            }
        }
        int noOfOddCounts = 0;
        for(int i=0;i<occurences.length;i++){
            int count = occurences[i];
            if(count > 0 && count%2 >= 1){
                noOfOddCounts++;
            }
        }
        if(noOfOddCounts>1){
            return false;
        }else {
            return true;
        }
    }
}
