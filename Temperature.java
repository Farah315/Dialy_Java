
package farah;
public class Temperature {
    private double ftemp;  
    public Temperature(double f) {
        ftemp = f;
    }

    public void setFahrenheit(double f) {
        ftemp = f;
    }

    public double getFahrenheit() {
        return ftemp;
    }

    public double getCelsius() {
        return (5.0 / 9.0) * (ftemp - 32);
    }

    public double getKelvin() {
        return ((5.0 / 9.0) * (ftemp - 32)) + 273.15;  
    }
}
