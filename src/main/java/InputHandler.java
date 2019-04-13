import java.util.Scanner;

public class InputHandler {
    private static Scanner SCANNER = new Scanner(System.in);
    private static String ASK_NUMBER = "숫자를 입력해 주세요 : ";


    static GameNumber getGameNumberFromUser() {
        try {
            System.out.print(ASK_NUMBER);
            return new GameNumber(SCANNER.nextLine().trim());
        } catch(Exception e) {
            System.out.println(e.getMessage());
            return getGameNumberFromUser();
        }
    }

}
