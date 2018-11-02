package guessingGame;

import java.util.Random;

public class WiputGame extends NumberGame {

    private int upperBound;

    private int secret;

    private int count = 0;

    public WiputGame() {
        this(100);
    }

    public WiputGame(int upperbound) {
        this.upperBound = upperbound;
        long seed = System.nanoTime();
        Random rand = new Random(seed);
        this.secret = rand.nextInt(upperbound) + 10;
    }

    @Override
    public boolean guess(int number) {
        count++;
        if (number == secret) {
            setMessage("Correct! The decimal value is " + secret);
            return true;
        }
        if (number < 3 * secret / 4) {
            setMessage("Woah! Your answer is WAY too small.");
        } else if (number < secret) {
            setMessage("Your answer is too small.");
        } else if (number > secret * 4 / 3) {
            setMessage("No way! Your answer is WAY too large.");
        } else /* if (number > secret) */ {
            setMessage("Your answer is too large.");
        }
        return false;
    }

    @Override
    public int getUpperBound() {
        return upperBound;
    }

    public int getCount() {
        return count;
    }

    public int getSecret() {
        return secret;
    }

    @Override
    public String toString() {
        return "Guess decimal number from 1 to upperbound.";
    }
}
