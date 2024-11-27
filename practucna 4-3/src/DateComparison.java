import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть першу дату (день.місяць.рік):");
        String[] date1 = scanner.nextLine().split("\\.");
        System.out.println("Введіть другу дату (день.місяць.рік):");
        String[] date2 = scanner.nextLine().split("\\.");

        int day1 = Integer.parseInt(date1[0]);
        int month1 = Integer.parseInt(date1[1]);
        int year1 = Integer.parseInt(date1[2]);

        int day2 = Integer.parseInt(date2[0]);
        int month2 = Integer.parseInt(date2[1]);
        int year2 = Integer.parseInt(date2[2]);

        if (year1 < year2 || (year1 == year2 && (month1 < month2 || (month1 == month2 && day1 < day2)))) {
            System.out.println("Перша дата раніша за другу.");
        } else if (year1 == year2 && month1 == month2 && day1 == day2) {
            System.out.println("Дати однакові.");
        } else {
            System.out.println("Друга дата раніша за першу.");
        }

        scanner.close();
    }
}