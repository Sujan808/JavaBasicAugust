package Assignment1;

import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Principle amount: ");
        long p = input.nextInt();

        System.out.println("Time in years: ");
        long t = input.nextInt();

        System.out.println("Interest rate: ");
        float r = input.nextInt();

        double SI = (p * t * r)/100;
        System.out.println("The Simple Interest: " + SI);
    }
}
