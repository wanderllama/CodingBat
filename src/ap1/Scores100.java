package ap1;

/*Given an array of scores, return true if there are scores of 100 next to each other in the array. The array length will be at least 2.*/

public class Scores100 {
    public boolean scores100(int[] scores) {
        boolean no100 = true;
        for(int i = 1; i < scores.length - 1; i++) {
            if(scores[i] == 100) {
                no100 = false;
                if(scores[i - 1] != 100 && scores[i + 1] != 100) {
                    return false;
                }
            }
        }
        return (no100 ? false : true);
    }
}
