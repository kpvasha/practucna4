import java.util.Scanner;

public class DateComparison Update {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення двох дат
        System.out.println("Введіть першу дату (день.місяць.рік):");
        String date1 = scanner.nextLine();
        System.out.println("Введіть другу дату (день.місяць.рік):");
        String date2 = scanner.nextLine();

        // Порівняння дат
        if (date1.equals(date2)) {
            System.out.println("Дати однакові.");
        } else if (date1.compareTo(date2) < 0) {
            System.out.println("Перша дата раніша за другу.");
        } else {
            System.out.println("Друга дата раніша за першу.");
        }

        scanner.close();
    }
}
