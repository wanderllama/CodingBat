package ap1;

/*Given an array of strings, return the count of the number of strings with the given length*/

public class WordsCount {
    public int wordsCount(String[] words, int len) {
        int count = 0;
        for(String element : words) {
            if(element.length() == len) {
                count++;
            }
        }
        return count;
    }
}
