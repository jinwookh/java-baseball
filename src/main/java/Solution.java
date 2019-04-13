import java.util.Scanner;

public class Solution {

    public static void main(String args[]) {

        InputHandler.getGameNumberFromUser();
        InputHandler.getChoiceFromUser();
        System.out.println(GameNumber.generateGameNumber());
    }

}
