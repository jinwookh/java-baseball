public class Game {

    static Choice doGame(GameNumber generatedNumber) {
        GameResult gameResult = new GameResult(InputHandler.getGameNumberFromUser(),
                generatedNumber);
        System.out.println(gameResult.toString());
        if(gameResult.isAllStrike()) {
            return InputHandler.getChoiceFromUser();
        }

        return doGame(generatedNumber);
    }

    static void start() {
        Choice choice = doGame(GameNumber.generateGameNumber());
        if(choice.saysGo()) {
            start();
        }
        return;
    }
}
