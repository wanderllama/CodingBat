package recursion1;

/*Given a string, return true if it is a nesting of zero or more pairs of parenthesis, like "(())" or "((()))". Suggestion: check the first and last chars, and then recur on what's inside them.*/

public class NestParen {
    public boolean nestParen(String str) {
        if(str.isEmpty()) {
            return true;
        }
        if(str.length() % 2 == 1) {
            return false;
        }
        if(str.charAt(0) != '(' || str.charAt(str.length() - 1) != ')') {
            return false;
        }
        if(str.length() == 2 && str.equals("()")) {
            return true;
        }
        return nestParen(str.substring(1 , str.length() - 1));
    }
}
