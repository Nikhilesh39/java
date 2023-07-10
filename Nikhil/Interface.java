package Nikhil;
import static java.lang.System.*;

interface Inf1{
    int add(int a,int b);
}
interface Inf2 extends Inf1{
    int sub(int a,int b);
}
interface Inf3{
    int multi(int a,int b);
}
class Mymath{
    public int div(int a,int b){
        return a/b;
    }
}
class Child4 extends Mymath implements Inf2,Inf3{// inherting both interface and class
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int multi(int a,int b){
        return a*b;
    }
}
class Interface{
    public static void main(String[] args) {
        Child4 c=new Child4();
        out.println(c.add(10,2));
        out.println(c.sub(10,2));
        out.println(c.multi(10,2));
        out.println(c.div(10,2));
    }
}