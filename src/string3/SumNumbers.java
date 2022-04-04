package string3;

/*
Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
*/

public class SumNumbers {
    public int sumNumbers(String str) {
        String num = "";
        int noDigit = 0;
        for(int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                num += " " + str.charAt(i);
                while(i < str.length() - 1 && Character.isDigit(str.charAt(i + 1))) {
                    num += str.charAt(i + 1);
                    i++;
                }
            } else {
                noDigit++;
            }
        }
        if(noDigit == str.length()) {
            return 0;
        }
        num = num.trim();
        int sum = 0;
        String[] arr = num.split(" ");
        for(String element : arr) {
            sum += Integer.parseInt(element);
        }
        return sum;
    }
}
