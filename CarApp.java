
package pkgclass;

public class CarApp {
  public static void main(String[] args) {
        Car myCar = new Car(2022, "Ferrari");

        System.out.println("Car Details:");
        System.out.println("Year Model: " + myCar.getYearModel());
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Initial Speed: " + myCar.getSpeed() + " mph");
        System.out.println();

        System.out.println("Accelerating...");
        for (int i = 1; i <= 5; i++) {
            myCar.accelerate();
            System.out.println("Speed after acceleration " + i + ": " + myCar.getSpeed() + " mph");
        }
        System.out.println();
        System.out.println("Braking...");
        for (int i = 1; i <= 5; i++) {
            myCar.brake();
            System.out.println("Speed after brake " + i + ": " + myCar.getSpeed() + " mph");
        }
    }
}  

