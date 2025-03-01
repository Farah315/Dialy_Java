
package pkgclass;

public class Square {

    private double sideLength;

    public Square() {
        this.sideLength = 0.0;
    }
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
