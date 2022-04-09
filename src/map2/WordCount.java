package map2;

/*The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the number of times that string appears in the array.*/

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public Map<String, Integer> wordCount(String[] strings) {
        Map<String , Integer> map = new HashMap<>();
        for(String element : strings) {
            if(!map.containsKey(element)) {
                map.put(element , 1);
            } else {
                int temp = map.get(element);
                map.put(element , ++temp);
            }
        }
        return map;
    }
}
