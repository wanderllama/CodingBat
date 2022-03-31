package string2;

/*Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.*/

public class PlusOut {
    public String plusOut(String str, String word) {
        for (int i = 0; i < str.length() - word.length(); i++) {
            if (!str.substring(i , i + word.length()).equals(word)) {
                str = str.replaceFirst(str.charAt(i) + "", "+");
            } else {
                i += word.length() - 1;
            }
        }
        String add = "";
        if (str.charAt(str.length() - 1) != '+' && !str.substring(str.length() - word.length()).equals(word)) {
            for (int i = str.length() - word.length(); i < str.length(); i++) {
                add += "+";
            }
        }
        if (str.charAt(str.length() - 1) != '+' && !str.substring(str.length() - word.length()).equals(word)) {
            str = str.substring(0 , str.length() - word.length());
        }

        return str + add;
    }
}
