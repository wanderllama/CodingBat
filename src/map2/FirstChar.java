package map2;

/*Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen, with the value of all the strings starting with that character appended together in the order they appear in the array.*/

import java.util.HashMap;
import java.util.Map;

public class FirstChar {
    public Map<String, String> firstChar(String[] strings) {
        Map<String , String> map = new HashMap<>();
        for(String element : strings) {
            if(!map.containsKey("" + element.charAt(0))) {
                map.put("" + element.charAt(0) , element);
            } else {
                String temp = map.get("" + element.charAt(0)) + element;
                map.put("" + element.charAt(0) , temp);
            }
        }
        return map;
    }
}
