package guessingGame;

/**
 * A main class for the GuessingGame. It is responsible for creating objects,
 * connecting objects, and running the game UI.
 */
public class Main {

    public static void main(String[] args) {
        // upper limit for secret number in guessing game
        int upperBound = 100;
        NumberGame game = new TeerapatNumberGame(upperBound);
        GameConsole ui = new GameConsole();
        int solution = ui.play(game);

        //TODO display how many guesses the user made
        System.out.println("Answer is " + solution);
        System.out.println("You've played " + game.getCount() + " times.");
    }
}
