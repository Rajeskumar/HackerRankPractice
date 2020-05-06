package main.com.crackingcodinginterview.practice.recursionanddynamicprog;

import java.util.Arrays;

/**
 * A child is running up a staircase with n steps and can hope either 1 step, 2 steps, or 3 steps at a time.
 * Implement a method to count how many possible ways the child can run up the stairs.
 */
public class TripleStep {

    public long countWays(int n){
        long[] memo = new long[n+1];
        Arrays.fill(memo, -1);

        return countWays(n, memo);
    }

    long countWays (int n, long[] memo){
        if(n <0 ){
            return 0;
        }else if(n == 1){
            return 1;
        }else if(memo[n] > -1){
            return memo[n];
        }else{
            memo[n] = countWays(n-1, memo) + countWays(n-2, memo)+ countWays(n-3, memo);
            return memo[n];
        }
    }
}
