/*
Exercise 4
Write a program to add together the following marks and find the average:
        45, 56, 34, 89
Output all the marks, the total (sum) and the average mark.
Note: Identify the total number of variables needed, their data types and choose appropriate
names.
        Note: The average is calculated as (45+56+34+89)/4.
*/


public class FindingSumAverage {

    public static void main(String[] args) {

        int num1 = 45;
        int num2 = 56;
        int num3 = 34;
        int num4 = 89;
        int totalSum = num1 + num2 + num3 + num4;
        int avgMark = totalSum / 4;

        System.out.println("Sum:" + totalSum);
        System.out.println("Average:" + avgMark);
    }
}
