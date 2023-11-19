import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10;
        int rounds = 0;
        int totalAttempts = 0;

        boolean playAgain = true;

        while (playAgain) {
           int generatedNumber = random.nextInt(maxRange - minRange + 1) + minRange;
           int attempts = 0;

    System.out.println("Welcome to the Number Guessing Game!");
    System.out.println("Guess the number between " + minRange + " and " + maxRange);

            while (true) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == generatedNumber) {
                    System.out.println("Congratulations! You guessed the correct"
                    		+ " number in "
                + attempts + " attempts.");
                    totalAttempts += attempts;
                    break;
                } else if (userGuess < generatedNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                if (attempts == maxAttempts) {
                    System.out.println("Sorry, you've reached the maximum number "
                    + "of attempts. The correct number was " + generatedNumber);
                    break;
                }
            }

            rounds++;

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            playAgain = playAgainInput.equals("yes");
        }

        System.out.println("Thanks for playing! Your total score is based on "
        		+ "the total attempts: " + totalAttempts);
        System.out.println("You played " + rounds + " rounds.");
        scanner.close();
}

}



