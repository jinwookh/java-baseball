public class GameResultOutput {
    private static final String STRIKE = "스트라이크 ";
    private static final String BALL = "볼";
    private static final String MISS = "MISS";

    public static void show(int strike, int ball) {
        String string = "";
        string += strikeString(strike);
        string += ballString(ball);
        if (strike == 0 && ball == 0) {
            string += MISS;
        }
        System.out.println(string);
    }

    private static String strikeString(int strike) {
        String string = "";
        if (strike != 0) {
            string += strike + STRIKE;
        }
        return string;
    }

    private static String ballString(int ball) {
        String string = "";
        if (ball != 0) {
            string += ball + BALL;
        }
        return string;
    }

}
