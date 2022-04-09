package map2;

/*We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2 strings in the array. A particular first char can only cause 1 swap, so once a char has caused a swap, its later swaps are disabled. Using a map, this can be solved making just one pass over the array. More difficult than it looks.*/

import java.util.HashMap;
import java.util.Map;

public class FirstSwap {
    public String[] firstSwap(String[] strings) {
        Map<String, String> map = new HashMap<>();
        String skip = "";
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].isEmpty()) {
                continue;
            }
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[j].isEmpty() || map.containsKey(strings[i]) || skip.contains("" + strings[i].charAt(0))) {
                    continue;
                } else if (strings[i].charAt(0) == strings[j].charAt(0)) {
                    map.put(strings[i], strings[j]);
                    map.put(strings[j], strings[i]);
                    skip += strings[i].charAt(0) + " ";
                    break;
                }
            }
        }
        String[] send = new String[strings.length];
        for (int i = 0, j = 0; i < send.length; i++) {
            if (map.containsKey(strings[i])) {
                send[j++] = map.get(strings[i]);
                map.remove(strings[i]);
            } else {
                send[j++] = strings[i];
            }
        }
        return send;
    }
}

