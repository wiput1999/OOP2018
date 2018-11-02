package guessingGame;

import java.util.Random;
import java.util.Scanner;

public class TeerapatNumberGame extends NumberGame {

    private int upperBound;
    private int secret;
    private int count;

    public TeerapatNumberGame() {
        this(100);
    }

    public TeerapatNumberGame(int upperBound) {
        this.upperBound = upperBound;
        this.secret = (new Random()).nextInt(upperBound) + 1;
    }

    @Override
    public int getUpperBound() {
        return upperBound;
    }

    @Override
    public boolean guess(int number) {
        count++;
        if (number == secret) {
            setMessage("Right! The secret number is " + secret + ".");
            return true;
        } else if (number < secret) {
            setMessage("Sorry, too small.");
        } else /* (number > secret) */ {
            setMessage("Sorry, too large.");
        }
        return false;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Guessing the Number";
    }
}
