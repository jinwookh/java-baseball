public class GameNumber {
    private static int LENGTH = 3;
    private static char BOTTOM = '1';
    private static char TOP = '9';
    private static String WRONG_NUMBER_FORMAT_ERROR = "1~9로 이루어진 세 자리 숫자를" +
            " 입력해 주세요.";

    private String number;

    GameNumber(String input) {
        if(!checkValidity(input)) {
            throw new IllegalArgumentException(WRONG_NUMBER_FORMAT_ERROR);
        }
        number = input;
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

}
