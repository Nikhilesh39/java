package Nikhil;

import static java.lang.System.*;
class One1 {
    int a,b;
    One1(int x, int y){
        a=x;//this.a=x;
        b=y;//this.b=y;
    }
    void display(){
        out.println("Object state");
        out.println("a : "+a);
        out.println("b : "+b);
    }
}
class Pcd1{
    public static void main(String[] args) {
        One1 o1 = new One1(10,20);// 1002
        One1 o2 = new One1(100,200);// 2002
        One1 o3 = new One1(1000,2000);// 3002
        o1.display();
        o2.display();
        o3.display();
    }
}