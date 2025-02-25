package farah;
//فرح خليل حسن طبل

import java.util.Scanner;

public class TemperatureApp {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = s.nextDouble();
        Temperature temp = new Temperature(fahrenheit);
        System.out.println("\nTemperature Conversions:");
        System.out.println("Fahrenheit: " + temp.getFahrenheit());
        System.out.println("Celsius: " + temp.getCelsius());
        System.out.println("Kelvin: " + temp.getKelvin());

    }

}
