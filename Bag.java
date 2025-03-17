package treasurebag;


public class Bag<T> {

    private Treasure[] items;
    private int size;

    public Bag(int capacity) {
        items = new Treasure[capacity];
        size = 0;
    }

    public void addTreasure(Treasure treasure) {
        for (int i = 0; i < size; i++) {
            if (items[i].name.equals(treasure.name)) {
                items[i].increaseCount();
                return;
            }
        }
        if (size < items.length) {
            items[size++] = treasure;
        }
    }

    public void removeTreasure(String name) {
        for (int i = 0; i < size; i++) {
            if (items[i].name.equals(name)) {
                items[i].decreaseCount();
                if (items[i].count == 0) {
                    items[i] = items[size - 1];
                    items[size - 1] = null;
                    size--;
                }
                return;
            }
        }
        System.out.println("Treasure not found.");
    }

    public void displayTreasures() {
        if (size == 0) {
            System.out.println("The chest is empty.");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(items[i]);
        }
    }

    public Treasure findMostFrequentTreasure() {
        if (size == 0) {
            return null;
        }
        Treasure mostFrequent = items[0];
        for (int i = 1; i < size; i++) {
            if (items[i].count > mostFrequent.count) {
                mostFrequent = items[i];
            }
        }
        return mostFrequent;
    }

    public void distributeTreasuresRandomly(String[] treasureNames) {
        for (String treasureName : treasureNames) {
            addTreasure(new Treasure(treasureName)); 
        }

        for (String treasureName : treasureNames) {
            int extraCount = (int) (Math.random() * 4); 
            for (int j = 0; j < extraCount; j++) {
                addTreasure(new Treasure(treasureName));
            }
        }
    }

}
