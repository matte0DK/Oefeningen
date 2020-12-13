package be.intecbrussel.hoofdstuk08_09.associaties;


import java.util.Random;

public class HigherLowerGame {
    private int value;
    private int max;
    private Random rand;

    public HigherLowerGame(int max) {
        this.max = max;
        this.rand = new Random();
        reset();
    }

    public void reset() {
        value = rand.nextInt(max + 1);
    }

    public int guess(int guessedValue) {
        if (guessedValue < value) {
            return -1;
        } else if (guessedValue < value) {
            return 1;
        } else {
            return 0;
        }
    }
}
