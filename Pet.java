/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgclass;
//فرح خليل حسن طبل
public class Pet {
    private String name;
    private String animal;
    private int age;

    public Pet(String name, String animal, int age) {
        this.name = name;
        this.animal = animal;
        this.age = age;
    }

    Pet() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getAnimal() {
        return animal;
    }

    public int getAge() {
        return age;
    }

    // Main method to test the class
    public static void main(String[] args) {
        Pet myPet = new Pet("Whiskers", "Cat", 3);

        System.out.println("Pet Name: " + myPet.getName());
        System.out.println("Pet Type: " + myPet.getAnimal());
        System.out.println("Pet Age: " + myPet.getAge());

        myPet.setAge(4);
        System.out.println("Updated Pet Age: " + myPet.getAge());
    }
}

    

