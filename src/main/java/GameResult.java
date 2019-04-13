import java.util.*;

public class GameResult {
    private int strike = 0;
    private int ball = 0;

    GameResult(GameNumber userNumber, GameNumber generatedNumber) {
        this(userNumber.toString(), generatedNumber.toString());
    }

    GameResult(String userNumber, String generatedNumber) {
        for(int i = 0; i< GameNumber.LENGTH; i++) {
            RoundResult result = isStrikeOrBallOrMiss(userNumber.charAt(i), generatedNumber, i);
            adaptResult(result);
        }
    }

    private RoundResult isStrikeOrBallOrMiss(char userCharacter,
                                     String generatedNumber, int index) {
        if(isStrike(userCharacter, generatedNumber, index)) {
            return RoundResult.STRIKE;
        }
        if(isBall(userCharacter, generatedNumber, index)) {
            return RoundResult.BALL;
        }
        return RoundResult.MISS;
    }

    private void adaptResult(RoundResult result) {
        if(result == RoundResult.STRIKE) {
            strike++;
            return;
        }
        if(result == RoundResult.BALL) {
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
        HashSet<Character> generatedNumberSet
                = new HashSet<Character>(stringtoCharacterList(generatedNumber));
        if(generatedNumberSet.contains(Character.valueOf(userCharacter))) {
            return true;
        }
        return false;
    }

    private List<Character> stringtoCharacterList(String string) {
        List<Character> characterList = new ArrayList<>();
        for(char character : string.toCharArray()) {
            characterList.add(character);
        }
        return characterList;
    }

    @Override
    public String toString() {
        return GameResultString.is(strike, ball);
    }
}
