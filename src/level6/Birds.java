package level6;

public class Birds {
    protected String color;

}

class Parrot extends Birds{
    private String name = "Pegasus";

    public void print(){
        System.out.println("Name of Parrot is: " + name + "    Colour: " + color);
    }
}

class Pigeon extends Birds{
    private String name = "Summs";

    public void display(){
        System.out.println("Name of pigeon is: " + name + "     Colour: " + color);
    }
}

class Sparrow extends Birds{
    private String name = "Lunkyy";

    public void printingName(){
        System.out.println("Name of sparrow is: " + name + "   Colour: " + color);
    }
}

class MainClass{
    public static void main(String[] args) {

        Parrot parrot = new Parrot();
        parrot.color = "Light Green";
        parrot.print();

        Pigeon pigeon = new Pigeon();
        pigeon.color = "White";
        pigeon.display();

        Sparrow sparrow = new Sparrow();
        sparrow.color = "Brown";
        sparrow.printingName();
    }
}
