public class Solution {

    public static void main(String[] args) {

        GameResult gameResult = new GameResult("123","321");
        System.out.println(gameResult);
        gameResult.show();
        System.out.println(GameNumber.isGenerated());
    }
}
