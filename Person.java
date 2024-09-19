public class Person {
	 // Encapsulated fields
    private String name;
    private int age;
    private String address;

    // Constructor
    public Person (String name, int age, String address) {
        this.name = name;
        setAge(age);  // Using the setter to ensure the validation
        this.address = address;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    // Getter for address
    public String getAddress() {
        return address;
    }

    // Setter for address
    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        // Creating a P object
        Person p = new Person("Diksha", 30, "123 Main St");

        // Accessing fields using getter methods
        System.out.println("Name: " + p.getName());       // Output: Diksha
        System.out.println("Age: " + p.getAge());         // Output: 30
        System.out.println("Address: " + p.getAddress()); // Output: 123 Main St

        // Modifying fields using setter methods
        p.setName("Diksha");
        p.setAge(25);
        p.setAddress("456 Elm St");

        // Accessing modified values
        System.out.println("Updated Name: " + p.getName());       // Output: Diksha
        System.out.println("Updated Age: " + p.getAge());         // Output: 25
        System.out.println("Updated Address: " + p.getAddress()); // Output: 456 Elm St

        // Trying to set a negative age
        p.setAge(-5); // Output: Age cannot be negative.
        System.out.println("Final Age: " + p.getAge()); ; // Output: 25 (unchanged)

    }

}