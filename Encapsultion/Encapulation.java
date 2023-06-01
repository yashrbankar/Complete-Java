class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }
}

public class Encapulation {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setAge(30);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}

/*
combines data and methods within a single unit called a class.
providing data hiding and abstraction
In Java, encapsulation is achieved through the use of access modifiers and getter and setter methods.

By encapsulating the name and age variables and providing controlled access through getter and setter methods, we ensure that other classes can't directly modify the internal state of a Person object. 

This data hiding helps maintain the integrity of the object's state and prevents unauthorized modifications.


*/


