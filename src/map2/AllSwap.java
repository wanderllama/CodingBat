package map2;

/*We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2 strings in the array. When a position in the array has been swapped, it no longer matches anything. Using a map, this can be solved making just one pass over the array. More difficult than it looks.*/

import java.util.HashMap;
import java.util.Map;

public class AllSwap {
    public String[] allSwap(String[] strings) {
        Map<String , String> map = new HashMap<>();
        for(int i = 0; i < strings.length; i++) {
            if(strings[i].isEmpty()) {
                continue;
            }
            for(int j = i + 1; j < strings.length; j++) {
                if(strings[j].isEmpty() || map.containsKey(strings[i])) {
                    continue;
                } else if(strings[i].charAt(0) == strings[j].charAt(0)) {
                    map.put(strings[i] , strings[j]);
                    map.put(strings[j] , strings[i]);
                    break;
                }
            }
        }
        String[] send = new String[strings.length];
        for(int i = 0 , j = 0; i < send.length; i++) {
            if(map.containsKey(strings[i])) {
                send[j++] = map.get(strings[i]);
            } else {
                send[j++] = strings[i];
            }
        }
        return send;
    }
}
