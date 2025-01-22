class Person {
    String name;
    String phoneNumber;
    String addressCode;

    public Person(String name, String phoneNumber, String addressCode) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.addressCode = addressCode;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address Code: " + addressCode);
        System.out.println("------------------------");
    }
}

public class demo022{ 
    public static void main(String[] args) {
        Person[] people = new Person[5];

        people[0] = new Person("prakash", "123-456-7890", "A101");
        people[1] = new Person("raghupathi", "234-567-8901", "B202");
        people[2] = new Person("yoga", "345-678-9012", "C303");
        people[3] = new Person("chetan", "456-789-0123", "D404");
        people[4] = new Person("ajay", "567-890-1234", "E505");

        for (Person person : people) {
            person.displayDetails();
        }
    }
}