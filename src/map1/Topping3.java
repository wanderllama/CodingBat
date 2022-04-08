package map1;

/*Given a map of food keys and topping values, modify and return the map as follows: if the key "potato" has a value, set that as the value for the key "fries". If the key "salad" has a value, set that as the value for the key "spinach".*/

import java.util.Map;

public class Topping3 {
    public Map<String, String> topping3(Map<String, String> map) {
        if(map.containsKey("potato")) {
            map.put("fries" , map.get("potato"));
        }
        if(map.containsKey("salad")) {
            map.put("spinach" , map.get("salad"));
        }
        return map;
    }
}
