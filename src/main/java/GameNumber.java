import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GameNumber {
    public static final int LENGTH = 3;
    private static final char ONE_CHARACTER = '1';
    private static final char NINE_CHARACTER = '9';
    private static final int MAX = 9;
    private static final int MIN = 1;

    private String gameNumberString;

    public GameNumber(String input) {
        if (checkValidity(input) == false) {
            throw new IllegalArgumentException();
        }
        gameNumberString = input;

    }

    private boolean checkValidity(String input) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            if (checkValidity(input.charAt(i))) {
                set.add(input.charAt(i));
            }
        }
        return set.size() == LENGTH;
    }

    private boolean checkValidity(char character) {
        if (character >= ONE_CHARACTER && character <= NINE_CHARACTER) {
            return true;
        }
        throw new IllegalStateException();
    }

    public static GameNumber isGenerated() {
        List<Integer> list = new ArrayList<>();
        while (list.size() < LENGTH) {
            int randomNumber = getRandomNumber();
            if (list.contains(randomNumber) == false) {
                list.add(randomNumber);
            }
        }
        return convertListToGameNumber(list);
    }

    private static int getRandomNumber() {
        int randomNumber = (int)(Math.random() * (MAX - MIN + 1) + MIN);
        return randomNumber;
    }

    private static GameNumber convertListToGameNumber(List<Integer> list) {
        String string = "";
        for (int number : list
             ) {
            string += number;
        }
        return new GameNumber(string);
    }

    @Override
    public String toString() {
        return gameNumberString;
    }
}
