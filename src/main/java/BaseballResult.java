public class BaseballResult {
    private int ball = 0;
    private int strike = 0;

    BaseballResult(String userNumber, String generatedNumber) {
        for(int i = 0; i < BaseballNumber.VALID_LENGTH; i++) {
            incrementBallOrStrike(userNumber.charAt(i),generatedNumber, i);
        }
    }

    private void incrementBallOrStrike(char userCharacter,
                                       String generatedNumber, int index) {
        incrementStrike(userCharacter, generatedNumber, index);
        incrementBall(userCharacter, generatedNumber);
    }

    private void incrementStrike(char userCharacter,
                                    String generatedNumber, int index) {
        if(userCharacter == generatedNumber.charAt(index)) {
            strike++;
        }
    }

    private void incrementBall(char userCharacter,
                                    String generatedNumber) {
        int count = 0;
        for(int i = 0; i <BaseballNumber.VALID_LENGTH; i++) {
            count = incrementCountIfNumberMatches(count, userCharacter, generatedNumber.charAt(i));
        }
        if(count > 1) {
            ball++;
        }
    }

    private int incrementCountIfNumberMatches(int count, char userCharacter,
                                               char generatedCharacter) {
        if(userCharacter == generatedCharacter) {
            return count + 1;
        }
        return count;
    }

    @Override
    public String toString() {
        BaseballResultString baseballResultString =
                new BaseballResultString(strike, ball);
        return baseballResultString.toString();
    }
}
