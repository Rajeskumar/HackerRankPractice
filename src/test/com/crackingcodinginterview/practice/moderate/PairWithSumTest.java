package test.com.crackingcodinginterview.practice.moderate;

import main.com.crackingcodinginterview.practice.moderate.PairWithSum;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PairWithSumTest {

    PairWithSum pairWithSum;
    @BeforeEach
    void setUp() {
        pairWithSum  = new PairWithSum();
    }

    @Test
    void findPairsWithSum_baseCase() {
        int[] input = new int[] {5,0,2,8,10,3,7};
        int sum = 8;

        List<List<Integer>> actual = pairWithSum.findPairsWithSum(input, sum);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0,8));
        expected.add(Arrays.asList(3,5));
        Assert.assertEquals(actual, expected);
    }


    @Test
    void findPairsWithSum_case1() {
        int[] input = new int[] {5,0,2,8,10,3,7};
        int sum = 5;

        List<List<Integer>> actual = pairWithSum.findPairsWithSum(input, sum);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0,5));
        expected.add(Arrays.asList(2,3));
        Assert.assertEquals(actual, expected);
    }
}