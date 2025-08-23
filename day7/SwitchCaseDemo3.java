package day7;

import java.util.Scanner;

public class SwitchCaseDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice: ");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Addition");
                break;
            case 2 :
                System.out.println("Subtration");
                break;
            case 3 :
                System.out.println("Division");
                break;
            case 4 :
                System.out.println("Multiplication");
                break;
            default :
                System.out.println("Invalid choice");
        }//end
        System.out.println("Rest code");
    }
}
