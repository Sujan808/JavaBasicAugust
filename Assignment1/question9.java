package Assignment1;

import java.util.Scanner;

public class question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        double pounds = input.nextDouble();

        double KG = pounds * 0.454;
        System.out.println("Result in KiloGram: " + KG);
    }
}
