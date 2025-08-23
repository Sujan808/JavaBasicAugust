package day8.basic;

public class MethodDemo2 {
    // <access modifier > return typw< method name> (){
    //   ========
    //return matching and suitable with return typw
    //}

    public int sum(){
        int a = 4;
        int b = 7;
        int add = a + b;
        return add;
        //return 1;
        //return a+b;
        //return 4,7;
        //return a,b;
    }
    // <access modifier > return< method name> (one or more than one numbers of parameters of any type)
    //   ========
    //}return matching and sutiable with return type

    public String displayInfo(String name,int age, double salary, boolean active){
        String info = "Name: " + name +"Age: " + age + "Salary: " + salary + "Active: " + active;
        return info;
    }
    public static void main(String[] args) {
        MethodDemo2 ob = new MethodDemo2();
        int r = ob.sum();
        System.out.println(r);


        String Info = ob.displayInfo("Sujan ", 36 , 1200 , true);
        System.out.println(Info);
    }

}
