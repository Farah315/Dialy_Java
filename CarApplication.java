
package carapplication;

public class CarApplication {

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

    }
    
}
