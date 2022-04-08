package map1;

/*Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values, remove them both.*/

import java.util.Map;

public class MapAB2 {
    public Map<String, String> mapAB2(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")) {
            if(map.get("a").equals(map.get("b"))) {
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }
}
