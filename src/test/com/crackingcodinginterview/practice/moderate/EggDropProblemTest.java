package test.com.crackingcodinginterview.practice.moderate;

import main.com.crackingcodinginterview.practice.moderate.EggDropProblem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EggDropProblemTest {

    EggDropProblem eggDropProblem;

    @BeforeEach
    void setUp() {
        eggDropProblem = new EggDropProblem();
    }

    @Test
    void findMaxFloor_Egg_Unbroken() {

        int floors = 100;
        int eggs = 3;
        int breakingFloor = 40;

        int actual = eggDropProblem.findMaxFloor_Egg_Unbroken(floors, eggs, breakingFloor);

        System.out.println("Actual : "+actual);

        int expected = 39;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxFloor_Egg_Unbroken_case2() {

        int floors = 100;
        int eggs = 3;
        int breakingFloor = 71;

        int actual = eggDropProblem.findMaxFloor_Egg_Unbroken(floors, eggs, breakingFloor);

        System.out.println("Actual : "+actual);

        int expected = breakingFloor-1;

        Assertions.assertEquals(expected, actual);
    }
}