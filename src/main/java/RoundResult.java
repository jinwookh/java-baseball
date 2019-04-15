public enum RoundResult {
    STRIKE,
    BALL,
    MISS;

    public RoundResult valueOf(char userCharacter, String generatedNumber,
                               int index) {
        if (isStrike(userCharacter, generatedNumber, index)) {
            return STRIKE;
        }


        return RoundResult.BALL;
    }

    private boolean isStrike(char userCharacter, String generatedNumber, int index) {
        if (generatedNumber.charAt(index) == userCharacter) {
            return true;
        }
        return false;
    }

}
