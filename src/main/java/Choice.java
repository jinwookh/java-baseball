public enum Choice {
    GO("1"),
    STOP("2");

    private String input;

    Choice(String input) {
        this.input = input;
    }

    public static Choice of(String input) {
        if (checkValidity(input) == false) {
            throw new IllegalArgumentException();
        }
        if (input.equals(GO.input)) {
            return GO;
        }
        return STOP;
    }

    private static boolean checkValidity(String input) {
        if (input.equals(GO.input) || input.equals(STOP.input)) {
            return true;
        }
        return false;
    }
}
