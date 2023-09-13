package observer.dice;

/*
 게임 참가자 (Observer)
 */
public abstract class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void update(int diceNumber); //상태변화 (주사위 수)
}
