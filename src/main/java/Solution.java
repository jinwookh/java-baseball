public class Solution {

    public static void main (String args[]) {
        int number = InputHandler.getBaseballNumberFromUser();
        System.out.println("number is " + number);

        BaseballNumber baseballNumber = new BaseballNumber();
        System.out.println(baseballNumber);

        int choice = InputHandler.askUserToStopGameOrNot();
        System.out.println("choice is " + choice);

    }

}
