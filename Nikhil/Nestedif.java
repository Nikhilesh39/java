package Nikhil;
import java.util.Scanner;
import static java.lang.System.*;
public class Nestedif {
    public static void main(String[] args) {
        out.print("Enter marks ");
        Scanner s = new Scanner(System.in);
        int a,b,c;
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        if(a>=40 && b>=40 && c>=40)
            out.println("Pass");
            float avg = (a+b+c)/3;
            if (avg>=90)
                out.println("A+");
        else
           out.println("Fail");

    }
}
