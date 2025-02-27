/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carapplication;

/**
 *
 * @author Al-Qema
 */
public class car {
// فرح خليل حسن طبل  2320230929
    private String model;
    private String year;
    private Double price;

    public car(String m, String y, Double p) {
        model = m;
        year = y;

        if (p > 0) {
            price = p;
        } else {

            System.out.print("The number u added is nigayive!");
            price =0.0;
        }

    }

    public void setModel(String m) {
        model = m;
    }

    public String getModel() {
        return model;
    }

    public void setYear(String y) {
        year = y;
    }

    public String getYear() {
        return year;
    }

    public void setPrice(Double p) {
        price = p;
    }

    public Double getPrice() {
        return price;
    }
// فرح خليل حسن طبل  2320230929

    public void discount(Double d) {
        price -= price * (d / 100);
    }
}

