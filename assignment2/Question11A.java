package assignment2;

public class Question11A {
    public static void main(String[] args) {
        int a = 5 , b = 12;
        System.out.println("Before swapping: a = " + a + ", b = " + b );

        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a =" + a + ", b = " + b );
    }
}
