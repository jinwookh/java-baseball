import java.util.Scanner;

public class Solution {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        try {
            GameNumber gameNumber = new GameNumber(input);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
