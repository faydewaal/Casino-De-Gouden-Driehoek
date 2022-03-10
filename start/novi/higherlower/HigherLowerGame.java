package novi.higherlower;

import java.util.Scanner;

public class HigherLowerGame {
    private Scanner inputScanner;

    private boolean gameIsRunning;
    privite int numberToGuess;
    private int numberOfTurn;

    public HigherLowerGame(Scanner inputScanner) {
        this.inputScanner = inputScanner;
    }

    public void playGame() {
        gameIsRunning = true;
        numberToGuess = new Random().nextInt(100);
        numberOfTurn = 0

        while (gameIsRunning) {
            System.out.println("Make a guess");

            var input = inputScanner.nextLine();
            System.out.printf("You typed: %s\n", input);

            // Check if the guess is correct, if so end the game
        }
    }

    private void performGuess(int guess)
        numberOfRuns++;

        if (guess == numberToGuess) {
            gameIsRunning = false;
        System.out.println("Correct! You guessed te number in %d turn\n", numberOfTurns);
        }   else if (guess > numberToGuess) {
        System.out.println("The number is to high");
        } else {
        System.out.println("The number is to low");
        }
}
