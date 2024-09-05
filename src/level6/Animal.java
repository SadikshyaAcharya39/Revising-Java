package level6;

public class Animal {
    String breed;
    String size;
    String colour;

    public Animal(String breed, String size, String colour){
       this.breed = breed;
       this.size = size;
       this.colour = colour;
    }

    public void bark() {
        System.out.println("The dog is barking woof! woof!");
    }

    public void eat(){
        System.out.println("The dog is eating...");
    }

    public void wagTail(){
        System.out.println("The dog is wagging its tail...");
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Labrador", "Large", "Black");
        System.out.println("Animal Breed: " + animal.breed);
        System.out.println("Size of the animal : " + animal.size);
        System.out.println("Color of an animal : " + animal.colour);
        animal.bark();
        animal.eat();
        animal.wagTail();
    }
}
