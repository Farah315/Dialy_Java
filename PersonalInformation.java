
package pkgclass;
public class PersonalInformation {
    private String name; 
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private String address; 
    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    private int age; 
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    private String phoneNumber;
 
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public PersonalInformation(String name, String address, int age, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println();
    }
}
