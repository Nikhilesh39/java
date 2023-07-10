package Nikhil;
import static java.lang.System.*;
import java.io.*;

public class ReadData {
    public static void main(String[] args) throws Exception {
        DataInputStream dis = new DataInputStream(in);
        /*out.print("Enter name : ");
        String name = dis.readLine();
        out.println("I'm "+name);*/
        out.print("Enter int value : ");
        int a=Integer.parseInt(dis.readLine());// converting into int from string

        out.print("Enter another int value : ");
        int b = Integer.parseInt(dis.readLine());

        int c=a+b;
        out.printf("%d+%d=%d",a,b,c);
        dis.close();
    }
}
