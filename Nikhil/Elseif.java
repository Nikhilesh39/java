package Nikhil;
import static java.lang.System.*;
import java.util.*;
public class Elseif {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b;
        a= s.nextInt();
        b= s.nextInt();
        System.out.println("Enter operation \n1.Add\n2.Sub\n3.Mul");
        int c=s.nextInt();
      /*  if (c==1)
            System.out.println(a+b);
        else if(c==2)a
            System.out.println(a-b);
        else
            System.out.println(a*b);*/
        switch(c){
            case 1:
                out.println(a+b);
                break;
            case 2:
                out.println(a-b);
                break;
            case 3:
                out.println(a*b);
                break;
            default:
                out.println("Invalid option");
        }

    }
}
