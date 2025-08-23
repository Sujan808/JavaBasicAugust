package Assignment1;

import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Perimeter of Circle
        System.out.println("Enter radius: ");
        double r = input.nextDouble();

        double circle = 2 * Math.PI * r;
        System.out.println("The Perimeter of Circle: " + circle);

        //Perimeter of Rectangle
        System.out.println("Enter length: ");
        double l = input.nextDouble();
        System.out.println("Enter breadth: ");
        double b = input.nextDouble();

        double rectangle = 2 *(l * b);
        System.out.println("The perimeter of Rectangle: " + rectangle);

        //Perimeter of triangle
        System.out.println("Enter side: ");
        double x = input.nextDouble();
        System.out.println("Enter base: ");
        double y = input.nextDouble();
        System.out.println("Enter side: ");
        double z = input.nextDouble();

        double triangle = x + y + z;
        System.out.println("The perimeter of Triangle: " + triangle);
    }
}
