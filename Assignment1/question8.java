package Assignment1;

import java.util.Scanner;

public class question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //Fahrenheit to Celsius
        System.out.println("Enter fahrenheit: ");
        double f = input.nextDouble();

        double intoCelsius = (f - 32) * 5/9;
        System.out.println("Converted to Celsius: " + intoCelsius);

        //Celsius to Fahrenheit
        System.out.println("Enter Celsius: ");
        double c =input.nextDouble();

        double intoFahrenheit = (c * 9 / 5) + 32;
        System.out.println("Converted to Fahrenheit: " + intoFahrenheit);
    }
}
