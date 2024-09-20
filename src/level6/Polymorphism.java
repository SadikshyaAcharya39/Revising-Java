package level6;

public class Polymorphism {
    String name;

    // Method Overriding

    public void greet(){
        System.out.println("Hello " + name);
    }
}

class Polymorphism1 extends Polymorphism{
    @Override
    public void greet(){
        System.out.println("Namaste " + name);
    }
}

class Polymorphism2 extends Polymorphism{
    @Override
    public void greet(){
        System.out.println("Hey " + name);
    }
}

class MainClass1{
    public static void main(String[] args) {
        Polymorphism polymorphism1 = new Polymorphism();
        polymorphism1.name = "Sadikshya";
        polymorphism1.greet();

        Polymorphism polymorphism2 = new Polymorphism();
        polymorphism2.name = "Shraddha";
        polymorphism2.greet();

        Polymorphism polymorphism3 = new Polymorphism();
        polymorphism3.name = "Narayani";
        polymorphism3.greet();

    }
}
