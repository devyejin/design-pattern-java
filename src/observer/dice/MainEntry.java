package observer.dice;

public class MainEntry {

    public static void main(String[] args) {
        DiceGame diceGame = new FairDiceGame();

        Player player1 = new EvenBettingPlayer("도박꾼1");
        Player player2 = new EvenBettingPlayer("도박꾼2");
        Player player3 = new EvenBettingPlayer("도박꾼3");
        Player player4 = new OddBettingPlayer("도박꾼4");

       diceGame.addPlayer(player1);
       diceGame.addPlayer(player2);
       diceGame.addPlayer(player3);
       diceGame.addPlayer(player4);


        for(int i=0; i<5; i++) {
            diceGame.play();
            System.out.println("=====" + (i+1) +"회차 종료 ======");
        }

    }
}
