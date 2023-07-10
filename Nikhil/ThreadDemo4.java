package Nikhil;
import static java.lang.System.*;

class One7 implements Runnable{
    public void run(){
        //Thread t = Thread.currentThread();// this lines tells if the class is running as a thread or not
        // it returns the name of the present thread which is running
        for (int i = 1; i <10 ; i++) out.println(i);
    }
}
public class ThreadDemo4 {// there is a main thread which runs the main method
    public static void main(String[] args) {
        One7 o1 = new One7();
        Thread t1 = new Thread(o1);
        t1.start();
        Thread mt = Thread.currentThread();
        out.println(mt.getName());// there is a main thread which runs the main method

    }
}
