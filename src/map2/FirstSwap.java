package map2;

import java.util.HashMap;
import java.util.Map;

public class FirstSwap {
    public String[] firstSwap(String[] strings) {
        Map<String , String> map = new HashMap<>();
        String skip = "";
        for(int i = 0; i < strings.length; i++) {
            if(strings[i].isEmpty()) {
                continue;
            }
            for(int j = i + 1; j < strings.length; j++) {
                if(strings[j].isEmpty() || map.containsKey(strings[i]) || skip.contains("" + strings[i].charAt(0))) {
                    continue;
                } else if(strings[i].charAt(0) == strings[j].charAt(0)) {
                    map.put(strings[i] , strings[j]);
                    map.put(strings[j] , strings[i]);
                    skip += strings[i].charAt(0) + " ";
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
