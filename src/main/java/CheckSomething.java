public class CheckSomething {

    boolean checkLength(String input, int length) {
        if (input.length() != length)
            return false;
        else
            return true;

    }
    /*
    boolean checkNumbers(String input) {
        boolean flag =  true;
        for (int i = 0; i < input.length(); i++) {
            if (checkNumber(input[i])
        }
    }
    */
    /*
    boolean checkNumber(char character) {
        if (character >= '1' && character <= '9')
            return true;
        else
            return false;
    }
    */
}
