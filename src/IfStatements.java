import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args){
        //int temp = 32;
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("enter temperature: ");
        int temp = scannerObject.nextInt();
        if (temp>30){
            System.out.println("its hot");
            System.out.println("drink a lot of water");
        } else if (temp>20 && temp<=30) {
            System.out.println("its beautiful day");
        } else {
            System.out.println("its very cold...use sweater");
        }

        //ternary operators:
        int income = 120000;
        String className = "Economy";
        if (income > 100_000){
            className = "Business";
        }

        //above can be written using ternary operator as,
        int iincome = 120_000;
        String classNamee = iincome>100_000 ? "Business" : "Economy";
        System.out.println(classNamee);
    }
}
