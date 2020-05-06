package test.com.crackingcodinginterview.practice.bitmanipulation;

import main.com.crackingcodinginterview.practice.bitmanipulation.ClosestIntWithWeight;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClosestIntWithWeightTest {

    ClosestIntWithWeight closestIntWithWeight;
    @BeforeEach
    void setUp() {
        closestIntWithWeight = new ClosestIntWithWeight();
    }

    @Test
    void closestIntSameBitCount() {

        int input = 92;
        int expected = 90;

        int actual = closestIntWithWeight.closestIntSameBitCount(input);

        System.out.println("Input  : "+Long.toBinaryString(input)+ ", Decimal: "+input);
        System.out.println("Actual : "+Long.toBinaryString(actual)+", Decimal: "+actual);
        Assertions.assertEquals(actual, expected);

    }

    @Test
    void closestIntSameBitCount_first1andthen0() {

        int input = 5;
        int expected = 6;

        int actual = closestIntWithWeight.closestIntSameBitCount(input);

        System.out.println("Input  : "+Long.toBinaryString(input)+ ", Decimal: "+input);
        System.out.println("Actual : "+Long.toBinaryString(actual)+", Decimal: "+actual);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void closestIntSameBitCount_all1s() {

        int input = 7;
        int expected = 11;

        int actual = closestIntWithWeight.closestIntSameBitCount(input);

        System.out.println("Input  : "+Long.toBinaryString(input)+ ", Decimal: "+input);
        System.out.println("Actual : "+Long.toBinaryString(actual)+", Decimal: "+actual);
        Assertions.assertEquals(expected, actual);

    }
}