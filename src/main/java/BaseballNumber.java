public class BaseballNumber {
    static final int RANGE = 9;
    static final char ONE = '1';
    static final char NINE = '9';
    static final int VALID_LENGTH = 3;

    private String numberString = "";

    BaseballNumber() {
        for(int i = 0; i < VALID_LENGTH; i++) {
            numberString += generateRandomNumber();
        }
    }

    private String generateRandomNumber() {
        Integer randomNumber = (int)(Math.random() * RANGE + Character.getNumericValue(ONE));
        return randomNumber.toString();
    }

    @Override
    public String toString() {
        return numberString;
    }
}
