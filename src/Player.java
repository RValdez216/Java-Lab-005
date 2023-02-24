public class Player {
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return score;
    }

    public void toss(Dice dice) {
        dice.roll();
        this.score = dice.view();
    }
}
