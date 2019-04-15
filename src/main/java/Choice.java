public enum Choice {
    GO("1"),
    STOP("2");

    private String input;

    Choice(String input) {
        this.input = input;
    }


    private boolean checkValidity(String input) {
        if (input.equals(GO.input) || input.equals(STOP.input)) {
            return true;
        }
        return false;
    }
}
