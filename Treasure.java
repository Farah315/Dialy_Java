
package treasurebag;

public class Treasure {
    String name;
    int count ;

    public Treasure(String name) {
        this.name = name;
        this.count = 1;
    }

    public void increaseCount() {
        count++;
    }

    public void decreaseCount() {
        count--;
    }

    public String toString() {
        return name + " - " + count + " times";
    }
}
   
