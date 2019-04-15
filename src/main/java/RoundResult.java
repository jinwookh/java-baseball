public enum RoundResult {
    STRIKE,
    BALL,
    MISS;

    public RoundResult valueOf(char userCharacter, String generatedNumber,
                               int index) {
        if (isStrike(userCharacter, generatedNumber, index)) {
            return STRIKE;
        }
        if (isBall(userCharacter, generatedNumber)) {
            return BALL;
        }
        return MISS;
    }

    private boolean isStrike(char userCharacter, String generatedNumber, int index) {
        if (generatedNumber.charAt(index) == userCharacter) {
            return true;
        }
        return false;
    }

    private boolean isBall(char userCharacter, String generatedNumber) {
        for (int i = 0; i < generatedNumber.length(); i++) {
            if (generatedNumber.charAt(i) == userCharacter) {
                return true;
            }
        }
        return false;
    }

}
