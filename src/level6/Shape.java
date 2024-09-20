package level6;

interface Shape {
    void draw();  // Interface method ( no body )
}

class Circle implements Shape{
    public void draw(){
        System.out.println(" Drawing a circle... ");
    }
}

class Square implements Shape{
    public void draw(){
        System.out.println(" Drawing a square...");
    }
}

class MainClass2{
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Square();

        shape1.draw();
        shape2.draw();

    }
}
