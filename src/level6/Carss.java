package level6;

//public class Carss {
////    static int x = 20;
////
////    public static void main(String[] args) {
////        Carss carss = new Carss();
////        carss.x = 333;
////        System.out.println(carss.x);
//
////        System.out.println(x);
////        System.out.println(Carss.x);
//
//    }
//}


public class Carss{
    String model;
    int year;
    double price;

    public void start(){
        System.out.println("Car is starting...");
    }

    public void displayDetails(){
        System.out.println("Model:" + model);
        System.out.println("Year:" + year);
        System.out.println("Price:" + price);
    }

    public static void main(String[] args) {
        Carss carss = new Carss();
        carss.model = "Chevrolet Equinox";
        carss.year = 2020;
        carss.price = 2000000.00;
        carss.start();
        carss.displayDetails();
    }
}
