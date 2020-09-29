package test.com.crackingcodinginterview.practice.hard;

import main.com.crackingcodinginterview.practice.hard.EscapeLargeMaze;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscapeLargeMazeTest {

    EscapeLargeMaze escapeLargeMaze;

    @BeforeEach
    void setUp() {
        escapeLargeMaze = new EscapeLargeMaze();
    }

    @Test
    void isEscapePossible_baseCase() {
        int[][] blocked = {{0,1},{1,0}};
        int[] source = {0,0};
        int[] target = {0,2};

        boolean actual = escapeLargeMaze.isEscapePossible(blocked, source, target);

        assertEquals(false, actual);
    }

    @Test
    void isEscapePossible_edgeCase() {
        int[][] blocked = {};
        int[] source = {0,0};
        int[] target = {999999,999999};

        boolean actual = escapeLargeMaze.isEscapePossible(blocked, source, target);

        assertEquals(actual, true);
    }

    @Test
    void isEscapePossible_case1() {
        int[][] blocked = {{691938,300406},{710196,624190},{858790,609485},{268029,225806},{200010,188664},{132599,612099},{329444,633495},{196657,757958},{628509,883388}};
        int[] source = {655988,180910};
        int[] target = {267728,840949};

        boolean actual = escapeLargeMaze.isEscapePossible(blocked, source, target);

        assertEquals(true, actual);
    }

    @Test
    void isEscapePossible_simpleCase1() {
        int[][] blocked = {{0,1},{0,3},{2,0},{1,2},{3,0},{3,2},{3,3}};
        int[] source = {0,0};
        int[] target = {2,3};

        boolean actual = escapeLargeMaze.isEscapePossible(blocked, source, target);

        assertEquals(actual, true);
    }

    @Test
    void isEscapePossible_simpleCase2() {
        int[][] blocked = {{0,1},{0,3},{2,0},{1,2},{3,0},{3,2},{3,3}};
        int[] source = {0,0};
        int[] target = {1,3};

        boolean actual = escapeLargeMaze.isEscapePossible(blocked, source, target);

        assertEquals(actual, true);
    }
}