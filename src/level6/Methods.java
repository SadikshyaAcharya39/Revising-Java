package level6;

public class Methods {

    // Without parameter
    public void myMethod(){
        System.out.println("Java is a fun language...");
    }

    // With parameter

    public void myNums(int num1, int num2){
        System.out.println("Value of num1 is: " + num1);
        System.out.println("Value of num2 is: " + num2);
    }

    public int myNumbers(int a){
        return a;
    }

    public static void main(String[] args) {
        Methods methods = new Methods();
        methods.myMethod();
        methods.myNums(2, 3);
        System.out.println(methods.myNumbers(33));
    }
}
