public class BaseballResultString {
    private static final String STRIKE = " 스트라이크";
    private static final String BALL = "볼";
    private static final String MISS = "MISS";

    private String resultString = "";

    BaseballResultString(int strike, int ball) {
        addStrike(strike);
        addBall(ball);
        addMISS(strike, ball);
    }

    private void addStrike(int strike) {
        if(strike != 0) {
            resultString+= strike + STRIKE;
        }
    }

    private void addBall(int ball) {
        if(ball != 0) {
            resultString += ball + BALL;
        }
    }

    private void addMISS(int strike, int ball) {
        if(strike == 0 && ball == 0) {
            resultString += MISS;
        }
    }

    @Override
    public String toString() {
        return resultString;
    }

}
