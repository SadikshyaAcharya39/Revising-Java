package level6;

public class Vehicle
{
    protected String brand = "Ford";

    public void honk(){
        System.out.println("Tutt tutt");
    }
}

class Cars extends Vehicle {
    private String modelName = "Mustang";

    public static void main(String[] args) {
    Cars cars = new Cars();
    System.out.println(cars.brand);
    System.out.println(cars.modelName);
    cars.honk();

    }
}





