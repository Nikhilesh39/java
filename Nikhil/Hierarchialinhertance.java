package Nikhil;

import static java.lang.System.out;

class Base2{
    int a;
    Base2(int a){// constructors are writter to intitialize memory
        out.println("Base constructor");
        this.a=a;
    }
    void display(){
        out.println("a : "+a);
    }
}
class Child2 extends Base2{
    int b;
    Child2(int b){
        super(10);
        // super.display();
        out.println("Child2 constructor");
        this.b=b;
    }
    void display(){
        super.display();
        out.println("b : "+b);
    }
}
class Child3 extends Base2{
    float f;
    Child3(float f){
        super(20);
        // super.display();
        out.println("Child3 constructor");
        this.f=f;
    }
    void display(){
        super.display();
        out.println("f : "+f);
    }
}
class Hierarchialinheritance{
    public static void main(String[] args) {
        Child2 c2=new Child2(100);// if no constructor is there compiler writes a constructor by default
        Child3 c3=new Child3(2.3f);
        out.println("c2 object state");
        c2.display();
        out.println("c3 object state");
        c3.display();
    }
}
