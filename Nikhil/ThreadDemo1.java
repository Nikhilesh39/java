package Nikhil;
import static java.lang.System.*;

/*public interface
public class Thread implements Runnable{
  public void run(){
  }
  }*/
class MyThread extends Thread{
    @Override
    public void run(){
        // overrides run() method in Thread class
        // run() is a method in runnable interface, which we need to override to perform our task
        for (int i = 1; i < 11; i++) {
            out.print(i+" ");
        }
    }
}
public class ThreadDemo1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        //t1.run();// run method should not be called directly
        t1.start();// calling the start() method which is a method in Thread class
    }
}
