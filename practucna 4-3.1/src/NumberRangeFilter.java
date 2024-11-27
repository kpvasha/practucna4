import java.util.Scanner;

public class NumberRangeFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть початок діапазону: ");
        int start = scanner.nextInt();
        System.out.print("Введіть кінець діапазону: ");
        int end = scanner.nextInt();
        System.out.print("Введіть просте число (від 1 до 9): ");
        int prime = scanner.nextInt();

        System.out.println("Числа в діапазоні, крім тих, що кратні " + prime + ":");
        for (int i = start; i <= end; i++) {
            if (i % prime == 0) {
                continue;
            }
            System.out.print(i + " ");
        }

        scanner.close();
    }
}