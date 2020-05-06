package main.com.crackingcodinginterview.practice.bitmanipulation;

/**
 * Write a function to determine the number of bits you would need to flip to convert integer A to integer B.
 */
public class Conversion {

    public int conversion (int a, int b){
        int numBitsToChange = 0;

        while (a!=0 || b!=0){
            if(a==0 && b!=0){
                numBitsToChange++;
                b >>=1;
            }else if(b==0 && a!=0){
                numBitsToChange++;
                a >>=1;
            }else{
                int lastBitA = a&1;
                int lastBitB = b&1;
                if(lastBitA != lastBitB){
                    numBitsToChange++;
                }
                b >>=1;
                a >>=1;
            }
        }

        return numBitsToChange;
    }

    public int conversion_optimized (int a, int b){
        int numbitsToChange = 0;

        int temp = a ^ b; //this gives number of bits that are different. Count bit 1 in this which is our result.

        while(temp != 0){
            numbitsToChange++;
            temp = temp & (temp-1); // setting the last bit 1 to 0. Remember x&(x-1)
        }

        return numbitsToChange;
    }
}
