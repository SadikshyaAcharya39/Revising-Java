package level6;

public class Car {
    String color;
    int year;

    void drive(){
        System.out.println("Driving the " + color + " car ");
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.color = " Red ";
        car1.year = 2023;
        car2.color = " Blue ";
        car2.year = 2024;

//        car1.drive();
        car2.drive();
    }
}
