//Bridget Acosta
// 9/28/2022

import java.util.Random;

public class Dice {
    private int sideFacingUp;
    private int sides;
    private Random randomGenerator;

    public Dice(int sides) {
        this.sides = sides;
    }

    public void roll() {
        Random randomGenerator = new Random(); //instance of random class
        int upperbound = sides;
        sideFacingUp = randomGenerator.nextInt(upperbound);
    }

    public int view() {
        return sideFacingUp;
    }
}
