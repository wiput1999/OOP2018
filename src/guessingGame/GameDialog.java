package guessingGame;

import javax.swing.*;

/**
 *
 * @author wiput
 */
public class GameDialog {

    private int guess;

    private void getGuess() {
        String userGuess = JOptionPane.showInputDialog(null, "Your answer", "Your answer?", JOptionPane.QUESTION_MESSAGE);
        if (userGuess == null) {
            System.exit(0);
        } else {
            guess = Integer.valueOf(userGuess);
        }
    }

    private void getPlayAgain() {
        int opt = JOptionPane.showConfirmDialog(null, "Do you want to play again?", "Guessing Game", JOptionPane.YES_NO_OPTION);
        if (opt == JOptionPane.NO_OPTION) {
            System.exit(0);
        }
    }

    private void showGameMessage(String message) {
        JOptionPane.showMessageDialog(null, message, "Guessing Game", JOptionPane.INFORMATION_MESSAGE);
    }

    public int play(NumberGame game) {

        // describe the game
        showGameMessage(game.toString());

        for (;;) {
            getGuess();
            boolean correct = game.guess(guess);
            showGameMessage(game.getMessage());
            if (correct) {
                break;
            } else {
                getPlayAgain();
            }
        }

        return guess;
    }

    public static void main(String[] args) {
        // upper limit for secret number in guessing game
        int upperBound = 100;
        NumberGame game = new WiputGame(upperBound);
        GameDialog ui = new GameDialog();
        ui.play(game);

        ui.showGameMessage("You've played " + game.getCount() + " times.");
    }
}
