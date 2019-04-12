public class Game {


    public static void start() {
        BaseballNumber baseballNumber = new BaseballNumber();
        startBaseball(baseballNumber);
        String userNumber = InputHandler.askUserToStopGameOrNot();
        if(userNumber.equals(Integer.toString(Validator.CHOICE_TO_GO))) {
            start();
        }
        return;
    }

    private static void startBaseball(BaseballNumber baseballNumber) {
        String userNumber = InputHandler.getBaseballNumberFromUser();
        BaseballResult baseballResult =
                new BaseballResult(userNumber, baseballNumber.toString());
        System.out.println(baseballResult.toString());
        if(baseballResult.isAllStrike()) {
            return;
        }
        startBaseball(baseballNumber);
    }






}
