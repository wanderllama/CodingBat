package map2;

/*Given an array of non-empty strings, create and return a Map<String, String> as follows: for each string add its first character as a key with its last character as the value.*/

import java.util.HashMap;
import java.util.Map;

public class Pairs {
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for(String element : strings) {
            map.put("" + element.charAt(0) , "" + element.charAt(element.length() - 1));
        }
        return map;
    }
}
