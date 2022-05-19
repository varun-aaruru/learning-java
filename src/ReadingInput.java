import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args){
        //scanner
        Scanner scannerObj = new Scanner(System.in);
        //System.out.print("Age: ");
        //int age = scannerObj.nextInt();
        //System.out.println("I am " + age + " years old");

        //strings
        String name = scannerObj.nextLine().trim(); //also use next() and compare output
        System.out.println(name);
    }
}
