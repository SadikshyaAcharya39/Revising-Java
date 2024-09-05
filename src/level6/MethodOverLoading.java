package level6;

public class MethodOverLoading {


    // Method OverLoading
    public void myMethod(){
        System.out.println("Student Details: ");
    }

    public String myMethod(String name){
       return name;
    }

    public int myMethod(int age){
        return age;
    }

    public void myMethod(String name, String caste){
        System.out.println(name);
        System.out.println(caste);
    }

    public void myMethod(float number){
        System.out.println(number);
    }

    public static void main(String[] args) {
        MethodOverLoading me = new MethodOverLoading();
        me.myMethod();
        System.out.println("Age is: " + me.myMethod(20));
        me.myMethod("Sadikshya");
        me.myMethod("Sana", "Acharya");
        me.myMethod(20.00f);


    }
}
