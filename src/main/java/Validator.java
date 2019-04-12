
public class Validator {
    static final int CHOICE_TO_GO = 1;
    static final int CHOICE_TO_STOP = 2;

    static boolean checkStringIsValid(String input) {
        int count = 0;
        for (int i =0; i < input.length(); i++) {
            count = incrementsIfCharacterIsValid(input.charAt(i), count);
        }
        return input.length() == BaseballNumber.VALID_LENGTH && count == input.length();
    }

    private static int incrementsIfCharacterIsValid(char character, int count) {
        if(character >= BaseballNumber.ONE && character <= BaseballNumber.NINE) {
            return count + 1;
        }
        return count;
    }

    static boolean checkChoiceIsValid(String input) {
        try {
            int integer = Integer.parseInt(input);
            return integer == CHOICE_TO_GO || integer == CHOICE_TO_STOP;
        }
        catch(Exception e) {
            return false;
        }
    }

}
