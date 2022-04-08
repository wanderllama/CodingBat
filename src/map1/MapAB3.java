package map1;

/*Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map (but not both), set the other to have that same value in the map.*/

import java.util.Map;

public class MapAB3 {
    public Map<String, String> mapAB3(Map<String, String> map) {
        if(map.containsKey("a") && !map.containsKey("b")) {
            map.put("b" , map.get("a"));
        }
        if(!map.containsKey("a") && map.containsKey("b")) {
            map.put("a" , map.get("b"));
        }
        return map;
    }
}
