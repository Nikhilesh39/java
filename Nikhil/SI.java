package Nikhil;
import static java.lang.System.*;

class One3 {
    static int s;// static variables - method area
    int a,b,count;// instance variables - heap memory
    One3(int a,int b){// creates memory in stack for local variable a and b
        this.a=a;
        this.b=b;
        count=++s;
    }
    void display(){
        out.println("a "+a);
        out.println("b "+b);
    }
}
class SI{
    public static void main(String[] args) {//args is also a local variable
        One3 o1 = new One3(10,20);// o1 is referece as well as local variable too. .
        One3 o2 = new One3(100,200);
        o1.display();
        o2.display();
    }
}
