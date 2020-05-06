package test.com.crackingcodinginterview.practice.recursionanddynamicprog;

import main.com.crackingcodinginterview.practice.recursionanddynamicprog.TripleStep;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripleStepTest {

    TripleStep tripleStep;
    @BeforeEach
    void setUp() {
        tripleStep = new TripleStep();
    }

    @Test
    void countWays() {

        int n = 5;

        System.out.println("Possible Ways : "+tripleStep.countWays(n));
    }
}