package test.com.crackingcodinginterview.practice.bitmanipulation;

import main.com.crackingcodinginterview.practice.bitmanipulation.BitwiseDivide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitwiseDivideTest {
    BitwiseDivide bitwiseDivide;
    @BeforeEach
    void setUp() {
        bitwiseDivide = new BitwiseDivide();
    }

    @Test
    void testDivideBitwiseForEven() {

        Assertions.assertEquals(bitwiseDivide.divideBitwise(6,1),3);

        Assertions.assertEquals(bitwiseDivide.divideBitwise(50,1),25);


    }

    @Test
    void testDivideBitwiseForOdd(){
        Assertions.assertEquals(bitwiseDivide.divideBitwise(9,1),4);
    }
}