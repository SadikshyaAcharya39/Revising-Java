/*
        Exercise 3
        Amend the skeleton program on the next page so that:
        1. It contains a constant for the conversion of gallons into litres. (1 gallon = 4.546 litres).
        2. It contains a gallons variable which is initialised to 14.
        3. It contains a litres variable.
        4. It contains a String initialised to "The number of litres in ".
        5. It contains a String initialised to " gallons is ". Note spaces!
        6. It contains the assignment : litres variable = gallons variable * conversion constant.
        7. It outputs the first String concatenated with the gallons variable, concatenated with the
        second String concatenated with the litres variable
*/

public class Exercise1 {

    public static void main(String[] args) {
        final float gallonToLitres = 4.456f;
        float gallon = 14f;
        float litre;
        String string = "The number of litres in:";
        String string1 = "Gallons is ";

        litre = gallon * gallonToLitres;
        System.out.println(string + " " +  string1 + litre);
    }

}
