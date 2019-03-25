import java.util.Scanner;

public class Game {

    static String recieveNumber() {
        boolean flag;
        String input;
        Scanner scan = new Scanner(System.in);
        CheckSomething check = new CheckSomething();

        while(true) {
            System.out.print("숫자를 입력해주세요 : ");
            input = scan.nextLine();
            flag = check.checkRecievedNumber(input);

            if (flag) {
                break;
            }
            else {
                System.out.println("공백을 제외한 3자리 숫자(1~9)를 입력하셔야 합니다.");
            }
        }

        return input;
    }

    static String generateNumber(int length) {
        int random;
        char zero = '1';
        String number = "";

        for (int i=0; i<3; i++) {
            random = (int) (Math.random() * 9);
            zero = (char) (zero + random);
            number += zero;
            zero = '1';
        }

        return number;
    }

    static boolean playGame(String createdNumber) {
        String inputNumber;
        Result result;

        while (true) {
            inputNumber = recieveNumber();
            result = Oracle.tells(createdNumber, inputNumber);
            if (result.strike != 0) {
                System.out.print(result.strike);
                System.out.print(" 스트라이크 ");
            }
            if (result.ball != 0) {
                System.out.print(result.ball);
                System.out.print("볼");
            }
            if (result.ball == 0 && result.strike == 0)
                System.out.print("Nothing");
            System.out.println();
            if (result.strike == 3)
                break;
        }

        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        return CheckSomething.checkUserThought();


    }

}
