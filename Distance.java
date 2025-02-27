/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package distance;
 import java.util.Scanner;

/**
 *
 * @author Al-Qema
 */
public class Distance {
// 2320230929فرح خليل حسن طبل

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner k = new Scanner(System.in);
        Distance_c d1 = new Distance_c();
        System.out.println("Enter feet for Distance :");
        Double feet = k.nextDouble();
        System.out.println("Enter inches for Distance :");
        Double inches = k.nextDouble();
        Distance_c d2 = new Distance_c(feet, inches);
        d2.setFeet(feet);
        d2.setInches(inches);
        System.out.println("The Distances :");
        d1.display();
        d2.display();

       // 2320230929فرح خليل حسن طبل
  
    }

}
