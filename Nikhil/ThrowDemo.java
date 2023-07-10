package Nikhil;
import static java.lang.System.*;
import java.util.*;
import java.lang.Exception.*;

public class ThrowDemo {
    public static void main(String[] args) {
        int a=0,b=0,c=0;
        Scanner s = new Scanner(in);//System.in
        out.println("Enter two integers");
        try{
/*            try{
                a=s.nextInt();
            }
            catch(InputMismatchException im){
                out.println("Enter correct values");
                //out.println(im.getMessage());
                s.next();
                a=s.nextInt();*/
            //}
            a=s.nextInt();
            b=s.nextInt();
            if(b==0){
                throw new ArithmeticException("b value Zero");
            }
            c=a/b;
            // new ArithmeticException("/ by zero");
        }
        catch (Exception ae){
            //out.println("Error");
            ae.printStackTrace();
            // prints the info which is stored in the reference variable
            //out.println(ae);
            //out.println(ae.toString()); // Type of excpetion
            //out.println(ae.getMessage()); // only cause
        }
       /* catch(InputMismatchException ime){
            //out.println(ime);
            out.println(ime.getMessage());
        }*/
        finally{
            out.println("Finally statement");
        }
        out.printf("%d / %d = %d%n",a,b,c);
        out.println("End");
    }
}