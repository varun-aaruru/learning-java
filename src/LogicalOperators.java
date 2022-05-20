import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args){
        /*
        * Used to connect two or more expressions
        * && == AND operator
        * || == OR operator
        * ! == NOT operator
        * */

        Scanner scannerObject = new Scanner(System.in);
        System.out.println("You are in a forest. Enter e or E to go east: ");
        String e = scannerObject.next();

        //if(e.equals("e") || e.equals( "E")){
        if(e.equals("e") && !e.equals( "E")){
            System.out.println("You are going East");
        }else {
            System.out.println("West it is");
        }
    }
}
