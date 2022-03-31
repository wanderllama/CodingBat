package string2;

/*Given a string and a non-empty word string, return a version of the original String
where all chars have been replaced by pluses ("+"), except for appearances of the word
string which are preserved unchanged.*/

public class PlusOut {
    public String plusOut(String str, String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '+') {
                count++;
                break;
            }
        }
        String send = "";
        if (count != 0) {
            int x = str.length();
            while (x > 0) {
                send += "+";
                x--;
            }
            return send;
        }
        str = str.replaceAll(word, "_" + word + "_");
        String[] arr = str.split("_");
        for (String element : arr) {
            if (element.equals(word)) {
                send += word;
            } else {
                int x = element.length();
                while (x > 0) {
                    send += "+";
                    x--;
                }
            }
        }
        return send;
    }
}
