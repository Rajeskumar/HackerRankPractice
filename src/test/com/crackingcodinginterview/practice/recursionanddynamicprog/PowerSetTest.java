package test.com.crackingcodinginterview.practice.recursionanddynamicprog;

import main.com.crackingcodinginterview.practice.recursionanddynamicprog.PowerSet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PowerSetTest {

    PowerSet powerSet;

    @BeforeEach
    void setUp() {
        powerSet = new PowerSet();
    }

    @Test
    void getSubSets() {

        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3));

        ArrayList<ArrayList<Integer>> actual = powerSet.getSubSets(list);

        System.out.println("SubSets : "+actual.toString());
    }
}