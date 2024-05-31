
public class ConcatenationOfStrings {
public static final int answer = 42;

    public static void main(String[] args) {

        String greeting = "Namaste";
        String names = "Sadikshya";
        String name = "    Sadikshya   ";
        String aboutme = "Sadikshya is a hardworking girl...";
        System.out.println(greeting + " " + name + " !!!");
        System.out.println("The number is " + 62);
        System.out.println(greeting.length());
        System.out.println("Length is " + greeting.length());
        System.out.println(greeting.equals("Namaste"));
        System.out.println(greeting.equals("Good-Bye"));
        System.out.println(greeting.equalsIgnoreCase("NAMASTE"));

        System.out.println(greeting.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        System.out.println(greeting.substring(0));
        System.out.println(greeting.substring(0,7));

        System.out.println(aboutme.indexOf("is"));

        System.out.println(names.compareTo("Sadikshya"));
        System.out.println(name.compareTo("zoo"));
        System.out.println(name.compareToIgnoreCase("Sadikshya"));

        String company = "FuseMachines";
        company = "AI " + company;
        System.out.println(company);
        System.out.println(answer);

    }
}
