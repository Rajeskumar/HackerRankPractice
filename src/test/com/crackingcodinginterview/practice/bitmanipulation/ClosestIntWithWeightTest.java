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

        long input = 92;
        long expected = 90;

        long actual = closestIntWithWeight.closestIntSameBitCount(input);

        System.out.println("Input  : "+Long.toBinaryString(input)+ ", Decimal: "+input);
        System.out.println("Actual : "+Long.toBinaryString(actual)+", Decimal: "+actual);
        Assertions.assertEquals(actual, expected);

    }
}