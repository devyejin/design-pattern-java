package observer.dice;

public class OddBettingPlayer extends Player {


    public OddBettingPlayer(String name) {
        super(name);
    }

    @Override
    public void update(int diceNumber) {

        //홀수라는 상태변화를 감지했을 때의 동작(내가이겼어!)
        if(diceNumber % 2 == 1) {
            System.out.println(getName() + "가 이겼어!");
        }

    }
}
