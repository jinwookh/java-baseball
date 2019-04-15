public class GameNumber {
    private static final int LENGTH = 3;
    private static final char ONE_CHARACTER = '1';
    private static final char NINE_CHARACTER = '9';

    private String gameNumber;

    public GameNumber(String input) {
        if (checkValidity(input) == false) {
            throw new IllegalArgumentException();
        }
        gameNumber = input;

    }

    private boolean checkValidity(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (checkValidity(input.charAt(i)) == false) {
                return false;
            }
        }
        return input.length() == LENGTH;
    }

    private boolean checkValidity(char character) {
        if (character >= ONE_CHARACTER && character <= NINE_CHARACTER) {
            return true;
        }
        return false;
    }
}
