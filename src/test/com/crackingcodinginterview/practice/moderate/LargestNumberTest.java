package test.com.crackingcodinginterview.practice.moderate;

import main.com.crackingcodinginterview.practice.moderate.LargestNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestNumberTest {

    LargestNumber largestNumber;

    @BeforeEach
    void setUp() {

        largestNumber = new LargestNumber();
    }

    @Test
    void largestNumber_simpleCase() {

        int[] nums = {24,9};

        String expected = "924";

        String actual = largestNumber.largestNumber(nums);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void largestNumber_singleDigits() {

        int[] nums = {4,9, 8, 1};

        String expected = "9841";

        String actual = largestNumber.largestNumber(nums);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void largestNumber_DifferentDigits() {

        int[] nums = {44,9, 100, 1000, 90};

        String expected = "990441001000";

        String actual = largestNumber.largestNumber(nums);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void largestNumbertTest_failingCase(){
        int[] nums = {3,30,34,5,9};

        String expected = "9534330";

        String actual = largestNumber.largestNumber(nums);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void largestNumbertTest_failingCase_2(){
        int[] nums = {128,12};

        String expected = "12812";

        String actual = largestNumber.largestNumber(nums);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void largestNumbertTest_failingCase_3(){
        int[] nums = {121,12};

        String expected = "12121";

        String actual = largestNumber.largestNumber(nums);

        Assertions.assertEquals(expected, actual);
    }
}