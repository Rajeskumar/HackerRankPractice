package test.com.crackingcodinginterview.practice.sortandsearch;

import main.com.crackingcodinginterview.practice.sortandsearch.SortStringArrayByAnagaram;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortStringArrayByAnagaramTest {

    SortStringArrayByAnagaram solution;
    @BeforeEach
    void setUp() {
        solution = new SortStringArrayByAnagaram();
    }

    @Test
    void sortArrayStringByAnagram() {

        String[] strings = {"ab","cad","ba","xyz","adc"};

        String[] actual = solution.sortArrayStringByAnagram(strings);

        String[] expected = {"ab","ba","cad","adc","xyz"};
        System.out.println(" Actual : "+ Arrays.asList(actual).toString());

        if(!Arrays.equals(actual,expected)){
            fail();
        }
    }

    @Test
    void sortArrayStringByAnagram_sameLength() {

        String[] strings = {"ab","da","ba","ad","cx","xc"};

        String[] actual = solution.sortArrayStringByAnagram(strings);

        String[] expected = {"ab","ba","da","ad","cx","xc"};
        System.out.println(" Actual : "+ Arrays.asList(actual).toString());

        if(!Arrays.equals(actual,expected)){
            fail();
        }
    }
}