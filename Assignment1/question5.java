package Assignment1;

import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Area of Circle
        System.out.println("Enter radius: ");
        double r = input.nextDouble();

        double Area  = Math.PI * (r * r);
        System.out.println("Area of Circle: " + Area);


        //Area of Rectangle
        System.out.println("Enter length: ");
        double l = input.nextDouble();
        System.out.println("Enter width: ");
        double w = input.nextDouble();

        double rectangle = l * w;
        System.out.println("Area of Rectangle: " + rectangle);

        //Area of Triangle
        System.out.println("Enter base: ");
        double b = input.nextDouble();
        System.out.println("Enter height: ");
        double h = input.nextDouble();

        double triangle = (b * h)/2;
        System.out.println("Area of Triangle: " + triangle);
    }
}
