public class EscapeSequences {
    public static void main(String[] args){
        //lets dive into escape sequences
        //String greeting = "Hello "varun"";
        //above line gives error because once double quotes are closed java doesn't understand about next characters
        //so we have to use escape character \
        String greeting = "Hello \"varun\"";
        System.out.println(greeting);
        //give ~hello "varun"~ as output
        /* now to print c:\\users\\..., we have to escape each backslash so */
        String sss = "c:\\\\users\\\\...";
        System.out.println(sss);
        /// similarly use \t ,\n


    }
}
