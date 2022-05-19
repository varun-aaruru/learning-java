import java.awt.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //primitive types
        int numi = 13;
        byte numb = 10;
        short nums = -23;
        numb = 12;
        //int viewsCount = 3_123_234_678; gives number too high error! use long
        long viewsCount = 3_123_234_678L;
        float price = 10.85F;
        //if we  don't give F or f suffix it will give error because java's default for decimals is double..not float.
        boolean isOut = true;
        int x = 2;
        int y= x;
        x= 3;
        System.out.println("primitive output : "+ y);//here y is not changed even after changing x because primitive types are not
        // copied by references but only by values and these values are independent of each other.
        // now reference types
        Date today = new Date();
        System.out.println("today's date is : "+today); //type sout and hit tab
        System.out.println(numb);
        int i = 2;
        //Point point1 = new Point(x:1 , y:2);
        Point newPoint = new Point(1,2);
        Point point2 = newPoint;
        newPoint.x = 3;
        //here point2 value also changed because reference types are copied by reference (aka address)
        System.out.println(point2);

        //if we use final keyword, it is considered constant

        final float PI = 3.141F;
    }
}