/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geometryapp;
 
import java.util.Scanner;

/**
 *
 * @author Al-Qema
 */
public class GeometryApp {
// 2320230929فرح خليل حسن طبل

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        while (true) {
            System.out.println("Geometry Calculator");
            System.out.println("1- Calculate the Area of a Circle");
            System.out.println("2- Calculate the Area of a Rectangle ");
            System.out.println("3- Calculate the Area of a Triangle");
            System.out.println("4- Quit");
            if (!k.hasNextInt()) {
                System.out.println("error");
            }
            int choice = k.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("enter the Radius");
                    int radius = k.nextInt();
                    geometry.getArea(radius);
                    break;
                case 2:
                    System.out.println("enter the Length");
                    int lenght = k.nextInt();
                    System.out.println("enter the Width");
                    int width = k.nextInt();
                    geometry.getArea(lenght, width);
                    break;
                case 3:
                    System.out.println("enter the Base");
                    double base = k.nextInt();
                    System.out.println("enter the Height");
                    int height = k.nextInt();
                    geometry.getArea(base, height);
                    break;
                case 4:
                    System.out.println("have a good day! , see u later");
                    return;

                default: // 2320230929فرح خليل حسن طبل

                    System.out.println("wrong index , choose from 1..4");
            }
        }

    }

}
