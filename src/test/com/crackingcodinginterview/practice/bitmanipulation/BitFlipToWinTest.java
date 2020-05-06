package test.com.crackingcodinginterview.practice.bitmanipulation;

import main.com.crackingcodinginterview.practice.bitmanipulation.BitFlipToWin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitFlipToWinTest {

    BitFlipToWin bitFlipToWin;
    @BeforeEach
    void setUp() {
        bitFlipToWin = new BitFlipToWin();
    }

    @Test
    void bitFlip() {

        int input = 1775;

        int actual = bitFlipToWin.bitFlip(input);

        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void bitFlip_onlyOneZero() {

        int input = 14;

        int actual = bitFlipToWin.bitFlip(input);

        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void bitFlip_onlyTwoZero_EqualLong() {

        int input = 93;

        System.out.println("Binary : "+Integer.toBinaryString(input));
        int actual = bitFlipToWin.bitFlip(input);

        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}