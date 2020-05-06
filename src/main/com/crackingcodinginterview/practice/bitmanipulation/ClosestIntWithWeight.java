package main.com.crackingcodinginterview.practice.bitmanipulation;

/**
 * Weight for an non-negative integer is number of bits set (i.e. 1) in the binary format. For ex : 92 binary form is
 * (1011100) which has 4 1's and so weight is 4.
 * Find a integer which has same weight as the input number which should be closest to the input. It can be larger or smaller
 * but not equals. Difference between the numbers should be closest.
 * For input 6, output will be 5.
 *
 * BUGGYYYY
 */
public class ClosestIntWithWeight {

    public int closestIntSameBitCount(int x){

        /*
        Hint is to just swap the right most two bits which differs.
        For example: 1011100, swap 1 and 0 from right which is 1011010. Thats the result.
        To do that, Extract the lowest set bit and right shift by one and add it to removed lowest set bit of x.
         */

        int tempX = x;
        if(x == 0) return 0; // x =0
        if(~x == 0) {
            int numBits = 0;
            while (tempX > 0){
                numBits++;
                tempX >>=1;
            }

            x = x<<1;
            x = x+1;
            tempX = 1 << (numBits-1);


            return x^tempX;
        }

        boolean bitChanged = false;
        int previousBit = x&1;
        int currentBit = 0;
        int bitIdx = 0;
        while( !bitChanged && tempX > 0){
            tempX >>=1;
            bitIdx++;
            currentBit = tempX&1;
            if(previousBit != currentBit){
                bitChanged = true;
            }
        }
        return swapBits(x, bitIdx);

    }

    int swapBits (int x, int i){

        int temp = 1 << i;
        x = x^temp;
        temp = 1 << (i-1);
        x = x ^ temp;
        return x;
    }
}
