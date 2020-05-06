package test.com.crackingcodinginterview.practice.treesgraphs;

import main.com.crackingcodinginterview.practice.treesgraphs.ProjectBuildOrder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProjectBuildOrderTest {

    ProjectBuildOrder projectBuildOrder;
    @BeforeEach
    void setUp() {
        projectBuildOrder = new ProjectBuildOrder();
    }

    @Test
    void buildOrder() {
        List<String> project = new ArrayList<>(Arrays.asList(new String[]{"a","b","c","d","e","f"}));
        List<List<String>> deps = new ArrayList<>();

        List<String> depList = new ArrayList<>();
        depList.add("a");
        depList.add("b");
        deps.add(depList);

        depList = new ArrayList<>();
        depList.add("f");
        depList.add("b");
        deps.add(depList);

        depList = new ArrayList<>();
        depList.add("b");
        depList.add("d");
        deps.add(depList);

        depList = new ArrayList<>();
        depList.add("f");
        depList.add("a");
        deps.add(depList);

        depList = new ArrayList<>();
        depList.add("d");
        depList.add("c");
        deps.add(depList);

        ArrayList<String> builtOrder = projectBuildOrder.buildOrder(project, deps);

        System.out.println("Order: "+builtOrder.toString());
    }
}