import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalc {
    public static void main(String[] args){
        //calc mortgage
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Principal amount: ");
        int principalAmount = scannerObject.nextInt();

        System.out.println("Annual interest: ");
        float annualInterest = scannerObject.nextFloat();
        float monthlyInterest = annualInterest/PERCENT/MONTHS_IN_YEAR;

        System.out.println("Number of years: ");
        byte years = scannerObject.nextByte();
        int totalMonths = years*MONTHS_IN_YEAR;

        double mortgage = (principalAmount)*(((monthlyInterest)*(Math.pow(monthlyInterest+1,totalMonths)))/(((Math.pow(monthlyInterest+1,totalMonths))-1)));
        System.out.println(mortgage);
        //we can even format this in currency
        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(formattedMortgage);
    }
}
