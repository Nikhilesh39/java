package Nikhil;
import static java.lang.System.*;

class Base5{
    int a= 100;
    static int s=200;
    void extra(){
        out.println("Extra method");
    }
    void display(){
        out.println("Base instance method");
    }
    static void get(){
        out.println("Base static method");
    }
}
class Child5 extends Base5{// no constructor so creates default constructor
    int a= 1000;
    static int s=2000;
    void display(){
        out.println("Child instance method");
    }
    static void get(){// static methods do not support overridding
        out.println("Child static method");
    }
}
public class StatDynaBinding {
    public static void main(String[] args) {
        Base5 b1 = new Child5();
        out.println("b1.a : "+b1.a);// b1 is Base5 type variable
        out.println("b1.s : "+b1.s);
        b1.get();// as it is static method even it is overridden base class get is displayed
        b1.extra();
        b1.display();// display method in child class is called as it is overridden
    }
}