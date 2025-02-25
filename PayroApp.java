
package farah;
import java.util.Scanner;

public class PayroApp {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String name = s.nextLine();
        System.out.print("Enter employee's ID number: ");
        int idNumber = s.nextInt();

        Payroll employee = new Payroll(name, idNumber);
        System.out.print("Enter hourly pay rate: ");
        double hourlyPayRate = s.nextDouble();
        employee.setHourlyPayRate(hourlyPayRate);

        System.out.print("Enter number of hours worked: ");
        double hoursWorked = s.nextDouble();
        employee.setHoursWorked(hoursWorked);
        double grossPay = employee.calculateGrossPay();
        System.out.println("\nEmployee: " + employee.getEmployeeName());
        System.out.println("ID Number: " + employee.getIdNumber());
        System.out.println("Gross Pay: $" + grossPay);

    }
}   

