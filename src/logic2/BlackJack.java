package logic2;

/*Given 2 int values greater than 0, return whichever value is nearest
to 21 without going over. Return 0 if they both go over.*/

public class BlackJack {
    public int blackjack(int a, int b) {
        if(21 % a == 21 && 21 % b == 21) {
            return 0;
        }
        if(21 % a == 21) {
            return b;
        }
        if(21 % b == 21){
            return a;
        }
        if(a > b) {
            return a;
        }
        return b;
    }
}
