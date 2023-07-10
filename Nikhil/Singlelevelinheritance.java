package Nikhil;

import static java.lang.System.*;
class Base {
    int a,b;
    Base(){
        out.println("Base class constructor");
        a=10;
        b=20;
    }
    void display(){
        out.println("base display. . .");
        out.println(a);
        out.println(b);
    }
}
class Child extends Base{
    int c,d;
    Child(){
        // super(); written by compiler by defualt
        //
        out.println("Child class constructor");
        c=30;
        d=40;
    }
    void display2(){
        out.println(c);
        out.println(d);
    }
}
public class Singlelevelinheritance {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.display();
        c1.display2();
    }
}
