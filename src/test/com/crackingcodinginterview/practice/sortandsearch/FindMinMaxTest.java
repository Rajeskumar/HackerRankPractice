package test.com.crackingcodinginterview.practice.sortandsearch;

import main.com.crackingcodinginterview.practice.sortandsearch.FindMinMax;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FindMinMaxTest {

    FindMinMax findMinMax;

    @BeforeEach
    void setUp() {
        findMinMax = new FindMinMax();
    }

    @Test
    void findMinAndMax() {
        int[] input = new int[] {3,2,5,1,2,4};

        int[] actual = findMinMax.findMinAndMax(input);

        int[] expected = new int[]{1,5};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void findMinAndMax_case2() {
        int[] input = new int[] {5,4,2,3,7,8,1,9,10};

        int[] actual = findMinMax.findMinAndMax(input);

        int[] expected = new int[]{1,10};

        Assertions.assertArrayEquals(expected, actual);
    }
}