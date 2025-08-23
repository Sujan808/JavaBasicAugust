package day7;

import java.util.Scanner;

public class WhileLoopDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter name: ");
            String name = sc.next();
            if (name.equals("sujan")){
                flag = false;
            }
            System.out.println("Name: " + name);
        }
        System.out.println("code rest.");
    }
}
