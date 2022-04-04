package String3;

/*Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not".
The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count.
(Note: Character.isLetter(char) tests if a char is a letter.)*/

public class NotReplace {
    public String notReplace(String str) {
        str = " " + str + "   ";
        for(int i = 0; i < str.length() - 3; i++) {
            if(str.charAt(i) == 'i' && str.charAt(i + 1) == 's') {
                if(i == 0 | (!Character.isAlphabetic(str.charAt(i + 2)) && !Character.isAlphabetic(str.charAt(i - 1)))) {
                    str = str.substring(0 , i + 2) + " not" + str.substring(i + 2);
                }
            }
        }
        return str.trim();
    }
}
