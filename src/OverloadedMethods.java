public class OverloadedMethods {
    public static void main(String[] args){
    //overloaded methods: methods that share same name but different parameters
        System.out.println(add(5,6));
        System.out.println(add(5,6, 8));
        System.out.println(add(5.1,6.2));
        System.out.println(add(5.1,6.0, 8.2));
    }
    static int add(int a, int b){
        System.out.println("First method is used.");
        return a+b;
    }
    static int add(int a, int b, int c){
        System.out.println("Second method is used");
        return a+b+c;
    }
    static double add(double a, double b){
        System.out.println("third method is used.");
        return a+b;
    }
    static double add(double a, double b, double c){
        System.out.println("fourth method is used");
        return a+b+c;
    }
}
