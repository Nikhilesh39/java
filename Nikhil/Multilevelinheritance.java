package Nikhil;
import static java.lang.System.*;

class Base1{
    int a;
    Base1(int a){// constructors are writter to intitialize memory
        out.println("Base constructor");
        this.a=a;
    }
    void display(){
        out.println("a : "+a);
    }
}
class Child1 extends Base1{
    int b;
    Child1(int a,int b){
        super(a);// as accessing from Base class using super(); initializing a using super class
        /*receives the necessary value for its initialization,
        and you can utilize the a value in both the superclass and subclass as needed.*/
        this.b=b;
        out.println("Child constructor");
    }
    void display(){
        super.display();// to display super class object, super class is base class, can display even after overriding
        out.println("b : "+b);// method overridding
    }
}
class SubChild extends Child1{
    int c;
    SubChild(int a,int b,int c){
        super(a,b);
        this.c=c;
        out.println("SubChild constructor");
    }
    void display(){
        super.display();//calls Child class, and Child class calls Base class like a ladder
        out.println("c : "+c);
    }

}
public class Multilevelinheritance {
    public static void main(String[] args) {
        SubChild s= new SubChild(22,8,2001);
        s.display();
    }
}