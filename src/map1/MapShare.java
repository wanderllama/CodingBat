package map1;

/*Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value. In all cases remove the key "c", leaving the rest of the map unchanged.*/

import java.util.Map;

public class MapShare {
    public Map<String, String> mapShare(Map<String, String> map) {
        if(map.containsKey("a")) {
            map.put("b" , map.get("a"));
        }
        map.remove("c");
        return map;
    }
}
