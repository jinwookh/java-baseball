public class Game {

    public static Choice doGame(String generatedNumber) {
        String userNumber = InputHandler.getGameNumber();
        GameResult gameResult = new GameResult(userNumber, generatedNumber);
        gameResult.show();
        if (gameResult.isAllStrike()) {
            Choice choice = InputHandler.getChoice();
            return choice;
        }
        return doGame(generatedNumber);
    }
    /*
    public static start() {

    }
    */
}
