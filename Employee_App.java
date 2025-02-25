
package pkgclass;
public class Employee_App {
    public static void main(String[] args) {
     
        Employee employee1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee employee2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee employee3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");

        System.out.printf("%-20s %-12s %-20s %-15s\n", "Name", "ID Number", "Department", "Position");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-20s %-12d %-20s %-15s\n", employee1.getName(), employee1.getIdNumber(), employee1.getDepartment(), employee1.getPosition());
        System.out.printf("%-20s %-12d %-20s %-15s\n", employee2.getName(), employee2.getIdNumber(), employee2.getDepartment(), employee2.getPosition());
        System.out.printf("%-20s %-12d %-20s %-15s\n", employee3.getName(), employee3.getIdNumber(), employee3.getDepartment(), employee3.getPosition());
    }
}


