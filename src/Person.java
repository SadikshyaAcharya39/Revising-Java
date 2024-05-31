/*Suppose sam is an object of a class named Person and supposemincreaseAge is a method for the class Person that takes one
argument that is an integer. How do you write an invocation of the
method increaseAge using sam as the calling object and using the
argument 10? The method increaseAge will change the data in
sam so that it simulates sam aging by 10 years

*/

public class Person {

    private int age;

// Constructor to initialize the age
    public Person(int age) {
        this.age = age;
    }


    // Method to increase the age
    public void increaseAge(int years){
        this.age += years;
    }

    // Getter method to retrieve the age

    public int getAge(){
        return age;
    }

    public static void main(String[] args) {

        // Create an instance of Person

        Person sam = new Person(30);

        // Invoke increaseAge on sam with the argument 10

        sam.increaseAge(10);

        //Print the updated age to verify the change
        System.out.println("Sam's Age: " + sam.getAge());
    }
}
