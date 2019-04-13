import java.util.*;

public class GameResult {
    private int STRIKE = 1;
    private int BALL = 2;
    private int MISS = 0;

    private int strike = 0;
    private int ball = 0;

    GameResult(GameNumber userNumber, GameNumber generatedNumber) {
        this(userNumber.toString(), generatedNumber.toString());
    }

    GameResult(String userNumber, String generatedNumber) {
        for(int i = 0; i< GameNumber.LENGTH; i++) {
            int result = isStrikeOrBallOrMiss(userNumber.charAt(i), generatedNumber, i);
            adaptResult(result);
        }
    }

    private int isStrikeOrBallOrMiss(char userCharacter,
                                     String generatedNumber, int index) {
        if(isStrike(userCharacter, generatedNumber, index)) {
            return STRIKE;
        }
        if(isBall(userCharacter, generatedNumber, index)) {
            return BALL;
        }
        return MISS;
    }

    private void adaptResult(int result) {
        if(result == STRIKE) {
            strike++;
            return;
        }
        if(result == BALL) {
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



}
