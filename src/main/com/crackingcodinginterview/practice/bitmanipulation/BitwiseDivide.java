package main.com.crackingcodinginterview.practice.bitmanipulation;

/**
 * Divide a number with even numbers without any arithmetic operations. Use Bit Manipulation
 */
public class BitwiseDivide {

    // Assume the divisor is 2 always.
    public int divideBitwise(int dividend, int divisor){

        return dividend >> divisor;
    }
}
