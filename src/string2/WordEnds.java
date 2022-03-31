package string2;

/*Given a string and a non-empty word string, return a string made of each char
just before and just after every appearance of the word in the string. Ignore
cases where there is no char before or after the word, and a char may be included
twice if it is between two words.*/

public class WordEnds {

    public static void main(String[] args) {
        String str = "abc1xyz11";

        String word = "1";
        str = str.replaceAll(word, " " + word + " ");
        String[] arr = str.split(" ");
        String send = "";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].isEmpty()) {
                continue;
            } else if (!arr[i].equals(word)) {
                continue;
            } else if ((i == 0 || arr[i - 1].isEmpty()) && arr[i].equals(word)) {
                send += arr[i + 1].charAt(0);
                System.out.println("send = " + send);
            } else if (i == arr.length - 1 && arr[i].equals(word)) {
                send += arr[i - 1].charAt(arr[i - 1].length() - 1);
            } else if (arr[i].equals(word)) {
                send += arr[i - 1].charAt(arr[i - 1].length() - 1);
                if (arr[i + 1].isEmpty()) {
                    continue;
                } else {
                    send += arr[i + 1].charAt(0);
                }
            }
        }
        System.out.println("send = " + send);
    }
}
