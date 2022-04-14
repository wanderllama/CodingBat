package recursion1;

/*Given a string that contains a single pair of parenthesis, compute recursively a new string made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".*/

public class ParenBit {
    public String parenBit(String str) {
        if(str.isEmpty()) {
            return "";
        }
        if(str.charAt(0) == '(') {
            String temp = "(";
            int index = 0;
            while(str.charAt(++index) != ')') {
                temp += str.charAt(index);
            }
            return temp + ')' + parenBit(str.substring(index + 1));
        }
        return parenBit(str.substring(1));
    }
}
