package Assignment1;

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = input.nextInt();

        System.out.println("Enter second number: ");
        int b = input.nextInt();

        int sum = a + b ;
        System.out.println("The sum is:" + sum);

        int average = (a + b)/2;
        System.out.println("The average is: " + average);
    }
}
