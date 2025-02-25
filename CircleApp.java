
package farah;


import java.util.Scanner;

public class CircleApp {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = s.nextDouble();

        Circle circle = new Circle(radius);

        System.out.println("Circle Properties:");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Diameter: " + circle.getDiameter());
        System.out.println("Circumference: " + circle.getCircumference());

    }
}
