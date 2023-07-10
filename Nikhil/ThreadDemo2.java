package Nikhil;
import static java.lang.System.*;

/*
 the output coincides
 sample output
 0 1 2 3 4 5 6 7 100 101 102 103 104 105 106 8 9 107 108 109
*/
class One6 extends Thread{
    public void run(){
        for (int i = 0; i <10 ; i++) out.println(getName()+" "+i);// getName() gets the name of the respective thread being executed
                                                // getName() is a method calling statement
    }
}
class Two extends Thread{
    public void run(){
        for (int i = 100; i <110 ; i++) out.println(getName()+" "+i);
    }
}
public class ThreadDemo2 {
    public static void main(String[] args) {
        One6 t1 = new One6();// newborn state
        Two t2 = new Two();// newborn state
        t1.start();// Runnable / Queued / Active state
        t2.start();
    }
}
