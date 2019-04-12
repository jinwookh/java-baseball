
public class Validator {
    private static final int VALID_LENGTH = 3;
    private static final char ZERO = '0';
    private static final char NINE = '9';


    static boolean checkStringIsValid(String input) {
        int count = 0;
        for (int i =0; i < input.length(); i++) {
            count = incrementsIfCharacterIsValid(input.charAt(i), count);
        }
        return input.length() == VALID_LENGTH && count == input.length();
    }

    private static int incrementsIfCharacterIsValid(char character, int count) {
        if(character >= ZERO && character <= NINE) {
            return count + 1;
        }
        return count;
    }

}
