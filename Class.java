/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgclass;

/**
 *
 * @author Al-Qema
 */
public class Class {

    public static void main(String[] args) {
        Pet myPet = new Pet();

        myPet.setName("Buddy");
        myPet.setAnimal("Dog");
        myPet.setAge(5);
        System.out.println("Pet Name: " + myPet.getName());
        System.out.println("Pet Animal: " + myPet.getAnimal());
        System.out.println("Pet Age: " + myPet.getAge());
    }
}
