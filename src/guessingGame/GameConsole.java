package guessingGame;

import java.util.Scanner;

/**
 * Play guessing game on the console.
 */
public class GameConsole {

    private int guess;

    /**
     * play the game.
     */
    public int play(NumberGame game) {
        Scanner console = new Scanner(System.in);

        // describe the game
        System.out.println(game.toString());

        for (;;) {
            System.out.print("Your answer? ");
            guess = console.nextInt();
            boolean correct = game.guess(guess);
            System.out.println(game.getMessage());
            if (correct) {
                break;
            }
        }

        return guess;
    }

}
