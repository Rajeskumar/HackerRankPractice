package test.com.crackingcodinginterview.practice.moderate;

import main.com.crackingcodinginterview.practice.moderate.SmallestDifference;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestDifferenceTest {

    SmallestDifference smallestDifference;
    @BeforeEach
    void setUp() {
        smallestDifference = new SmallestDifference();
    }

    @Test
    void smallestDifferenceHappyPath_1() {

        int[] arr1 = {1,3,15,11,2};
        int[] arr2 = {23,127,255,8,19};

        int actual = smallestDifference.smallestDifference(arr2,arr1);

        Assertions.assertEquals(3, actual);

    }

    @Test
    void smallestDifferenceHappyPath_2() {

        int[] arr1 = {1,3,15,11,2,20};
        int[] arr2 = {23,127,255,8,19};

        int actual = smallestDifference.smallestDifference(arr1,arr2);

        Assertions.assertEquals(1, actual);

    }

    @Test
    void smallestDifference_ZeroDiff() {

        int[] arr1 = {1,3,15,11,2,20};
        int[] arr2 = {23,127,255,8,19,2};

        int actual = smallestDifference.smallestDifference(arr1,arr2);

        Assertions.assertEquals(0, actual);

    }
}