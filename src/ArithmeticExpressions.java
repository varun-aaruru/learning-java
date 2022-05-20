import java.text.NumberFormat;
import java.util.Random;

public class ArithmeticExpressions {
    public static void main(String[] args){
        int x = 1;
        int y = x++;
        int z = ++x;
        System.out.println(y);
        System.out.println(z);
        x += 2; //this is equal to x = x + 2
        //similarly we have -=,/=,*=
        //order of operations
        int a = 11+3*4;
        int b = (11+3)*4;
        System.out.println(a);
        System.out.println(b);
        /*
        * order of operators
        * ()
        * /  and *
        * + and -
        * */
        //casting and type conversion
        // implicit casting ==> automatic casting..it is done when there is no data loss
        // byte<short<int<long<float<double
        short s = 2;
        int i = s +4;
        System.out.println(i);
        //here int is larger than short so no data loss so no error but implicit conversion...
        //explicit casting ==> by us
        double d = 1.1;
        int j = (int)d+5;
        //here 1.1 is stored in int, so it becomes 1...we have done conversion explicitly by giving (datatype) before variable
        System.out.println(j);
        //casting happens only between compatible types
        //we can't convert strings to numbers directly, but we can do by using methods
        String s1 = "1";
        int i1 = Integer.parseInt(s1);
        System.out.println(i1);
        //MATH class
        System.out.println(Math.round(1.1F));
        System.out.println(Math.ceil(1.1F));
        System.out.println(Math.floor(1.9F));
        //there are many other methods like max(),min(),random()
        System.out.println((int)(Math.random()*100));

        //Formatting numbers
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.89);
        System.out.println(result);
        NumberFormat percent = NumberFormat.getPercentInstance();
        String pResult = percent.format(0.1);
        System.out.println(pResult);

        Random random = new Random();
        int x1 = random.nextInt(10)+1;
        System.out.println(x1);
    }
}
