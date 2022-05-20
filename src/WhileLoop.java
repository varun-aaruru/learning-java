import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args){
        // While loop executes a block of code as long as the condition is true

        Scanner scannerObj = new Scanner(System.in);
        String name = "";
        while(name.isBlank()){
            System.out.println("enter your name: ");
            name = scannerObj.nextLine();
        }
        System.out.println("Hello "+ name);
    }

}
