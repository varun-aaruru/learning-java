import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args){
        //for loop executes block of code a limited amount of time
        Scanner scanner = new Scanner(System.in);
//        int number=0;
//        while (number==0 || number >10){
//            System.out.println("Enter a number between 1 and 10 ");
//            number = scanner.nextInt();
//        }
//        System.out.println("Your number is "+number );
//        for (int index=1; index<=number; index++){
//            System.out.println(index);
//        }

        int rows;
        int columns;
        String symbol = "";
        System.out.println("Enter number of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter columns: ");
        columns =scanner.nextInt();
        System.out.println("enter symbol: ");
        symbol = scanner.next();

        for(int index = 1; index <= rows; index++){
            System.out.println();
            for(int colindex = 1; colindex <=columns; colindex++){
                System.out.print(symbol);
            }
        }

    }
}
