public class PrintFormat {
    public static void main(String[] args){

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;

        //[conversion-character]
        System.out.printf("%b",myBoolean);
        System.out.printf("%c",myChar);
        System.out.printf("%s",myString);
        System.out.printf("%d",myInt);
        System.out.printf("%f",myDouble);

        //[width]
        //minimum number of characters to be written as output
        System.out.printf("\nHello %10s",myString);

        //[precision]
        // sets number of digits of precision when outputting floating-point values
        System.out.printf("\nYou have this much money %.1f",myDouble);

        /*[flags]
         adds an effect to output based on the flag added to format specifier
         - : left-justify
         + : output a plus ( + ) or minus ( - ) sign for a numeric value
         0 : numeric values are zero-padded
         , : comma grouping separator if numbers > 1000 */

        System.out.printf("\n You have this much money %,f",myDouble);

    }
}
