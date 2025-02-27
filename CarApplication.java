/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carapplication;

/**
 *
 * @author Al-Qema
 */
public class CarApplication {
// فرح خليل حسن طبل  2320230929
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    car car1 = new car("Ferrari SF90 Stradale" , "2019" , 515000.0);
    car car2 = new car("Mercedes-Benz C300" , "2024" , 55000.0);
    System.out.println("The Real Price To Ferrari SF90 Stradale is : " + car1.getPrice() );
    System.out.println("The Real Price To Mercedes-Benz C300 is : " + car2.getPrice() );
    
    // الخصم
    car1.discount(5.0);
    car2.discount(7.0);
    
    
    System.out.println("The New Price To Ferrari SF90 Stradale is : " + car1.getPrice() );
    System.out.println("The New Price To Mercedes-Benz C300 is : " + car2.getPrice() );
    // فرح خليل حسن طبل  2320230929
    }
    
}
