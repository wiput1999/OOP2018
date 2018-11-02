/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessingGame;

import java.util.Random;

/**
 *
 * @author wiput
 */
public class GameSolver {

    public int play(NumberGame game) {
        int upperbound = game.getUpperBound();

        long seed = System.nanoTime();
        Random rand = new Random(seed);
        int random = rand.nextInt(upperbound) + 10;

        for (;;) {
            System.out.println("Checking " + random);
            boolean correct = game.guess(random);
            System.out.println("Result : " + game.getMessage());
            if (correct) {
                break;
            } else {
                random = rand.nextInt(upperbound) + 10;
            }
        }

        return random;

    }

    public static void main(String[] args) {
        // upper limit for secret number in guessing game
        int upperBound = 100;
        NumberGame game = new WiputGame(upperBound);
        GameSolver ui = new GameSolver();
        ui.play(game);
        System.out.println("You've played " + game.getCount() + " times.");
    }
}
