public class BaseballResult {
    static final String ALL_STRIKE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";

    private int ball = 0;
    private int strike = 0;

    BaseballResult(String userNumber, String generatedNumber) {
        for(int i = 0; i < BaseballNumber.VALID_LENGTH; i++) {
            incrementBallOrStrike(userNumber.charAt(i),generatedNumber, i);
        }
    }

    private void incrementBallOrStrike(char userCharacter,
                                       String generatedNumber, int index) {
        if(isStrike(userCharacter,generatedNumber, index)) {
            strike++;
        }
        if(isBall(userCharacter,generatedNumber, index)) {
            ball++;
        }
    }

    private boolean isStrike(char userCharacter, String generatedNumber, int index) {
        if(userCharacter == generatedNumber.charAt(index)) {
            return true;
        }
        return false;
    }

    private boolean isBall(char userCharacter, String generatedNumber, int index) {
        if(isStrike(userCharacter, generatedNumber, index)) {
            return false;
        }
        return isBall(userCharacter, generatedNumber);
    }

    private boolean isBall(char userCharacter, String generatedNumber) {
        int count = 0;
        for(int i = 0; i < BaseballNumber.VALID_LENGTH; i ++) {
            count = incrementCountIfNumberMatches(count,
                    userCharacter, generatedNumber.charAt(i));
        }
        return count > 0;
    }




    private int incrementCountIfNumberMatches(int count, char userCharacter,
                                               char generatedCharacter) {
        if(userCharacter == generatedCharacter) {
            return count + 1;
        }
        return count;
    }

    public boolean isAllStrike() {
        if(strike == BaseballNumber.VALID_LENGTH) {
            System.out.println(ALL_STRIKE);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        BaseballResultString baseballResultString =
                new BaseballResultString(strike, ball);
        return baseballResultString.toString();
    }
}
