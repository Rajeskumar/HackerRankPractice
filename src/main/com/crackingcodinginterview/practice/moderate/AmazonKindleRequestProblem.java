package main.com.crackingcodinginterview.practice.moderate;

import java.util.*;

public class AmazonKindleRequestProblem {

    public ArrayList<String> topKFeaturesRequested (ArrayList<String> featureRequests,
                                                    ArrayList<String> possibleFeatures,
                                                    int topFeatures){

        ArrayList<String> topKFeatures = new ArrayList<>();

        HashMap<String, Integer> featureRequestCountMap = generateFeatureRequestsCountMap(featureRequests, possibleFeatures);

        ArrayList<String> topPossibleFeaturesFromRequest = new ArrayList<>(featureRequestCountMap.keySet());

        Collections.sort(topPossibleFeaturesFromRequest, (s1, s2) ->
                featureRequestCountMap.get(s1) == featureRequestCountMap.get(s2) ?
                        s1.compareTo(s2)
                        : featureRequestCountMap.get(s2) - featureRequestCountMap.get(s1));

        for(int i=0;i< topFeatures;i++){
            topKFeatures.add(topPossibleFeaturesFromRequest.get(i));
        }
        return topKFeatures;
    }

    private HashMap<String, Integer> generateFeatureRequestsCountMap (ArrayList<String> featureRequests,
                                                                       ArrayList<String> possibleFeatures){

        HashMap<String, Integer> featureRequestCountMap = new HashMap<String, Integer>();

        for (String feature: featureRequests){
            String[] featureWords = feature.split(" ");
            HashSet<String> featureWordsSet = new HashSet<String>(Arrays.asList(featureWords));

            for(String possibleFeature: possibleFeatures){

                if(featureWordsSet.contains(possibleFeature)){
                    if(featureRequestCountMap.get(possibleFeature) != null){
                        featureRequestCountMap.put(possibleFeature, featureRequestCountMap.get(possibleFeature)+1);
                    }else{
                        featureRequestCountMap.put(possibleFeature, 1);
                    }
                    break;
                }
            }
        }

        return featureRequestCountMap;
    }

    /*private HashMap<String, Integer> generateFeatureRequestsCountMap (ArrayList<String> featureRequests,
                                                                      ArrayList<String> possibleFeatures){

        HashMap<String, Integer> featureRequestCountMap = new HashMap<String, Integer>();

        for (String feature: featureRequests){
            String[] featureWords = feature.split(" ");

            for(String possibleFeature: possibleFeatures){
                boolean anyPossibleFeatureMatch = Arrays.stream(featureWords).anyMatch(
                        word -> word.equalsIgnoreCase(possibleFeature));
                if(anyPossibleFeatureMatch){
                    if(featureRequestCountMap.get(possibleFeature) != null){
                        featureRequestCountMap.put(possibleFeature, featureRequestCountMap.get(possibleFeature)+1);
                    }else{
                        featureRequestCountMap.put(possibleFeature, 1);
                    }
                }
            }
        }

        return featureRequestCountMap;
    }*/
}
