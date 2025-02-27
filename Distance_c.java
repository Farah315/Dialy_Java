/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distance;
 

/**
 *
 * @author Al-Qema
 */
public class Distance_c {
// 2320230929فرح خليل حسن طبل
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
// 2320230929فرح خليل حسن طبل
    public void display() {
        System.out.println("Distance: " + feet + " feet " + inches + " inches");
    }
    
 

}
