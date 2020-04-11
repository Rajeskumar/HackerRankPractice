package main.com.crackingcodinginterview.practice.bitmanipulation;

/**
 * Count Number of Bit 1 in the give number.
 */
public class CountBitOne {

    public int countBitOne(int x){
        int numBits = 0;

        while(x!=0){
            numBits += x&1;
            x >>>= 1;
        }
        return numBits;
    }


}
