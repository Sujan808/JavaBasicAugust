import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Volume of Cylinder
        System.out.println("Enter radius: ");
        double r = input.nextDouble();
        System.out.println("Enter height: ");
        double h = input.nextDouble();

        double volume = Math.PI *(r * r) * h;
        System.out.println("Volume of Cylinder: " + volume);
    }
}
