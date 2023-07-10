import java.util.Scanner;

public class readingdata{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);//new keyword creates a new object
        System.out.print("Enter a :");
        float a=n.nextFloat();
        System.out.print("Enter b :");
        float b =n.nextFloat();
        float c =a+b;
        System.out.println(c);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}
