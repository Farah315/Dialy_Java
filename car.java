
package carapplication;

public class car {
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


    public void discount(Double d) {
        price -= price * (d / 100);
    }
}

