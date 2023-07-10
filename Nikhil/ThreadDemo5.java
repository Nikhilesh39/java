package Nikhil;
import static java.lang.System.*;

class One8 extends Thread{
    public void run(){
        for (int i = 0; i <10 ; i++) out.println(getName()+" "+i);// getName() gets the name of the respective thread being executed
        // getName() is a method calling statement
    }
}
class Two1 extends Thread{
    public void run(){
        for (int i = 100; i <110 ; i++) out.println(getName()+" "+i);
    }
}
// Thread scheduler allots time slots to the threads which are in queued state
// for example if for a task t1 1nsec is given.
// if the t1 is not completed in 1nsec it again goes into the queue state and waits to get into the processor to complete its task
// there are two states, Queue state and Running state
// after task is completed then that thread will go to dead state
// stop method sends active state thread to dead state, but it is a deprecate method
public class ThreadDemo5 {
    public static void main(String[] args) {
        One8 t1 = new One8();
        t1.setName("First");
        Two1 t2 = new Two1();
        t2.setName("Second");
        t1.start();// Runnable / Queued / Active state
        t2.start();// Runnable / Queued / Active state
        //t2.sleep(1000);
        /*t2 will go to blocked state for 1 second if sleep() is called
        which would provide room for t1 to execute without any interruption till the time given in the sleep(t)*/
    }
}
