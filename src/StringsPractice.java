import java.awt.*;
import java.sql.SQLOutput;
import java.util.Date;
import java.util.Locale;

public class StringsPractice {
    public static void main(String[] args) {

        System.out.println("Hello Again!");

        //strings in double quotes...two types of initialisation
        //type 1
        String message = new String("Welcome to strings");
        //type 2
        String message2 = "another wayyyyy yayyyyy";
        System.out.println(message+" " +message2);
        //string methods: there are many inbuilt string methods to use like
        /*
        * startsWith()
        * endsWith()
        * equals()
        * length()
        * replace()
        * replaceAll()
        * toLowerCase()
        * toString()
        * trim()
        * indexOf()
        * valueOf()
        * */

        System.out.println(message.startsWith("t"));
        System.out.println(message.length());
        System.out.println(message.equals(message2));
        System.out.println(message2.indexOf("z"));
        System.out.println(message2.replace("y","z")); // returns new string
        System.out.println(message2);
        //we can see original string is not affected even after replacing because replace() returns new string that is because
        //in java strings are immutable.
        System.out.println(message.toUpperCase());//returns new string again...

    }
}
