package level6;

public class MethodCreation {

    public void greet(String name){
        System.out.println("Namaste!!!, What\'s your name ? ");
        System.out.println("My name is " + name);
    }

    public static  void greeting(String greeting){
        System.out.println(greeting + "Welcome to Java Programming!!!");
    }

    public static void main(String[] args) {
        MethodCreation methodCreation = new MethodCreation();
        methodCreation.greet("Sadikshya Acharya");

        greeting("Hello ");

    }
}
