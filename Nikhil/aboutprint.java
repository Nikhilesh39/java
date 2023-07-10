package Nikhil;

public class aboutprint {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        String d="Alex";
        int c=a+b;
        float e=10.2f;
        System.out.println(a);
        System.out.print(b);
        System.out.print(c);//prints on the same line as previous
        System.out.println();
        //System.out.println(a,b,c); is not valid as only one can be passed
        System.out.printf("%d %d %d",a,b,c);
        System.out.println();
        System.out.printf("%d + %d = %d",a,b,c);
        System.out.println();
        System.out.format("%-10d%-10s%-10f",c,d,e);
    }
}
