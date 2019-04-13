public class Game {

    Choice doGame(GameNumber generatedNumber) {
        GameResult gameResult = new GameResult(InputHandler.getGameNumberFromUser(),
                generatedNumber);
        System.out.println(gameResult.toString());
        if(gameResult.isAllStrike()) {
            return InputHandler.getChoiceFromUser();
        }

        return doGame(generatedNumber);
    }
}
