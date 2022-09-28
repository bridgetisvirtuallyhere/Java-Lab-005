//Bridget Acosta
// 9/28/2022

public class Player {
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }
    public String getName() {
        System.out.println(name);
        return name;
    }
    public int getScore() {
        System.out.println(score);
        return score;
    }
    public void toss(Dice d1) {
        d1.roll();
        score = d1.view();
        System.out.println(score);
    }
}
