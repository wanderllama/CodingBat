package ap1;

/*Given an array of scores sorted in increasing order, return true if the array contains 3 adjacent scores that differ from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.*/

public class ScoresClump {
    public boolean scoresClump(int[] scores) {
        for(int i = 0; i < scores.length - 2; i++) {
            int min = scores[i] - 2;
            int max = scores[i] + 2;
            if(scores[i + 1] < min || scores[i + 1] > max || scores[i + 2] < min || scores[i + 2] > max) {
                continue;
            } else {
                return true;
            }
        }
        return false;
    }
}
