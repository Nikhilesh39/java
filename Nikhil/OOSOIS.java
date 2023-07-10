package Nikhil;


import static java.lang.System.*;
import java.io.*;

class Emp1 implements Serializable{// as Serializable is a interface
    // the class which implements serializable then the objects in that class are called serializable objects
    // Emp1 also implements the abstract methods in Serializable
    // process of converting object state into binary format is called serialization
    // the reverse is called deserialization
    int a;
    String b;
    float c;
    Emp1(int eno,String ename,float sal){
        this.a=eno;
        this.b=ename;
        this.c=sal;
    }
    void display(){
        out.println(a);
        out.println(b);
        out.println(c);
    }
}
public class OOSOIS {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("Data1.txt");
        //inputstream
        ObjectInputStream ois = new ObjectInputStream(fis);
        //converts the objects in the input stream to binary - serializability

        FileOutputStream fos = new FileOutputStream("Data1.txt");
        // FileOutputStream creates new file even thought there is no existing file
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        //converts binary to objects type
        Emp1 e1 = new Emp1(1,"Nick",12.9f);
        oos.writeObject(e1);
        Emp1 e2 =(Emp1)ois.readObject();//(Emp1) is typecasting

        fos.close();
        oos.close();
        e2.display();
    }
}

