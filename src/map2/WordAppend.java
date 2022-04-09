package map2;

/*Loop over the given array of strings to build a result string like this: when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result. Return the empty string if no string appears a 2nd time.*/

import java.util.HashMap;
import java.util.Map;

public class WordAppend {
    public String wordAppend(String[] strings) {
        Map<String , Integer> map = new HashMap<>();
        String send = "";
        for(String element : strings) {
            if(!map.containsKey(element)) {
                map.put(element , 1);
            } else {
                int temp = map.get(element);
                map.put(element , ++temp);
                if(map.get(element) % 2 == 0) {
                    send += element;
                }
            }
        }
        return send;
    }
}
