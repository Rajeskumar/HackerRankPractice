package test.com.crackingcodinginterview.practice.bitmanipulation;

import main.com.crackingcodinginterview.practice.bitmanipulation.Insertion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionTest {

    Insertion insertion;

    @BeforeEach
    void setUp() {
        insertion = new Insertion();
    }

    @Test
    void insertMintoN() {
        int n = 1024;
        int m = 19;
        int i = 2;
        int j = 6;

        int actual = insertion.insertMintoN(m,n,i,j);
        int expected = 1100;
        Assertions.assertEquals(expected, actual);
    }
}