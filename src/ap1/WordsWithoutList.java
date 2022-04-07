package ap1;

/*Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given length are omitted. See wordsWithout() below which is more difficult because it uses arrays.*/

import java.util.ArrayList;

public class WordsWithoutList {
    public ArrayList wordsWithoutList(String[] words, int len) {
        ArrayList<String> send = new ArrayList<>();
        for(int i = 0; i < words.length; i++) {
            if(words[i].length() != len) {
                send.add(words[i]);
            }
        }
        return send;
    }
}
