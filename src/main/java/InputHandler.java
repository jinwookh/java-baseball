import java.util.Scanner;

public class InputHandler {
    static final String ASK_GAME_NUMBER = "숫자를 입력해주세요: ";
    static final String GAME_NUMBER_ERROR = "1~9 범위의 서로 다른 숫자로 이루어진 세 자리 수를"
            + " 입력해주세요.";
    static final String ASK_CHOICE = "게임을 새로 시작하려면 1, "
            + "종료하려면 2를 입력하세요.";
    static final String CHOICE_ERROR = "입력이 1 또는 2가 아닙니다. 다시 입력해 주세요.";

    static final Scanner SCANNER = new Scanner(System.in);

    public static String getGameNumber() {
        try {
            System.out.print(ASK_GAME_NUMBER);
            GameNumber gameNumber = new GameNumber(SCANNER.nextLine().trim());
            return gameNumber.toString();
        } catch (Exception e) {
            System.out.println(GAME_NUMBER_ERROR);
            return getGameNumber();
        }
    }

    public static Choice getChoice() {
        try {
            System.out.println(ASK_CHOICE);
            return Choice.of(SCANNER.nextLine().trim());
        } catch (Exception e) {
            System.out.println(CHOICE_ERROR);
            return getChoice();
        }
    }

}
