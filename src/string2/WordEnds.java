package string2;

/*Given a string and a non-empty word string, return a string made of each char
just before and just after every appearance of the word in the string. Ignore
cases where there is no char before or after the word, and a char may be included
twice if it is between two words.*/

import java.util.ArrayList;

public class WordEnds {
    public String wordEnds(String str, String word) {
        if(str.equals(word)) {
            return "";
        }
        String[] arrs = str.replaceAll(word , " " + word + " ").split(" ");
        ArrayList<String> arr = new ArrayList<>();
        for (String element : arrs) {
            if (!element.isEmpty()) {
                arr.add(element);
            }
        }
        String send = "";
        for(int i = 0; i < arr.size(); i++) {
            if((i == 0 || arr.get(i - 1).isEmpty()) && arr.get(i).equals(word)) {
                send += arr.get(i + 1).charAt(0);
            } else if (i == arr.size() - 1 && arr.get(i).equals(word)) {
                send += arr.get(i - 1).charAt(arr.get(i - 1).length() - 1);
            } else if (arr.get(i).equals(word)) {
                send += arr.get(i - 1).charAt(arr.get(i - 1).length() - 1);
                send += arr.get(i + 1).charAt(0);
            }
        }
        return send;
    }
}
