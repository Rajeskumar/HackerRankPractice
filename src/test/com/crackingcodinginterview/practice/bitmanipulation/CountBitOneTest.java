package test.com.crackingcodinginterview.practice.bitmanipulation;

import main.com.crackingcodinginterview.practice.bitmanipulation.CountBitOne;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CountBitOneTest {

    CountBitOne countBits;
    @BeforeEach
    void setUp() {
        countBits = new CountBitOne();
    }

    @Test
    void countBitOne() {

        Assert.assertEquals(countBits.countBitOne(6),2);
        Assert.assertEquals(countBits.countBitOne(1),1);
        Assert.assertEquals(countBits.countBitOne(7),3);

    }
}