public class Choice {
    private static final String GO = "1";
    private static final String STOP = "2";
    private static final String WRONG_CHOICE_ERROR = "1 또는 2가 아닙니다.";
    private String choice;

    Choice(String input) {
        if(!checkValidity(input)) {
            throw new IllegalArgumentException(WRONG_CHOICE_ERROR);
        }
        choice = input;
    }

    private boolean checkValidity(String string) {
        if(string.equals(GO) || string.equals(STOP)) {
            return true;
        }
        return false;
    }

    public boolean saysGo() {
        return choice.equals(GO);
    }

    public boolean saysStrop() {
        return choice.equals(STOP);
    }


}
