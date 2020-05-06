package test.com.crackingcodinginterview.practice.bitmanipulation;

import main.com.crackingcodinginterview.practice.bitmanipulation.Conversion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConversionTest {

    Conversion conversion;

    @BeforeEach
    void setUp() {
        conversion = new Conversion();
    }

    @Test
    void conversion() {
        int a = 29;
        int b = 15;

        int actual = conversion.conversion(a,b);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void conversion_optimized() {
        int a = 29;
        int b = 15;

        int actual = conversion.conversion_optimized(a,b);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
}