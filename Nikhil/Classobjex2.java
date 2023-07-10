package Nikhil;
import static java.lang.System.*;

class Emp{
    // instance fields/variables
    int eno;// 4 bytes, store : 0 as default
    String ename;// ename is a reference variable, by default stores : null
    float sal;// stores : 0.0
    // instance constructor
    Emp(){
        //out.println("Constructor");
    }
    // instance methods
    void display(){// called using 'e' in the bottom
        out.printf("Eno : %d\n",eno);// out.printf("Eno : %d",e.eno);
        out.printf("Ename : %s\n",ename);
        out.printf("Esal : %f\n",sal);
    }
}
class Classobjex2{
    public static void main(String[] args) {
        Emp e1 = new Emp();// main method is callin constructor
        // constructor returns object's address and is stored in the assignment operator
        // to create object, constructor needs to be called and then memory is allocated in the heap memory
        // now e is used to access the Emp as it's address is stored in 'e'
        // e.display();
        // '.' is memory access operator
        //e.display();

        e1.ename="Grey";// string literal, memory is allocated separately in the string constant pool
        e1.eno=505;
        e1.sal=10000000000.00f;
        e1.display();// written to display the object state

        out.println();

        Emp e2 = new Emp();
        e2.ename="Alex";// string literal, memory is allocated separately in the string constant pool
        e2.eno=506;
        e2.sal=100000000.00f;
        e2.display();// written to display the object state
    }
}