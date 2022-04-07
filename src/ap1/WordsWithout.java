package ap1;

/*Given an array of strings, return a new array without the strings that are equal to the target string. One approach is to count the occurrences of the target string, make a new array of the correct length, and then copy over the correct strings.*/

public class WordsWithout {
    public String[] wordsWithout(String[] words, String target) {
        int count = 0;
        for(int i = 0; i < words.length; i++) {
            if(!words[i].equals(target)) {
                count++;
            }
        }
        String[] send = new String[count];
        for(int i = 0 , j = 0; i < words.length; i++) {
            if(!words[i].equals(target)) {
                send[j++] = words[i];
            }
        }
        return send;
    }
}
