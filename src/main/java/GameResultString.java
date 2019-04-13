public class GameResultString {
    private static final String MISS = "MISS";
    private static final String STRIKE = " 스트라이크 ";
    private static final String BALL = "볼";


    public static String is(int strike, int ball) {
        String string = "";
        string += addStrike(strike);
        string += addBall(ball);
        if(strike == 0 && ball == 0) {
            string = MISS;
        }
        return string;
    }

    private static String addStrike(int strike) {
        String string = "";
        if(strike != 0) {
            string += strike + STRIKE;
        }
        return string;
    }

    private static String addBall(int ball) {
        String string = "";
        if(ball != 0) {
            string += ball + BALL;
        }
        return string;
    }
}
