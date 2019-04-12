public class Solution {

    public static void main (String args[]) {
        String number = InputHandler.getBaseballNumberFromUser();
        System.out.println("number is " + number);

        BaseballNumber baseballNumber = new BaseballNumber();
        System.out.println(baseballNumber);

        BaseballResult baseballResult = new BaseballResult(number,
                baseballNumber.toString());
        System.out.println(baseballResult);
        int choice = InputHandler.askUserToStopGameOrNot();
        System.out.println("choice is " + choice);

    }

}
