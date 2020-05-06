package test.com.crackingcodinginterview.practice.moderate;

import main.com.crackingcodinginterview.practice.moderate.AmazonKindleRequestProblem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AmazonKindleRequestProblemTest {

    AmazonKindleRequestProblem amazonKindleRequestProblem;

    @BeforeEach
    void setUp() {
        amazonKindleRequestProblem = new AmazonKindleRequestProblem();
    }

    @Test
    void topKFeaturesRequested() {

        ArrayList<String> featureRequests = new ArrayList<>();

        featureRequests.add("I want battery increased");
        featureRequests.add("Its better if resolution is better");
        featureRequests.add("How about increase the design of kindle");
        featureRequests.add("I like to have battery capacity incresed");
        featureRequests.add("kindle would have been more better,of kindle would have been more better," +
                " design of kindle would have been more better design of kindle would have been more better," +
                " design of kindle would have been more better, design of kindle would have been more better, design of kindle would have been more better");

        ArrayList<String> possibleFeatures = new ArrayList<>();
        possibleFeatures.add("battery");
        possibleFeatures.add("design");
        possibleFeatures.add("resolution");

        int topFeatures = 2;

        ArrayList<String> actual = amazonKindleRequestProblem.topKFeaturesRequested(featureRequests, possibleFeatures, topFeatures);

        String[] expected = {"battery", "design"};

        Assertions.assertArrayEquals(expected, actual.toArray());
    }
}