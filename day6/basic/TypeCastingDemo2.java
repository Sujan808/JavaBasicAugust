package day6.basic;

public class TypeCastingDemo2 {
    public static void main(String[] args) {
        char c1 = 65;
        short s1 = 65;
        System.out.println("c1 = " + c1);
        System.out.println("s1 = " + s1);

        char c2 = 'B';
        short s2 = 'B';
        System.out.println("c2 = " + c2);
        System.out.println("s2 = " + s2);

        char c3 = 45;
        short s3 = (short)c3;
        System.out.println("c3 = " + c3);
        System.out.println("s3 = " + s3);
    }
}
