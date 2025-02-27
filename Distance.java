
package distance;
 import java.util.Scanner;

public class Distance {

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

    }

}
