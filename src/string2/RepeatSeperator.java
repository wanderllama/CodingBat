package string2;

/*Given two strings, word and a separator sep, return a big string made of
count occurrences of the word, separated by the separator string.*/

public class RepeatSeperator {
    public String repeatSeparator(String word, String sep, int count) {
        if(count == 0) {
            return "";
        }
        String repeat = sep + word;
        String send = "";
        for(int i = 1; i < count; i++) {
            send += repeat;
        }
        return word + send;
    }
}
