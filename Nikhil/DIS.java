package Nikhil;

import static java.lang.System.*;
import java.io.*;

public class DIS {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("Rhys.txt");
        DataInputStream dis = new DataInputStream(fis);
        //String line = dis.readLine();// prints the entire line
        String line;
        while((line=dis.readLine())!=null){
            out.println(line);
        }
        fis.close();
        dis.close();

    }
}
