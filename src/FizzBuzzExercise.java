import java.util.Scanner;

public class FizzBuzzExercise {
    public static void main(String[] args){
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = newScanner.nextInt();
        if (number%5==0 &number%3==0){
            System.out.println("FizzBuzz");
        } else if (number%5==0) {
            System.out.println("Fizz");
        } else if (number%3==0) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }
    }
}
