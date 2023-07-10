package Nikhil;

import java.util.Scanner;
public class Condtional {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        //Greater than two numbers
        /*System.out.print("Enter a and b value : ");
        int a=n.nextInt();
        int b=n.nextInt();
        if (a>b)
            System.out.printf("%d greater than %d",a,b);
        else
            System.out.printf("%d greater than %d",b,a);*/

        int a =n.nextInt();
        if(a%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
