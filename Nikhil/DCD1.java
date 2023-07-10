package Nikhil;

import static java.lang.System.*;
class One{
    int a,b;// instance variables
    One(){// instance constructor
        // object initialization is done using constructor
        a=10;
        b=20;
        out.println("Constructor");
    }
    void display(){// instance method
        out.println("Object state");
        out.printf("a : %d\n",a);
        out.printf("b : %d\n",b);
    }

    public static void main(String[] args) {
        One o1 = new One(); // main method calling constructor
        o1.display();
    }
}