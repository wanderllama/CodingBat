package map1;

/*Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty string.*/

import java.util.Map;

public class MapBully {
    public Map<String, String> mapBully(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")) {
            String temp = map.get("a");
            map.put("a" , "");
            map.put("b" , temp);
            return map;
        }
        if(map.containsKey("a")) {
            String temp = map.get("a");
            map.put("a" , "");
            map.put("b" , temp);
        }
        return map;
    }
}
