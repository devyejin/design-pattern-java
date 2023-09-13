package observer.dice;

import java.util.Iterator;
import java.util.Random;

public class FairDiceGame extends DiceGame {

    private Random random = new Random();


    @Override
    public void play() {

        int diceNumber = random.nextInt(6) + 1;
        System.out.println("주사위 던짐, 주사위 결과 : " + diceNumber );

        //Obsserver들에게 알려주기
        Iterator<Player> iter = playerList.iterator();
        while (iter.hasNext()) {

            iter.next().update(diceNumber);
        }
    }
}
