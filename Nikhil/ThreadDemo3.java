package Nikhil;
import static java.lang.System.*;

/*class x extends Object{

}*/
class MyThread1 implements Runnable{
    public void run(){
        for (int i = 0; i <10 ; i++) out.println(i);// getName()cannot be called as Thread is not inherited
    }
    public void add(){
        out.println("i+i");
    }
}
public class ThreadDemo3 {
    public static void main(String[] args) {
        MyThread1 box = new MyThread1();
        // tkd.start();// start() cannot be called as Thread is not inherited
        //engine is present but no key
        Thread Bike = new Thread(box);// so putting engine into the whole car
        //therefore starting it
        Bike.start();
    }
}
