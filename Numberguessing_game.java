import java.util.Random;
import java.util.Scanner;

public class Numberguessing_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int minvalue = 1;
        int maxvalue = 100;
        int max_attempts = 10;
        int rounds = 3;
        int Total_Score = 0;
        System.out.println("Welcome to Number Guessing Game!!");
        for (int round = 1; round <= rounds; round++) {
            int target = random.nextInt(maxvalue - minvalue + 1) + minvalue;
            int attempts = 0;
            System.out.println("\nRound " + round + ":\nGuess the number between " + minvalue + " and " + maxvalue);
            while (attempts < max_attempts) {
                System.out.print("Enter your guess : ");
                int user_guess = sc.nextInt();
                attempts++;
                if (user_guess == target) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    int round_score = max_attempts - attempts + 1;
                    Total_Score += round_score;
                    break;
                } else if (user_guess < target) {
                    System.out.println("Your guess is too LOW.Try again!");
                } else {
                    System.out.println("Your guess is too HIGH.Try again!");
                }
            }
            if (attempts == max_attempts) {
                System.out.println("Sorry!!,You have reached maximum attempts.");
                System.out.println("The correct number was : " + target);
            }
        }
        System.out.println("Game Over! Your total score is : " + Total_Score);
        System.out.println("Please try again!");
    }
}