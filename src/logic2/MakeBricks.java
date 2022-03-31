package logic2;

public class MakeBricks {

/*    We want to make a row of bricks that is goal inches long.
      We have a number of small bricks (1 inch each) and big bricks (5 inches each).
      Return true if it is possible to make the goal by choosing from the given bricks.
      This is a little harder than it looks and can be done without any loops*/


 public static boolean makeBricks(int small, int big, int goal) {
  if(small >= goal) {
    return true;
  } else if (big == 0) {
    return false;
  } else if ((5 * big) + small < goal) {
    return false;
  } else if (goal % (5 * big) <= small) {
    return true;
  } else if (goal % 5 <= small) {
    return true;
  }
  return false;
}


    public static boolean makeBricksV2(int small, int big, int goal) {
        if (small >= goal) {
            return true;
        }
        for (int i = 5; i <= big * 5; i+=5) {
            for (int j = 0; j <= small ; j++) {
                if (i + j == goal) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int small = 3;
        int big = 1;
        int goal = 8;

        System.out.println(makeBricks(small , big , goal));
        System.out.println(makeBricksV2(small , big , goal));
    }
}
