
import java.util.Scanner;

public class MonthDaysApp {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a month (1-12): ");
        int month = s.nextInt();
        System.out.print("Enter a year: ");
        int year = s.nextInt();
        MonthDays monthDays = new MonthDays(year, month);
        System.out.println(monthDays.getNumberOfDays() + " days");

    }
}
