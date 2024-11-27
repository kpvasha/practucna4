import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int targetNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int guess;

        System.out.println("Вгадайте число від 1 до 100!");

        do {
            System.out.print("Введіть ваше число: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < targetNumber) {
                System.out.println("Число більше!");
            } else if (guess > targetNumber) {
                System.out.println("Число менше!");
            } else {
                System.out.println("Вітаємо! Ви вгадали число за " + attempts + " спроб.");
            }
        } while (guess != targetNumber);

        scanner.close();
    }
}