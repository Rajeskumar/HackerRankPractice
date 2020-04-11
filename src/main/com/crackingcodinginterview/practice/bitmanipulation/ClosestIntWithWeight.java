package main.com.crackingcodinginterview.practice.bitmanipulation;

/**
 * Weight for an non-negative integer is number of bits set (i.e. 1) in the binary format. For ex : 92 binary form is
 * (1011100) which has 4 1's and so weight is 4.
 * Find a integer which has same weight as the input number which should be closest to the input. It can be larger or smaller
 * but not equals. Difference between the numbers should be closest.
 * For input 6, output will be 5.
 *
 */
public class ClosestIntWithWeight {

    public long closestIntSameBitCount(long x){

        /*
        Hint is to just swap the right most two bits which differs.
        For example: 1011100, swap 1 and 0 from right which is 1011010. Thats the result.
        To do that, Extract the lowest set bit and right shift by one and add it to removed lowest set bit of x.
         */

        return ((x & ~(x-1)) >>> 1) + (x & (x-1));

    }
}
