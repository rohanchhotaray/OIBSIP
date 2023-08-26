
import java.util.Random;
import java.util.Scanner;

public  class number_guessing  {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int rangeStart = 1;
        int rangeEnd = 100;
        int targetNumber = random.nextInt(rangeEnd - rangeStart + 1) + rangeStart;
        int attempts = 0;
        int maximumAttempts = 5;

        System.out.println("Hello Guess Number!");
        System.out.println("I'm thinking of a number between " + rangeStart + " and " + rangeEnd);
        System.out.println("Can you guess it?");

        while(attempts < maximumAttempts){
            System.out.println("Enter your guess");
            int guess = scanner.nextInt();
            scanner.nextLine();

            attempts++;

            if(guess == targetNumber){
                System.out.println("Congratulations! You guessed the number correctly");
                System.out.println("You took " + attempts + "attempts to guess the number");
                break;
            }else if (guess  < targetNumber){
                System.out.println("Too low! Try a higher number");
            }else{
                System.out.println("Too high! Try a lower number");
            }

            if(attempts == maximumAttempts){
                System.out.println("Sorry,You have reached the maximum number of attempts");
                System.out.println("The number I was thinking of was "+ targetNumber);
            }
        }

        scanner.close();
    }
}
