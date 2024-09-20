package level6;

abstract class Animalss {

    // Abstract Method ( does have a body )
    public abstract void sound();

    // Regular Method
    public void sleep(){
        System.out.println("This animal sleeps.");
    }
}

class Dog extends Animalss{
    public void sound(){
        System.out.println("The dog barks.");
    }
}

class Main{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.sleep();
    }
}
