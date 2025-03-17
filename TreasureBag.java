
package treasurebag;

import java.util.Scanner;

public class TreasureBag {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Bag<Treasure> bag = new Bag<>(10);

        String[] treasureTypes = {"Sword", "Shield", "Maps", "Gold Coins"};
        bag.distributeTreasuresRandomly(treasureTypes);

        while (true) {
            System.out.println("--- Treasure Chest ---");
            System.out.println("1. Add a new treasure");
            System.out.println("2. Remove a treasure");
            System.out.println("3. Display treasures");
            System.out.println("4. Find the most frequent treasure");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = s.nextInt();
            s.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter treasure name to add: ");
                    String addName = s.nextLine();
                    bag.addTreasure(new Treasure(addName));
                    break;

                case 2:
                    System.out.print("Enter treasure name to remove: ");
                    String removeName = s.nextLine();
                    bag.removeTreasure(removeName);
                    break;

                case 3:
                    bag.displayTreasures();
                    break;

                case 4:
                    Treasure frequent = bag.findMostFrequentTreasure();
                    if (frequent != null) {
                        System.out.println("Most frequent: " + frequent);
                    } else {
                        System.out.println("No treasures.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting game.");

                    return;

                default:
                    System.out.println("Invalid option. Please enter a number from 1 to 5.");
            }
        }
    }
}
