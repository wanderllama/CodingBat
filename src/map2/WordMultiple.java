package map2;

/*Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is true if that string appears 2 or more times in the array.*/

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String , Boolean> map = new HashMap<>();
        for(String element : strings) {
            if(!map.containsKey(element)) {
                map.put(element , false);
            } else {
                map.put(element , true);
            }
        }
        return map;
    }
}
