/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgclass;
//فرح خليل حسن طبل

public class Square {

    private double sideLength;

    public Square() {
        this.sideLength = 0.0;
    }
 // Overloaded
    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getArea() {
        return sideLength * sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }
}
