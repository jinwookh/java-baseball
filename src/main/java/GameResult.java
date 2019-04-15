public class GameResult {
    private int ball;
    private int strike;

    public GameResult(String userNumber, String generatedNumber) {
        for (int i = 0; i < userNumber.length(); i++) {
            adapt(RoundResult.valueOf(userNumber.charAt(i),
                    generatedNumber, i));
        }
    }

    private void adapt(RoundResult roundResult) {
        if (roundResult == RoundResult.BALL) {
            ball++;
        }
        if (roundResult == RoundResult.STRIKE) {
            strike++;
        }
    }

    public void show() {
        GameResultOutput.show(strike, ball);

    }

    @Override
    public String toString() {
        return ""+strike+" "+ ball;
    }
}
