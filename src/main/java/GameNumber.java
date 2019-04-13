public class GameNumber {
    private static int LENGTH = 3;
    private static char BOTTOM = '1';
    private static char TOP = '9';
    private static String WRONG_NUMBER_FORMAT_ERROR = "1~9로 이루어진 세 자리 숫자를" +
            " 입력해 주세요.";

    private String numberString;

    GameNumber(String input) {
        if(!checkValidity(input)) {
            throw new IllegalArgumentException(WRONG_NUMBER_FORMAT_ERROR);
        }
        numberString = input;
    }

    private boolean checkValidity(String input) {
        for(int i = 0; i< input.length(); i++) {
            if(!checkValidity(input.charAt(i))) {
                return false;
            }
        }
        return input.length() == LENGTH;
    }

    private boolean checkValidity(char character) {
        if(character < BOTTOM || character > TOP) {
            return false;
        }
        return true;
    }

    public static GameNumber generateGameNumber() {
        String gameNumber = "";
        for(int i = 0; i < LENGTH; i++) {
            gameNumber += generateRandomNumber(Character.getNumericValue(BOTTOM),
                    Character.getNumericValue(TOP));
        }
        return new GameNumber(gameNumber);
    }

    private static String generateRandomNumber(int bottom, int top) {
        int randomNumber = (int)(Math.random()*(top - bottom + 1) + bottom);
        return Integer.toString(randomNumber);
    }

    @Override
    public String toString() {
        return numberString;
    }
}
