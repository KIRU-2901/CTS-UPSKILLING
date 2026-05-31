import java.util.Random;
import java.util.Scanner;
public class NumberGuessing {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the guess number: " );
        int guessnumber = scanner.nextInt();
        while(guessnumber != numberToGuess) {
            if(guessnumber < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
            guessnumber = scanner.nextInt();
        }
        System.out.println("Congratulations! You guessed the number.");
    }
}
