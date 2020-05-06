package test.com.crackingcodinginterview.practice.moderate;

import main.com.crackingcodinginterview.practice.moderate.SubSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SubSortTest {

    SubSort subSort;

    @BeforeEach
    void setUp() {
        subSort = new SubSort();
    }

    @Test
    void subSort() {

        int[] arr = new int[] {1,2,4,7,10,11,7,12,6,7,16,18,19};

        List<Integer> actual = subSort.subSort(arr);

        List<Integer> expected = new ArrayList<Integer>();
        expected.add(3);
        expected.add(9);

        Assertions.assertArrayEquals(actual.toArray(), expected.toArray());
    }
}