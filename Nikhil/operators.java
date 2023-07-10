package Nikhil;

public class operators {
    public static void main(String[] args) {
        boolean b1= true;
        System.out.println("b1:\t"+b1);
        boolean b2=!b1;
        System.out.println("b2:\t"+b2);
        boolean b3=!b2;
        System.out.println("b3:\t"+b3);
        int a =10;
        int b = a++;// assign and increment
        System.out.println(a);
        int c = ++a;//increment and assign
        System.out.println(c);
        int d=a++ + ++a;
        System.out.println(d);
    }
}
