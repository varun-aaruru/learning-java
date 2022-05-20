import java.util.Scanner;

public class MethodsExamples {
    public static void main(String[] args){

        //Method is block of code which is executed whenever called upon
        hello();//calling the method
        hello();//calling again
        hello();//call as many times as you want

        String name = "";
        int age= 28;
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter name : ");
        name = scannerObject.nextLine();
        helloArg(name,age);

        int x= 3;
        int y = 6;
        int c = add(x,y);
        System.out.println(c);
        System.out.println(add(8,9));
    }

    static void hello(){

        System.out.println("Hey there!");

    }

    static void helloArg(String title, int years){
        System.out.println("Hello"+" "+title+". You are "+years+" years old.");
    }

    static int add(int a, int b){
        return a+b;
    }
}
