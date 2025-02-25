package RetailItemTest;
public class RetailItem1 {
    private String description;
    private int unitsOnHand;
    private double price;

    public RetailItem1(String description, int unitsOnHand, double price) {
        this.description = description;
        this.unitsOnHand = unitsOnHand;
        this.price = price;
    }
 public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
public void setUnitsOnHand(int unitsOnHand) {
        this.unitsOnHand = unitsOnHand;
    }

    public int getUnitsOnHand() {
        return unitsOnHand;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
   

    
    
