package farah;

import RetailItemTest.RetailItem1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Al-Qema
 */
public class RetailItemT {
//فرح خليل حسن طبل

    public static void main(String[] args) {

        RetailItem1 item1 = new RetailItem1("Jacket", 12, 59.95);
        RetailItem1 item2 = new RetailItem1("Designer Jeans", 40, 34.95);
        RetailItem1 item3 = new RetailItem1("Shirt", 20, 24.95);

        System.out.printf("%-10s %-20s %-15s %-10s%n", "", "Description", "Units On Hand", "Price");
        System.out.println("-----------------------------------------------------------");
        System.out.printf("%-10s %-20s %-15d %-9.2f%n", "Item #1", item1.getDescription(), item1.getUnitsOnHand(), item1.getPrice());
        System.out.printf("%-10s %-20s %-15d %-9.2f%n", "Item #2", item2.getDescription(), item2.getUnitsOnHand(), item2.getPrice());
        System.out.printf("%-10s %-20s %-15d %-9.2f%n", "Item #3", item3.getDescription(), item3.getUnitsOnHand(), item3.getPrice());
    }
}
