
package pkgclass;

public class Class {

    public static void main(String[] args) {
        Pet myPet = new Pet();

        myPet.setName("Vic");
        myPet.setAnimal("cat");
        myPet.setAge(5);
        System.out.println("Pet Name: " + myPet.getName());
        System.out.println("Pet Animal: " + myPet.getAnimal());
        System.out.println("Pet Age: " + myPet.getAge());
    }
}
