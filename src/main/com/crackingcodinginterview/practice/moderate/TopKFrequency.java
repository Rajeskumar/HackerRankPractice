package main.com.crackingcodinginterview.practice.moderate;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Given a non-empty list of words, return the k most frequent elements.
 *
 * Your answer should be sorted by frequency from highest to lowest. If two words have the same frequency,
 * then the word with the lower alphabetical order comes first.
 */
public class TopKFrequency {

    public static List<String> topKFrequent(String[] words, int k) {

        HashMap<String, Integer> frequencies = new HashMap<>();

        for(String word: words){
            if(frequencies.get(word) != null){
                int count = frequencies.get(word);
                frequencies.put(word,count+1);
            }else{
                frequencies.put(word,1);
            }
        }

        Comparator<Map.Entry<String, Integer>> comparator = new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                if(e1.getValue() < e2.getValue()){
                    return 1;
                }else if(e1.getValue() == e2.getValue()){
                    if(e1.getKey().compareTo(e2.getKey()) > 0){
                        return 1;
                    }else{
                        return -1;
                    }
                }else{
                    return -1;
                }
            }
        };

        Map<String, Integer> sortedMap = frequencies.entrySet().stream()
                .sorted(comparator)
                .limit(k)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (key1, key2) -> key1, LinkedHashMap::new));

        ArrayList<String> result = new ArrayList<String>(sortedMap.keySet());

        return result;
    }

    public List<String> topKFrequent_optimized(String[] words, int k) {
        Map<String, Integer> count = new HashMap();
        for (String word : words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
        List<String> candidates = new ArrayList(count.keySet());
        Collections.sort(candidates, (w1, w2) -> count.get(w1).equals(count.get(w2)) ?
                w1.compareTo(w2) : count.get(w2) - count.get(w1));

        return candidates.subList(0, k);
    }
}
