package map2;

/*Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, and the value is that string's length.*/

import java.util.HashMap;
import java.util.Map;

public class WordLen {
    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for(String element : strings) {
            map.put(element , element.length());
        }
        return map;
    }
}
