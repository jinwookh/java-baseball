import java.util.Scanner;

public class InputHandler {
    private static final String INVALID_NUMBER_ERROR = "1~9로 이루어진 숫자 세 개를 입력해 주세요.";
    private static final String WRITE_THE_NUMBER = "숫자를 입력해주세요 : ";
    private static final String WRITE_YOUR_CHOICE = "게임을 새로 시작하려면 1, 종료하려면" +
            " 2를 입력하세요.";

    private static Scanner SCANNER = new Scanner(System.in);

    static int getBaseballNumberFromUser() {
        System.out.print(WRITE_THE_NUMBER);
        String input = SCANNER.nextLine().trim();

        if(Validator.checkStringIsValid(input)) {
            return Integer.parseInt(input);
        }
        return getBaseballNumberFromUser();
    }

    static int askUserToStopGameOrNot() {
        System.out.println(WRITE_YOUR_CHOICE);
        String input = SCANNER.nextLine().trim();

        if(Validator.checkChoiceIsValid(input)) {
            return Integer.parseInt(input);
        }
        System.out.println(WRITE_YOUR_CHOICE);
        return askUserToStopGameOrNot();
    }


}
