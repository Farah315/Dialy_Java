
package farah;
public class Payroll {
    private String employeeName;
    private int idNumber;
    private double hourlyPayRate;
    private double hoursWorked;
    public Payroll(String employeeName, int idNumber) {
        this.employeeName = employeeName;
        this.idNumber = idNumber;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }
public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
    public int getIdNumber() {
        return idNumber;
    }
public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }
    public double getHourlyPayRate() {
        return hourlyPayRate;
    }
public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }
 public double calculateGrossPay() {
        return hourlyPayRate * hoursWorked;
    }
}    
   
    

    

    

    
    
