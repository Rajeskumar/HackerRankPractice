package test.com.crackingcodinginterview.practice.moderate;

import main.com.crackingcodinginterview.practice.moderate.StoreCountForBuildings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreCountForBuildingsTest {

    StoreCountForBuildings storeCountForBuildings;
    @BeforeEach
    void setUp() {
        storeCountForBuildings = new StoreCountForBuildings();
    }

    @Test
    void numberGoStores() {

        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(1,0,1,1,0));
        grid.add(Arrays.asList(0,1,0,1));
        grid.add(Arrays.asList(1,0,1,1,1,0));

        int actual = storeCountForBuildings.numberGoStores(3, 5, grid);

        Assertions.assertEquals(6, actual);
    }

    @Test
    void numberGoStores_case1() {

        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(1,0,1,1,0));
        grid.add(Arrays.asList(0,1,0,1));
        grid.add(Arrays.asList(1,0,1,1,1,0));
        grid.add(Arrays.asList(1,1,1,1,1));
        grid.add(Arrays.asList(0,0,0,0));

        int actual = storeCountForBuildings.numberGoStores(3, 5, grid);

        Assertions.assertEquals(7, actual);
    }

    @Test
    void numberGoStores_case2() {

        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(1,1,1,1,1));
        grid.add(Arrays.asList(1));
        grid.add(Arrays.asList(0));

        int actual = storeCountForBuildings.numberGoStores(3, 5, grid);

        Assertions.assertEquals(2, actual);
    }
}