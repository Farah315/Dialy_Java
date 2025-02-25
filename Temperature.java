/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farah;
//فرح خليل حسن طبل

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
