import java.util.Scanner;

public class Solution {

    public static void main(String args[]) {

        GameNumber userNumber = InputHandler.getGameNumberFromUser();
        InputHandler.getChoiceFromUser();
        GameResult gameResult =
                new GameResult(userNumber, GameNumber.generateGameNumber());
        System.out.println(gameResult.toString());
    }

}
