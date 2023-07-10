package Nikhil;
import static java.lang.System.*;

class One2 {
    int a,b;
    One2(){// non parameterised constructor
        out.println("default constructor . .");
    }
    One2(int a, int b){// parameterised constructor
        this();
        out.println("Parameterized constructor . .");
        this.a=a;// method variables assigned to local variables
        this.b=b;
    }
    void display(){
        out.println("Object state . .");
        out.println("a : "+a);
        out.println("b : "+b);
    }
}
class Thisexample{
    public static void main(String[] args) {
        One2 o1 = new One2(10,20);
        One2 o2 = new One2();
        o1.display();
        o2.display();
    }
}
