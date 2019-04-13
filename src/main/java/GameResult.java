public class GameResult {
    private int strike;
    private int ball;

    GameResult(GameNumber userNumber, GameNumber generatedNumber) {
        countStrike(userNumber.toString(), generatedNumber.toString());
    }

    private void countStrike(String userNumber, String generatedNumber) {
        for(int i = 0; i < GameNumber.LENGTH; i++) {
            if(isStrike(userNumber.charAt(i), generatedNumber, i)) {
                strike++;
            }
        }
    }

    private boolean isStrike(char userCharacter, String generatedNumber, int index) {
        if(userCharacter == generatedNumber.charAt(index)) {
            return true;
        }
        return false;
    }



}
