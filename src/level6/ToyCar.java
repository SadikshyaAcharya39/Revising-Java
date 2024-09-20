package level6;

public class ToyCar {
    private String color;
    private int wheels;

    public ToyCar(String color, int wheels){
        this.color = color;
        this.wheels = wheels;
    }

    public String getColor(){
        return  color;
    }

    public int getWheels(){
        return  wheels;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setWheels(int wheels){
        this.wheels = wheels;
    }

    public static void main(String[] args) {
        // Create an object
        ToyCar toyCar = new ToyCar("Blue", 3);

        // Access and print the toy car's properties
        System.out.println(toyCar.getColor());
        System.out.println(toyCar.getWheels());

        toyCar.setColor("Green");
        toyCar.setWheels(4);

        // Access and print the toy car's properties
        System.out.println(toyCar.getColor());
        System.out.println(toyCar.getWheels());

    }
}
