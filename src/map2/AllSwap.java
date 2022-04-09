package map2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AllSwap {

    public static void main(String[] args) {


        String[] strings = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].isEmpty()) {
                continue;
            }
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[j].isEmpty()) {
                    continue;
                } else if (strings[i].charAt(0) == strings[j].charAt(0)) {
                    map.put(strings[i], strings[j]);
                    map.put(strings[j], strings[i]);
                    System.out.println(map);
                    break;
                }
            }
        }
        String[] send = new String[strings.length];
        for (int i = 0, j = 0; i < send.length; i++) {
            if (map.containsKey(strings[i])) {
                send[j++] = map.get(strings[i]);
                System.out.println(map.get(strings[i]));
            } else {
                send[j++] = strings[i];
            }
        }
        System.out.println(Arrays.toString(send));
    }
}
