import java.util.Scanner;

public class InputHandler {
    private static Scanner SCANNER = new Scanner(System.in);
    private static String ASK_NUMBER = "숫자를 입력해 주세요 : ";
    private static String ASK_CHOICE = "게임을 새로 시작하려면 1, 종료하려면 "
            + "2를 입력하세요";

    static GameNumber getGameNumberFromUser() {
        try {
            System.out.print(ASK_NUMBER);
            return new GameNumber(SCANNER.nextLine().trim());
        } catch(Exception e) {
            System.out.println(e.getMessage());
            return getGameNumberFromUser();
        }
    }

    static Choice getChoiceFromUser() {
        try {
            System.out.println(ASK_CHOICE);
            return new Choice(SCANNER.nextLine().trim());
        } catch(Exception e) {
            return getChoiceFromUser();
        }
    }

}
