
package distance;

public class Distance_c {

    private double feet;
    private double inches;

    public void setFeet(double f) {
        feet = f;
    }

    public double getFeet() {
        return feet;
    }

    public void setInches(double i) {
        inches = i;
    }

    public double getInches() {
        return inches;
    }
//no argument

    public Distance_c() {
        feet = 0.0;
        inches = 0.0;
    }
//two argument

    public Distance_c(double f, double i) {
        feet = f;
        inches = i;
    }

    public void display() {
        System.out.println("Distance: " + feet + " feet " + inches + " inches");
    }
    
 

}
