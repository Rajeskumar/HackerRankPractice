package test.com.crackingcodinginterview.practice.sortandsearch;

import main.com.crackingcodinginterview.practice.sortandsearch.SearchRotatedArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchRotatedArrayTest {

    SearchRotatedArray searchRotatedArray;
    @BeforeEach
    void setUp() {
        searchRotatedArray = new SearchRotatedArray();
    }

    @Test
    void searchRotatedArray() {
        int[] arr = {15,16,9,20,25,1,3,4,5,7,10,14};

        int actual = searchRotatedArray.searchRotatedArray(arr, 5);
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void searchRotatedArray_case2() {
        int[] arr = {15,16,9,20,25,1,3,4,5,7,10,14};

        int actual = searchRotatedArray.searchRotatedArray(arr, 20);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void searchRotatedArray_foundAt0() {
        int[] arr = {15,16,9,20,25,1,3,4,5,7,10,14};

        int actual = searchRotatedArray.searchRotatedArray(arr, 15);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void searchRotatedArray_foundAtEnd() {
        int[] arr = {15,16,9,20,25,1,3,4,5,7,10,14};

        int actual = searchRotatedArray.searchRotatedArray(arr, 14);
        int expected = 11;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void searchRotatedArray_foundAtLastHalf() {
        int[] arr = {15,16,9,20,25,1,3,4,5,7,10,14};

        int actual = searchRotatedArray.searchRotatedArray(arr, 10);
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void searchRotatedArray_NotFound() {
        int[] arr = {15,16,9,20,25,1,3,4,5,7,10,14};

        int actual = searchRotatedArray.searchRotatedArray(arr, 99);
        int expected = -1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void searchRotatedArray_findSmallElem() {
        int[] arr = {15,16,9,20,25,26,1,4,5,7,10,14};

        int actual = searchRotatedArray.searchRotatedArray(arr, 1);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void searchRotatedArray_failCase() {
        int[] arr = {4,5,6,7,0,1,2};

        int actual = searchRotatedArray.searchRotatedArray(arr, 1);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}